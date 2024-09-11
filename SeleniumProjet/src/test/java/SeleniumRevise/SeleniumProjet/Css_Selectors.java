package SeleniumRevise.SeleniumProjet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Css_Selectors {

	public static void main(String[] args) throws InterruptedException {

		WebDriver dr = new ChromeDriver();

		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		dr.get("https://rahulshettyacademy.com/locatorspractice/");
		dr.manage().window().maximize();

		dr.findElement(By.id("inputUsername")).sendKeys("Shantanu");
		dr.findElement(By.name("inputPassword")).sendKeys("rahulshetty.com");
		dr.findElement(By.className("submit")).click();

		System.out.println(dr.findElement(By.cssSelector("p.error")).getText());

		dr.findElement(By.linkText("Forgot your password?")).click();

		dr.findElement(By.xpath("//form/input[1]")).sendKeys("Shantanu");
		dr.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("Shantanujoshi1998vg@gmail.com");
		dr.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("7087735426");
		Thread.sleep(2000);
		// dr.findElement(By.cssSelector(".reset-pwd-btn")).click();

		dr.findElement(By.cssSelector("button.go-to-login-btn")).click();

		System.out.println(dr.findElement(By.cssSelector("form p")).getText());
		Thread.sleep(2000);

		dr.findElement(By.cssSelector("#inputUsername")).sendKeys("Shantanu");
		dr.findElement(By.cssSelector("input[type*=pass]")).sendKeys("rahulshettyacademy");
		dr.findElement(By.id("chkboxOne")).click();
		// dr.findElement(By.cssSelector(" .submit")).click();
		dr.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); // Regular expression for Xpath

		// dr.close();

	}

}
