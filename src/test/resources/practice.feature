Feature: exercise for map list and scenario outline

  Background: my first 4 steps for the scenarios
    Given The user wants to go ORANGEHTM
    When The user wants to enter user and password
    Then The user wants to click on PIM Modulee
    Then The user wants to click Add Employee Header

  @MAP
  Scenario: example for map
    Then The user wants to add employee's  name and surname as following
    |Name|ahmet|
    |Surname|deger|
    And The user wants to click on Save button

    @LIST
  Scenario: example for list
    Then The user wants to add employee's  name and surname as following by list
      |Ahmet  |deger |
      |Ali    |Ceyhan|
      |Huseyin|DEGER |
    And The user wants to click on Save button

      @SceriouPractice
      Scenario Outline: example for DDT
        Then The user wants to add employee's  name and surname as following by "<firstname1>" "<surname>"
        And The user wants to click on Save button

        Examples:
          |firstname1|surname|
          |Ahmet     |deger  |
          |Ali       |Ceyhan |
          |Huseyin   |DEGER  |



