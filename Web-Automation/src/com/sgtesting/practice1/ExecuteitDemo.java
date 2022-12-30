package com.sgtesting.practice1;

public class ExecuteitDemo {

	public static void main(String[] args) {
		executeautoit();
	}
		private static void executeautoit()
		
		{
			try
			{
				Runtime.getRuntime().exec("E:\\GitRepository\\DemoWorkSpace\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

