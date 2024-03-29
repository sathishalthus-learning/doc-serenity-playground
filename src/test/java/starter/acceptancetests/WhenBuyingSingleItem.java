package starter.acceptancetests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import starter.actions.navigation.NavigateActions;
import starter.actions.pages.CartPage;
import starter.actions.pages.CatalogPage;
import starter.actions.search.LoginActions;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenBuyingSingleItem {
	
	NavigateActions navigate;
	LoginActions login;
	CatalogPage catalog;
	CartPage cart;

	@Test
	@DisplayName("Buying a Single Item")
	public void itemAddedToCartAndCheckedout() {
		System.out.println("what the hell is this");
		navigate.toSauceLabsLoginPage();
		login.loginWithValidCredentials();
		catalog.clickCart();
		assertThat(cart.getCartPageHeader()).isEqualTo("Your Cart");
	}
}
