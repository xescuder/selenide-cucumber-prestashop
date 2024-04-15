Feature: Add products to basket
  Scenario: Adding a new product item to empty basket
    Given Xavier has an empty basket
    When he adds the item "Navitimer" to shopping cart
    Then he should see the "Navitimer" in the cart with quantity 1