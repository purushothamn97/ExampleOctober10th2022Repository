package com.sgtesting.practice1;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DemoParactise {
		public static WebDriver OBrowser=null;
		public static void main(String[] args) {
			LaunchBrowser();
			navigate();
			login();
			
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
