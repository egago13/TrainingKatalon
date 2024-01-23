#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@tag
	Feature: Patient Registration
 	Background: 
 	Given As a user that succeeds in Login
 	
  @tag1
  Scenario Outline: Registration with Valid Data
    Given the user is on Home Page 
    When I click on Register a Patient menu
    And I input the First Name <FirstName>
    And Input the Family Name  <FamilyName>
    And I click on Next button
    And I select the Gender
    And I click on Next button
    And I input the Day of Birthday <DBday>
    And I select the Month of Birthday 
    And I input the Year of Birthday <YBday>
    And I click on Next button
    And I input the Address <Address>
    And I click on Next button
    And I input the Phone Number <PHNum>
    And I click on Next button
    And I select the Relation 
    And I input the Person Name <PName>
    And I click on Next button
    And I click on Confirm button
    Then I verify the Patient Name <FirstName>

    Examples: 
      | FirstName	| FamilyName	| DBday	|	YBday	|	Address	|	PHNum	|	PName	|
      | Friska	| Womsiwor	| 13	|	1993	|	Jl Tenis	|	084567899876	|	Dominggus	|
