/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 12.46.10                         ---
 * ----------------------------------------------------------------
 */
package my.hospitaluiip.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import my.hospitaluiip.constants.HospitaluiipConstants;
import my.hospitaluiip.jalo.Appointment;
import my.hospitaluiip.jalo.Doctor;
import my.hospitaluiip.jalo.Patient;
import my.hospitaluiip.jalo.Ward;

/**
 * Generated class for type <code>HospitaluiipManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHospitaluiipManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Appointment createAppointment(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HospitaluiipConstants.TC.APPOINTMENT );
			return (Appointment)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Appointment : "+e.getMessage(), 0 );
		}
	}
	
	public Appointment createAppointment(final Map attributeValues)
	{
		return createAppointment( getSession().getSessionContext(), attributeValues );
	}
	
	public Doctor createDoctor(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HospitaluiipConstants.TC.DOCTOR );
			return (Doctor)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Doctor : "+e.getMessage(), 0 );
		}
	}
	
	public Doctor createDoctor(final Map attributeValues)
	{
		return createDoctor( getSession().getSessionContext(), attributeValues );
	}
	
	public Patient createPatient(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HospitaluiipConstants.TC.PATIENT );
			return (Patient)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Patient : "+e.getMessage(), 0 );
		}
	}
	
	public Patient createPatient(final Map attributeValues)
	{
		return createPatient( getSession().getSessionContext(), attributeValues );
	}
	
	public Ward createWard(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HospitaluiipConstants.TC.WARD );
			return (Ward)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Ward : "+e.getMessage(), 0 );
		}
	}
	
	public Ward createWard(final Map attributeValues)
	{
		return createWard( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return HospitaluiipConstants.EXTENSIONNAME;
	}
	
}
