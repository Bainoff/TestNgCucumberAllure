Feature: Reservations list check

  Background: Main page is opened

  @regression @smoke
  Scenario: User checks his/her reservation list for active reservations
    Given User is logged in the app
    And Two book reservations created
    When User goes to reservation page
    Then Tab Active with 2 items is displayed

  @regression
  Scenario: User checks his/her reservation list for completed reservations
    Given User is logged in the app
    And One book reservation completed
    When User goes to reservation page
    Then Tab Completed with item is displayed

  @regression
  Scenario: User sorts his/her reservation list
    Given User is logged in the app
    And Two book reservations created
    When User goes to reservation page
    And User changes sorting order
    Then Items are displayed in different order

