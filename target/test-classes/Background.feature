Feature: We are testing background keyword in this file
  #We are predefining the steps below for each scenario in this feature file
  #Which means it will run these steps before each scenario we run in this class
  #We must place Background keyword before all scenarios in file and after Feature keyword.it will not work otherwise.Scenario:
  #Background keyword works like hooks
  #We cannot have background keyword twice
  #hooks are global,background is local


  Background: The user wants to go to OrangeHRM Website
    Given The user wants to go to OrangeHRM Website
    When The user wants to enter Username and Password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard



  @TC200 @Smoke @Regression @BackgroundKeyword
  Scenario: Adding a new employee
    Then The user wants to click on PIM module
    And The user wants to go to Add Employee Page
    Then The user wants to add first name as "Bahar"
    Then The user wants to add last name as "Reanstech"
    Then The user wants to save personal information
    Then The user should be able to see "Personal Details"

        #in this scenario we are using map to provide multiple pieces of information
  @TC300 @Smoke @Regression @BackgroundKeyword
  Scenario: Adding new employee-create login details
    Then The user wants to click on PIM module
    And The user wants to go to Add Employee Page
    Then The user wants to add employee's first and last name as following
      #Key       #Value
      |FirstName| Shahnaz |
      |LastName| Renastech|
    Then The user wants to add Login Details as following
     #Key       #Value
      |UserName| sahabb1232 |
      |Password| Renastech34#$|
      |Status  | Disabled   |
    Then The user wants to save personal information
    Then The user should be able to see "Personal Details"