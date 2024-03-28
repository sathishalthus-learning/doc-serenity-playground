package starter.acceptancetests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import starter.actions.navigation.NavigateActions;
import starter.actions.pages.CatalogPage;
import starter.actions.search.LoginActions;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingIntoSwagLabsApplication {
	
	NavigateActions navigate;
	LoginActions login;
	CatalogPage catalog;

	@Test
	@DisplayName("logging into saucelabs application")
	public void catalogPageShouldBeDisplayed() {
		System.out.println("what the hell is this");
		navigate.toSauceLabsLoginPage();
		login.loginWithValidCredentials();
		catalog.getCatalogPageHeading();
		assertThat(catalog.getCatalogPageHeading()).isEqualTo("Products");
		
		
	}
}
