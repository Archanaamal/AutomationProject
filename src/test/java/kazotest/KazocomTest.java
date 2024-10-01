package kazotest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import kazopage.KazocomPage;
import kazopage.Kazopage2;
import kazopage.Kazopage3;
import kazopage.Kazopage4;
import utilitypackage.Excelutilities;

public class KazocomTest extends Baseclass {
	
	@Test
	public void homepage() throws InterruptedException, IOException
	{
		KazocomPage kp=new KazocomPage(driver);
		kp.newArrivals();
		
		Kazopage2 kp2=new Kazopage2(driver);
		kp2.bags();
		kp2.bagsort();
		Kazopage3 kp3=new  Kazopage3(driver);
		kp3.screenshot();
		kp3.kazobarbie();
		
		  kp3.loginpage(); String
		  Excel="C:\\Users\\amalj\\OneDrive\\Desktop\\ARCHANA\\kazo.xlsx"; 
		  String sheet="sheet1"; 
		  int rowcount=Excelutilities.getRowcount(Excel, sheet);
		  for(int i=1;i<=rowcount;i++) { String
		  email=Excelutilities.getstringValue(Excel, sheet, i, 0);
		  System.out.println("Email:"+email); String
		  password=Excelutilities.getstringValue(Excel, sheet, i, 1);
		  System.out.println("Password:"+password); kp3.Account(email, password); 
		
		  
		  }
		 
	}
	

}
