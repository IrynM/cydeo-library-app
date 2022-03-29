Feature: User should be able to login
  @smoke
  Scenario: Librarian Librarian should be able to log in
    Given user is on log in page
    Then user enter username "librarian2@library"
    And user enter password "uYrhHmmj"
    When user click login button
    Then verify user is in library page

  @test2
  Scenario: Student should be able to log in
    Given user is on log in page
    Then user enter username "student2@library"
    And user enter password "zyxa10vg"
    When user click login button
    Then verify user is in library page


  @test3
  Scenario: Login as librarian in the same line
    Given user is entered "librarian14@library" and "bWN7YaaB"


  @test4
  Scenario:Login as librarian in the same line
    Given user is entered "librarian14@library" and "bWN7YaaB"

  @test5
  Scenario:UserShould see all table
    Given user is on log in page
    Then user enter username "librarian2@library"
    And user enter password "uYrhHmmj"
    When user click login button
    And user click Users button
    Then verify table have following:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |