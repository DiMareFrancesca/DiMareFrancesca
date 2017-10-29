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
package my.race1uiip.setup;

import static my.race1uiip.constants.Race1uiipConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.race1uiip.constants.Race1uiipConstants;
import my.race1uiip.service.Race1uiipService;


@SystemSetup(extension = Race1uiipConstants.EXTENSIONNAME)
public class Race1uiipSystemSetup
{
	private final Race1uiipService race1uiipService;

	public Race1uiipSystemSetup(final Race1uiipService race1uiipService)
	{
		this.race1uiipService = race1uiipService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		race1uiipService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return Race1uiipSystemSetup.class.getResourceAsStream("/race1uiip/sap-hybris-platform.png");
	}
}
