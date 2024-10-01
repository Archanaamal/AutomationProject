package kazopage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kazopage4 {
	WebDriver driver;
	@FindBy (xpath = "//*[@id=\"shopify-section-template--18320694673651__main\"]/div[2]/div[2]/div[2]/p[2]/a")
	WebElement viewaddress;
	public Kazopage4(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void viewAddress()
	{
		viewaddress.click();
	}

}
