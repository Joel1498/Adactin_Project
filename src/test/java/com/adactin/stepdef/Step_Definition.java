package com.adactin.stepdef;

import com.adactin.base.Base_Class;
import com.adactin.helper.File_Reader_Manager;
import com.adactin.pageobjectmanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		String url = File_Reader_Manager.get_Instance_FR().get_Instance_CR().get_Url();
		getURL(url);
		
	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		sendkey(pom.get_Instance_Login().getUsername(), "Akash567");
	}

	@When("^user Enter The Passwrod In The Password Field$")
	public void user_Enter_The_Passwrod_In_The_Password_Field() throws Throwable {
		sendkey(pom.get_Instance_Login().getPassword(), "Ironman@1498");
	}

	@Then("^use Clcik On The Login Button And It Navigate To The Select Hotel Page$")
	public void use_Clcik_On_The_Login_Button_And_It_Navigate_To_The_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_Instance_Login().getLoginBtn());
	}

	@When("^user clicks the login button and then there is an option to select the location of the hotel in a dropdown$")
	public void user_clicks_the_login_button_and_then_there_is_an_option_to_select_the_location_of_the_hotel_in_a_dropdown()
			throws Throwable {
		dropdown(pom.get_Instance_Search().getLocation(), "Byvalue", "Melbourne");
	}

	@When("^user selects the hotel in the hotels list dropdown$")
	public void user_selects_the_hotel_in_the_hotels_list_dropdown() throws Throwable {
		dropdown(pom.get_Instance_Search().getHotels(), "Byvalue", "Hotel Sunshine");
	}

	@When("^user selects room type in the Room Type dropdown$")
	public void user_selects_room_type_in_the_Room_Type_dropdown() throws Throwable {
		dropdown(pom.get_Instance_Search().getRoomtype(), "Byvalue", "Super Deluxe");
	}

	@When("^user Selects the number of room in the next drop down$")
	public void user_Selects_the_number_of_room_in_the_next_drop_down() throws Throwable {
		dropdown(pom.get_Instance_Search().getRoomnos(), "Byindex", "1");
	}

	@When("^user Selects the check in date in the next Drop down$")
	public void user_Selects_the_check_in_date_in_the_next_Drop_down() throws Throwable {
		sendkey(pom.get_Instance_Search().getCheckindate(), "23/02/2022");
	}

	@When("^user Selects the Check out date in the next Drop down$")
	public void user_Selects_the_Check_out_date_in_the_next_Drop_down() throws Throwable {
		sendkey(pom.get_Instance_Search().getCheckoutdate(), "28/02/2022");
	}

	@When("^user Selects the number of Adults per room in the next drop down$")
	public void user_Selects_the_number_of_Adults_per_room_in_the_next_drop_down() throws Throwable {
		dropdown(pom.get_Instance_Search().getAdults(), "Byvalue", "1");
	}

	@When("^user Selects the number of Children per room in the next Drop down$")
	public void user_Selects_the_number_of_Children_per_room_in_the_next_Drop_down() throws Throwable {
		dropdown(pom.get_Instance_Search().getChildren(), "Byvalue", "0");
	}

	@Then("^clicks on the search button and it navigates to the select hotel page$")
	public void clicks_on_the_search_button_and_it_navigates_to_the_select_hotel_page() throws Throwable {
		clickOnElement(pom.get_Instance_Search().getSearchBtn());
	}

	@When("^user clicks the checkbox in the select hotel page$")
	public void user_clicks_the_checkbox_in_the_select_hotel_page() throws Throwable {
		clickOnElement(pom.get_Instance_Select().getFirst());
	}

	@Then("^user clicks the continue button and it navigates to the Book a hotel page$")
	public void user_clicks_the_continue_button_and_it_navigates_to_the_Book_a_hotel_page() throws Throwable {
		clickOnElement(pom.get_Instance_Select().getContinueBtn());
	}

	@When("^user clicks the continue button it navigates to Book a hotel page there user enters the first name in the First name box$")
	public void user_clicks_the_continue_button_it_navigates_to_Book_a_hotel_page_there_user_enters_the_first_name_in_the_First_name_box()
			throws Throwable {
		String firstname = File_Reader_Manager.get_Instance_FR().get_Instance_CR().get_Firstname();
		sendkey(pom.get_Instance_Book().getFirstname(), firstname);
	}

	@When("^user Enters the Second name in the Second name box$")
	public void user_Enters_the_Second_name_in_the_Second_name_box() throws Throwable {
		String lastname = File_Reader_Manager.get_Instance_FR().get_Instance_CR().get_Lastname();
		sendkey(pom.get_Instance_Book().getLastname(), lastname);
	}

	@When("^user Enters the Address in the Billing address box$")
	public void user_Enters_the_Address_in_the_Billing_address_box() throws Throwable {
		String address = File_Reader_Manager.get_Instance_FR().get_Instance_CR().get_Address();
		sendkey(pom.get_Instance_Book().getAddress(), address);
	}

	@When("^user Enters the credit card number in the cc box$")
	public void user_Enters_the_credit_card_number_in_the_cc_box() throws Throwable {
		String ccnumber = File_Reader_Manager.get_Instance_FR().get_Instance_CR().get_Ccnumber();
		sendkey(pom.get_Instance_Book().getCcnumber(), ccnumber);
	}

	@When("^user selects the cc type in the Credit card type drop down$")
	public void user_selects_the_cc_type_in_the_Credit_card_type_drop_down() throws Throwable {
		dropdown(pom.get_Instance_Book().getCctype(), "Byvalue", "AMEX");
	}

	@When("^user selects the expiry month in the month drop down$")
	public void user_selects_the_expiry_month_in_the_month_drop_down() throws Throwable {
	   dropdown(pom.get_Instance_Book().getExpmonth(), "Byvalue", "7");
	}

	@When("^user selects the expiry year in the year drop down$")
	public void user_selects_the_expiry_year_in_the_year_drop_down() throws Throwable {
		dropdown(pom.get_Instance_Book().getExpyear(), "Byvalue", "2022");
	}

	@When("^user Enter the CVV number in the CVV number box$")
	public void user_Enter_the_CVV_number_in_the_CVV_number_box() throws Throwable {
		String cvvnumber = File_Reader_Manager.get_Instance_FR().get_Instance_CR().get_Cvvnumber();
		sendkey(pom.get_Instance_Book().getCvvnumber(), cvvnumber);
	}

	@Then("^user clicks the BOOK NOW button and it navigates to the booking confirmation page$")
	public void user_clicks_the_BOOK_NOW_button_and_it_navigates_to_the_booking_confirmation_page() throws Throwable {
		clickOnElement(pom.get_Instance_Book().getBookBtn());
		Thread.sleep(5000);
	}

	@Then("^user clicks the BOOK NOW button it navigates to the booking confirmation page there user can check the details on the booked hotel and user clicks the my itinerary button and it navigates to the booked Itinerary page$")
	public void user_clicks_the_BOOK_NOW_button_it_navigates_to_the_booking_confirmation_page_there_user_can_check_the_details_on_the_booked_hotel_and_user_clicks_the_my_itinerary_button_and_it_navigates_to_the_booked_Itinerary_page()
			throws Throwable {
		clickOnElement(pom.get_Instance_Confirm().getMyitenerary());
	}

	@Then("^user clicks on the Itinerary page and it navigates to the itinerary page and user clicks the logout button$")
	public void user_clicks_on_the_Itinerary_page_and_it_navigates_to_the_itinerary_page_and_user_clicks_the_logout_button()
			throws Throwable {
		clickOnElement(pom.get_Instance_Confirm().getLogoutBtn());
	}

}
