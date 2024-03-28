package starter.actions.search;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class LoginActions extends UIInteractions{

		@Step("Logging with Valid Credentials")
		public void loginWithValidCredentials() {
			$("#user-name").sendKeys("standard_user");
			$("#password").sendKeys("secret_sauce");
			$("#login-button").click();
		}
}
