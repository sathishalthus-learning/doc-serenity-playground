package starter.actions.pages;

import org.openqa.selenium.By;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageComponent;

public class LoginPage extends PageComponent{

	@Step("get login page error message")
	public String getErrorMessage() {
		return find(By.tagName("h3")).getText();
	}
}
	