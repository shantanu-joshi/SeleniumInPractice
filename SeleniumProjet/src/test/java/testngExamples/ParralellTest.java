package testngExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParralellTest {

	WebDriver dr = null;

	@BeforeMethod
	public void setup() {
		dr = new ChromeDriver();
	}

	@AfterMethod
	public void closing() {
		dr.close();
	}

	@Test
	public void Test1() {
		System.out.println("Test 1");

		dr.get("https://www.google.com");

	}

	@Test
	public void test2() {

		dr.get("https://www.gmail.com");
		System.out.println("Test 2");

	}

}
