package SeleniumRevise.SeleniumProjet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URL;
import java.net.HttpURLConnection;

public class BrokenLinksTest {
	
	
	public static void verifyLink(String url) {
		try {
		URL link = new URL(url);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		httpURLConnection.connect();


		if (httpURLConnection.getResponseCode() == 200) {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage());
		} else {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		}
		} catch (Exception e) {
		System.out.println(url + " - " + "is a broken link");
		}
	}
	
	public static void main(String[] args) {
		
		
		WebDriver dr =  new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("https://bstackdemo.com/");
		
		List<WebElement> l1 =  dr.findElements(By.tagName("a"));
		
		for(WebElement link:l1)
		{
			String url =  link.getAttribute("href");
			//System.out.println(url);
			verifyLink(url);
		}
		
		
		
	}

}
