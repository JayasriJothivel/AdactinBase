package com.stepdefinition;

import com.lipglobal.LibGlobal;
import com.pojo.AdactinPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends LibGlobal {

	AdactinPojo ap;

	@Given("launch Adactin web application")
	public void launch_Adactin_web_application() {

	}
	@Then("validate the Url")
	public void validate_the_Url() {
		if (currentUrl().contains("adactin")) {
			System.out.println("URL is verified");
		}
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		ap = new AdactinPojo();
		sendValue(ap.getUserName(), "Jayasri123");
		sendValue(ap.getPassword(), "123456");
	}

	@When("user click login Button")
	public void user_click_login_Button() {
		elementClick(ap.getLogin());
	}

	@Then("user validate the dashboard of adactin web application is displayed")
	public void user_validate_the_dashboard_of_adactin_web_application_is_displayed() {
		ap = new AdactinPojo();
		if (elementText(ap.getDashBoard()).contains("Welcome to Adactin")) {
			System.out.println("Dashboard Launch is verified");
		}
	}

	@When("user enters hotel booking details")
	public void user_enters_hotel_booking_details() {
		sendValue(ap.getLocation(), "Melbourne");
		sendValue(ap.getHotels(), "Hotel Creek");
		sendValue(ap.getRoomType(), "Standard");
		sendValue(ap.getRoomNos(), "2 - Two");
		sendValue(ap.getCheckIn(), "09/05/2022");
		sendValue(ap.getCheckOut(), "10/05/2022");
		sendValue(ap.getAdultRoom(), "2 - Two");
		sendValue(ap.getChildRoom(), "1 - One");
	}

	@When("user click search Button")
	public void user_click_search_Button() {
		ap = new AdactinPojo();
		elementClick(ap.getSearchButton());
	}

	@Then("select hotel page should be displayed")
	public void select_hotel_page_should_be_displayed() {
		ap = new AdactinPojo();
		if (elementText(ap.getSelectHotelPage()).contains("Select")) {
			System.out.println("Hotel page is verified");
		}
	}

	@When("user click radio button to select the hotel")
	public void user_click_radio_button_to_select_the_hotel() {
		ap = new AdactinPojo();
		elementClick(ap.getRadioButton());
	}

	@When("user click continue Button")
	public void user_click_continue_Button() {
		ap = new AdactinPojo();
		elementClick(ap.getContinueButton());
	}

	@When("user enters personal details for booking")
	public void user_enters_personal_details_for_booking() {
		ap = new AdactinPojo();
		sendValue(ap.getFirstName(), "Jayasri");
		sendValue(ap.getLastName(), "Jothivel");
		sendValue(ap.getAddress(), "Perambalur");
		sendValue(ap.getCreditCardNo(), "1234567891234567");
		sendValue(ap.getCreditCardType(), "VISA");
		sendValue(ap.getExpMonth(), "December");
		sendValue(ap.getExpYear(), "2022");
		sendValue(ap.getCvv(), "123");
	}

	@When("click book now Button")
	public void click_book_now_Button() {
		ap = new AdactinPojo();
		elementClick(ap.getBookNowButton());
	}

	@Then("booking confirmation page should be displayed")
	public void booking_confirmation_page_should_be_displayed() {
		ap = new AdactinPojo();
		if (elementText(ap.getBookinConfirmationPage()).contains("Confirmation")) {
			System.out.println("Booking confirmation page displayed");
		}

	}

	@Then("order ID for the hotel booking should be displayed")
	public void order_ID_for_the_hotel_booking_should_be_displayed() {
		ap = new AdactinPojo();
		String orderId = elementValue(ap.getOrderNo());
		System.out.println("Order No:  " + orderId);
	}

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String userName, String password) {
		ap = new AdactinPojo();
		sendValue(ap.getUserName(), userName);
		sendValue(ap.getPassword(), password);
	}

	@When("user enters hotel booking details {string},{string},{string},{string},{string},{string},{string}, {string}")
	public void user_enters_hotel_booking_details(String location, String hotels, String roomType, String roomNos,
			String adultRoom, String childRoom, String checkIn, String checkOut) {
		ap = new AdactinPojo();
		sendValue(ap.getLocation(), location);
		sendValue(ap.getHotels(), hotels);
		sendValue(ap.getRoomType(), roomType);
		sendValue(ap.getRoomNos(), roomNos);
		sendValue(ap.getAdultRoom(), adultRoom);
		sendValue(ap.getChildRoom(), childRoom);
		sendValue(ap.getCheckIn(), checkIn);
		sendValue(ap.getCheckOut(), checkOut);
	}

	@When("user enters personal details for booking {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enters_personal_details_for_booking(String firstName, String lastName, String address,
			String creditCardNo, String creditCardType, String expMonth, String expYear, String cvv) {
		ap = new AdactinPojo();
		sendValue(ap.getFirstName(), firstName);
		sendValue(ap.getLastName(), lastName);
		sendValue(ap.getAddress(), address);
		sendValue(ap.getCreditCardNo(), creditCardNo);
		sendValue(ap.getCreditCardType(), creditCardType);
		sendValue(ap.getExpMonth(), expMonth);
		sendValue(ap.getExpYear(), expYear);
		sendValue(ap.getCvv(), cvv);
	}

}