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
package my.hospitaluiip.handler.impl;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.util.Calendar;
import java.util.Date;

import my.hospitaluiip.model.PatientModel;


/**
 *
 */
public class TotDaysHandler implements DynamicAttributeHandler<Integer, PatientModel>
{
	private Integer totDays;

	//calcolo giorni totali di degenza
	public Integer get(final PatientModel model)
	{
		final Date in = model.getDateIn();
		final Date out = model.getDateOut();
		final int input = in.getDay();
		final int output = out.getDay();
		//se la data di ingresso e uscita è nello stesso mese
		if (in.getMonth() == out.getMonth())
		{

			totDays = new Integer(output - input);
		}
		//se le date di ingresso e di uscita sono in mesi diversi
		else
		{
			final Calendar c = Calendar.getInstance();
			c.setTime(in);
			c.setTime(out);
			final int maxDay = c.getActualMaximum(Calendar.MONTH);
			final Integer totDays1 = new Integer(maxDay - input);
			final Integer totDays2 = new Integer(maxDay - output);
			totDays = new Integer(totDays1.intValue() + totDays2.intValue());

		}
		return totDays;
	}





	@Override
	public void set(final PatientModel model, final Integer totDays)
	{
		this.totDays = totDays;

	}


}

