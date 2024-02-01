Feature: Reservation cancellation

  Background: Main page is opened

  @regression @smoke
  Scenario: User cancels his/her reservation
    Given User is logged in the app
    And One book reservation created
    When User goes to reservation page
    And User cancels reservation
    Then Cancellation confirming pop-up appears
    Then Reservation appears on the Canceled tab

  @regression
  Scenario: User cancels his/her reservation from list
    Given User is logged in the app
    And One book reservation created
    When User goes to reservation page
    And User cancels reservation
    Then Cancellation confirming pop-up appears
    Then Reservation disappears from the Active tab

  @regression
  Scenario: User cancels his/her reservation from reservation page
    Given User is logged in the app
    And One book reservation created
    When User goes to the reservation page
    And User cancels reservation
    Then Cancellation confirming pop-up appears
    Then Reservation disappears from the Active tab