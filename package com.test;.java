package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

   public static void main(String[] args) {
<<<<<<< HEAD
       System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\AppData\\Local\\Jenkins\\.jenkins\\jobs\\Demo-Pipeline-selenium-git\\chromedriver.exe" );	// <-- Change this path
=======
      System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\AppData\\Local\\Jenkins\\.jenkins\\jobs\\Demo-Pipeline-selenium-git\\chromedriver.exe" );	// <-- Change this path	// <-- Change this path
>>>>>>> 2c53c0c8df2117ae3743a4484aa8f50183f321cd
       WebDriver driver = new ChromeDriver();
       String baseUrl = "https://experitest.com/free-trial/";
       String expectedTitle = "Free trial";
       String actualTitle = "";
       driver.get(baseUrl);
       actualTitle = driver.getTitle();
       if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("TEST PASSED!");
       } else {
           System.out.println("TEST FAILED");
       }
       driver.close();
   }
}
