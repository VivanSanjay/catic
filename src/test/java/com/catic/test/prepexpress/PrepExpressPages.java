package com.catic.test.prepexpress;

public enum PrepExpressPages {
	// General
	LOGIN("login"),
	HOME("home"),
	
	// Title Search
	TITLE_SEARCH_IMPORT("title search import"),
	
	// Tools
	BLANK_DOCUMENTS("blank documents"),
	LENDER_MAINTENANCE("lender maintenance"),
	CONTACT_MAINTENANCE("contact maintenance"),
	PHRASE_MAINTENANCE("phrase code maintenance"),
	PREFERENCES("preferences"),
	
	// Reports
	JACKET_HISTORY("jacket history"),
	ICL_HISTORY("icl history"),
	BORROWER_LIST("borrower list"),
	CLOSINGS_BY_LENDER("closings by lender"),
	FILING_LIST_1099S("1099-s filing list"),
	LENDER_LIST("lender list"),
	
	// Create New File
	GEN_INFO("general info"),
	CD_PAGE_1("closing disclosure page 1"),
	CD_PAGE_2("closing disclosure page 2"),
	CD_PAGE_3("closing disclosure page 3"),
	CD_PAGE_4("closing disclosure page 4"),
	CD_PAGE_5("closing disclosure page 5"),
	HUD("hud"),
	POLICY_OTHER_DOCUMENTS("policy/other documents"),
	EDIT_POLICY("edit policy"),
	DISBURSEMENTS("disbursements"),
	ADJUSTMENT_SHEET("adjustment sheet"),
	ALTA_SETTLEMENT("alta settlement statement"),
	FORM_1099S("1099-s"),
	MANAGE_DOCUMENTS("manage documents");
	
	PrepExpressPages(String key) {
		this.pageKey = key;
	}
	
	private final String pageKey;
}
