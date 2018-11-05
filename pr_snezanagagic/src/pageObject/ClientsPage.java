package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClientsPage {

	private static WebElement element;

	public static WebElement getAddNewClient(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//a[@class='primary mt-5 mr-5 v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']"));
		return element;
	}

	public static void setAddNewClient(WebDriver driver) {
		getAddNewClient(driver).click();
	}

	public static WebElement getClientName(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[1]/div[1]/div/div[2]/div[1]/div/input"));
		return element;
	}

	public static void setClientName(WebDriver driver, String clientName) {
		getClientName(driver).sendKeys(clientName);
	}

	public static WebElement getContactName(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//form[@class='ma-2 pa-3 text-xs-center']//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return element;
	}

	public static void setContactName(WebDriver driver, String contactName) {
		getContactName(driver).sendKeys(contactName);
	}

	public static WebElement getEmail(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='flex xs6 mr-2']//input[@type='text']"));
		return element;
	}

	public static void setEmail(WebDriver driver, String email) {
		getEmail(driver).sendKeys(email);
	}

	public static WebElement getRegistryNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[2]/div[2]/div/div[2]/div[1]/div/input"));
		return element;
	}

	public static void setRegistryNumber(WebDriver driver, String registryNumber) {
		getRegistryNumber(driver).sendKeys(registryNumber);

	}

	public static WebElement getCountries(WebDriver driver) {
		element = driver.findElement(By.xpath("//i[contains(text(),'arrow_drop_down')]"));
		return element;
	}

	public static void SetCountrie(WebDriver driver, String countryName) throws InterruptedException {
		Actions builder = new Actions(driver);
		Actions country = builder.moveToElement(getCountries(driver)).click().sendKeys(countryName).click();
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
	}

	public static WebElement getCity(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[2]/div/div[2]/div[1]/div/input"));
		return element;
	}

	public static void setCity(WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}

	public static WebElement getStreet(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[3]/div/div[2]/div[1]/div/input"));
		return element;
	}

	public static void setStreet(WebDriver driver, String street) {
		getStreet(driver).sendKeys(street);
	}

	public static WebElement getZip(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[4]/div/div[2]/div[1]/div/input"));
		return element;

	}

	public static void setZip(WebDriver driver, String zip) {
		getZip(driver).sendKeys(zip);
	}

	public static WebElement getCode(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[4]/div[2]/div/div[2]/div[1]/div/input"));
		return element;
	}

	public static void setCode(WebDriver driver, String code) {
		getCode(driver).sendKeys(code);
	}

	public static WebElement getSave(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return element;
	}

	public static void setSave(WebDriver driver) {
		getSave(driver).click();
	}
}
