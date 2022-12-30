package com.sgtesting.practice1;
//launchBrowser --> navigate --> Login --> Create Customer --> Create Project--> Create Tasks -->Delete Tasks --> delete Project-->
//delete Customer --> Logout --> CloseApplication
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Demo8 {
		public static WebDriver OBrowser=null;
		public static void main(String[] args) {
			LaunchBrowser();
			navigate();
			login();
			creatCustomer();
			creatProject();
		    CreatTask();
			DeleteTask();
			DeleteCustomwer();
			Logout();
			closeApplication();
		}
		private static void DeleteTask() {
			try
			{
				 OBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")).click();
				 Thread.sleep(2000);
				 OBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]")).click();
				 Thread.sleep(2000);
				 OBrowser.findElement(By.xpath("//*[@id=\'deleteTaskPopup_deleteConfirm_submitBtn\']/div")).click();
				 Thread.sleep(2000);
				 
			}catch (Exception e) 
				{
					 e.printStackTrace();
					}
		}
		private static void CreatTask() {
			try
			{
				 OBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div")).click();
				 Thread.sleep(2000);
				 OBrowser.findElement(By.xpath("//div[text()='Create new tasks']")).click();
				 Thread.sleep(2000);
				 OBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("Automation1");
				 OBrowser.findElement(By.xpath("//span[text()='Create Tasks']")).click();
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
				//OBrowser.findElement(By.name("projectDescriptionField")).sendKeys("Solar Project");
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
				OBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
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
				OBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
				Thread.sleep(2000);
				OBrowser.findElement(By.xpath("/html/body/div[12]/div[1]")).click();
				Thread.sleep(2000);
				
				OBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Alaen");
				OBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
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
				OBrowser.quit();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

