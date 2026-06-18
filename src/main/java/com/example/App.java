package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {    
        ChromeOptions options = new ChromeOptions;
        options.addArguments('--headless=new');
        options.addArguments('--no-sandbox');
        options.addArguments('--disable-dev-shm-usage');
        WebDriver driver = new ChromeDriver(options);
        
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//a[contains(text(),'Add to cart')])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//u[text()='View Cart']")).click();
        System.out.println( "Logged In" );
        Thread.sleep(3000);
        driver.quit();
    }
}
