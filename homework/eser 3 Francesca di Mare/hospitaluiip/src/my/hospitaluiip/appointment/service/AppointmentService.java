package my.hospitaluiip.appointment.service;

import java.util.List;

import my.hospitaluiip.model.AppointmentModel;


public interface AppointmentService
{
	public List<AppointmentModel> getAppointmentsForPatient(String patient);
}
