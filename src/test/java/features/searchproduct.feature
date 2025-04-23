Feature: Search the Order for Products

@OffersPage
Scenario Outline: Search Experience for Prodcut Search in both home and offers page
Given User is on GreenCart Landing Page 
When User searched with shortname <name> and extract actual name of product
Then User searched for <name> shortname in offers page
And validate product name matches with offer name

Examples:
|name|
|Tom|
|Beet|


