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
@Regression
Feature: Login feature
  This feature tests the login functionality with valid and invalid input conditions

  @Regression @Smoke
  Scenario: valid username and valid password test
    Given I am on the login page
    When I enter "jxz5374zhen" and "joeyzhe"
    Then I should login successfully

  @negative
  Scenario Outline: Invalid username and invalid password test
    Given I am on the login page
    When I enter "<username>" and "<password>"
    Then I should login successfully

    Examples: 
      | username    | password |
      | jxz5374zhen | joeyzhe  |
      | j1452154    | emptyme  |
