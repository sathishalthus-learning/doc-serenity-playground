package starter.actions.navigation;

import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {

	public void toSauceLabsLoginPage() {
		openUrl("https://www.saucedemo.com/v1/index.html");
	}
}
