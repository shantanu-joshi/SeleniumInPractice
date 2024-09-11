package SeleniumRevise.SeleniumProjet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	
	public static void main(String[] args) {
		
		
		WebDriver dr  =  new ChromeDriver();
		dr.get("https://omayo.blogspot.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//input[@id='alert1']")).click();
		Alert alert = dr.switchTo().alert();
		alert.accept();
		dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String url =dr.getCurrentUrl();
		System.out.println(url);
		
		
		
	}

}
