/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.hospitaluiip.setup;

import static my.hospitaluiip.constants.HospitaluiipConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.hospitaluiip.constants.HospitaluiipConstants;
import my.hospitaluiip.service.HospitaluiipService;


@SystemSetup(extension = HospitaluiipConstants.EXTENSIONNAME)
public class HospitaluiipSystemSetup
{
	private final HospitaluiipService hospitaluiipService;

	public HospitaluiipSystemSetup(final HospitaluiipService hospitaluiipService)
	{
		this.hospitaluiipService = hospitaluiipService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		hospitaluiipService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return HospitaluiipSystemSetup.class.getResourceAsStream("/hospitaluiip/sap-hybris-platform.png");
	}
}
