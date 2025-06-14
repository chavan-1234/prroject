package com.pro.testCases;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import com.pro.pageobjects.RegSuccesspage;
import com.pro.pageobjects.Homepage;
import com.pro.pageobjects.Registerpage;

import baseTest.BaseTest;

public class RegisterTest extends BaseTest {
	 Homepage hp;
	 Registerpage rp;
	 RegSuccesspage as;
	 
	
	         @Test
	         public void verifyregisterusingValidCredentials() {
	        	 
	        	  hp=new  Homepage(driver);
	        	  hp.clickmyacc();
	        	  hp.clickonregister();
	        	  
	        	  rp=new Registerpage(driver);
	        	  rp.enterfirstname(null);
	        	  rp.enterlastname(null);
	        	  rp.enteremail(null);
	        	  rp.entertelephone(null);
	        	  rp.enterpassword(null);
	        	  rp.enterconfpass(null);
	        	 
	        	  rp.clickOnsubscribe();
	        	  rp.clickonprivacypolicy();
	        	  rp.clickContinue();
	        	  
	        	  as=new RegSuccesspage(driver);
	        	           boolean succmsg = as.isdisplayedaccsuccmag();
	        	            Assert.assertTrue(succmsg);
	        	 
	         }
	
	
}
