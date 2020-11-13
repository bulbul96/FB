Feature: Login to Amazon website or homepage

Scenario: I want to login to my acccount

Given I'm on the Amazon homepage
When I click on signin button
And I put my email
And I click continue
And I put my password
And I click sign-in button
Then I successfully login to my account