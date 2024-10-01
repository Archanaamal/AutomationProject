package kazopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KazocomPage 
{
	public static WebDriver driver;

	
	
	@FindBy (xpath ="//*[@id=\"siteNav\"]/li[1]/a")
	WebElement newarrivals;
	@FindBy (xpath = "//*[contains(@ class,'btn btn-filter')]")
	WebElement Filter;
	@FindBy (xpath = "//*[@id=\"CollectionFiltersForm\"]/div[1]/ul/li[13]/label")
	WebElement top;
	@FindBy (xpath = "//form[@id=\"CollectionFiltersForm\"]/div[2]/ul/li[4]")
	WebElement l;
	@FindBy (xpath = "//*[@id=\"CollectionFiltersForm\"]/div[4]/ul/li[2]/label")
	WebElement black;
	@FindBy(xpath = "//*[@id=\"Collection\"]/div[2]/div[1]/i")
	WebElement close;
	@FindBy (xpath = "//*[@id=\"Collection\"]/div[1]/div[1]/div[3]/div[1]/div/div[1]/a/div[2]")
	WebElement product;
	@FindBy (xpath = "//*[@id=\"product-form-template--18320695492851__product\"]/div[1]/div[2]/label/a")
	WebElement sizechart;
	@FindBy (xpath = "//*[@id=\"sizechart\"]/button")
	WebElement closed;
	@FindBy (xpath = "//*[@id=\"shopify-section-template--18320694575347__collection\"]/div[1]/nav/a")
	WebElement home;
	public KazocomPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void newArrivals() throws InterruptedException
	{
		newarrivals.click();
		Filter.click();
		top.click();
		l.click();
		black.click();
		close.click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.click(product).perform();
		sizechart.click();
		closed.click();
		driver.navigate().back();
		home.click();
	
		
	}
	

}
