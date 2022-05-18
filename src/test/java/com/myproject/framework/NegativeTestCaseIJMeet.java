package com.myproject.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class NegativeTestCaseIJMeet {
	public RemoteWebDriver driver = null;

	@BeforeMethod
	public void invokeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ijmeet.com");
	}
	@Test
	public void verifyJoinMeeting() throws InterruptedException {

		driver.findElement(By.xpath("//a[text()=\" Join Meeting \"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#username")).sendKeys("Ssujata");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#meetingid")).sendKeys("123456ABc");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button#before_start")).click();
		WebElement element=driver.findElement(By.cssSelector("p.text-center"));
		
		String msg=element.getText();
		System.out.println(msg);
		
		//Assert.assertEquals("Meeting id not found", msg);
	}
	
	
}

