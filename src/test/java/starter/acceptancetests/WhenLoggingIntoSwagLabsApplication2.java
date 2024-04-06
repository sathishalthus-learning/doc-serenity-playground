package starter.acceptancetests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import starter.actions.navigation.NavigateActions;
import starter.actions.pages.CatalogPage;
import starter.actions.pages.LoginPage;
import starter.actions.search.LoginActions;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingIntoSwagLabsApplication2 {
	
	NavigateActions navigate;
	LoginActions login;
	CatalogPage catalog;
	LoginPage loginpage;

	@Test
	@ParameterizedTest(name = "")
	@CsvSource(value = { "               ,secret_sauce   ,Username is required",
			"standard_user  ,                , Password is required",
			"               ,                , Username is required",
			"standard_user  , wrong_password , Username and password do not match any user in this service",
			"wrong_user     , secret_sauce   , Username and password do not match any user in this service", })
	@DisplayName("logging into saucelabs application with invalid credentials")
	public void errorMessageShouldbeDisplayed(String username, String password, String errorMessage) {
		System.out.println("what the hell is this");
		navigate.toSauceLabsLoginPage();
		login.loginWithInValidCredentials(username, password);
		catalog.getCatalogPageHeading();
		assertThat(loginpage.getErrorMessage()).contains(errorMessage);
		
		
	}
}
