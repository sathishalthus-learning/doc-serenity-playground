package starter.actions.pages;

import org.openqa.selenium.By;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageComponent;

public class CatalogPage extends PageComponent{

		@Step("Getting Catalog Page Header")
		public String getCatalogPageHeading() {
			return $(".product_label").getText();
		}
		
		@Step("Click cart buttoon")
		public void clickCart() {
			System.out.println("before click cart");
			$(".shopping_cart_link").click();
			System.out.println("clicked cart buttton");
		}
}
