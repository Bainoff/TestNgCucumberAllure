Feature: Reserve a book

  Background: Main page is opened

  @regression @smoke
  Scenario: Reserve a book with registration proceeded
    When Guest selects a book
    When Guest selects store from list
    When Guest registers via phone number
    When Guest fills up mandatory registration fields
    When User reserves book
    Then Reservation appears on the Profile page
    Then Email and SMS reservation notification received

    Scenario Outline: Reserve books with various registration ways
      When Guest selects a book
      When Guest selects store from list
      When Guest registers via "<registration_way>"
      When Guest fills up mandatory registration "<field>"
      When User reserves book
      Then Reservation appears on the Profile page
      Then Email and SMS reservation notification received

      Examples:
      | registration_way  | field         |
      | phone number      | 1112233       |
      | email             | test@mail.com |

  @regression @smoke
  Scenario: Reserve a book as a registered user
    Given User is logged in the app
    When Guest selects a book
    And Guest selects store from list
    And User reserves book
    Then Reservation appears on the Profile page
    And Email and SMS reservation notification received

  @regression
  Scenario: Reserve a book for different location
    Given User is logged in the app
    When User changes his/her location from store selection menu
    And User reserves book
    Then Reservation appears on the Profile page
    And Email and SMS reservation notification received
    And User's and store's address matches defined ones

  @regression
  Scenario: Reserve a book for different person
    Given User is logged in the app
    When User selects a book
    And User selects store from list
    And User changes customer's credentials
    And User reserves book
    Then Reservation appears on the Profile page
    And Email and SMS reservation notification received
    And Store's address and customer's information matches defined ones

  @regression
  Scenario: Reserve a book without email notification
    Given User is logged in the app
    When User selects a book
    And User selects store from list
    And User excludes notifying via email
    And User reserves book
    Then Reservation appears on the Profile page
    And SMS reservation notification received
    And Only SMS notification turned on on reservation page

  @regression
  Scenario: Reserve a book without email notification
    Given User is logged in the app
    When User selects a book
    And User selects store from list
    And User excludes notifying via SMS
    And User reserves book
    Then Reservation appears on the Profile page
    And Email reservation notification received
    And Only Email notification turned on on reservation page



