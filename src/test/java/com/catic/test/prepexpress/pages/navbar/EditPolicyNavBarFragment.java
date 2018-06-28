package com.catic.test.prepexpress.pages.navbar;

import org.openqa.selenium.By;

public class EditPolicyNavBarFragment {
	private static final By MENU_POLICY_TYPE = By.xpath(".//li[@class='dropdown' and contains(., 'Policy Type')]");
	private static final By ITEM_PC = By.linkText("PC");
	private static final By ITEM_MP = By.linkText("MP");
	private static final By ITEM_OP = By.linkText("OP");
	private static final By ITEM_SF = By.linkText("SF");
	
	private static final By MENU_COPY_SCHEDULES = By.xpath(".//li[@class='dropdown' and contains(., 'Copy Schedules')]");
	// pc
	private static final By ITEM_COPY_B_EXCEPITONS_TO_MP_OP = By.id("copy-schedule-pc-xp");
	private static final By ITEM_COPY_B_EXCEPTIONS_TO_SF_ADD = By.id("copy-schedule-pc-sf");
	private static final By ITEM_COPY_B_EXCEPTIONS_TO_OP = By.id("copy-schedule-pc-xop");
	private static final By ITEM_COPY_B_EXCEPTIONS_TO_MP = By.id("copy-schedule-pc-xmp");
	// op
	private static final By ITEM_OP_COPY_B_SCHEDULE_TO_PC = By.id("copy-schedule-op-pc");
	private static final By ITEM_COPY_B_SCHEDULE_TO_MP = By.id("copy-schedule-op-mp");
	private static final By ITEM_COPY_B_SCHEDULE_FROM_PC = By.id("copy-schedule-pc-op");
	private static final By ITEM_COPY_B_SCHEDULE_FROM_MP = By.id("copy-schedule-mp-op");
	// mp
	private static final By ITEM_COPY_B_SCHEDULE_FROM_PC_TO_MP_OP = By.id("copy-schedule-pc-xp");
	private static final By ITEM_MP_COPY_B_SCHEDULE_TO_PC = By.id("copy-schedule-mp-pc");
	// sf
	private static final By ITEM_COPY_PC_B_EXCEPTIONS_TO_ADD = By.id("copy-schedule-pc-sf");
}
