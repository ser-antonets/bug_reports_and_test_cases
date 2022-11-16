Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario: Performance test
    Given User opens "https://demo.nopcommerce.com/" page_
    When User click Computers link
    And User click Desktops link
    Then User clickBuild your own computer link



