package com.pro.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pro.pageobjects.Homepage;
import com.pro.pageobjects.LoginPage;
import com.pro.pageobjects.Myaccpage;
import com.pro.utilities.Dataproviders;

import baseTest.BaseTest;
                
                 
             
            
              public class LoginDDT extends BaseTest{
            	  
            	  Homepage hp;
            	  LoginPage lp;
            	  Myaccpage myacc;
            	  
            	  
               @Test(dataProvider = "dp1" , dataProviderClass = Dataproviders.class)
               public void verifyLoginDDt(String username, String pwd ,String exp) {
            	     hp = new Homepage(driver);
            	     hp.clickmyacc();
            	     hp.clickonlogin();
            	     
            	     lp= new LoginPage(driver);
            	     lp.enteremail(null);
            	     lp.enterpassword(null);
            	     lp.clicklogin();
            	      myacc=new  Myaccpage(driver);
            	     
	                     boolean targetpage = myacc.isdiaplayedmyacc();
	  
	                     
	                     if(exp.equalsIgnoreCase("valid")) {
	                    	 
	                    	 if(targetpage == true) {
	                    		 myacc.clicklogout();
	                    		 Assert.assertTrue(true);
	                    	 }
	                    	 else {
	                    		 Assert.assertFalse(false);
	                    	 }
	                     }
	                     
	                     if(exp .equalsIgnoreCase("invalid")) {
	                    	 if(targetpage==true) {
	                    		 myacc.clicklogout();
	                    		 Assert.assertTrue(false);
	                    	 }
	                    	 
	                    	 else {
								Assert.assertTrue(true);
							}
	                     }
	  
                 }
}
