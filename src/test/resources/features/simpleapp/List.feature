@Tugas @android
Feature: Login

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu

  @list @positive
  Scenario: Verify user successfully login when input valid email and password
    And user do scroll

  Scenario: Taps long press
    And taps long press at list

  Scenario: Multi taps
    And taps at list ke 9
