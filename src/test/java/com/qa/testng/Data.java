package com.qa.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
	public class DataProviders
	{
	    @DataProvider (name = "data-provider")
	     public Object[][] dpMethod(){
		 return new Object[][] {{"First-Value"}, {"Second-Value"}};
	     }
		
	    @Test (dataProvider = "data-provider")
	    public void myTest (String val) {
	        System.out.println("Passed Parameter Is : " + val);
	    }
	}

}
