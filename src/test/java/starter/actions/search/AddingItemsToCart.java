package starter.actions.search;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class AddingItemsToCart extends UIInteractions{

		@Step("Adding items to cart")
		public void addItems() {
			$("").click();
		}
}
