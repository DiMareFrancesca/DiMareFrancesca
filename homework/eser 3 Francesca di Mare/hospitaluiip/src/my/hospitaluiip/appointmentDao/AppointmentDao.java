package my.hospitaluiip.appointmentDao;

import java.util.List;

import my.hospitaluiip.model.AppointmentModel;


public interface AppointmentDao
{
	public List<AppointmentModel> findAppointmentByPatient(String patient);

}

