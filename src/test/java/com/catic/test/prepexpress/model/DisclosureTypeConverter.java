package com.catic.test.prepexpress.model;

import cucumber.deps.com.thoughtworks.xstream.converters.ConversionException;
import cucumber.deps.com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class DisclosureTypeConverter extends AbstractSingleValueConverter {

	@SuppressWarnings("rawtypes")
	@Override
	public boolean canConvert(Class type) {
		return type.equals(DisclosureType.class);
	}

	@Override
	public Object fromString(String value) {
		DisclosureType disclosureType = DisclosureType.fromString(value);
		
		if (disclosureType == DisclosureType.EMPTY) {
			String allowed = String.join(",", DisclosureType.allowedValues());
			throw new ConversionException(String.format("Couldn't convert %s to %s. Legal values are [%s]", value, DisclosureType.class, allowed));
		}

		return disclosureType;
	}

}
