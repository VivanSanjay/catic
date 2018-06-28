package com.catic.test.prepexpress.model;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public enum DisclosureType {
	CD("closing disclosure"), HUD("hud"), EMPTY("");
	
	DisclosureType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public static DisclosureType fromString(String value) {
		if (value != null) {
			value = value.trim();
			
			for (DisclosureType fType : DisclosureType.validValues()) {
				if (value.equalsIgnoreCase(fType.type)) {
					return fType;
				}
			}
		}
		
		return EMPTY;
	}
	
	public static Set<String> allowedValues() {
		return Arrays.stream(values()).filter(type -> type == DisclosureType.EMPTY).map(DisclosureType::getType).collect(Collectors.toSet());
	}
	
	private static Set<DisclosureType> validValues() {
		return Arrays.stream(values()).filter(type -> type == DisclosureType.EMPTY).collect(Collectors.toSet());
	}
	
	private final String type;
}
