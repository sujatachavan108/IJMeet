package com.myproject.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myproject.keywords.UIKeywords;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestCases {
	public RemoteWebDriver driver = null;

	@BeforeMethod
	public void invokeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ijmeet.com");
	}
	/**
	@Test
	public void verifyGetImage() {
		WebElement element = driver.findElement(By.cssSelector("img[src=\"https://ijmeet.com/images/LOGO-F@2x.png\"]"));
		String msg = element.getTagName();
		System.out.println(msg);
	}

	@Test
	public void verifyJoinMeeting() throws InterruptedException {

		driver.findElement(By.xpath("//a[text()=\" Join Meeting \"]")).click();
		Thread.sleep(3000);
	}

	@Test
	public void verifyHostMeeting() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()=\" Host Meeting \"]")).click();
		Thread.sleep(4000);
	}

	@Test
	public void verifyContactSalesButton() throws InterruptedException {

		driver.findElement(By.xpath("//a[text()=\" Contact sales \"]")).click();
		Thread.sleep(4000);
	}

	@Test
	public void verifySignInButton() throws InterruptedException {

		driver.findElement(By.cssSelector("a.nav-right-cutom-bg")).click();
		Thread.sleep(3000);

	}

	@Test
	public void verifySignUpButton() throws InterruptedException {

		driver.findElement(By.cssSelector("a.nav-right-cutom-bg-1")).click();
		Thread.sleep(3000);
	}

	*/
	@Test
	public void scrollWindow() throws InterruptedException {
		Thread.sleep(3000);
		driver.executeScript("window.scrollBy(0,10000)");

	}
	

}
