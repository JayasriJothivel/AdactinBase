Feature:
Validate Adactin Web Application


Background:
Given launch Adactin web application
Then validate the Url


Scenario:
TC001_Validate the adactin hotel booking 

When user enters valid username and password
And user click login Button
Then user validate the dashboard of adactin web application is displayed
When user enters hotel booking details
And user click search Button
Then select hotel page should be displayed
When user click radio button to select the hotel
And user click continue Button 
When user enters personal details for booking 
And click book now Button
Then booking confirmation page should be displayed
Then order ID for the hotel booking should be displayed

Scenario Outline:
TC002_Validate the Adactin Hotel Booking 


When user enters valid "<username>" and "<password>"
And user click login Button
Then user validate the dashboard of adactin web application is displayed
When user enters hotel booking details "<location>","<hotel>","<roomtype>","<roomNos>","<checkIn>","<checkOut>","<adultsRm>", "<childrenRm>"
And user click search Button
Then select hotel page should be displayed
When user click radio button to select the hotel
And user click continue Button 
When user enters personal details for booking "<FirstName>","<LastName>","<BillingAddress>","<CreditCardNo>","<cardType>","<expiryMonth>","<ExpiryYear>","<cvv>"
And click book now Button
Then booking confirmation page should be displayed
Then order ID for the hotel booking should be displayed

Examples:
|username|password|location|hotel|roomtype|roomNos|checkIn|checkOut|adultsRm|childrenRm|FirstName|LastName|BillingAddress|CreditCardNo|cardType|expiryMonth|ExpiryYear|cvv|


|Jayasri123|123456|Sydney|Hotel Creek|Standard|2 - Two|09/05/2022|10/05/2022|4 - Four|3 - Three|Jayasri|Jothivel|perambalur|1234567891234567|VISA|December|2022|123|


|Jayasri123|123456|Melbourne|Hotel Cornice|Deluxe|4 - Four|09/05/2022|10/05/2022|1 - One|0 - None|Jeeva|Jothivel|Arankotai|1234567891234567|VISA|December|2022|123|


|Jayasri123|123456|Adelaide|Hotel Sunshine|Double|3 - Three|09/05/2022|10/05/2022|3 - Three|1 - One|Jayaprakash|Jothivel|Sirugudal|1234567891234567|VISA|December|2022|123|


|Jayasri123|123456|Los Angeles|Hotel Hervey|Super Deluxe|1 - One|09/05/2022|10/05/2022|4 - Four|4 - Four|Manikandan|Jothivel|perambalur|1234567891234567|VISA|December|2022|123|

