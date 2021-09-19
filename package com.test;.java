package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

   public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\AppData\\Local\\Jenkins\\.jenkins\\jobs\\Demo-Pipeline-selenium-git\\chromedriver.exe" );	// <-- Change this path	// <-- Change this path
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
