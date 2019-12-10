# automationpractice.com
Issues encountered:
The website is making heavy use of floating panels, hence it requires a bit more care when using Selenium since elements need to be 
ready to go before interacting with them; it's often the case that Selenium by default finds these elements quickly before 
JavaScript has completed and they often are not in a ready to use state. I have tried to fix this by using the class
WebDriverWait extensively, but this solution may increase the time required for the tests to run, which is not very feasible 
in a big test suite.

- Take Screenshot and place it in a folder with Test Class name
