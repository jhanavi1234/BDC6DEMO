Feature: BDC Demo for parameterization

Scenario Outline: I want to cross check the multipl users access for login

Given I am launching the webshop url
Then I will check on Login
When I enter username"<email>" and password "<password>"
And click on submit button
Then verify for user account status

Examples:
|email|password|
|j.bysani@gmail.com|Password123|
|jpattnaik@gmail.com|jogamaya@123@|
|naveena.elango@accenture.com|Naveena@98|