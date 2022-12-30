package com.sgtesting.practice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateuserScenerioDemo {
	public static WebDriver OBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		login();
		creatuser();
		Deleteuser();
		Logout();
		closeApplication();
	}
	private static void Deleteuser() {
		try
		{
			OBrowser.findElement(By.xpath("//span[text()='D1, Demo1']")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert OAlert=OBrowser.switchTo().alert();
			Thread.sleep(2000);
			String constent=OAlert.getText();
			System.out.println(constent);
			OAlert.accept();
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void creatuser() {
		try
		{
			OBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.name("firstName")).sendKeys("Demo1");
			OBrowser.findElement(By.name("lastName")).sendKeys("D1");
			OBrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
			OBrowser.findElement(By.name("username")).sendKeys("Sample11155s");
			OBrowser.findElement(By.name("password")).sendKeys("welcome@1");
			OBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome@1");
			OBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
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
			OBrowser.findElement(By.id("username")).sendKeys("admin");
			OBrowser.findElement(By.name("pwd")).sendKeys("manager");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
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
