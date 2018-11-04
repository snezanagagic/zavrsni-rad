package pageObjectTest;

import org.openqa.selenium.WebDriver;

import pageObject.BussinesPage;
import pageObject.ClientsPage;
import utility.Constant;
import utility.ExcelUtil;

public class ClientsPageTest {
	public static void SetUpExcel() throws Exception {

		ExcelUtil.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Clients");
	}

	public static String TestAddNewClients(WebDriver driver)  throws Exception {

		String clientName = ExcelUtil.getCellData(0, 1);	
		String contactName = ExcelUtil.getCellData(1, 1);	
		String email = ExcelUtil.getCellData(2, 1);	
		String registryNumber = ExcelUtil.getCellData(3, 1);
		String countryName = ExcelUtil.getCellData(4, 1);	
		String city = ExcelUtil.getCellData(5, 1);	
		String street = ExcelUtil.getCellData(6, 1);
		String zip = ExcelUtil.getCellData(7, 1);	
		String code = ExcelUtil.getCellData(9, 1);
	

		ClientsPage.getAddNewClient(driver).click();
		System.out.println("Set Client name:"+" " + clientName);
		ClientsPage.setClientName(driver, clientName);
		System.out.println("Set Contact name:"+" " + contactName);
		ClientsPage.setContactName(driver, contactName);
		System.out.println("Email:"+" " + email);
		ClientsPage.setEmail(driver, email);
		System.out.println("Reg Num:"+" " + registryNumber);
		ClientsPage.setRegistryNumber(driver, registryNumber);
		System.out.println("Country name:" +" "+ countryName );
		ClientsPage.SetCountrie(driver, countryName);
		Thread.sleep(1000);
		System.out.println("City: "+ city);
		ClientsPage.setCity(driver, city);
		System.out.println("Street: "+ street);
		ClientsPage.setStreet(driver, street);
		System.out.println("Zip: " + zip);
		ClientsPage.setZip(driver, zip);
		System.out.println("Code: "+ code);
		System.out.println("IT Bootcamp je najbooolji!!!");
		ClientsPage.setCode(driver, code);
		ClientsPage.setSave(driver);
		Thread.sleep(1000);
		return "Pass";

	}

	
	
		
	}


		
	