Feature: Guest user action in demowebshop

@Smoke
Scenario: Users choice to opt for an account
Given user access the signup page
And gets the credentials

Scenario: Registered user accss track the ordered item in DemoWebshop

Given user has valid account creds for Demo webshop
And provide the valid creds as inputs for the login process
Then verifies the state for the login status