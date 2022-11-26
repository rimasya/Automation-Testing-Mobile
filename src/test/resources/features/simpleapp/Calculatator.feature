@Tugas @android
Feature: Calculator

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login

    @Positive
    Scenario: Calculate add with value
      Given User is already on login page
      When User input a is 5
      And User click dropdown button
      And User select icon plus
      And User input b is 10
      And User click equal button
      Then the total add should be 15

    @Positive
    Scenario: Calculate minus with value
      Given User is already on login page
      When User input a is 100
      And User click dropdown button
      And User select icon minus
      And User input b is 70
      And User click equal button
      Then the total add should be 30

    @Positive
    Scenario: Calculate Divided with value
      Given User is already on login page
      When User input a is 80
      And User click dropdown button
      And User select icon divided
      And User input b is 4
      And User click equal button
      Then the total add should be 20

    @Positive
    Scenario: Calculate Multiply with value
      Given User is already on login page
      When User input a is 20
      And User click dropdown button
      And User select icon star
      And User input b is 5
      And User click equal button
      Then the total add should be 100