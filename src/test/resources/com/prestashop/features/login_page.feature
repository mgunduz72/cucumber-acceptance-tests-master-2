@login
Feature: login 

Scenario: login link
     Given the user is on the home page
     When the user clicks on the sign in link
     Then username and password fields should be displayed
	
	
