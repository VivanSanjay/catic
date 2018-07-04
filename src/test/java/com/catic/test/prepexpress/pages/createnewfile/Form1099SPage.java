package com.catic.test.prepexpress.pages.createnewfile;

import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.createnewfile.widgets.SellerEditor1099S;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class Form1099SPage extends PageObject {
	
	@FindBy(id = "addSellerButton")
	private WebElementFacade addSellerButton;
	
	@FindBy(id = "refreshSellersButton")
	private WebElementFacade refreshSellerNamesButton;
	
	@FindBy(id ="deleteSellerConfirmationYesButton")
	private WebElementFacade deleteSellerEditor_Yes_Button;
	
	@FindBy(id ="deleteSellerConfirmationNoButton")
	private WebElementFacade deleteSellerEditor_No_Button;
	
	@FindBy(xpath ="//a[@href='#'][contains(text(),'Ãƒâ€”')]")
	private WebElementFacade deleteSellerEditor_Cross_Icon;
	
	@FindBy(id ="saveSellerButton")
	private WebElementFacade saveSellerEditorButton;
	
	@FindBy(id ="cancelSellerButton")
	private WebElementFacade cancelSellerEditorButton;
	
	@FindBy(xpath ="//i[@class='icon-edit']")
	private WebElementFacade editSellerEditorIcon;
	
	@FindBy(xpath ="//i[@class='icon-remove']")
	private WebElementFacade deleteSellerEditorIcon;
	
	@FindBy(id ="sellerEditor")
	private SellerEditor1099S addSellerWidget;
	
	public ActionsMenu actions() {
		return navigation().actions();
	}
	
	public SellerEditor1099S addSeller(WebElementFacade addSellerIcon,String name,String ssn,String address,String city,String state,String zipcode,String marriagecode,Money gross,Money estatetax)
	{
		addSellerIcon.click();
		addSellerWidget.sellerEditorEnterName(name);
		addSellerWidget.sellerEditorEnterTin_Ssn(ssn);
		addSellerWidget.sellerEditorEnterStreetSddress(address);
		addSellerWidget.sellerEditorEnterCity_Town(city);
		addSellerWidget.sellerEditorEnterState(state);
		addSellerWidget.sellerEditorEnterZipCode(zipcode);
		addSellerWidget.sellerEditorEnterMarriageCode(marriagecode);
		addSellerWidget.sellerEditorEnterGross(gross);
		addSellerWidget.sellerEditorEnterEstateTax(estatetax);
			
		return addSellerWidget;
	}
	
	public SellerEditor1099S addSellerEditor(String name,String ssn,String address,String city,String state,String zipcode,String marriagecode,Money gross,Money estatetax)
	{
		return addSeller(addSellerButton,name,ssn,address,city,state,zipcode,marriagecode,gross,estatetax);
	}
	
	public void clickRefreshSellerNames()
	{
		refreshSellerNamesButton.click();
	}
	
	public void clickEditSellerInfo()
	{
		editSellerEditorIcon.click();
	}
	
	public void deleteSellerInfo()
	{
		deleteSellerEditorIcon.click();
	}
	
	//to close the file 
	public void closeFile() {
		navigation().closeFile();
	}
	
	
	
	private GenericCreateNewFileNavBarFragment navigation() {
		return GenericCreateNewFileNavBarFragment.from(this);
	}
}
