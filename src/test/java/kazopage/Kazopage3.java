package kazopage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Kazopage3 {
	WebDriver driver;
	@FindBy (xpath = "//*[@id=\"cartLink\"]/i")
	WebElement carts;
	@FindBy(xpath = "//*[@id=\"CartDrawer-Checkout\"]")
	WebElement cartimage;
	@FindBy (xpath = "//*[@id=\"CartDrawer\"]/div[1]/h4/button/i")
	WebElement closebutton;
	@FindBy(xpath = "//*[@id=\"siteNav\"]/li[7]")
	WebElement barbie;
	@FindBy (xpath="//*[@id=\"header\"]/header/div[4]/a[2]/i")
	WebElement login;
	@FindBy (xpath="//*[@id=\"settingsBox\"]/div[1]/p[1]/a")
	WebElement Myaccount;
	@FindBy (id="CustomerEmail")
	WebElement emailfield;
	@FindBy (id="CustomerPassword")
	WebElement passwordfield;
	@FindBy (xpath = "//*[@id=\"customer_login\"]/div[1]/input")
	WebElement signIn;
	public  Kazopage3(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void screenshot() throws IOException
	{
		carts.click();
		File img1=cartimage.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(img1, new File("./screenshots/image2.png"));
		closebutton.click();
	}
	public void kazobarbie() throws InterruptedException, IOException
	{
		barbie.click();
		Thread.sleep(2000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./screenshots/pagepic.png"));
	}
	public void loginpage()
	{
		login.click();
		Myaccount.click();
	}
	public void Account(String email,String password) throws InterruptedException
	{

		emailfield.clear();
		emailfield.sendKeys(email);
		Thread.sleep(3000);
		passwordfield.clear();
		passwordfield.sendKeys(password);
		signIn.click();
		String expectedurl="https://kazo.com/challenge";
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		if(actualurl==expectedurl)
		{
			System.out.println("Passed");
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
