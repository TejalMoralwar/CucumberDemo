package bddcucumber.ecommerce.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import bddcucumber.ecommerce.po.PO_Header;
import bddcucumber.ecommerce.po.PO_Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps_CsCartSearch {
	WebDriver driver;
	//PO_Header pO_Header = PageFactory.initElements(driver, PO_Header.class);
	//PO_Search PO_Search = PageFactory.initElements(driver, PO_Search.class);
	
	


	@Given("As a user when I launch application in chrome")
	public void as_a_user_when_I_launch_application_in() {
		System.setProperty("webdriver.chrome.driver","F:\\automation\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	}

    @Given("navigate to url as {string}")
	public void navigate_to_url_as(String url) {
		driver.get(url);
	}

	@When("I enter {string} in top search box") 
	public void i_enter_in_top_search_box(String Product) { 
		PO_Header pO_Header = PageFactory.initElements(driver, PO_Header.class);
		
		pO_Header.setSearchbox(Product);
		System.out.println(Product);

	}

	@When("click on search submit button") 
	public void click_on_search_submit_button() { 
		PO_Header pO_Header = PageFactory.initElements(driver, PO_Header.class);
		
		pO_Header.clickSearchButton();

	}

	@Then("page navigates to product search results") 
	public void page_navigates_to_product_search_results() { 
		String expected ="Search results"; 
		String actual = driver.getTitle();
	   Assert.assertEquals(expected, actual);
	   System.out.println("validation is successfull");

	}

	@Then("proudct results are displayed") 
	public void proudct_results_are_displayed() { 
		
		PO_Search PO_Search = PageFactory.initElements(driver, PO_Search.class);
		PO_Search.validate_search_results(); }

	@Then("close the browser") 
	public void close_the_browser() { 
		driver.close();
	}




}
