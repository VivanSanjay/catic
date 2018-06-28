package com.catic.test.prepexpress.model;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import cucumber.deps.com.thoughtworks.xstream.annotations.XStreamConverter;

public class FileDetails {
	private String fileName = "";
	private String fileNumber = "";
	private String titleNumber = "";
	
	@XStreamConverter(value = DisclosureTypeConverter.class)
	private DisclosureType fileType = DisclosureType.EMPTY;

	public FileDetails(String fileName, String fileNumber, String titleNumber, DisclosureType fileType) {
		this.fileName = StringUtils.defaultIfEmpty(fileName, "");
		this.fileNumber = StringUtils.defaultIfEmpty(fileNumber, "");
		this.titleNumber = StringUtils.defaultIfEmpty(titleNumber, "");
		this.fileType = ObjectUtils.defaultIfNull(fileType, DisclosureType.EMPTY);
	}
	
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @return the fileNumber
	 */
	public String getFileNumber() {
		return fileNumber;
	}

	/**
	 * @return the titleNumber
	 */
	public String getTitleNumber() {
		return titleNumber;
	}

	/**
	 * @return the disclosure type
	 */
	public DisclosureType getDisclosureType() {
		return fileType;
	}
	
	/**
	 * Appends a random alphanumeric string to the given base name
	 * @param baseName
	 * @return a new string with a randomized suffix
	 */
	public static String randomFileName(String baseName) {
		return baseName + "_" + RandomStringUtils.randomAlphanumeric(5);
	}
}
