@ElearningNoData
Feature: This feature is to automate the Elearning page
  To verify whether application allows teacher to add project details
  @GotoElearning
 	Scenario: Login to Elearning
  	Given User should launch the application and enter the url "http://elearningm1.upskills.in/"
    Then Login as Teacher "AnithaRaman123" "Malarz85"
    Then Go to the course
          
  Scenario: Add Project details
  	Given Click on Project icon
  	Then Click on create a new project icon
  	Then Enter valid title in title text box 
    And Enter valid text in sub title text box 
    Then click on save blog button
    Then click on project link
    Then click on new task icon
    And enter valid task in title text box 
    And click on save1 button
    Then click on Role management icon
    Then click on add a new role icon
    Then enter valid role in title text box 
    And click on save role button
    Then click on Assign role icon
    And select student / teacher name in user list box
    And click on validate button
    #Then click on user management icon
    #And click on checkbox beside the user
		#When click on register button
		#Then Display the user has been registered message
  