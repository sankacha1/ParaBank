package com.parabank.transaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

//import cucumber.api.java.en.Given;

public class ParaRegister {

	WebDriver driver;

		
		public void invokeBrowser(){
			try {
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium Library\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("Cursor here");
				
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
				driver.get("https://parabank.parasoft.com/parabank/index.htm");
				Thread.sleep(4000);
				Register();
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
		
		public void Register(){
			try {
				//driver.findElement(By.id("loginPanel")).click();
				//driver.findElement(By.xpath("//*[@id='loginPanel']/p[2]/a")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();
				System.out.println("sag");
				Thread.sleep(3000);
				driver.findElement(By.id("customer.firstName")).sendKeys("chandra");
				driver.findElement(By.id("customer.lastName")).sendKeys("sanka");
				driver.findElement(By.id("customer.address.street")).sendKeys("16288");
				driver.findElement(By.id("customer.address.city")).sendKeys("Tampa");
				driver.findElement(By.id("customer.address.state")).sendKeys("FL");
				driver.findElement(By.id("customer.address.zipCode")).sendKeys("33647");
				driver.findElement(By.id("customer.phoneNumber")).sendKeys("489499333");
				driver.findElement(By.id("customer.ssn")).sendKeys("489499333");
				driver.findElement(By.id("customer.username")).sendKeys("AIG1");
				driver.findElement(By.id("customer.password")).sendKeys("sankachandra");
				driver.findElement(By.id("repeatedPassword")).sendKeys("sankachandra");
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")).click();
				
				
				//driver.findElement(By.id("search-button-top")).click();
			//	jse = (JavaScriptExecutor)driver;
				//(() jse).executeScript("scroll(0,800)");
			} catch (InterruptedException e) {
			  e.printStackTrace();
			}
		}	
     public static void main(String[] args) {
			
    	 ParaRegister myobj = new ParaRegister();
	        myobj.invokeBrowser();
	        
		}

}
