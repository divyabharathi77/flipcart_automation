package com.application.scripts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.objectRepository.CommonPage;
import com.support.Filereader;

public class TC12 extends CommonPage {

	Filereader read= new Filereader();
	@Test	
	public void testTC12() throws Throwable{
		String rd= read.Filereader();
      while(rd!=null){
      type( txtSearch,rd ,"text search enter");}
		click(btnSearch, "search button");
		String strText = getTitle();
		if (strText.toLowerCase().contains(rd.toLowerCase())) {
			SuccessReport("Verify search results page title", "Appropriate page title '" +strText+"' is displayed for the search term - " +rd );
		} else 
		{
			failureReport("Verify search results page title", "Appropriate page title '" +strText+"' is not displayed for the search term - " + rd);
		}







	}
}
