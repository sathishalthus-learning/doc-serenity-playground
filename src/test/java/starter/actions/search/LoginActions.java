package starter.actions.search;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class LoginActions extends UIInteractions {
	
	@Step("Logging with Valid Credentials")
	public void loginWithValidCredentials() {
		$("#user-name").sendKeys("standard_user");
		$("#password").sendKeys("secret_sauce");
		$("#login-button").click();
	}

	@Step("Logging with In-Valid Credentials")
	public void loginWithInValidCredentials(String username, String password) {
		$("#user-name").sendKeys(username);
		$("#password").sendKeys(password);
		$("#login-button").click();
	}
}
