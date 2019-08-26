Feature: Question and Task factories
  Scenario: Buy pants and spend all money
    Given   user A goes shopping
    When    user A buys pants
    Then    user A has no money left

  Scenario: Buy socks and have money left
    Given   user A goes shopping
    When    user A buys socks
    Then    user A has a lot of money left