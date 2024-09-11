package SeleniumRevise.SeleniumProjet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstBasicExample {

	public static void main(String[] args) {

		WebDriver dr = new ChromeDriver();

		dr.get("http://www.google.com");

		System.out.println(dr.getCurrentUrl());
		System.out.println(dr.getTitle());
		System.out.println(dr.getWindowHandle());

		// dr.get("http://www.reddit.com");
		// The below command will open a new tab
		dr.switchTo().newWindow(WindowType.TAB);
		// And the reddit command will be open in a new tab
		dr.get("http://www.reddit.com");
		// close wil only close the last opened tab
		dr.close();
		// Quit will close all the associated tabs
		dr.quit();
	}

}
