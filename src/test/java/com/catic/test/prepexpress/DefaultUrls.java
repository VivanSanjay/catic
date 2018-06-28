package com.catic.test.prepexpress;

public final class DefaultUrls {
	private static final String BASE_URL = "https://uatpe.catic.com";
	
	// General
	public static final String LOGIN = BASE_URL + "/Account/LogOn";
	public static final String HOME = BASE_URL;
	
	// Import
	public static final String TITLE_SEARCH_IMPORT = BASE_URL + "/TitleSearchImport/Form";
	
	// Tools
	public static final String BLANK_DOCUMENTS = BASE_URL + "/Documents/BlankDocuments";
	public static final String LENDER_MAINTENANCE = BASE_URL + "/AgentLender/Maintenance";
	public static final String CONTACT_MAINTENANCE = BASE_URL + "/AgentContact/Maintenance";
	public static final String PHRASE_MAINTENANCE = BASE_URL + "/PhraseCodes/PhraseCodeEditor";
	public static final String PREFERENCES = BASE_URL + "/Preferences/Form";
	
	// Reports
	public static final String JACKET_HISTORY = BASE_URL + "/Reports/Form?key=JacketHistory";
	public static final String ICL_HISTORY = BASE_URL + "/Reports/Form?key=ICLHistory";
	public static final String BORROWER_LIST = BASE_URL + "/Reports/Form?key=BorrowerList";
	public static final String CLOSINGS_BY_LENDER = BASE_URL + "/Reports/Form?key=ClosingsByLender";
	public static final String FILING_LIST_1099S = BASE_URL + "/Reports/Form?key=1099SFilingList";
	public static final String LENDER_LIST = BASE_URL + "/Reports/Form?key=LenderList";
	
	// Create New File
	public static final String GENERAL_INFO = BASE_URL + "/GenInfo/Form";
	public static final String CLOSING_DISCLOSURE = BASE_URL + "/Disclosure/Form";
	public static final String HUD = BASE_URL + "/HUD/Form";
	public static final String POLICY_OTHER_DOCUMENTS = BASE_URL + "/Policy/Form";
	public static final String EDIT_POLICY = BASE_URL + "/Policy/Edit";
	public static final String DISBURSEMENTS = BASE_URL + "/Disbursements/Form";
	public static final String ADJUSTMENT_SHEET = BASE_URL + "/AdjusmentSheet/Form";
	public static final String ALTA_SETTLEMENT = BASE_URL + "/AltaSettlement/Form";
	public static final String FORM_1099S = BASE_URL + "/Form1099/Form";
	public static final String MANAGE_DOCUMENTS = BASE_URL + "/Documents/Form";
}
