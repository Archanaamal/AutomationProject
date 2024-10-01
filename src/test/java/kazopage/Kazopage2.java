package kazopage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class Kazopage2 {
	WebDriver driver;
	@FindBy (xpath = "//ul[@id=\"siteNav\"]/li[3]")
	WebElement bag;
	@FindBy(xpath = "//ul[@id=\"siteNav\"]/li[3]/ul/li[3]")
	WebElement slingbag;
	@FindBy(id="SortBySt")
	WebElement sort;
	@FindBy(xpath = "//*[@id=\"Collection\"]/div[1]/div[1]/div[3]/div[2]/div/div[1]/a/div[2]")
	WebElement bag2;
	@FindBy(xpath = "//*[@id=\"AddToCart-template--18320695492851__product\"]/span")
	WebElement cart;
	@FindBy(xpath = "//*[@id=\"inlinecheckout-cart\"]")
	WebElement viewcart;
	@FindBy (xpath = "//*[@id=\"main-cart-footer\"]/div/div/a")
	WebElement continuebutton;
	String expurl="https://kazo.com/";
	
	public Kazopage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void bags() throws InterruptedException
	{
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(bag).perform();
		slingbag.click();
	}
	public void bagsort() throws InterruptedException {
		Thread.sleep(2000);
		Select bag=new Select(sort);
		bag.selectByVisibleText("Best Selling");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.click(bag2).perform(); 
		cart.click();
		Thread.sleep(2000);
		act.click(viewcart).perform();
		continuebutton.click();
		//String currenturl=driver.getCurrentUrl();
		//Assert.assertEquals(expurl, currenturl,"Failed to load home page");
		
	}
	

}
