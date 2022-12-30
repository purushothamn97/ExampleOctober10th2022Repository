package com.sgtesting.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoname1 {
	public static WebDriver OBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		login();
		SearchandAddtocart();
	//	Logout();
	//	closeApplication();
	}
	private static void SearchandAddtocart() {
		try
		{
			OBrowser.findElement(By.id("twotabsearchtextbox")).sendKeys("Onepluse mobiles");
			OBrowser.findElement(By.id("nav-search-submit-button")).click();
			OBrowser.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
			OBrowser.findElement(By.id("wishListMainButton-announce")).click();
			//OBrowser.findElement(By.id("attach-sidesheet-view-cart-button-announce")).click();
		}catch (Exception e)
		{
			e.printStackTrace();	
		}
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
	private static void login() {
		try
		{
			OBrowser.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
			OBrowser.findElement(By.name("email")).sendKeys("purushotham97222@gmail.com");
			OBrowser.findElement(By.id("continue")).click();
			OBrowser.findElement(By.name("password")).sendKeys("Welcome@1");
			OBrowser.findElement(By.id("signInSubmit")).click();
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LaunchBrowser() {
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\GitRepository\\DemoWorkSpace\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			OBrowser=new ChromeDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			OBrowser.get("https://www.amazon.in/");
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
