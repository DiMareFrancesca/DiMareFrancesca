package my.hospitaluiip.appointment.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import my.hospitaluiip.appointment.service.AppointmentService;
import my.hospitaluiip.appointmentDao.AppointmentDao;
import my.hospitaluiip.appointmentDao.PatientDao;
import my.hospitaluiip.model.AppointmentModel;


public class DefaultAppointmentService implements AppointmentService
{


	final AppointmentDao appointmentDao;

	@Override
	public List<AppointmentModel> getAppointmentsForPatient(final String patient)
	{
		final List<AppointmentModel> appointments = appointmentDao.findAppointmentByPatient(patient);
		if (CollectionUtils.isEmpty(appointments))
		{
			return null;
		}

		return appointments;
	}

	public AppointmentDao getAppointmentDao()
	{
		return appointmentDao;
	}

	@Required
	public void setPatientDao(final PatientDao patientDao)
	{
		this.patientDao = patientDao;
	}
}


