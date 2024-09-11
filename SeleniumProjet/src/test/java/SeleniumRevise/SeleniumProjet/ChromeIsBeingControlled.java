package SeleniumRevise.SeleniumProjet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeIsBeingControlled {

	public static void main(String[] args) {
		
		
		 ChromeOptions options = new ChromeOptions();

	        // Disable the "Chrome is being controlled by automated test software" infobar
	        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

	        // Optional: Add additional arguments if needed
	        options.addArguments("start-maximized");

	        // Create a new instance of ChromeDriver with the customized options
	        WebDriver dr = new ChromeDriver(options);

	        // Navigate to a webpage
	      //  driver.get("https://www.example.com");
		dr.get("https://rsps100.com/vote/760");
	}
}
