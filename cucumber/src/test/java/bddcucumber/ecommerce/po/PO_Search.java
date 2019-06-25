package bddcucumber.ecommerce.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class PO_Search {
	WebDriver driver;

	public PO_Search(WebDriver d) 
	{
		this.driver=d;
	}
	
	//elements
	@FindBy(how=How.ID, using="pagination_contents")
	WebElement search_container;
	
	//method
	public void validate_search_results()
	{
	   Assert.assertEquals(true, search_container.isDisplayed());	
	}
	

}
