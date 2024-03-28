package starter.actions.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageComponent;

public class CatalogPage extends PageComponent{

		@Step("Getting Catalog Page Header")
		public String getCatalogPageHeading() {
			return $(".product_label").getText();
		}
}
