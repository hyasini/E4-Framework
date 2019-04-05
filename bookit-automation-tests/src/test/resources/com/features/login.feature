@smoke 
Feature: Login 
	As a user, when I go to the login page
		I should be able to login
		
Background: 	
	Given the user is on the login page 
	
@login
Scenario: Login as teacher 
	When the user logs in as a teacher 
	Then the user should be logged in 
	
@login	
Scenario: Login as a teamlead 
	
	When the user logs in as a teamlead 
	Then the user should be logged in 
	
	
Scenario: Login as a anyone 

	When the user logs using "kliversageu@cbslocal.com" and "kerrieliversage" 
	Then the user should be logged in 
	
	