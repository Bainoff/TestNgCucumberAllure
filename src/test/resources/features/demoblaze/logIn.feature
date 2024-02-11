Feature: Log in

  Background: Unauthorized user is on the main page

  Scenario: Logging in in with correct credentials
    Given User has already registered with credentials 'supertester' and '12345678' and is on the main page
    When User clicks 'Log in' button on page header
    When User enters username 'supertester' in Log in popup window
    When User enters password '12345678' in Log in popup window
    When User clicks 'Log in' button in popup window
    Then Main page with greeting 'Welcome 'supertester'' opens

  Scenario Outline: Logging in with incorrect username
    Given User has already registered with credentials 'supertester' and '<password>' and is on the main page
    When User clicks 'Log in' button on page header
    When User enters username '<username>' in Log in popup window
    When User enters password '<password>' in Log in popup window
    When User clicks 'Log in' button in popup window
    Then Alert window 'User does not exist.' appears.

    Examples:
      | username     | password |
      | supertester3 | 12345678 |

  Scenario Outline: Logging in with incorrect password
    Given User has already registered with credentials 'supertester' and '<password>' and is on the main page
    When User clicks 'Log in' button on page header
    When User enters username '<username>' in Log in popup window
    When User enters password '<password>' in Log in popup window
    When User clicks 'Log in' button in popup window
    Then Alert window 'Wrong password.' appears.

    Examples:
      | username    | password |
      | supertester | 111111   |
