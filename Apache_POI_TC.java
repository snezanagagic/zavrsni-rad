package automationFramework;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import appModules.SignIn;
import pageObjectTest.BussinesPageTest;
import pageObjectTest.ClientsPageTest;
import utility.Constant;
import utility.ExcelUtil;


public class Apache_POI_TC {

	public static void main(String[] args) throws Exception {
		
		
		ExcelUtil.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"signIn");
		
		String signIn = ExcelUtil.getCellData (0, 1);
		String pass = ExcelUtil.getCellData (1, 1);
		System.out.println("email: "+signIn);
		System.out.println("pass: "+pass);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://app.invoice-factory.source-code.rs/login";
		driver.get(url);
		
		SignIn.setSignIn(driver, signIn);
		SignIn.setPassword(driver, pass);
		SignIn.setLogin(driver);
		Thread.sleep(10000);
		
		//Testiranje Business Strane
		WebElement businessPage = driver.findElement(By.xpath("//a[@id='nav-bar-business']//div[@class='v-btn__content']"));
		businessPage.click();
		Thread.sleep(1000);
		
		BussinesPageTest.SetUpExcel();
		BussinesPageTest.TestAddNewBussines(driver);
		Thread.sleep(10000);
		
		//Testiranje Clients Strane
		WebElement clientsPage = driver.findElement(By.xpath("//a[@id='nav-bar-clients']//div[@class='v-btn__content']"));
		clientsPage.click();
		Thread.sleep(1000);
		
		ClientsPageTest.SetUpExcel();
		String s=ClientsPageTest.TestAddNewClients(driver);
		ExcelUtil.setCellData(s, 1, 12);//za vracanje PASS u Excel-u
		Thread.sleep(10000);
		
		
		driver.close();
		

	}

}
