
Feature: LoginScreenForRecruiters_pos @feature_user_login

  Background: 
    Given the user is on the Login Screen

  @valid-login
  Scenario Outline: Login Screen for Recruiters
    Given the user is on the Login Screen
    When I enter a valid email ID "<email>"
    And I enter a valid password "<password>"
    And I click on the 'Show Password' option
    And I click the Login button
    Then the user should be redirected to the dashboard
    And the dashboard loads successfully without errors

    Examples:
      | email                   | password           |
      | recruiter@example.com   | SecurePassword123   |

@check_login_button_state
Scenario Outline: Login Screen for Recruiters
  When I enter a valid email ID <email> in the Email ID field
  And I leave the Password field empty
  Then the Login button should be disabled
  When I enter a valid password <password> in the Password field
  Then the Login button should be enabled

  Examples:
    | email              | password     |
    | krishna@gmail.com  | password123  |

  @toggle_password_visibility
  Scenario Outline: Login Screen for Recruiters
    Given the user enters a valid password in the Password field
    When the user clicks on the 'Show Password' option
    Then the password should be visible
    When the user clicks on the 'Hide Password' option
    Then the password should be hidden
    And the user can still log in successfully after toggling

  Examples:
    | password            |
    | ValidPassword123!   |

@valid-email-login
Scenario Outline: Login Screen for Recruiters with Subdomain
  When the user enters "<email_id>"
  And the user enters "<password>"
  And the user clicks the Login button
  Then the user should be redirected to the dashboard successfully

  Examples:
    | email_id              | password         |
    | user@mail.example.com | correct_password  |

@valid-email-login
Scenario Outline: Login Screen for Recruiters without Subdomain
  When the user logs out
  And the user returns to the Login Screen
  When the user enters "<email_id>"
  And the user enters "<password>"
  And the user clicks the Login button
  Then the user should be redirected to the dashboard successfully

  Examples:
    | email_id         | password         |
    | user@example.com | correct_password  |

  @case_sensitive_login
  Scenario Outline: Verify case-sensitive password login for recruiters
    Given the user enters <email>
    And the user enters <password>
    And the user clicks the Login button
    Then the user should be redirected to the dashboard successfully
    And the user logs out and returns to the Login Screen
    Given the user enters <email>
    And the user enters <incorrect_password>
    And the user clicks the Login button
    Then an error message "Incorrect email ID or password." should be displayed

  Examples:
    | email               | password      | incorrect_password |
    | krishna@gmail.com   | Password123   | password123        |

@valid-login-gmail
Scenario Outline: Login Process with Valid Email IDs
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the user is redirected to the dashboard successfully
  And the user logs out and returns to the login screen

  Examples:
    | email                | password              |
    | user@gmail.com      | correctPassword123    |
    | user@yahoo.com      | correctPassword123    |

  @valid-alphanumeric-login
  Scenario Outline: Login Screen for Recruiters
    When I enter "<email>"
    And I enter "<password>"
    And I click the Login button
    Then the user should be redirected to the Dashboard successfully

    When I log out and return to the Login Screen
    And I enter "<email>"
    And I enter "<special_password>"
    And I click the Login button
    Then the user should be redirected to the Dashboard successfully

  Examples:
    | email              | password      | special_password |
    | krishna@gmail.com  | Password123   | !@#Password       |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When the user enters the valid email ID "<email_id>"
  And the user enters the correct password
  And the user clicks the Login button
  Then the user should be redirected to the dashboard successfully

  Examples:
    | email_id              |
    | user123@example.com   |
    | user456@example.com   |

@logout
Scenario: User logs out and returns to the Login Screen
  Then the user logs out and returns to the Login Screen

  @valid-login-hyphens
  Scenario Outline: Login process for valid email IDs with hyphens
    When I enter "<email_id>"
    And I enter "<password>"
    And I click the Login button
    Then the user should be redirected to the dashboard successfully

    Examples:
      | email_id               | password            |
      | user-name@example.com   | correctPassword123  |
      | user-name123@example.com | correctPassword123  |

  @logout-and-return
  Scenario Outline: Log out and return to the login screen
    When I log out
    And I return to the Login Screen
    When I enter "<email_id>"
    And I enter "<password>"
    And I click the Login button
    Then the user should be redirected to the dashboard successfully

    Examples:
      | email_id               | password            |
      | user-name@example.com   | correctPassword123  |
      | user-name123@example.com | correctPassword123  |
