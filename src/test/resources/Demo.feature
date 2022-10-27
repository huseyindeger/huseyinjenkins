Feature: Payment Gateway functional test

  @BuyingProduct_TC1 @BuyingProduct
  Scenario: Verify that user can buy a product
    Given The user wants to go Payment Gateway Website
    When The user wants to buy a elephant toy
    Then The user wants to provide payment information
    And The user wants to click on pay now
    And The user wants to verify message is successful

    #first step is go to website
  #second step is choose quantity and click on buy now button
  #third step we will provide all required information
  #fourth step we will verify if we can see success message
  @BuyingProduct_TC2 @BuyingProduct
  Scenario: Verify that user can buy multiple products
    Given The user wants to go Payment Gateway Website
    When The user wants to buy  elephant toy as "5"
    Then The user wants to enter Credit Card Number as "4444443334433333"
    And The user wants to enter Expiration Month as "11"
    And The user wants to enter Expiration Year as "2025"
    And The user wants to enter CVVCode as "177"
    Then The user wants to click on pay now
    And The user wants to verify message as "Payment successfull!"

@TC_600
    Scenario:Verify that user can buy multiple products with using map
      Given The user wants to go Payment Gateway Website
      When The user wants to buy  elephant toy as "5"
      Then The user wants to provite enter payment information as fallowing
      |CardNumber|4545454545454545|
      |EMonth    |11              |
      |EYear     |2025            |
      |CvvCode   |177             |
      Then The user wants to click on pay now
      And The user wants to verify message as "Payment successfull!"
@TC_700
  Scenario:Verify that user can buy multiple products with following list
    Given The user wants to go Payment Gateway Website
    When The user wants to buy  elephant toy as following quantity
    |5|
    |9|
    |1|
    Then The user wants to provite enter payment information as fallowing lists
      |4545454545454545|11|2025|177
    Then The user wants to click on pay now
    And The user wants to verify message as "Payment successfull!"




