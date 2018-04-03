package a.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileElement;

public class DemoPage extends MobilePageObject {

	public DemoPage(WebDriver driver) {
		super(driver);
	}

	// @iOSFindBy(accessibility = "Buttons")
	// private WebElement buttons;

	public void clickOnButtons() {
		waitForRenderedElements(By.id("Buttons"));
		MobileElement m = (MobileElement) getDriver().findElement(By.id("Buttons"));
		m.click();
		waitABit(5000);
		// IOSDriver d = (IOSDriver) getDriver();
		// TouchAction touchAction = new TouchAction(d);
		// d.performTouchAction(TouchAction().)
	}

	public void clickOnSomethingElse() {
		waitForRenderedElements(By.id("Right pointing arrow"));
		MobileElement m = (MobileElement) getDriver().findElement(By.id("Right pointing arrow"));
		m.click();
		waitABit(5000);
	}

	public void clickOnTextFields() {
		waitForRenderedElements(By.id("TextFields"));
		MobileElement m = (MobileElement) getDriver().findElement(By.id("TextFields"));
		m.click();
		waitABit(5000);
	}

	public void inserText() {
		MobileElement m = (MobileElement) getDriver()
				.findElement(By.xpath("(//XCUIElementTypeTextField[@name=\"Normal\"])[2]"));
		m.sendKeys("aaa");
		waitABit(5000);
	}

}