package a.appium.steps;

import a.appium.pages.DemoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoSteps extends ScenarioSteps {

	DemoPage demoPage;

	@Step
	public void clickOnButtons() {
		demoPage.clickOnButtons();
	}

	@Step
	public void clickOnSomethingElse() {
		demoPage.clickOnSomethingElse();
	}

	@Step
	public void clickOnTextFields() {
		demoPage.clickOnTextFields();
	}

	@Step
	public void inserText() {
		demoPage.inserText();
	}

}