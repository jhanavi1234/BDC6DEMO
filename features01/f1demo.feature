Feature: BDC validation on demowebshop

@Regression
Scenario: Registered user accss to cart in DemoWebshop
Given user launched demo Webshop app in chrome web browser
Then user searches items of his choice
And Adds that item to the cart

@Sanity
Scenario: Registered user accss track the ordered item in DemoWebshop
Given user has already placed an order for his favourite item
And user tries to access the order tracking dashboard
Then identifies the state of the order