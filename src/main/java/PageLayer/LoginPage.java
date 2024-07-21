package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass {

	@FindBy(name = "email")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginbutton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void userEnterValidUsernameAndPassword(String uname, String pass) {
		Wait.sendkeys(username, uname);
		Wait.sendkeys(password, pass);
		
	}

	public void userClickOnLoginButton() {
		Wait.click(loginbutton);
		
	}

	
	}


	

