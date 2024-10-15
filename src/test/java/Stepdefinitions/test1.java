package Stepdefinitions;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class test1 {
	
	 WebDriver driver =new ChromeDriver();
	  String projectPath= System.getProperty("user.dir");
	  // System.out.println(projectPath);
	      String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	    	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	    	
	
	
	
	@Given("user navigates on to app")
	public void user_navigates_on_to_app() throws InterruptedException {
	 
	   driver.get(url);
   	//Thread.sleep(3000);
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   	driver.manage().window().maximize();
    System.out.println("*************************");
	}	  

	@Then("user checks the page title")
	public void user_checks_the_page_title() {
		// System.out.println("hello");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
	}

	@Then("user enters  {string} username")
	public void user_enters_username(String string) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	
		 System.out.println("user entered correct details");
		// Thread.sleep(3000);
	}

	@Then("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 System.out.println("clicks login");
		
		//Thread.sleep(3000);
	}

	@Then("User navigates to dashboard page")
	public void user_navigates_to_dashboard_page() throws InterruptedException {
		String  Str =driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
    	System.out.println(Str);
    //	Thread.sleep(3000);
    	 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
         
         //Copy the file to a location and use try catch block to handle exception
         try {
             FileUtils.copyFile(screenshot, new File("C:\\Users\\TBEEMARA\\Newprojectworkspace\\22sep_cucumber_project\\Screenshots\\.s.png"));
         } catch (IOException e) {
             System.out.println(e.getMessage());}
       
	driver.quit();
	   
	}

	@Then("user enters  {string} invalid")
	public void user_enters_invalid(String string) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		 Thread.sleep(3000);
			
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(3000);
			
	
	//String text=driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		 System.out.println("user entered invalid details");
		 Thread.sleep(3000);
	}
	@Then("user valid text message")
	public void user_valid_text_message() {
		String text2= driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		System.out.println(text2);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
	}



}
