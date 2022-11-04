Feature: Login functionality 

Background: User open application
Given User provide browser name as "Chrome" and exe location as "E:\\Automation support\\chromedriver.exe"
Given user enter url as "https://www.facebook.com/" 

@SmokeTest
Scenario: Login functionality with valid credentials 
When user enter "anuja12589@gmail.com" as email address
When user enter "52565854" as password
When user click on Login button
