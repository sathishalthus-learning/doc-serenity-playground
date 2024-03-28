package starter.actions.search;


import net.serenitybdd.core.steps.UIInteractions;

public class LoginActions extends UIInteractions{

		public void loginWithValidCredentials() {
			$("#user-name").sendKeys("standard_user");
			$("#password").sendKeys("secret_sauce");
			$("#login-button").click();
		}
}
