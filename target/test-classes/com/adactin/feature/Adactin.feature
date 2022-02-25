Feature: Hotel Booking In Adactin Application

Scenario: User Login the Application

Given  user launch the application

When user Enter The Username In The Username Field

And user Enter The Passwrod In The Password Field

Then use Clcik On The Login Button And It Navigate To The Select Hotel Page

Scenario: Search Hotels

When user clicks the login button and then there is an option to select the location of the hotel in a dropdown

And user selects the hotel in the hotels list dropdown

And user selects room type in the Room Type dropdown

And user Selects the number of room in the next drop down

And user Selects the check in date in the next Drop down

And user Selects the Check out date in the next Drop down

And user Selects the number of Adults per room in the next drop down

And user Selects the number of Children per room in the next Drop down

Then clicks on the search button and it navigates to the select hotel page

Scenario: Select Hotels

When user clicks the checkbox in the select hotel page

Then user clicks the continue button and it navigates to the Book a hotel page

Scenario: Book A Hotel

When user clicks the continue button it navigates to Book a hotel page there user enters the first name in the First name box

And user Enters the Second name in the Second name box

And user Enters the Address in the Billing address box

And user Enters the credit card number in the cc box

And user selects the cc type in the Credit card type drop down

And user selects the expiry month in the month drop down

And user selects the expiry year in the year drop down

And user Enter the CVV number in the CVV number box

Then user clicks the BOOK NOW button and it navigates to the booking confirmation page

Scenario: Booking Confirmation

Then user clicks the BOOK NOW button it navigates to the booking confirmation page there user can check the details on the booked hotel and user clicks the my itinerary button and it navigates to the booked Itinerary page

Scenario: Logout

Then user clicks on the Itinerary page and it navigates to the itinerary page and user clicks the logout button



