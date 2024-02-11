Feature: Create account

  Scenario: Creating account with correct credentials
    Given Unauthorized user is on the main page
    When User clicks 'Sign up' button on page header
    When User enters username 'supertester' in Sign up popup window
    When User enters password '12345678' in Sign up popup window
    When User clicks 'Sign up' button in popup window
    Then Alert window 'Sign up successful.' appears.

  Scenario: Creating account with existing user credentials
    Given Unauthorized user is on the main page
    When User clicks 'Sign up' button on page header
    When User enters username 'supertester' in Sign up popup window
    When User enters password '12345678' in Sign up popup window
    When User clicks 'Sign up' button in popup window
    Then Alert window 'This user already exist.' appears.