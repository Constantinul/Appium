package a.appium.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import a.appium.steps.DemoSteps;
import io.appium.java_client.ios.IOSDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class DemoTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public DemoSteps demoSteps;

	@Test
	public void demoTest() {
		demoSteps.clickOnButtons();
		demoSteps.clickOnSomethingElse();

		// demoSteps.clickOnTextFields();
		// demoSteps.inserText();
	}

	private static IOSDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "iOS");
		caps.setCapability("platformVersion", "11.2"); // Replace this with your iOS version
		caps.setCapability("deviceName", "iPhone 8 Simulator"); // Replace this with your simulator/device version
		caps.setCapability("app", "sauce-storage:UICatalog6.1.app.zip"); // Replace this with app path in your
																			// system
		driver = new IOSDriver(
				new URL("https://Tiberius:639dd645-e4b7-4bba-845b-8e5d8dfc2a78@ondemand.saucelabs.com/wd/hub"), caps);
		driver.findElement(By.id("Buttons")).click();
		driver.wait(10000);
	}

}