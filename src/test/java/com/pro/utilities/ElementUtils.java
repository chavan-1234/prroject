package com.pro.utilities;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.reactivex.rxjava3.functions.Action;

public class ElementUtils {
          
	WebDriver driver;
	
	  
	        public ElementUtils( WebDriver driver){
		 
		 this.driver= driver;
		 
	 }
	
	        public void clickonelement(WebElement element) {
	        	if(isElementDisplayed(element)&& isElementEnabled(element)) {
	        		element.click();
	        		
	        	}
	        	
	        }
	        
	      
	        public boolean isElementDisplayed(WebElement element) {
	        	
	        	boolean b=false;
	        	try {
	        		b=element.isDisplayed();
	        		
	        	}
	        	catch (NoSuchElementException e) {
					b=false;
					
				}
	        	return b;
	        	
	        }
	        
	        //isenabled
	        public boolean isElementEnabled(WebElement element) {
	        	boolean b=false;
	        	try {
	        		b=element.isEnabled();
	        		
	        	}
	        	catch (NoSuchElementException e) {
					b=false;
					
				}
	        	return b;
	        	
	        }
	        
	        //for sendkeys
	        
	          public void enterDatainField(WebElement element,String data) {
	        	  if(isElementDisplayed(element)&& isElementEnabled(element)) {
	        		  element.clear();
	        		  element.sendKeys(data);
	        	  }
	          }
	          
	          //select
	          
	          public void elementSelectByVisibleText(WebElement element,String text) {
	        	  
	        	  Select sel= new Select(element);
	        	  sel.selectByVisibleText(null);
	          }
	        
	        public void elementSelectByValue(WebElement element, String text) {
	        	
	        	Select sel= new Select(element);
	        	sel.selectByValue(text);
	        }
	          public void elementSelectByIndex(WebElement element, int index) {
	        	  Select sel=new Select(element);
	        	  sel.selectByIndex(index);
	          }
	          
	          public int elementGetAllOptions(WebElement element) {
	        	  Select sel = new Select(element);
	        	      List<WebElement> options = sel.getOptions();
	        	        int    size  =options.size();
	        	          for(       WebElement op : options) {
	        	        	  System.out.println(op.getText());
	        	          }
	        	          
	        	  return size;
	        	  
	          }
	          
	          
	          //mouse action methods
	          
	          public void doubleClickOnelement(WebElement element) {
	        	  Actions act = new Actions(driver);
	        	  act.doubleClick(element);
	        	  
	          }
	          
	          public void rightClickOnElement(WebElement element) {
	        	  
	        	  Actions act= new Actions(driver);
	        	  act.contextClick(element);
	        	  
	          }
	          
	          public void mouseHoverOnElement(WebElement element) {
	        	  Actions act= new Actions(driver);
	        	  act.moveToElement(element);
	        	  
	          }
	          
	          
	          public int getElementCount(List<WebElement> elements) {
	        	  int n=0;
	        	  try {
	        		 n =elements.size();
	        	  }
	        	 catch (Exception e) {
					 n=0;
					 
				}
	        	  
	        	  return n;
	        	  
	        	  
	          }
	          
	          
	          public String getTextOfElement(WebElement element) {
	        	  
	        	  return element.getText();
	        	  
	        	  
	          }
	          
	          
	          public void pressKeyMultipleTimes(WebDriver driver, int count , Keys tab) {
	        	  Actions act = new Actions(driver);
	        	  for(int i=0; i<=count; i++) {
	        		  
	        		  act.sendKeys(tab).perform();
	        		  
	        	  }
	        	  
	          }
	
}
