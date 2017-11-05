/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2017 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.hospitaluiip.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import java.util.List;

import my.hospitaluiip.appointment.service.AppointmentService;
import my.hospitaluiip.model.AppointmentModel;
import my.hospitaluiip.model.PatientModel;


/**
 *
 */
public class MyPrepareInterceptor implements PrepareInterceptor<PatientModel>
{
	private AppointmentService appointmentservice;

	public void onPrepare(final PatientModel patient, final InterceptorContext ctx) throws InterceptorException
	{
		final List<AppointmentModel> appointments = appointmentService.getAppointmentsForPatient(patient.getId());

		for (final AppointmentModel appointment : appointments)
		{

		}

	}
}
