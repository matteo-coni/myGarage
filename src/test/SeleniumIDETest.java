package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import org.junit.*;
import java.util.*;

import logic.bean.*;

public class SeleniumIDETest {
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/trunk/src/logic/view/web/HomeScreenSelectedVehicle.jsp");
		
		driver.findElement(By.xpath("/html/body/form/table/tbody[2]/tr[2]/td[3]/div/button")).click();
		WebElement conversionBox = driver.findElement(By.xpath("//*[@id=\"licensePlate\"]"));
		
		//boolean 
		
		
		driver.close();
	}

}
