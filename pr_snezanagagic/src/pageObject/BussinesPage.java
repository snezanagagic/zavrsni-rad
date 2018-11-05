package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BussinesPage {

	// private static WebElement element;

	public static WebElement getAddNewBusiness(WebDriver driver) {
		WebElement AddNewBusiness = driver.findElement(By.xpath("//i[contains(text(),'library_add')]"));
		return AddNewBusiness;
	}

	public static void setAddNewBusiness(WebDriver driver) {
		getAddNewBusiness(driver).click();
	}

	public static WebElement getBusinessName(WebDriver driver) {

		WebElement BusinessName = driver.findElement(By.id("business-form-name"));
		return BusinessName;
	}

	public static void setBusinessName(WebDriver driver, String businessName) {
		getBusinessName(driver).sendKeys(businessName);
	}

	public static WebElement getCountries(WebDriver driver) {
		WebElement Countries = driver.findElement(By.xpath("//input[@id='business-form-country']"));
		return Countries;
	}

	public static void SetCountries(WebDriver driver, String countryName) throws InterruptedException {
		Actions builder = new Actions(driver);
		Actions country = builder.moveToElement(getCountries(driver)).click().sendKeys(countryName);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();

	}

	public static WebElement getCity(WebDriver driver) {
		WebElement City = driver.findElement(By.xpath("//input[@id='business-form-city']"));
		return City;
	}

	public static void setCity(WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}

	public static WebElement getStreet(WebDriver driver) {
		WebElement Street = driver.findElement(By.xpath("//input[@id='business-form-street']"));
		return Street;
	}

	public static void setStreet(WebDriver driver, String street) {
		getStreet(driver).sendKeys(street);
	}

	public static WebElement getZip(WebDriver driver) {
		WebElement Zip = driver.findElement(By.xpath("//input[@id='business-form-zip']"));
		return Zip;
	}

	public static void setZip(WebDriver driver, String zip) {
		getZip(driver).sendKeys(zip);
	}

	public static WebElement getRegistryNumber(WebDriver driver) {
		WebElement RegistryNumber = driver.findElement(By.xpath("//input[@id='business-form-reg-num']"));
		return RegistryNumber;
	}

	public static void setRegistryNumber(WebDriver driver, String registryName) {
		getRegistryNumber(driver).sendKeys(registryName);
	}

	public static WebElement getAddBankAccount(WebDriver driver) {
		WebElement AddBankAccount = driver
				.findElement(By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']"));
		return AddBankAccount;
	}

	public static void setAddBankAccount(WebDriver driver) {
		getAddBankAccount(driver).click();
	}

	public static WebElement getBankName(WebDriver driver) {
		WebElement BankName = driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));
		return BankName;
	}

	public static void setBankName(WebDriver driver, String bankName) {
		getBankName(driver).sendKeys(bankName);
	}

	public static WebElement getAccountNumber(WebDriver driver) {
		WebElement BankAccountNumber = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
		return BankAccountNumber;
	}

	public static void setAccountNumber(WebDriver driver, String accountNumber) {
		getAccountNumber(driver).sendKeys(accountNumber);
	}

	public static WebElement getSwiftNumber(WebDriver driver) {
		WebElement SwiftNumber = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
		return SwiftNumber;
	}

	public static void setSwiftNumber(WebDriver driver, String swiftNumber) {
		getSwiftNumber(driver).sendKeys(swiftNumber);
	}

	public static WebElement getPaymentInstructins(WebDriver driver) {
		WebElement PaymentInstructins = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
		return PaymentInstructins;
	}

	public static void setPaymentInstructins(WebDriver driver, String paymentInstructions) {
		getPaymentInstructins(driver).sendKeys(paymentInstructions);
	}

	public static WebElement getCurrency(WebDriver driver) {
		WebElement Currency = driver.findElement(By.xpath(
				"//div[@class='v-input v-text-field v-select']//i[@class='v-icon material-icons'][contains(text(),'arrow_drop_down')]"));

		return Currency;
	}

	public static void SetCurrency(WebDriver driver, String currency) throws InterruptedException {
		Actions builder = new Actions(driver);
		Actions currency1 = builder.moveToElement(getCurrency(driver)).click().sendKeys(currency).click();
		currency1.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		currency1.perform();
	}

	public static WebElement getAddBankAccount1(WebDriver driver) {
		WebElement bankAccount = driver.findElement(By.xpath("//*[@id=\"bank-dialog-add-bank\"]/div"));
		return bankAccount;
	}

	public static void setAddBankAccount1(WebDriver driver) {
		getAddBankAccount1(driver).click();
	}

	public static WebElement getSave(WebDriver driver) {
		WebElement Save = driver.findElement(By.xpath("//*[@id=\"business-form-save-btn\"]/div"));
		return Save;
	}

	public static void setSave(WebDriver driver) {
		getSave(driver).click();

	}
}
