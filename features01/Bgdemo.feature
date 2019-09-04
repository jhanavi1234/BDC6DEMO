Feature: My Demo for Bgn for BDc users

Background: Clearing the browser cache
Given I am clicking the shortcut for browser cache	
And ensuring for deletion of all the cookies

Scenario: User login into DemoWebshop for BDC 
Given bdc user having valide creds
Then user tries tp provide the data for the login process

Scenario: User logout process for the bdc user
Given BDC user is able to see the logout button
Then user clicks on the logout button to close the window