package com.sgtesting.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo31 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		//minimizeFlyoutWindow();
		createUser();
		adminLogout();
		userLoginAndLogout();
		userLoginAndModifyPassword();
		userLoginAndLogoutUsingNewPassWordOne();
		adminLoginUserPasswordChange();
		userLoginAndLogoutUsingNewPassword2();
		adminLoginAndDeleteAllUsersAndLogoutCloseApp();


	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\GitRepository\\DemoWorkSpace\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		};

	}
	private static void minimizeFlyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			oBrowser.findElement(By.name("lastName")).sendKeys("user1");
			oBrowser.findElement(By.name("email")).sendKeys("demo1@yahoo.com");
			oBrowser.findElement(By.name("username")).sendKeys("demo1");
			oBrowser.findElement(By.name("password")).sendKeys("1111");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1111");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo2");
			oBrowser.findElement(By.name("lastName")).sendKeys("user2");
			oBrowser.findElement(By.name("email")).sendKeys("demo2@yahoo.com");
			oBrowser.findElement(By.name("username")).sendKeys("demo2");
			oBrowser.findElement(By.name("password")).sendKeys("2222");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("2222");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo3");
			oBrowser.findElement(By.name("lastName")).sendKeys("user3");
			oBrowser.findElement(By.name("email")).sendKeys("demo3@yahoo.com");
			oBrowser.findElement(By.name("username")).sendKeys("demo3");
			oBrowser.findElement(By.name("password")).sendKeys("3333");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("3333");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void adminLogout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void userLoginAndLogout()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demo1");
			oBrowser.findElement(By.name("pwd")).sendKeys("1111");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);

			oBrowser.findElement(By.id("username")).sendKeys("demo2");
			oBrowser.findElement(By.name("pwd")).sendKeys("2222");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);

			oBrowser.findElement(By.id("username")).sendKeys("demo3");
			oBrowser.findElement(By.name("pwd")).sendKeys("3333");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();   
			Thread.sleep(5000);

		}catch (Exception e)
		{
			e.printStackTrace();
		};

	}
	private static void userLoginAndModifyPassword()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demo1");
			oBrowser.findElement(By.name("pwd")).sendKeys("1111");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='user1, demo1']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("password")).sendKeys("vin111");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("vin111");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("username")).sendKeys("demo2");
			oBrowser.findElement(By.name("pwd")).sendKeys("2222");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='user2, demo2']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("password")).sendKeys("vin222");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("vin222");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("username")).sendKeys("demo3");
			oBrowser.findElement(By.name("pwd")).sendKeys("3333");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='user3, demo3']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("password")).sendKeys("vin333");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("vin333");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void userLoginAndLogoutUsingNewPassWordOne()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demo1");
			oBrowser.findElement(By.name("pwd")).sendKeys("vin111");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);

			oBrowser.findElement(By.id("username")).sendKeys("demo2");
			oBrowser.findElement(By.name("pwd")).sendKeys("vin222");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);

			oBrowser.findElement(By.id("username")).sendKeys("demo3");
			oBrowser.findElement(By.name("pwd")).sendKeys("vin333");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.linkText("Logout")).click();   
			Thread.sleep(5000);

		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void adminLoginUserPasswordChange()
	{
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='user1, demo1']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("password")).sendKeys("1000");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1000");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='user2, demo2']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("password")).sendKeys("2000");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("2000");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='user3, demo3']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("password")).sendKeys("3000");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("3000");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);

			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);


		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void userLoginAndLogoutUsingNewPassword2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demo1");
			oBrowser.findElement(By.name("pwd")).sendKeys("1000");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);

			oBrowser.findElement(By.id("username")).sendKeys("demo2");
			oBrowser.findElement(By.name("pwd")).sendKeys("2000");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);

			oBrowser.findElement(By.id("username")).sendKeys("demo3");
			oBrowser.findElement(By.name("pwd")).sendKeys("3000");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.linkText("Logout")).click();   
			Thread.sleep(5000);

		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void adminLoginAndDeleteAllUsersAndLogoutCloseApp()
	{
		try
		{
			
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(5000);

			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert1=oBrowser.switchTo().alert();
			oAlert1.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert3=oBrowser.switchTo().alert();
			oAlert3.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			
			oBrowser.quit();
			


		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}