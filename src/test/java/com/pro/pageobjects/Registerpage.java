package com.pro.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends  BasePage{
                
	//cons
	//locator
	//method
	
	public  Registerpage ( WebDriver driver){
		  super(driver);
		  
		 
		 
	 }
	  
	  
	  @FindBy(xpath = "")
      WebElement firstname;
      
      
      @FindBy(xpath = "")
      WebElement lastname;
      
      
      @FindBy(xpath = "")
      WebElement email;
      
      @FindBy(xpath = "")
      WebElement telephone;
      
      @FindBy(xpath = "")
      WebElement password;
      
      @FindBy(xpath = "")
      WebElement confirmpassword;
      
      @FindBy(xpath = "")
      WebElement subscribebutton;
      
      @FindBy(xpath = "")
      WebElement privacypolicybox;
      
      @FindBy(xpath = "")
      WebElement continuebutton;
      
      
      
         //action method
      
        public void enterfirstname(String fn) {
        	eleutils.enterDatainField(firstname, fn);
        	
        }
        public void enterlastname(String ln) {
        	eleutils.enterDatainField(lastname, ln);
        	
        }
        public void enteremail(String em) {
        	eleutils.enterDatainField(email, em);
        }
      
        public void entertelephone(String num) {
        	eleutils.enterDatainField(telephone, num);
        	
        }
        
        public void enterpassword(String pass) {
        	eleutils.enterDatainField(password, pass);
        }
      
        public void enterconfpass(String conpass) {
        	eleutils.enterDatainField(confirmpassword, conpass);
        }
      
        public void clickOnsubscribe() {
        	
        	eleutils.clickonelement(subscribebutton);
        }
      
        public void clickonprivacypolicy() {
        	eleutils.clickonelement(privacypolicybox);
        	
        }
        
        public void clickContinue() {
        	eleutils.clickonelement(continuebutton);
        }
      
      
      
      
      
      
      
}
