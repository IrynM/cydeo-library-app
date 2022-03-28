Feature:

  @test6
  Scenario Outline: log in with different user accounts
    Given user is on log in page
    Then As a user, I should be able to login with different users using their correct "<emails>" and "<passwords>"
    And When I login, I should be able to see username in the account username section "<name>"
    Examples: users login with next creadentials
      | emails             | passwords |name|
      | student5@library   | i1oDgf2d  |Test Student 5|
      | student6@library   | NXhpXJdC  |Test Student 6|
      | student7@library   | QfYjDNXj  |Test Student 7|
      | librarian5@library | hj65YBiE  |Test Librarian 5|
      | librarian8@library | UECJkTnl  |Test Librarian 8|