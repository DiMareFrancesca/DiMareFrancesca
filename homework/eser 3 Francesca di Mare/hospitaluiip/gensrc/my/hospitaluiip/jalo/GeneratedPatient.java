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

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Patient}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPatient extends GenericItem
{
	/** Qualifier of the <code>Patient.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Patient.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Patient.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Patient.codFisc</code> attribute **/
	public static final String CODFISC = "codFisc";
	/** Qualifier of the <code>Patient.birthDate</code> attribute **/
	public static final String BIRTHDATE = "birthDate";
	/** Qualifier of the <code>Patient.placeDate</code> attribute **/
	public static final String PLACEDATE = "placeDate";
	/** Qualifier of the <code>Patient.gender</code> attribute **/
	public static final String GENDER = "gender";
	/** Qualifier of the <code>Patient.dateIn</code> attribute **/
	public static final String DATEIN = "dateIn";
	/** Qualifier of the <code>Patient.dateOut</code> attribute **/
	public static final String DATEOUT = "dateOut";
	/** Qualifier of the <code>Patient.doctor</code> attribute **/
	public static final String DOCTOR = "doctor";
	/** Qualifier of the <code>Patient.ward</code> attribute **/
	public static final String WARD = "ward";
	/** Qualifier of the <code>Patient.appointment</code> attribute **/
	public static final String APPOINTMENT = "appointment";
	/** Qualifier of the <code>Patient.appointments</code> attribute **/
	public static final String APPOINTMENTS = "appointments";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DOCTOR's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPatient> DOCTORHANDLER = new BidirectionalOneToManyHandler<GeneratedPatient>(
	HospitaluiipConstants.TC.PATIENT,
	false,
	"doctor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n WARD's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPatient> WARDHANDLER = new BidirectionalOneToManyHandler<GeneratedPatient>(
	HospitaluiipConstants.TC.PATIENT,
	false,
	"ward",
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
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SURNAME, AttributeMode.INITIAL);
		tmp.put(CODFISC, AttributeMode.INITIAL);
		tmp.put(BIRTHDATE, AttributeMode.INITIAL);
		tmp.put(PLACEDATE, AttributeMode.INITIAL);
		tmp.put(GENDER, AttributeMode.INITIAL);
		tmp.put(DATEIN, AttributeMode.INITIAL);
		tmp.put(DATEOUT, AttributeMode.INITIAL);
		tmp.put(DOCTOR, AttributeMode.INITIAL);
		tmp.put(WARD, AttributeMode.INITIAL);
		tmp.put(APPOINTMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.appointment</code> attribute.
	 * @return the appointment
	 */
	public String getAppointment(final SessionContext ctx)
	{
		return (String)getProperty( ctx, APPOINTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.appointment</code> attribute.
	 * @return the appointment
	 */
	public String getAppointment()
	{
		return getAppointment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.appointment</code> attribute. 
	 * @param value the appointment
	 */
	public void setAppointment(final SessionContext ctx, final String value)
	{
		setProperty(ctx, APPOINTMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.appointment</code> attribute. 
	 * @param value the appointment
	 */
	public void setAppointment(final String value)
	{
		setAppointment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.appointments</code> attribute.
	 * @return the appointments
	 */
	public Collection<Appointment> getAppointments(final SessionContext ctx)
	{
		return APPOINTMENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.appointments</code> attribute.
	 * @return the appointments
	 */
	public Collection<Appointment> getAppointments()
	{
		return getAppointments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.appointments</code> attribute. 
	 * @param value the appointments
	 */
	public void setAppointments(final SessionContext ctx, final Collection<Appointment> value)
	{
		APPOINTMENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.appointments</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>Patient.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public Date getBirthDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BIRTHDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public Date getBirthDate()
	{
		return getBirthDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BIRTHDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final Date value)
	{
		setBirthDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.codFisc</code> attribute.
	 * @return the codFisc
	 */
	public String getCodFisc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODFISC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.codFisc</code> attribute.
	 * @return the codFisc
	 */
	public String getCodFisc()
	{
		return getCodFisc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.codFisc</code> attribute. 
	 * @param value the codFisc
	 */
	public void setCodFisc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODFISC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.codFisc</code> attribute. 
	 * @param value the codFisc
	 */
	public void setCodFisc(final String value)
	{
		setCodFisc( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DOCTORHANDLER.newInstance(ctx, allAttributes);
		WARDHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.dateIn</code> attribute.
	 * @return the dateIn
	 */
	public Date getDateIn(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.dateIn</code> attribute.
	 * @return the dateIn
	 */
	public Date getDateIn()
	{
		return getDateIn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateIn</code> attribute. 
	 * @param value the dateIn
	 */
	public void setDateIn(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateIn</code> attribute. 
	 * @param value the dateIn
	 */
	public void setDateIn(final Date value)
	{
		setDateIn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.dateOut</code> attribute.
	 * @return the dateOut
	 */
	public Date getDateOut(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEOUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.dateOut</code> attribute.
	 * @return the dateOut
	 */
	public Date getDateOut()
	{
		return getDateOut( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateOut</code> attribute. 
	 * @param value the dateOut
	 */
	public void setDateOut(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEOUT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateOut</code> attribute. 
	 * @param value the dateOut
	 */
	public void setDateOut(final Date value)
	{
		setDateOut( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.doctor</code> attribute.
	 * @return the doctor
	 */
	public String getDoctor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.doctor</code> attribute.
	 * @return the doctor
	 */
	public String getDoctor()
	{
		return getDoctor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.doctor</code> attribute. 
	 * @param value the doctor
	 */
	public void setDoctor(final SessionContext ctx, final String value)
	{
		DOCTORHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.doctor</code> attribute. 
	 * @param value the doctor
	 */
	public void setDoctor(final String value)
	{
		setDoctor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender()
	{
		return getGender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final EnumerationValue value)
	{
		setGender( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.placeDate</code> attribute.
	 * @return the placeDate
	 */
	public Date getPlaceDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PLACEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.placeDate</code> attribute.
	 * @return the placeDate
	 */
	public Date getPlaceDate()
	{
		return getPlaceDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.placeDate</code> attribute. 
	 * @param value the placeDate
	 */
	public void setPlaceDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PLACEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.placeDate</code> attribute. 
	 * @param value the placeDate
	 */
	public void setPlaceDate(final Date value)
	{
		setPlaceDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.ward</code> attribute.
	 * @return the ward
	 */
	public String getWard(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WARD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.ward</code> attribute.
	 * @return the ward
	 */
	public String getWard()
	{
		return getWard( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.ward</code> attribute. 
	 * @param value the ward
	 */
	public void setWard(final SessionContext ctx, final String value)
	{
		WARDHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.ward</code> attribute. 
	 * @param value the ward
	 */
	public void setWard(final String value)
	{
		setWard( getSession().getSessionContext(), value );
	}
	
}
