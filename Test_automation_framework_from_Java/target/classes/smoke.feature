Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario: Check elements from HomePage
    Given User opens "https://zahid-instrument.com/" page
    When User checks header
    And User checks menu
    And User checks content
    Then User checks footer

  Scenario: Check telephone numbers from HomePage
    Given User opens "https://zahid-instrument.com/" page
    When User click telephone number
    Then User sees telephone numbers

  Scenario: Check search from SearchPage
    Given User opens "https://zahid-instrument.com/" search page
    When User  enter a "tlt-235sb-380" in the search field
    Then User sees a list of products

  Scenario: Check search page from SearchPage
    Given User opens "https://zahid-instrument.com/" search page
    When User  enter a "tlt-235sb-380" in the search field
    And User sees a list of products
    And User click a search button
    Then User sees the products page

  Scenario: Check elements from ProductPage
    Given User opens "https://zahid-instrument.com/tlt-235sb-380" product page
    When User checks hOne
    And User checks article
    And User checks producer
    And User checks price
    And User checks button
    Then User checks description

  Scenario: Check characteristics from ProductPage
    Given User opens "https://zahid-instrument.com/tlt-235sb-380" product page
    When User click characteristics tab
    Then User sees characteristics

  Scenario: Check filters from CategoryPage
    Given User opens "https://zahid-instrument.com/index.php?route=product/category&path=59_60_604_345" category page
    When User click filter
    Then User sees filtered products

  Scenario: Check sorting from CategoryPage
    Given User opens "https://zahid-instrument.com/index.php?route=product/category&path=59_60_604_345" category page
    When User click sort in descending order
    Then User sees sorted products

  Scenario: Check addition of the product to the cart from CartPage
    Given User opens "https://zahid-instrument.com/tlt-235sb-380" cart page
    When User click button cart
    Then User sees the product has been added to the cart

  Scenario: Check the change in the amount of goods in the basket from CartPage
    Given User opens "https://zahid-instrument.com/tlt-235sb-380" cart page
    When User click button cart
    And User sees the product has been added to the cart
    And User opens cart page
    And User click button +
    Then User sees the quantity of the product has changed by two pcs


