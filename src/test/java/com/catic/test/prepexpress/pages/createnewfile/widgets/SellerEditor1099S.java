package com.catic.test.prepexpress.pages.createnewfile.widgets;

import org.javamoney.moneta.Money;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(SellerEditor1099SImpl.class)
public interface SellerEditor1099S extends WidgetObject{

	SellerEditor1099S sellerEditorEnterName(String name);

	SellerEditor1099S sellerEditorEnterTin_Ssn(String ssn);

	SellerEditor1099S sellerEditorEnterStreetSddress(String address);

	SellerEditor1099S sellerEditorEnterCity_Town(String city);

	SellerEditor1099S sellerEditorEnterState(String state);

	SellerEditor1099S sellerEditorEnterZipCode(String zipcode);

	SellerEditor1099S sellerEditorEnterMarriageCode(String marriagecode);

	SellerEditor1099S sellerEditorEnterGross(Money gross);

	SellerEditor1099S sellerEditorEnterEstateTax(Money estatetax);

	SellerEditor1099S sellerEditorClickSaveButton();

	SellerEditor1099S sellerEditorClickCloseButton();


	
	

}
