
Feature: Registration functionality



Background: Application opens successfully
Given user launches browser by providing "webdriver.chrome.driver" and "D:\\Automation Support\\Selenium\\chromedriver.exe"
Given user opens application by using "https://demo.guru99.com/test/newtours/index.php"



@SmokeTest
Scenario: Registration of user by valid credentials
When user click on register.
When user enters first name as "Akash"
When user enters last name as "Bhaskar"
When user enters phone numer as "9011651247"
When user enters email address as "bhaskarakash1104@gmail.com"
When user selects country of living
When user click on submit button
Then application shows User Registration is successfull 


  

   