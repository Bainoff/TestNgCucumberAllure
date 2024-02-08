Feature: Bookwatch

  Background: User is logged in the app

  Scenario: Verifying valid receipt number
    Given User made a purchase and receipt number is available for checking
    When User goes to Bookwatch in Profile menu
    And User enters valid receipt number
    Then Number is verified
    And Bonus points added

  Scenario: Verifying invalid receipt number
    Given User made a purchase and receipt number is available for checking
    When User goes to Bookwatch in Profile menu
    And User enters invalid receipt number
    Then Number is verified as invalid