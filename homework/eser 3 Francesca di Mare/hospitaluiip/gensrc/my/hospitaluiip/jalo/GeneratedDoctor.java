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
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.hospitaluiip.constants.HospitaluiipConstants;
import my.hospitaluiip.jalo.Appointment;
import my.hospitaluiip.jalo.Patient;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Doctor}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDoctor extends GenericItem
{
	/** Qualifier of the <code>Doctor.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Doctor.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Doctor.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Doctor.codFisc</code> attribute **/
	public static final String CODFISC = "codFisc";
	/** Qualifier of the <code>Doctor.birthDate</code> attribute **/
	public static final String BIRTHDATE = "birthDate";
	/** Qualifier of the <code>Doctor.placeDate</code> attribute **/
	public static final String PLACEDATE = "placeDate";
	/** Qualifier of the <code>Doctor.gender</code> attribute **/
	public static final String GENDER = "gender";
	/** Qualifier of the <code>Doctor.alboNumber</code> attribute **/
	public static final String ALBONUMBER = "alboNumber";
	/** Qualifier of the <code>Doctor.ward</code> attribute **/
	public static final String WARD = "ward";
	/** Qualifier of the <code>Doctor.patients</code> attribute **/
	public static final String PATIENTS = "patients";
	/** Qualifier of the <code>Doctor.appointments</code> attribute **/
	public static final String APPOINTMENTS = "appointments";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n WARD's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDoctor> WARDHANDLER = new BidirectionalOneToManyHandler<GeneratedDoctor>(
	HospitaluiipConstants.TC.DOCTOR,
	false,
	"ward",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PATIENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Patient> PATIENTSHANDLER = new OneToManyHandler<Patient>(
	HospitaluiipConstants.TC.PATIENT,
	false,
	"doctor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n APPOINTMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Appointment> APPOINTMENTSHANDLER = new OneToManyHandler<Appointment>(
	HospitaluiipConstants.TC.APPOINTMENT,
	false,
	"doctor",
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
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SURNAME, AttributeMode.INITIAL);
		tmp.put(CODFISC, AttributeMode.INITIAL);
		tmp.put(BIRTHDATE, AttributeMode.INITIAL);
		tmp.put(PLACEDATE, AttributeMode.INITIAL);
		tmp.put(GENDER, AttributeMode.INITIAL);
		tmp.put(ALBONUMBER, AttributeMode.INITIAL);
		tmp.put(WARD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.alboNumber</code> attribute.
	 * @return the alboNumber
	 */
	public Integer getAlboNumber(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ALBONUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.alboNumber</code> attribute.
	 * @return the alboNumber
	 */
	public Integer getAlboNumber()
	{
		return getAlboNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.alboNumber</code> attribute. 
	 * @return the alboNumber
	 */
	public int getAlboNumberAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAlboNumber( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.alboNumber</code> attribute. 
	 * @return the alboNumber
	 */
	public int getAlboNumberAsPrimitive()
	{
		return getAlboNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.alboNumber</code> attribute. 
	 * @param value the alboNumber
	 */
	public void setAlboNumber(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ALBONUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.alboNumber</code> attribute. 
	 * @param value the alboNumber
	 */
	public void setAlboNumber(final Integer value)
	{
		setAlboNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.alboNumber</code> attribute. 
	 * @param value the alboNumber
	 */
	public void setAlboNumber(final SessionContext ctx, final int value)
	{
		setAlboNumber( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.alboNumber</code> attribute. 
	 * @param value the alboNumber
	 */
	public void setAlboNumber(final int value)
	{
		setAlboNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.appointments</code> attribute.
	 * @return the appointments
	 */
	public Collection<Appointment> getAppointments(final SessionContext ctx)
	{
		return APPOINTMENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.appointments</code> attribute.
	 * @return the appointments
	 */
	public Collection<Appointment> getAppointments()
	{
		return getAppointments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.appointments</code> attribute. 
	 * @param value the appointments
	 */
	public void setAppointments(final SessionContext ctx, final Collection<Appointment> value)
	{
		APPOINTMENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.appointments</code> attribute. 
	 * @param value the appointments
	 */
	public void setAppointments(final Collection<Appointment> value)
	{
		setAppointments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to appointments. 
	 * @param value the item to add to appointments
	 */
	public void addToAppointments(final SessionContext ctx, final Appointment value)
	{
		APPOINTMENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to appointments. 
	 * @param value the item to add to appointments
	 */
	public void addToAppointments(final Appointment value)
	{
		addToAppointments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from appointments. 
	 * @param value the item to remove from appointments
	 */
	public void removeFromAppointments(final SessionContext ctx, final Appointment value)
	{
		APPOINTMENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from appointments. 
	 * @param value the item to remove from appointments
	 */
	public void removeFromAppointments(final Appointment value)
	{
		removeFromAppointments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public Date getBirthDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BIRTHDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public Date getBirthDate()
	{
		return getBirthDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BIRTHDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final Date value)
	{
		setBirthDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.codFisc</code> attribute.
	 * @return the codFisc
	 */
	public String getCodFisc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODFISC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.codFisc</code> attribute.
	 * @return the codFisc
	 */
	public String getCodFisc()
	{
		return getCodFisc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.codFisc</code> attribute. 
	 * @param value the codFisc
	 */
	public void setCodFisc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODFISC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.codFisc</code> attribute. 
	 * @param value the codFisc
	 */
	public void setCodFisc(final String value)
	{
		setCodFisc( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		WARDHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender()
	{
		return getGender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final EnumerationValue value)
	{
		setGender( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.patients</code> attribute.
	 * @return the patients
	 */
	public Collection<Patient> getPatients(final SessionContext ctx)
	{
		return PATIENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.patients</code> attribute.
	 * @return the patients
	 */
	public Collection<Patient> getPatients()
	{
		return getPatients( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.patients</code> attribute. 
	 * @param value the patients
	 */
	public void setPatients(final SessionContext ctx, final Collection<Patient> value)
	{
		PATIENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.patients</code> attribute. 
	 * @param value the patients
	 */
	public void setPatients(final Collection<Patient> value)
	{
		setPatients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to patients. 
	 * @param value the item to add to patients
	 */
	public void addToPatients(final SessionContext ctx, final Patient value)
	{
		PATIENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to patients. 
	 * @param value the item to add to patients
	 */
	public void addToPatients(final Patient value)
	{
		addToPatients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from patients. 
	 * @param value the item to remove from patients
	 */
	public void removeFromPatients(final SessionContext ctx, final Patient value)
	{
		PATIENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from patients. 
	 * @param value the item to remove from patients
	 */
	public void removeFromPatients(final Patient value)
	{
		removeFromPatients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.placeDate</code> attribute.
	 * @return the placeDate
	 */
	public Date getPlaceDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PLACEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.placeDate</code> attribute.
	 * @return the placeDate
	 */
	public Date getPlaceDate()
	{
		return getPlaceDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.placeDate</code> attribute. 
	 * @param value the placeDate
	 */
	public void setPlaceDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PLACEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.placeDate</code> attribute. 
	 * @param value the placeDate
	 */
	public void setPlaceDate(final Date value)
	{
		setPlaceDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.ward</code> attribute.
	 * @return the ward
	 */
	public String getWard(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WARD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.ward</code> attribute.
	 * @return the ward
	 */
	public String getWard()
	{
		return getWard( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.ward</code> attribute. 
	 * @param value the ward
	 */
	public void setWard(final SessionContext ctx, final String value)
	{
		WARDHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.ward</code> attribute. 
	 * @param value the ward
	 */
	public void setWard(final String value)
	{
		setWard( getSession().getSessionContext(), value );
	}
	
}
