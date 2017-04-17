Feature: Create Account

  Background:
    Given I am on Moo homepage
    When I choose to signin
    And I choose the option to signup


  Scenario: Successfully create account
    And I enter First Name as "Nirupam"
    And I enter Last Name as "Saha"
    And I enter Email Address as a valid random email
    And I enter Password as "Password123"
    And I enter Confirm password as "Password123"
    And I select country as "India"
    And I select Industry as "Technology"
    And I select Business type as "Software"
    And I select size of business as "I work for myself"
    And I choose to signup for Moo emails
    And I click on Create Account button
    Then I should be on Dashboard Page
    And I should see the welcome message "Hello Nirupam"

  Scenario: Cannot create account with invalid email address
    And I enter First Name as "Nirupam"
    And I enter Last Name as "Saha"
    And I enter Email Address as "abcd"
    And I enter Password as "Password123"
    And I enter Confirm password as "Password123"
    And I select country as "India"
    And I select Industry as "Technology"
    And I select Business type as "Software"
    And I select size of business as "I work for myself"
    And I choose to signup for Moo emails
    And I click on Create Account button expecting error
    Then I should see an error message for the email field

