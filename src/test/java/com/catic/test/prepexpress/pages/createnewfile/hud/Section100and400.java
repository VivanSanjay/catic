package com.catic.test.prepexpress.pages.createnewfile.hud;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Section100and400 extends PageObject {
	// 100 - summary of borrower's transaction
	@FindBy(id = "PurchasePrice")
	private WebElementFacade l101Field;
	
	@FindBy(id = "L102Text")
	private WebElementFacade l102TextInputField;
	
	@FindBy(id = "L102Amount")
	private WebElementFacade l102AmountInputField;
	
	@FindBy(id = "L103Amount")
	private WebElementFacade l103AmountInputField;
	
	@FindBy(id = "L104Text")
	private WebElementFacade l104TextInputField;
	
	@FindBy(id = "L104Amount")
	private WebElementFacade l104AmountInputField;
	
	@FindBy(id = "L105Text")
	private WebElementFacade l105TextInputField;
	
	@FindBy(id = "L105Amount")
	private WebElementFacade l105AmountInputField;
	
	@FindBy(id = "btnOpen100Continuation")
	private WebElementFacade add100ContinuationButton;
	
	//TODO: section 100 table rows
	
	// city/town taxes
	@FindBy(id = "L106FromDateCalendar")
	private WebElementFacade l106FromDateInputField;
	
	@FindBy(id = "L106ToDateCalendar")
	private WebElementFacade l106ToDateInputField;
	
	@FindBy(id = "L106Amount")
	private WebElementFacade l106AmountInputField;
	
	@FindBy(id = "L106OverrideButton")
	private WebElementFacade l106ManualOverrideButton;
	
	// county taxes
	@FindBy(id = "L107FromDateCalendar")
	private WebElementFacade l107FromDateInputField;
	
	@FindBy(id = "L107ToDateCalendar")
	private WebElementFacade l107ToDateInputField;
	
	@FindBy(id = "L107Amount")
	private WebElementFacade l107AmountInputField;
	
	// assessments
	@FindBy(id = "L108FromDateCalendar")
	private WebElementFacade l108FromDateInputField;
	
	@FindBy(id = "L108ToDateCalendar")
	private WebElementFacade l108ToDateInputField;
	
	@FindBy(id = "L108Amount")
	private WebElementFacade l108AmountInputField;
	
	// other
	@FindBy(id = "L109Text")
	private WebElementFacade l109TextInputField;
	
	@FindBy(id = "L109Calc")
	private WebElementFacade l109CalcButton;
	
	@FindBy(id = "L109Amount")
	private WebElementFacade l109AmountInputField;
	
	@FindBy(id = "L109POCButton")
	private WebElementFacade l109POCButton;
	
	@FindBy(id = "L110Text")
	private WebElementFacade l110TextInputField;
	
	@FindBy(id = "L110Calc")
	private WebElementFacade l110CalcButton;
	
	@FindBy(id = "L110Amount")
	private WebElementFacade l110AmountInputField;
	
	@FindBy(id = "L110POCButton")
	private WebElementFacade l110POCButton;
	
	@FindBy(id = "L111Text")
	private WebElementFacade l111TextInputField;
	
	@FindBy(id = "L111Calc")
	private WebElementFacade l111CalcButton;
	
	@FindBy(id = "L111Amount")
	private WebElementFacade l111AmountInputField;
	
	@FindBy(id = "L111POCButton")
	private WebElementFacade l111POCButton;
	
	@FindBy(id = "L112Text")
	private WebElementFacade l112TextInputField;
	
	@FindBy(id = "L112Calc")
	private WebElementFacade l112CalcButton;
	
	@FindBy(id = "L112Amount")
	private WebElementFacade l112AmountInputField;
	
	@FindBy(id = "L112POCButton")
	private WebElementFacade l112POCButton;
	
	@FindBy(id = "L120SectionTotalAmt")
	private WebElementFacade grossAmountDueFromBorrowerField;
	
	// 400 - summary of seller's transaction
	@FindBy(id = "L401Amount")
	private WebElementFacade l401AmountField;
	
	@FindBy(id = "L402Text")
	private WebElementFacade l402TextField;
	
	@FindBy(id = "L402Amount")
	private WebElementFacade l402AmountField;
	
	@FindBy(id = "L403Text")
	private WebElementFacade l403TextInputField;
	
	@FindBy(id = "L403Amount")
	private WebElementFacade l402AmountInputField;
	
	@FindBy(id = "L404Text")
	private WebElementFacade l404TextInputField;
	
	@FindBy(id = "L404Amount")
	private WebElementFacade l404AmountInputField;
	
	@FindBy(id = "L405Text")
	private WebElementFacade l405TextInputField;
	
	@FindBy(id = "L405Amount")
	private WebElementFacade l405AmountInputField;
	
	// city/town taxes
	@FindBy(id = "L406FromDate")
	private WebElementFacade l406FromDateField;
	
	@FindBy(id = "L406ToDate")
	private WebElementFacade l406ToDateField;
	
	@FindBy(id = "L406Amount")
	private WebElementFacade l406AmountField;
	
	// county taxes
	@FindBy(id = "L407FromDate")
	private WebElementFacade l407FromDateField;
	
	@FindBy(id = "L407ToDate")
	private WebElementFacade l407ToDateField;
	
	@FindBy(id = "L407Amount")
	private WebElementFacade l407AmountField;
	
	// assessments
	@FindBy(id = "L408FromDate")
	private WebElementFacade l408FromDateField;
	
	@FindBy(id = "L408ToDate")
	private WebElementFacade l408ToDateField;
	
	@FindBy(id = "L408Amount")
	private WebElementFacade l408AmountField;
	
	// other
	@FindBy(id = "L409Text")
	private WebElementFacade l409TextField;
	
	@FindBy(id = "L409Amount")
	private WebElementFacade l409AmountField;
	
	@FindBy(id = "L410Text")
	private WebElementFacade l410TextField;
	
	@FindBy(id = "L410Amount")
	private WebElementFacade l410AmountField;
	
	@FindBy(id = "L411Text")
	private WebElementFacade l411TextField;
	
	@FindBy(id = "L411Amount")
	private WebElementFacade l411AmountField;
	
	@FindBy(id = "L412Text")
	private WebElementFacade l412TextField;
	
	@FindBy(id = "L412Amount")
	private WebElementFacade l412AmountField;
	
	@FindBy(id = "L420SectionTotalAmt")
	private WebElementFacade grossAmountDueToSellerField;
}
