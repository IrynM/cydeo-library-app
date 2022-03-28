@test1
Feature: User should be able to login

  Scenario: Librarian should be able to log in
    Given user is on log in page
    Then Librarian enter username
    And Librarian enter password
    When Librarian click login button
    Then verify user is in library page

    Scenario: Student should be able to log in
      Given Student is on log in page
      Then Student enter username
      And Student enter password
      When Student click login button
      Then verify user is in library page