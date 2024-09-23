Feature: Login to website with incorrect credentials

  @TEST_JAVAAUTO-9
  Scenario: Login to website with incorrect credentials
    Given Launch the website
    When Provide incorrect credentials
    Then Click on Login button