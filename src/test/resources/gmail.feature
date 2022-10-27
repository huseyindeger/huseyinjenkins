Feature: Login to Gmail,Google Search
  #We always have to start with Feature keyword otherwise it will not work properly

  Scenario: Verify that login to gmail with positive credentials is successful
    Given The user wants to go to Google
    When The user wants to click on Gmail button
    Then The user wants to verify if Gmail Page is opened successfully
    And The user wants to click on Sign In button
    And The user wants to enter correct email address
    And The user wants to enter correct password
    And The user wants to click on Login button
    Then The user wants to verify that signing was successful


    Scenario: Verify that user is able search in emails
      Given The user wants to go to Google
      When The user wants to click on Gmail button
      Then The user wants to verify if Gmail Page is opened successfully
      And The user wants to click on Sign In button
      And The user wants to enter correct email address
      And The user wants to enter correct password
      And The user wants to click on Login button
      Then The user wants to verify that signing was successful
      And The user wants to search for Renastech in emails
      Then The user wants to verify that search was successful


      #Make a search on Google for Renastech and click on first related website
      #and make sure website opened successful
  Scenario: Verify that the user is able to go to Renastech website using google search
    Given The user wants to go to Google
    When The user wants to search for Renastech
    And The user wants to click on Google search button
    And The user wants to click on Renastech in results
    Then The user wants to verify that Renastech Website is opened
    #usually we use Then keyword where there is some verification


    #Each step is sentence sensitive.So you need to pass exact same steps to use it is another scenario
    Scenario: Verify that the user is able to go to Renastech website by Click I'm Feeling Lucky button
      Given The user wants to go to Google
      When The user wants to search for Renastech
      And The user wants to click on I'm Feeling Lucky button
      Then The user wants to verify that Browser is directed to renastech.com

      #you can use steps here when providing details on how to reproduce a bug in a jira ticket

      #The tools that we use in this framework
      #this framework is cucumber BDD with JUnit
      #Selenium--Automation tool for web browser
      #JUnit---This is for testing framework.For assertions/Instead of JUnit we can use TestNG as well
      #Cucumber--Type of framework



