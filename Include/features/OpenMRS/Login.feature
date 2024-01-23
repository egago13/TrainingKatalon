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
	Feature: Login
  As a user,
	I want to be able to log in to the website
	So I can access all of features on the website
  
  @tag1
  Scenario Outline: User login with valid credential
    Given the user is in Login Page
		When the user input the username <username>
		And the user input the password <password>
		And the user select the session location
		And the user click on login button
		Then system will display the home page

   #Examples: 
      #| username 	| password |
      #| Admin 		| Admin123 | 
