package bddcucumber.ecommerce.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Header {
	WebDriver driver;

	public PO_Header(WebDriver d) 
	{
		this.driver=d;
	}
	
	//elements
	@FindBy(how=How.ID, using="search_input")
	WebElement search_box;
	
	@FindBy(how=How.XPATH, using="//button[@title='Search']")
	WebElement search_btn;
	
	//methods
	
	public void setSearchbox(String product)
	{
		search_box.sendKeys("laptop");
		
	}
	
	public void clickSearchButton()
	{
		search_btn.click();
	}

}
