package starter.actions.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageComponent;

public class CartPage extends PageComponent{

	@Step("get cart page header")
	public String getCartPageHeader() {
		System.out.println($(".subheader").getText());
		return $(".subheader").getText();
	}
}
