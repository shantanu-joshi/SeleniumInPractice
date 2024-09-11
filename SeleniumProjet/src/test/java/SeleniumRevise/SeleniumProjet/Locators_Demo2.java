package SeleniumRevise.SeleniumProjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Demo2 {
	
	public static void main(String[] args) {
		
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://rahulshettyacademy.com/locatorspractice/");
		
		dr.manage().window().maximize();
		dr.findElement(By.id("inputUsername")).sendKeys("Shantanu");
		dr.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		dr.findElement(By.className("submit")).click();
		
	}

}
