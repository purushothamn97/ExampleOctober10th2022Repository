package com.sgtesting.practice1;
//launchBrowser --> navigate --> Login --> Create User1 --> Create User2--> Create User3 --> Logout from admin --> Login as User1 --> 
//logout as user1 --> Login as User2 --> logout as User2 --> Login as User3 --> logout as user3 --> Login as User1 --> Modify Password --> 
//Logout as user1 -->Login as User2 --> Modify Password --> Logout as user2 -->Login as User3 --> Modify Password --> Logout as user3 --> 

import org.openqa.selenium.Alert;

//Login as User1 using new pasword --> Logout as User1 -->Login as User2 using new pasword --> Logout as User2 --> 
//Login as User3 using new pasword --> Logout as User3 --> Login as Admin --> Modify Password for 
//User1 , User2, User3 --> Logout as Admin --> Login as User1 using new pasword --> Logout as User1 -->Login as User2 using new pasword -->
// Logout as User2 --> Login as User3 using new pasword --> Logout as User3 -->Login as Admin --> Delete User1, User2, User3 --> Logout as Admin

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static WebDriver OBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		login();
		CreateUser();
		LoginLogout();
		ModifyPswd();
		Loginusingnewpassword();
		LogininasAdminandModifypassword();
		Logininasnewpasswordandlogout();
		Delete();
	}
	private static void Delete() {
		try
		{
			OBrowser.findElement(By.id("username")).sendKeys("admin");
			OBrowser.findElement(By.name("pwd")).sendKeys("manager");
			OBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			OBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(3000);

			OBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=OBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
			
			OBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert1=OBrowser.switchTo().alert();
			oAlert1.accept();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//span[text()='A, Demo1']")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert3=OBrowser.switchTo().alert();
			oAlert3.accept();
			Thread.sleep(2000);
			
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			
			OBrowser.quit();

		}catch (Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	private static void Logininasnewpasswordandlogout() {
		try
		{
			OBrowser.findElement(By.id("username")).sendKeys("Sample1");
			OBrowser.findElement(By.name("pwd")).sendKeys("welcome@111");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			OBrowser.findElement(By.id("username")).sendKeys("Sample2");
			OBrowser.findElement(By.name("pwd")).sendKeys("welcome@222");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			OBrowser.findElement(By.id("username")).sendKeys("Sample3");
			OBrowser.findElement(By.name("pwd")).sendKeys("welcome@333");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void LogininasAdminandModifypassword() {
		try
		{
			
			OBrowser.findElement(By.id("username")).sendKeys("admin");
			OBrowser.findElement(By.name("pwd")).sendKeys("manager");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//span[text()='A, Demo1']")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.name("password")).sendKeys("welcome@111");
			OBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome@111");
			OBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(5000);
	
			OBrowser.findElement(By.xpath("//span[text()='B, Demo2']")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.name("password")).sendKeys("welcome@222");
			OBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome@222");
			OBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(5000);
			
			OBrowser.findElement(By.xpath("//span[text()='C, Demo3']")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.name("password")).sendKeys("welcome@333");
			OBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome@333");
			OBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(5000);
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();	
		}
		
	}

	private static void Loginusingnewpassword() {
		try
		{
			OBrowser.findElement(By.id("username")).sendKeys("Sample1");
			OBrowser.findElement(By.name("pwd")).sendKeys("welcome@11");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			OBrowser.findElement(By.id("username")).sendKeys("Sample2");
			OBrowser.findElement(By.name("pwd")).sendKeys("welcome@22");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			OBrowser.findElement(By.id("username")).sendKeys("Sample3");
			OBrowser.findElement(By.name("pwd")).sendKeys("welcome@33");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();		
		}
		
	}

	

	private static void ModifyPswd() {
		try
		{
			
			OBrowser.findElement(By.id("username")).sendKeys("Sample1");
			OBrowser.findElement(By.name("pwd")).sendKeys("welcome@1");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//span[text()='A, Demo1']")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.name("password")).sendKeys("welcome@11");
			OBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome@11");
			OBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(5000);
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			OBrowser.findElement(By.id("username")).sendKeys("Sample2");
			OBrowser.findElement(By.name("pwd")).sendKeys("welcome@2");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//span[text()='B, Demo2']")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.name("password")).sendKeys("welcome@22");
			OBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome@22");
			OBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(5000);
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			OBrowser.findElement(By.id("username")).sendKeys("Sample3");
			OBrowser.findElement(By.name("pwd")).sendKeys("welcome@3");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.xpath("//span[text()='C, Demo3']")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.name("password")).sendKeys("welcome@33");
			OBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome@33");
			OBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(5000);
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();	
		}
	}

	private static void LoginLogout() {
		try
		{
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.id("username")).sendKeys("Sample1");
			OBrowser.findElement(By.name("pwd")).sendKeys("welcome@1");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			
			OBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(5000);
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			OBrowser.findElement(By.id("username")).sendKeys("Sample2");
			OBrowser.findElement(By.name("pwd")).sendKeys("welcome@2");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			
			OBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div")).click();
			Thread.sleep(5000);
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			OBrowser.findElement(By.id("username")).sendKeys("Sample3");
			OBrowser.findElement(By.name("pwd")).sendKeys("welcome@3");
			OBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
	
			OBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div")).click();
			Thread.sleep(2000);
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void CreateUser() {
			try
			{
				OBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.name("firstName")).sendKeys("Demo1");
				OBrowser.findElement(By.name("lastName")).sendKeys("A");
				OBrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
				OBrowser.findElement(By.name("username")).sendKeys("Sample1");
				OBrowser.findElement(By.name("password")).sendKeys("welcome@1");
				OBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome@1");
				OBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(5000);
				
				OBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.name("firstName")).sendKeys("Demo2");
				OBrowser.findElement(By.name("lastName")).sendKeys("B");
				OBrowser.findElement(By.name("email")).sendKeys("demo2@gmail.com");
				OBrowser.findElement(By.name("username")).sendKeys("Sample2");
				OBrowser.findElement(By.name("password")).sendKeys("welcome@2");
				OBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome@2");
				OBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(5000);
				
				OBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.name("firstName")).sendKeys("Demo3");
				OBrowser.findElement(By.name("lastName")).sendKeys("C");
				OBrowser.findElement(By.name("email")).sendKeys("demo3@gmail.com");
				OBrowser.findElement(By.name("username")).sendKeys("Sample3");
				OBrowser.findElement(By.name("password")).sendKeys("welcome@3");
				OBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome@3");
				OBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
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
	private static void navigate() {
		try
		{
			OBrowser.get("http://localhost/login.do");
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

}
