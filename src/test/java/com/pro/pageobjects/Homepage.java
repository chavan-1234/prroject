package com.pro.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage  {
               public Homepage(WebDriver driver) {
				
            	   
            	   super(driver);
            	   
			}
               
               //locator
               @FindBy(xpath = "//span[text()='My Account']")
               WebElement myacc;
               
               @FindBy (xpath = "//a[text()='Register']")
               WebElement register;
               
               @FindBy(xpath = "//a[text()='Login']")
               WebElement login;
               
               
           public void clickmyacc()  {  
        	   eleutils.clickonelement(myacc);
        	   
           }
           
           public void clickonregister() {
        	   
        	   eleutils.clickonelement(register);
           }
               
               
               public void clickonlogin() {
            	   eleutils.clickonelement(login);
               }
               
               
               
               
               
               
               
               
               
}
