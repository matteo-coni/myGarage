package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

//TEST MATTEO CONI SELENIUM_API

public class TestSeleniumVehicleModel {

	@Test
	public void checkCorrectModel() {
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/myGarage/LoginScreen.jsp");
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("admin");
		
		driver.findElement(By.xpath("/html/body/div/form/div[4]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"select\"]")).sendKeys("BB/636/CG");
		driver.findElement(By.xpath("/html/body/form/table/tbody[2]/tr[2]/td[3]/div/button")).click();
		
		String modelVehicle = driver.findElement(By.xpath("//html/body/form/table/tbody[2]/tr[3]/td[2]/table/tbody[2]/tr/td[4]/h4[2]/label[2]")).getText();
		
		
		assertEquals("California", modelVehicle);
		
		driver.close();
	}

}
