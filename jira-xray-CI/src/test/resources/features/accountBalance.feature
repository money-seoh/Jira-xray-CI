Feature: Bank Check Balance

  @TEST_KAN-2
  Scenario: Checking Account Balance after Deposit
    Given my checking account has a balance of $500
    And I have recently made a deposit of $100
    When I check my account balance
    Then I should see $600 as the balance
    But there is an overdraft fee of $50
    And the available balance should be $550