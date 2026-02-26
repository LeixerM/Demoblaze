Feature:Buy from the Demoblaze website

  As a customer of the store
  I want to add multiple items to my cart and checkout
  To ensure the e-commerce flow works correctly

  @test
  Scenario: Make a successful purchase
    Given the user is on the Demoblaze homepage
    When they add products to the cart
    Then they successfully complete the purchase of the products