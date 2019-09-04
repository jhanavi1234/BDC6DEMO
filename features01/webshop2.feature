Feature: My demo to access the webshop applications

Background: Launch and login
Given Configurations of the browser and the Application is launched by the user
Given bdcs user having valid creds
Then users tries to provide the data for the login process
And clicks on Login


Scenario: Add Camera to the cart
Given BDCs user enters Camera in search tab
Then users selects the products
And users adds products to the cart

Scenario: Adding another product to the cart
Given BDCs user enters Notebook in search tab and adds products to the carts