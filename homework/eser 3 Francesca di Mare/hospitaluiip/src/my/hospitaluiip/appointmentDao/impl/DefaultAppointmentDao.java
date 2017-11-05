package my.hospitaluiip.appointmentDao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.hospitaluiip.appointmentDao.AppointmentDao;
import my.hospitaluiip.model.AppointmentModel;


public class DefaultAppointmentDao extends AbstractItemDao implements AppointmentDao
{

	public List<AppointmentModel> findAppointmentByPatient(final String patient)
	{
		final String queryStr = "SELECT {a.PK} FROM {Patient as p Join Appointment as a ON {p.appointment}={a.PK}} "
				+ "WHERE {a.result}='POSITIVE' ";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);

		fsq.addQueryParameter("patient", patient);

		final SearchResult<AppointmentModel> result = getFlexibleSearchService().search(fsq);

		final List<AppointmentModel> appointments = result.getResult();

		return appointments;
	}

}
