package com.pro.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pro.utilities.ElementUtils;

      public class Myaccpage extends BasePage {
	
             public  Myaccpage(WebDriver driver){
            	   super(driver);
            	   
               }
               
               @FindBy(xpath = "//h2[text()='My Account']")
               WebElement myaccheader;
               
               
               @FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
     	      WebElement logoutbtn;
            		  
               
               
               
               public boolean  isdiaplayedmyacc() {
            	   
            	   
             return	 eleutils.isElementDisplayed(myaccheader);
            	   
               }
                public void clicklogout() {
                eleutils.clickonelement(logoutbtn);
                }
}
