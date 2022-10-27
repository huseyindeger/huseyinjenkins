Feature: Functional testing on Orange HRM

  Scenario: Login to Orange HRM
    Given The user wants to go to OrangeHRM Website
    When The user wants to enter Username and Password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard

    @ParameterizedDashboard @TC100
  Scenario: Login to Orange HRM with Parameterized message
    Given The user wants to go to OrangeHRM Website
    When The user wants to enter Username and Password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on "Dashboard"

      @TC200 @Smoke @Regression
  Scenario: Adding a new employee
        Given The user wants to go to OrangeHRM Website
        When The user wants to enter Username and Password
        Then The user wants to click on Login button
        And The user wants to verify that browser landed on Dashboard
        Then The user wants to click on PIM module
        And The user wants to go to Add Employee Page
        Then The user wants to add first name as "Bahar"
        Then The user wants to add last name as "Reanstech"
        Then The user wants to save personal information
        Then The user should be able to see "Personal Details"

        #in this scenario we are using map to provide multiple pieces of information
@TC300 @Smoke @Regression
  Scenario: Adding new employee-create login details
    Given The user wants to go to OrangeHRM Website
    When The user wants to enter Username and Password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard
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

@TC400 @Regression
  Scenario: Adding a new employee-Third format using List
    Given The user wants to go to OrangeHRM Website
    When The user wants to enter Username and Password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard
    Then The user wants to click on PIM module
    And The user wants to go to Add Employee Page
    Then The user wants to add employee's first and last name as following list
    #firstname  #lastname
    |Serhat    | Renastech23$|
   Then The user wants to add Login in a  List way
   #Username        #Password    #Status
   |reanastech2344|Renastech2022#$.|Disabled|
  Then The user wants to save personal information
  Then The user should be able to see "Personal Details"


  #Scenario outline is the place where we implement DDT(Data Driven Testing)
  @Scenario_Outline2
  Scenario Outline: Adding a new employee-Using Scenario Outline
    Given The user wants to go to OrangeHRM Website
    When The user wants to enter Username and Password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard
    Then The user wants to click on PIM module
    And The user wants to go to Add Employee Page
    Then The user wants to add employee's first and last name as following list
    #firstname  #lastname
      |Serhat    | Renastech23$|
      |Bahar     |Renastech#2  |
    Then user wants to add login information "<username>" "<password>" "<status>"
    Examples:
    |username  |password|status  |
    |Huseyin123|bjdka   |Disabled|
    |Ahmet     |kjdgdhvd|Disabled|
    |Mazlumsd  |k341dhvd|Enabled |
    |Alikodjf  |kv323dgd|Enabled |
    |Yasdb     |dgdhdfdd|Enabled |
    |Serjnsd   |1454jdfd|Disabled|

  @Scenario_Outline1
  Scenario Outline: Adding a new employee-Using Scenario Outline
    Given The user wants to go to OrangeHRM Website
    When The user wants to enter Username and Password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard
    Then The user wants to click on PIM module
    And The user wants to go to Add Employee Page
    Then The user wants to add employee's first and last name as "<firstname>" "<lastname>"
    Then user wants to add login information "<username>" "<password>" "<status>"
    Then The user wants to go to OrangeHRM Website
    Examples:
      |username  |password|status  |firstname|lastname|
      |Huseyin123|bjdka   |Disabled|reanstech|renas   |
      |Ahmet     |kjdgdhvd|Disabled|Yaseen   |renastech|
      |Mazlumsd  |k341dhvd|Enabled |Bahar    |uludag   |
      |Alikodjf  |kv323dgd|Enabled |Banu     |yildiz   |
      |Yasdb     |dgdhdfdd|Enabled |yildiz   |tilbe    |
      |Serjnsd   |1454jdfd|Disabled|huseyin  |deger    |


  @Scenario_Outline3
  Scenario Outline: Adding new nationalities to nationalities Page
    Given The user wants to go to OrangeHRM Website
    When The user wants to enter Username and Password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard
    Then The user wants to click Admin Module
    Then The user wants to click on Nationalities Section
    Then The user wants to click on add button
    Then The user wants to add new nationalities as "<nationalities>"

    Examples:
    |nationalities|
    |Kurdisha     |
    |Arabica      |
    |Italiana     |




