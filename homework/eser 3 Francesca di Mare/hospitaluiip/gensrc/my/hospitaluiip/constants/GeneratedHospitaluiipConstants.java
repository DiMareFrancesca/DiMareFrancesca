/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 12.46.10                         ---
 * ----------------------------------------------------------------
 */
package my.hospitaluiip.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedHospitaluiipConstants
{
	public static final String EXTENSIONNAME = "hospitaluiip";
	public static class TC
	{
		public static final String APPOINTMENT = "Appointment".intern();
		public static final String DOCTOR = "Doctor".intern();
		public static final String GENDERENUM = "genderEnum".intern();
		public static final String PATIENT = "Patient".intern();
		public static final String RESULTENUM = "resultEnum".intern();
		public static final String WARD = "Ward".intern();
	}
	public static class Attributes
	{
		// no constants defined.
	}
	public static class Enumerations
	{
		public static class GenderEnum
		{
			public static final String FEMALE = "FEMALE".intern();
			public static final String MALE = "MALE".intern();
		}
		public static class ResultEnum
		{
			public static final String POSITIVE = "POSITIVE".intern();
			public static final String NEGATIVE = "NEGATIVE".intern();
		}
	}
	public static class Relations
	{
		public static final String DOCTOR2APPOINTMENTRELATION = "Doctor2AppointmentRelation".intern();
		public static final String DOCTOR2PATIENTRELATION = "Doctor2PatientRelation".intern();
		public static final String PATIENT2APPOINTMENTRELATION = "Patient2AppointmentRelation".intern();
		public static final String WARD2DOCTORRELATION = "Ward2DoctorRelation".intern();
		public static final String WARD2PATIENTRELATION = "Ward2PatientRelation".intern();
	}
	
	protected GeneratedHospitaluiipConstants()
	{
		// private constructor
	}
	
	
}
