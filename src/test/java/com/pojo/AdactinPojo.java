package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lipglobal.LibGlobal;

public class AdactinPojo extends LibGlobal {

	public AdactinPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement userName;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login;
	@FindBy(xpath = "//td[contains(text(),'Welcome to Adactin Group')]")
	private WebElement dashBoard;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement roomNos;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement childRoom;
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	@FindBy(id="Submit")
	private WebElement searchButton;
	
	@FindBy(xpath="//td[text()=\"Select Hotel \"]")
	private WebElement selectHotelPage;
	
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	@FindBy(id="continue")
	private WebElement continueButton;
	
	@FindBy(xpath="//td[text()=\"Book A Hotel \"]")
	private WebElement bookHotelPage;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement creditCardNo;
	@FindBy(id="cc_type")
	private WebElement creditCardType;
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement bookNowButton;
	
	@FindBy(xpath="//td[text()=\"Booking Confirmation \"]")
	private WebElement bookinConfirmationPage;
	
	
	@FindBy(name = "order_no")
	private WebElement orderNo;


	public WebElement getUserName() {
		return userName;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}


	public WebElement getDashBoard() {
		return dashBoard;
	}


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoomType() {
		return roomType;
	}


	public WebElement getRoomNos() {
		return roomNos;
	}


	public WebElement getAdultRoom() {
		return adultRoom;
	}


	public WebElement getChildRoom() {
		return childRoom;
	}


	public WebElement getCheckIn() {
		return checkIn;
	}


	public WebElement getCheckOut() {
		return checkOut;
	}


	public WebElement getSearchButton() {
		return searchButton;
	}


	public WebElement getSelectHotelPage() {
		return selectHotelPage;
	}


	public WebElement getRadioButton() {
		return radioButton;
	}


	public WebElement getContinueButton() {
		return continueButton;
	}


	public WebElement getBookHotelPage() {
		return bookHotelPage;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCreditCardNo() {
		return creditCardNo;
	}


	public WebElement getCreditCardType() {
		return creditCardType;
	}


	public WebElement getExpMonth() {
		return expMonth;
	}


	public WebElement getExpYear() {
		return expYear;
	}


	public WebElement getCvv() {
		return cvv;
	}


	public WebElement getBookNowButton() {
		return bookNowButton;
	}


	public WebElement getBookinConfirmationPage() {
		return bookinConfirmationPage;
	}


	public WebElement getOrderNo() {
		return orderNo;
	}
	
	
	
}
