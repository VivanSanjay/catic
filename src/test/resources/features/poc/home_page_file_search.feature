Feature: Searching for files on the home page
	As a user,
	I want to be able to search for my files,
	So that I can view and modify them.
	
	@ignore
	Scenario Outline: Searching for an existing file by creation date
		Given I am on the home page
		When I select the start date '<start date>'
		And I select the end date '<end date>'
		Then I should see files with a creation date between '<start date>' and '<end date>'
		Examples:
			| start date | end date   |
			| 06/12/2018 | 06/15/2018 |
			| 06/15/2018 | 06/20/2018 |

	@ignore
	Scenario Outline: Searching for an existing file by name
		Given I am on the home page
		When I search for '<term>'
		Then I should see files whose names contain '<term>'
		Examples:
			| term |
			| Test |
			| CD   |
	
	Scenario: Logging in and creating a new file
		Given I have logged in
		When I create a new file with the following details:
			| file name | file number | title number | file type|
			| test123   |             |              | hud      |
		Then I should see the 'General Info' page
	
	
