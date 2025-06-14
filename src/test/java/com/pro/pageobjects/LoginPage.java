package com.pro.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
            
	          public LoginPage(WebDriver driver) {
	        	 super(driver);
	        	  
	          }
	          
	          //loc
	          
	          @FindBy(xpath = "//input[@id='input-email']")    
	   	   WebElement emailfield;
	   	   
	   	   @FindBy (xpath = "//input[@id='input-password']")     
	   	   WebElement pwdfield;
	   	   
	   	   @FindBy(xpath = "//input[@value='Login']")
	   	   WebElement loginButton;
	   	   
	   	   
	   	   public void enteremail(String em) {
	   		   
	   		 eleutils.enterDatainField(emailfield, em); 
	   	   }
	   	   
	   	   public void enterpassword(String pwd) {
	   		   eleutils.enterDatainField(pwdfield, pwd);
	   	   }
	   	   
	   	   
	   	   public void clicklogin() {
	   		   eleutils.clickonelement(loginButton);
	   	   }
}
