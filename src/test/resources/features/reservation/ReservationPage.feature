Feature: Reservation details check

  Background: Main page is opened

  @regression @smoke
  Scenario: User checks reservation details
    Given User is logged in the app
    When User selects a book
    And User selects store from list
    And User reserves book
    And User goes to reservation details on the reservation page
    Then Reservation details are displayed