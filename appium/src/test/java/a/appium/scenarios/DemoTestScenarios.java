package a.appium.scenarios;

import net.thucydides.core.annotations.StepGroup;

public class DemoTestScenarios extends BaseScenarios {

	@StepGroup
	public void demoScenario() {
		demoSteps.clickOnButtons();
		demoSteps.clickOnSomethingElse();
	}

}
