package starter.actions.pages;

import net.serenitybdd.core.pages.PageComponent;

public class CatalogPage extends PageComponent{

		public String getCatalogPageHeading() {
			return $(".product_label").getText();
		}
}
