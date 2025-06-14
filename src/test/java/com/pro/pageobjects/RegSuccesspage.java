package com.pro.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class RegSuccesspage extends BasePage{
	      public    RegSuccesspage (WebDriver driver) {
	    	  super(driver);
	    	  
	      }
	      
	      @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	      WebElement accsuccessmsg;
	      @FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	      WebElement logoutbtn;
	      
	      
	      public boolean isdisplayedaccsuccmag() {
	    	  
	    	return  eleutils.isElementDisplayed(accsuccessmsg);
	    	  
	    	  
	      }
	      
	      public void clicklogout() {
	    	  eleutils.clickonelement(logoutbtn);
	      }
}
