package com.sgtesting.practice1;
//launchBrowser --> navigate --> Login --> Create Customer --> Create Project-->Modify Project--> delete Project-->delete Customer --> 
//Logout --> CloseApplication

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Demo7 {
		public static WebDriver OBrowser=null;
		public static void main(String[] args) {
			LaunchBrowser();
			navigate();
			login();
			creatCustomer();
			creatProject();
			ModifyProject();
			DeleteProject();
			Logout();
			closeApplication();
		}
		private static void ModifyProject() {
			try
			{
				 OBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
				 Thread.sleep(2000);
				 OBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
				 Thread.sleep(2000);
				 OBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).clear();
				 Thread.sleep(2000);
				 OBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("Agriculture Project");
				 Thread.sleep(2000);
				 OBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
				 Thread.sleep(2000);
			} catch (Exception e) 
			{
			 e.printStackTrace();
			}
		}
		private static void DeleteProject()
		{
			try
			{
				 OBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				 Thread.sleep(2000);
				 OBrowser.findElement(By.className("actionButton")).click();
				 Thread.sleep(2000);
				 OBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
				 Thread.sleep(2000);
				 OBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
				 Thread.sleep(2000);
			} catch (Exception e) 
			{
			 e.printStackTrace();
			}
		}
		private static void creatProject() {
			try
			{
				OBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("demo project");
			//	OBrowser.findElement(By.id("projectPopup_newCustomerNameField")).sendKeys("Alaen1");
				OBrowser.findElement(By.name("projectDescriptionField")).sendKeys("Solar Project");
				Thread.sleep(2000);
				OBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
				Thread.sleep(5000);
			}catch (Exception e)
			{
				e.printStackTrace();
			
			}
		}
		
		private static void DeleteCustomwer() {
			try
			{
				OBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.xpath("//div[text ()='Delete']")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
				Thread.sleep(2000);
				
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void creatCustomer() {
			try
			{
				OBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")).click();
				OBrowser.findElement(By.xpath("//div[text ()='+ New Customer']")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_nameField\"]")).sendKeys("Alaen");
				OBrowser.findElement(By.xpath("//span[text ()='Create Customer']")).click();
				Thread.sleep(2000);
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
	
