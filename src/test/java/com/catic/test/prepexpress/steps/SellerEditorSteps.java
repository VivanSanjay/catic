package com.catic.test.prepexpress.steps;

import org.javamoney.moneta.Money;

import com.catic.test.prepexpress.pages.createnewfile.Form1099SPage;

import net.thucydides.core.annotations.Step;


public class SellerEditorSteps {
	//id required

	private Form1099SPage form1099SPage;

	
	@Step
	public void addSellerEditorSave(String name,String ssn,String address,String city,String state,String zipcode,String marriagecode,Money gross,Money estatetax) 
	{
		form1099SPage.addSellerEditor(name, ssn, address, city, state, zipcode, marriagecode, gross, estatetax).sellerEditorClickSaveButton();
	}
	
	
	
}
