package com.catic.test.prepexpress.steps;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;

import com.catic.test.prepexpress.model.DisclosureType;
import com.catic.test.prepexpress.model.FileDetails;
import com.catic.test.prepexpress.pages.home.HomePage;
import com.catic.test.prepexpress.pages.home.table.FileTableActionMenu;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomeSteps extends ScenarioSteps {
	private static final long serialVersionUID = -8116186129608525478L;
	
	private HomePage homePage;
	
	@Step
	public void createNewFile(FileDetails fileDetails) {
		createNewFile0(fileDetails);
	}
		
	@Step
	public void createNewFileWithRandomizedName(String baseFileName, String fileNumber, String titleNumber, DisclosureType disclosureType) {
		String fileName = FileDetails.randomFileName(baseFileName);
		FileDetails fileDetails = new FileDetails(fileName, fileNumber, titleNumber, disclosureType);
		createNewFile0(fileDetails);
	}
	
	@Step
	public void logOff() {
		homePage.logOut();
	}
	
	@Step
	public void filterByFileName(String fileName) {
		homePage.fileTable().filterOptions().setSearchTerm(fileName);
	}
	
	@Step
	public void filterByActiveFilesOnly() {
		homePage.fileTable().filterOptions().setActiveFilesOnly();
	}
	
	@Step
	public void assertActiveFilesOnly(boolean expectedActiveFilesOnly) {
		boolean displayedActiveFilesOnly = homePage.fileTable().filterOptions().activeFilesOnly();
		
		Assertions.assertThat(displayedActiveFilesOnly)
		.as("'Home Page' Active Files Only")
		.isEqualTo(expectedActiveFilesOnly);
	}
	
	@Step
	public void filterByAllFiles() {
		homePage.fileTable().filterOptions().setAllFiles();
	}
	
	@Step
	public void assertAllFiles(boolean expectedAllFiles) {
		boolean displayedAllFiles = homePage.fileTable().filterOptions().allFiles();
		
		Assertions.assertThat(displayedAllFiles)
		.as("'Home Page' All Files")
		.isEqualTo(expectedAllFiles);
	}
	
	@Step
	public void filterByInactiveFilesOnly() {
		homePage.fileTable().filterOptions().setInactiveFilesOnly();
	}
	
	@Step
	public void assertInactiveFilesOnly(boolean expectedInactiveFilesOnly) {
		boolean displayedInactiveFilesOnly = homePage.fileTable().filterOptions().inactiveFilesOnly();
		
		Assertions.assertThat(displayedInactiveFilesOnly)
		.as("'Home Page' All Files")
		.isEqualTo(expectedInactiveFilesOnly);
	}
	
	@Step
	public void filterByCreatedBetween(LocalDate start, LocalDate end) {
		homePage.fileTable().filterOptions().setCreatedBetween(start, end);
	}
	
	@Step
	public void filterByCreatedBetweenStartDate(LocalDate start) {
		homePage.fileTable().filterOptions().setStartDate(start);
	}
	
	@Step
	public void filterByCreatedBetweenEndDate(LocalDate end) {
		homePage.fileTable().filterOptions().setEndDate(end);
	}
	
	@Step
	public void assertCreatedBetween(String expectedStart, String expectedEnd) {
		SoftAssertions.assertSoftly(softly -> {
			String displayedStart = homePage.fileTable().filterOptions().getStartDate();
			String displayedEnd = homePage.fileTable().filterOptions().getEndDate();
			
			softly.assertThat(displayedStart)
			.as("'Home Page' Created Between Start Date")
			.isEqualTo(expectedStart);
			
			Assertions.assertThat(displayedEnd)
			.as("'Home Page' Created Between End Date")
			.isEqualTo(expectedEnd);
		});
	}
	
	@Step
	public void assertCreatedBetweenStartDate(String expectedStart) {
		String displayedStart = homePage.fileTable().filterOptions().getStartDate();
		
		Assertions.assertThat(displayedStart)
		.as("'Home Page' Created Between Start Date")
		.isEqualTo(expectedStart);
	}
	
	@Step
	public void assertCreatedBetweenEndDate(String expectedEnd) {
		String displayedEnd = homePage.fileTable().filterOptions().getEndDate();
		
		Assertions.assertThat(displayedEnd)
		.as("'Home Page' Created Between End Date")
		.isEqualTo(expectedEnd);
	}
	
	@Step
	public void clearFilter() {
		homePage.fileTable().filterOptions().clickClear();
	}
	
	@Step
	public void openFile(String fileName) {
		homePage.fileTable().findFirstRowElementByFileName(fileName).open();
	}
	
	@Step
	public void openFileAndGoToGenInfo(String fileName) {
		actionMenuFor(fileName).openFileAndGoToGenInfo();
	}
	
	@Step
	public void openFileAndGoToHUD(String fileName) {
		actionMenuFor(fileName).openFileAndGoToHUD();
	}
	
	@Step
	public void openFileAndGoToClosingDisclosure(String fileName) {
		actionMenuFor(fileName).openFileAndGoToClosingDisclosure();
	}
	
	@Step
	public void openFileAndGoToDisbursements(String fileName) {
		actionMenuFor(fileName).openFileAndGoToDisbursements();
	}
	
	@Step
	public void openFileAndGoToPolicyOtherDocuments(String fileName) {
		actionMenuFor(fileName).openFileAndGoToPolicyOtherDocuments();
	}
	
	@Step
	public void openFileAndGoToAdjustmentSheet(String fileName) {
		actionMenuFor(fileName).openFileAndGoToAdjustmentSheet();
	}
	
	@Step
	public void openFileAndGoToAltaSettlementStatement(String fileName) {
		actionMenuFor(fileName).openFileAndGoToAltaSettlementStatement();
	}
	
	@Step
	public void openFileAndGoTo1099S(String fileName) {
		actionMenuFor(fileName).openFileAndGoTo1099S();
	}
	
	@Step
	public void openFileAndGoToManageDocuments(String fileName) {
		actionMenuFor(fileName).openFileAndGoToManageDocuments();
	}
	
	@Step
	public void makeFileActive(String fileName) {
		actionMenuFor(fileName).makeFileActive();
	}
	
	@Step
	public void makeFileInactive(String fileName) {
		actionMenuFor(fileName).makeFileInactive();
	}
	
	/**
	 * Convenience method for accessing the 'Action' menu for a particular row in this table
	 * @param fileName
	 * @return the action menu widget
	 */
	private FileTableActionMenu actionMenuFor(String fileName) {
		return homePage.fileTable().findFirstRowElementByFileName(fileName).actionMenu();
	}
	
	private void createNewFile0(FileDetails fileDetails) {
		homePage.createNewFile().createNewFile(fileDetails);
	}
}
