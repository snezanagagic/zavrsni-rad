package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	private static WebElement element;

	public static WebElement getSignIn(WebDriver driver) {
		element = driver.findElement(By.id("login-form-email"));
		return element;

	}

	public static void setSignIn(WebDriver driver, String signIn) {
		getSignIn(driver).sendKeys(signIn);

	}

	public static WebElement getPassword(WebDriver driver) {
		element = driver.findElement(By.id("login-pass"));
		return element;
	}

	public static void setPassword(WebDriver driver, String password) {
		getPassword(driver).sendKeys(password);
	}

	public static WebElement getLogin(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-btn__content']"));
		return element;
	}

	public static void setLogin(WebDriver driver) {
		getLogin(driver).click();
	}

}