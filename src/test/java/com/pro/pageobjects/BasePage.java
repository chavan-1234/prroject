package com.pro.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pro.utilities.ElementUtils;

public class BasePage {
         WebDriver driver;
         ElementUtils eleutils;
         
         
	          public  BasePage(WebDriver driver){
	    	 this.driver=driver;
	    	 eleutils=new ElementUtils(driver);
	    	 PageFactory.initElements(driver, this);
	    	  
	     }


	
}
