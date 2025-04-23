#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

###Before ->Background -> scenario -> After
Feature: Applciation login

Background:
When Launch the browser from config variables
And hit the home page url of banking site

@mobiletest @netbanking
Scenario: Admin Page deafult login

Given User is on NetBanking landing page
When User login into application with username "admin" and password 1234
Then Home Page is displayed
And Card are displayed

@smoke @regression @brokerbanking
Scenario: User Page deafult login
Given User is on NetBanking landing page
When User login into application with username "alex" and password 0987
Then Home Page is displayed
And Card are displayed


Scenario Outline: User Page deafult login

#Given User is on NetBanking landing page
When User login into application with username "<username>" and password "<password>"
Then Home Page is displayed
And Card are displayed

Examples:
|username|password|
|alex|hh1234|
|sam|gg0987|




