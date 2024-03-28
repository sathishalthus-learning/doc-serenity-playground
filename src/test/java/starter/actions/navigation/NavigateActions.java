package starter.actions.navigation;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {

	@Step("Navigating to Sauce Labs Login Page")
	public void toSauceLabsLoginPage() {
		openUrl("https://www.saucedemo.com/v1/index.html");
	}
}
