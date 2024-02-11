Feature: Purchasing product
  Background: User is authorized on the site

  Scenario: Product addition to the cart
    Given Authorized user is on the main page
    When User clicks on 'HTC One M9' item image on the main page
    When User clicks on 'Add to cart' button on product page
    Then Alert with text 'Product added.' appears

  Scenario Outline: Placing an order and purchasing a product
    Given Authorized user is on the main page, product added to the cart
    When User clicks on 'Cart' button in the header
    When User clicks 'Place Order' button on Cart page
    When User enters name '<name>' in popup 'Place order'
    And User enters country '<country>' in popup 'Place order'
    And User enters city '<city>' in popup 'Place order'
    And User enters credit card '<credit_card>' in popup 'Place order'
    And User enters month '<month>' in popup 'Place order'
    And User enters year '<year>' in popup 'Place order'
    And User clicks 'Purchase' button
    Then Popup with text 'Thank you for your purchase!' appears
    When User clicks 'OK' button
    Then Main page opens

    Examples:
    | name  | country   | city    | credit_card | month | year  |
    | John  | Zimbabwe  | Harare  | 11223344    | 12    | 2024  |
    | Jane  | Thailand  | Bangkok | 44332211    | 11    | 2025  |