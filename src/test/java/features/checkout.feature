Feature: Place the Order for Products

@PlaceOrder
Scenario Outline: Search Experience for Prodcut Search in both home and offers page

Given User is on GreenCart Landing Page 
When User searched with shortname <name> and extract actual name of product
And Added "3" items of the selected product to cart
Then User proceeds to Checkout and validate the <name> items in checkout page
And Verify user has ability to enter promo code and palce the order

Examples:
|name|
|Tom|





