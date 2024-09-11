package SeleniumRevise.SeleniumProjet;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v124.input.model.DragData;

import com.github.dockerjava.api.model.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenShotExample {

	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws IOException {

		driver.get("https://www.google.co.in");
		TakeScreenshot("GooglePage");

	}

	static void TakeScreenshot(String filename) throws IOException {

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file,
				new File("C:\\Users\\shant\\OneDrive\\Desktop\\Ankita teacher\\" + "Screenshot" + ".jpeg"));

	}

}
