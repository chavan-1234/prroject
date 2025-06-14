package com.pro.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataproviders {
               
            	 @DataProvider(name="logindata")
            		public String[][] getdata() throws IOException{
            			
            		 String path="C:\\Users\\HP\\Desktop\\exceldata\\logindata.xlsx";
            			
            			Excelutility  xlutil =new Excelutility(path);
            			              // xlutil.convertIntegersToStrings(path);
            			 int totalrows = xlutil.getrowcount("sheet");
            			   int totalcols = xlutil.getcellcount("sheet", 1);
            			      
            			      String [][]logindata=new String[totalrows][totalcols];
            			      
            			      for(int i=1; i<=totalrows; i++) { //not include header part 
            			    	  
            			    	  for(int j=0; j<totalcols; j++) {
            			    		  
            			    		     logindata [i-1][j] =  xlutil.getcelldata("sheet", i, j);
            			    		  
            			    	  }
            			      }
            			 return logindata;
            			
            		}
}
