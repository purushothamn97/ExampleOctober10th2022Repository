package com.sgtesting.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
	public static WebDriver OBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		Logout();
		closeApplication();
	}
	private static void Logout() {
		try
		{
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow() {
		try
		{
			OBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login() {
		try
		{
			OBrowser.findElement(By.id("username")).sendKeys("admin");
			OBrowser.findElement(By.name("pwd")).sendKeys("manager");
			OBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void launchBrowser() {
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\GitRepository\\DemoWorkSpace\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			OBrowser=new FirefoxDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			OBrowser.get("http://localhost/login.do");
			
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication() {
		try
		{
			OBrowser.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
