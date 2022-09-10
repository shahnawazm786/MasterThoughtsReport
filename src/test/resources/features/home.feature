#Author: Mohammad Shahnawaz
#Keywords Summary : Home page link verification
@homepage @sanity
Feature: HomePage 
  In this scenario we checked element available on the given page
  @logo
  Scenario: Verify the logo
    Given veify the logo on home page
    
  @inputtext
  Scenario: verify the input text
    Given verify the user input text on home page
    And verify the user password text on home page
    

  @loginbutton
  Scenario: Verify the login button
    Given verify the login button on home page
 
 