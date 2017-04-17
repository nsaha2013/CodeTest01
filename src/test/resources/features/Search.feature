Feature: Search products
  Background:
    Given I am on Moo homepage

  Scenario: Search valid product
    When I search for "business card"
    Then I should see text displayed Results for "business card"
    And I should see text displayed about x results
    And I should see all the results title contains the text "business card"

  Scenario: Search invalid product
    When I search for "sdjfnjsdfj"
    Then I should see text displayed Results for "sdjfnjsdfj"
    And I should see the no result found message