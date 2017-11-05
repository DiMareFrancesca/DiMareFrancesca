/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 12.46.10                         ---
 * ----------------------------------------------------------------
 */
package my.hospitaluiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.hospitaluiip.constants.HospitaluiipConstants;
import my.hospitaluiip.jalo.Patient;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Appointment}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAppointment extends GenericItem
{
	/** Qualifier of the <code>Appointment.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Appointment.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Appointment.result</code> attribute **/
	public static final String RESULT = "result";
	/** Qualifier of the <code>Appointment.doctor</code> attribute **/
	public static final String DOCTOR = "doctor";
	/** Qualifier of the <code>Appointment.patient</code> attribute **/
	public static final String PATIENT = "patient";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DOCTOR's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAppointment> DOCTORHANDLER = new BidirectionalOneToManyHandler<GeneratedAppointment>(
	HospitaluiipConstants.TC.APPOINTMENT,
	false,
	"doctor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PATIENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAppointment> PATIENTHANDLER = new BidirectionalOneToManyHandler<GeneratedAppointment>(
	HospitaluiipConstants.TC.APPOINTMENT,
	false,
	"patient",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(RESULT, AttributeMode.INITIAL);
		tmp.put(DOCTOR, AttributeMode.INITIAL);
		tmp.put(PATIENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DOCTORHANDLER.newInstance(ctx, allAttributes);
		PATIENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Appointment.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Appointment.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Appointment.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Appointment.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Appointment.doctor</code> attribute.
	 * @return the doctor
	 */
	public String getDoctor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Appointment.doctor</code> attribute.
	 * @return the doctor
	 */
	public String getDoctor()
	{
		return getDoctor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Appointment.doctor</code> attribute. 
	 * @param value the doctor
	 */
	public void setDoctor(final SessionContext ctx, final String value)
	{
		DOCTORHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Appointment.doctor</code> attribute. 
	 * @param value the doctor
	 */
	public void setDoctor(final String value)
	{
		setDoctor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Appointment.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Appointment.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Appointment.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Appointment.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Appointment.patient</code> attribute.
	 * @return the patient
	 */
	public Patient getPatient(final SessionContext ctx)
	{
		return (Patient)getProperty( ctx, PATIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Appointment.patient</code> attribute.
	 * @return the patient
	 */
	public Patient getPatient()
	{
		return getPatient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Appointment.patient</code> attribute. 
	 * @param value the patient
	 */
	public void setPatient(final SessionContext ctx, final Patient value)
	{
		PATIENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Appointment.patient</code> attribute. 
	 * @param value the patient
	 */
	public void setPatient(final Patient value)
	{
		setPatient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Appointment.result</code> attribute.
	 * @return the result
	 */
	public EnumerationValue getResult(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RESULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Appointment.result</code> attribute.
	 * @return the result
	 */
	public EnumerationValue getResult()
	{
		return getResult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Appointment.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RESULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Appointment.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final EnumerationValue value)
	{
		setResult( getSession().getSessionContext(), value );
	}
	
}
