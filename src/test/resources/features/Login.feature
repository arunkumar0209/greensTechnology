Feature: Smoke Test Facebook 
#Scenario: Test with valid credentials 
#	Given Open browser and launch the URL 
#	When I enter valid "arun@gmail.com" and valid "pass"
#	Then User should be able to login Successfully
	
	
Scenario Outline: Test with valid credentials 
	Given Open browser and launch the URL 
	When I enter valid "<Username>" and valid "<Password>" 
	Then User should be able to login Successfully 
	
	Examples: 
		| Username          | Password |
		| arun@gmail.com    | pass789  |
		| arun123@gmail.com | pass123  |
		| arun456@gmail.com | pass456  |		