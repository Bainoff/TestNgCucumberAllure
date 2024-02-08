Feature: Bonus card

  Background: Main page is opened

  Scenario: Getting bonus points after registration
    Given Newly registered user is logged in the app
    When User goes to Bonus card in Profile menu
    Then Bonus page with 50 earned points is displayed

  Scenario: Doing purchase using bonus points
    Given User is logged in the app
    Given User made an order using bonus points
    When User cancels the order from reservation page
    Then Bonus points are refunded and displayed on the Bonus card page