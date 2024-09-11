package SeleniumRevise.SeleniumProjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.reddit.com");
		
		//for every attribute there can be a value
		//Here class is the attribute
		//span is the tag
		//and the last one is value
		dr.findElement(By.xpath("(//span[@class=\"flex items-center justify-center\"])[2]")).click();
	}

}
