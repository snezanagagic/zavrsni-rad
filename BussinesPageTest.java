package pageObjectTest;

import org.openqa.selenium.WebDriver;

import pageObject.BussinesPage;

import utility.Constant;
import utility.ExcelUtil;

public class BussinesPageTest {
	public static void SetUpExcel() throws Exception {

		ExcelUtil.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "BusinessPage");
	}

	public static String TestAddNewBussines(WebDriver driver) throws Exception {

		String businessName = ExcelUtil.getCellData(0, 1);
		String countryName = ExcelUtil.getCellData(1, 1);
		String city = ExcelUtil.getCellData(2, 1);
		String street = ExcelUtil.getCellData(3, 1);
		String zip = ExcelUtil.getCellData(4, 1);
		String registryName = ExcelUtil.getCellData(5, 1);
		String bankName = ExcelUtil.getCellData(6, 1);
		String accountNumber = ExcelUtil.getCellData(7, 1);
		String swiftNumber = ExcelUtil.getCellData(8, 1);
		String paymentInstructions = ExcelUtil.getCellData(9, 1);
		String currency = ExcelUtil.getCellData(10, 1);

		BussinesPage.getAddNewBusiness(driver).click();
		System.out.println("Add New Business name:" + " " + businessName);
		BussinesPage.setBusinessName(driver, businessName);
		System.out.println("Setting Country name:" + " " + countryName);
		BussinesPage.SetCountries(driver, countryName);
		Thread.sleep(1000);
		System.out.println("Setting City:" + " " + city);
		BussinesPage.setCity(driver, city);
		System.out.println("Setting Street:" + " " + street);
		BussinesPage.setStreet(driver, street);
		System.out.println("Setting Zip:" + " " + zip);
		BussinesPage.setZip(driver, zip);
		System.out.println("Setting Registry Number:" + " " + registryName);
		BussinesPage.setRegistryNumber(driver, registryName);
		System.out.println("Click");
		BussinesPage.setAddBankAccount(driver);
		System.out.println("Setting Bank Name:" + " " + bankName);
		BussinesPage.setBankName(driver, bankName);
		System.out.println("Setting Account Name:" + " " + accountNumber);
		BussinesPage.setAccountNumber(driver, accountNumber);
		System.out.println("Setting Swift Number:" + " " + swiftNumber);
		BussinesPage.setSwiftNumber(driver, swiftNumber);
		System.out.println("Setting PayInstruction:" + " " + paymentInstructions);
		BussinesPage.setPaymentInstructins(driver, paymentInstructions);
		System.out.println("Setting Currency:" + " " + currency);
		Thread.sleep(1000);
		BussinesPage.SetCurrency(driver, currency);
		System.out.println("Click Add BankAcc");
		Thread.sleep(10000);
		BussinesPage.setAddBankAccount1(driver);
		BussinesPage.setSave(driver);
		Thread.sleep(1000);
		return "Pass";
	}

}
