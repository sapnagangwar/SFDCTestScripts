

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationScripts extends ReUsableMethods{
	public static WebDriver driver;

	public static void SFDCLogin() throws Exception {
		startReport("Login", "/Users/sapna/Desktop/Report/");

		//reading test data
		String dt_path = "/Users/sapna/Desktop/Abhi/SFDC/SFDCLogin.xls";
		File xlFile = new File(dt_path);
		FileInputStream xlDoc = new FileInputStream(xlFile);
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
		HSSFSheet sheet = wb.getSheet("Sheet1");

		String un = sheet.getRow(0).getCell(1).getStringCellValue();
		String pwd = sheet.getRow(0).getCell(2).getStringCellValue();

		/* Launch a Browser*/
		System.setProperty("webdriver.gecko.driver", "/Users/sapna/Desktop/gecko driver");
		driver = new FirefoxDriver(); 

		/*Launch URL*/
		driver.get("https://login.salesforce.com/");

		//read ff objectName, ff object type and ff object property from Object Rep.xls
		String objRepo_path = "/Users/sapna/Desktop/Abhi/SFDC/Object Rep.xls";
		File xlObjFile = new File(objRepo_path);
		FileInputStream xlObjDoc = new FileInputStream(xlObjFile);
		HSSFWorkbook wbObj = new HSSFWorkbook(xlObjDoc);
		HSSFSheet sheetObj = wbObj.getSheet("Sheet1");

		String x =sheetObj.getRow(1).getCell(2).getStringCellValue();
		String y = sheetObj.getRow(1).getCell(3).getStringCellValue();

		WebElement userName= driver.findElement(getLocator(x, y));
		enterText(userName, un, "username");

		String x1 =sheetObj.getRow(2).getCell(2).getStringCellValue();
		String y1 = sheetObj.getRow(2).getCell(3).getStringCellValue();
		WebElement password=driver.findElement(getLocator(x1, y1));
		enterText(password, pwd, "password");

		String x2 =sheetObj.getRow(3).getCell(2).getStringCellValue();
		String y2 = sheetObj.getRow(3).getCell(3).getStringCellValue();
		WebElement login = driver.findElement(getLocator(x2, y2));		
		clickButton(login, "Login");

		driver.close();
		bw.close();


	}

	public static void validateErrorMessage() throws Exception{

		startReport("ValidateErrorMessage", "/Users/sapna/Desktop/Report/");

		//reading test data
		String dt_path = "/Users/sapna/Desktop/Abhi/SFDC/SFDCLogin.xls";
		File xlFile = new File(dt_path);
		FileInputStream xlDoc = new FileInputStream(xlFile);
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
		HSSFSheet sheet = wb.getSheet("Sheet1");

		String un = sheet.getRow(0).getCell(1).getStringCellValue();
		String pwd = sheet.getRow(0).getCell(2).getStringCellValue();

		/* Launch a Browser*/
		System.setProperty("webdriver.gecko.driver", "/Users/sapna/Desktop/gecko driver");
		driver = new FirefoxDriver(); 

		/*Launch URL*/
		driver.get("https://login.salesforce.com/");

		//read ff objectName, ff object type and ff object property from Object Rep.xls
		String objRepo_path = "/Users/sapna/Desktop/Abhi/SFDC/Object Rep.xls";
		File xlObjFile = new File(objRepo_path);
		FileInputStream xlObjDoc = new FileInputStream(xlObjFile);
		HSSFWorkbook wbObj = new HSSFWorkbook(xlObjDoc);
		HSSFSheet sheetObj = wbObj.getSheet("Sheet1");

		String x =sheetObj.getRow(1).getCell(2).getStringCellValue();
		String y = sheetObj.getRow(1).getCell(3).getStringCellValue();

		WebElement userName= driver.findElement(getLocator(x, y));
		enterText(userName, un, "username");

		String x1 =sheetObj.getRow(2).getCell(2).getStringCellValue();
		String y1 = sheetObj.getRow(2).getCell(3).getStringCellValue();
		WebElement password=driver.findElement(getLocator(x1, y1));
		clearTextBox(password, "password");


		String x2 =sheetObj.getRow(3).getCell(2).getStringCellValue();
		String y2 = sheetObj.getRow(3).getCell(3).getStringCellValue();
		WebElement login = driver.findElement(getLocator(x2, y2));		
		clickButton(login, "Login");

		String x3 =sheetObj.getRow(4).getCell(2).getStringCellValue();
		String y3 = sheetObj.getRow(4).getCell(3).getStringCellValue();
		WebElement error = driver.findElement(getLocator(x3,y3));

		getTextInfo(error,"error");
		
		driver.close();
		bw.close();
	}

	public static void loginFailure() throws Exception{
		
		startReport("loginFailure", "/Users/sapna/Desktop/Report/");
		
		
		//reading test data
		String dt_path = "/Users/sapna/Desktop/Abhi/SFDC/SFDCLogin.xls";
		File xlFile = new File(dt_path);
		FileInputStream xlDoc = new FileInputStream(xlFile);
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
		HSSFSheet sheet = wb.getSheet("Sheet1");

		String un = sheet.getRow(1).getCell(1).getStringCellValue();
		String pwd = sheet.getRow(1).getCell(2).getStringCellValue();
		
		/* Launch a Browser*/
		System.setProperty("webdriver.gecko.driver", "/Users/sapna/Desktop/gecko driver");
		driver = new FirefoxDriver(); 

		/*Launch URL*/
		driver.get("https://login.salesforce.com/");


		//read ff objectName, ff object type and ff object property from Object Rep.xls
		String objRepo_path = "/Users/sapna/Desktop/Abhi/SFDC/Object Rep.xls";
		File xlObjFile = new File(objRepo_path);
		FileInputStream xlObjDoc = new FileInputStream(xlObjFile);
		HSSFWorkbook wbObj = new HSSFWorkbook(xlObjDoc);
		HSSFSheet sheetObj = wbObj.getSheet("Sheet1");

		String x =sheetObj.getRow(1).getCell(2).getStringCellValue();
		String y = sheetObj.getRow(1).getCell(3).getStringCellValue();

		WebElement userName= driver.findElement(getLocator(x, y));
		enterText(userName, un, "username");

		String x1 =sheetObj.getRow(2).getCell(2).getStringCellValue();
		String y1 = sheetObj.getRow(2).getCell(3).getStringCellValue();
		WebElement password=driver.findElement(getLocator(x1, y1));
		clearTextBox(password, "password");

		String x2 =sheetObj.getRow(3).getCell(2).getStringCellValue();
		String y2 = sheetObj.getRow(3).getCell(3).getStringCellValue();
		WebElement login = driver.findElement(getLocator(x2, y2));		
		clickButton(login, "Login");

		String x3 =sheetObj.getRow(4).getCell(2).getStringCellValue();
		String y3 = sheetObj.getRow(4).getCell(3).getStringCellValue();
		WebElement error = driver.findElement(getLocator(x3,y3));
		
		getTextInfo(error, "error");
		
		driver.close();

		bw.close();

	}
	
	public static void openMyprofilePage() throws Exception{
		
		startReport("OpenMyProfilePage", "/Users/sapna/Desktop/Report/");
		//reading test data
		String dt_path = "/Users/sapna/Desktop/Abhi/SFDC/SFDCLogin.xls";
		File xlFile = new File(dt_path);
		FileInputStream xlDoc = new FileInputStream(xlFile);
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		
		String un = sheet.getRow(0).getCell(1).getStringCellValue();
		String pwd = sheet.getRow(0).getCell(2).getStringCellValue();
		
		/* Launch a Browser*/
		System.setProperty("webdriver.gecko.driver", "/Users/sapna/Desktop/gecko driver");
		driver = new FirefoxDriver(); 

		/*Launch URL*/
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//read ff objectName, ff object type and ff object property from Object Rep.xls
		String objRepo_path = "/Users/sapna/Desktop/Abhi/SFDC/Object Rep.xls";
		File xlObjFile = new File(objRepo_path);
		FileInputStream xlObjDoc = new FileInputStream(xlObjFile);
		HSSFWorkbook wbObj = new HSSFWorkbook(xlObjDoc);
		HSSFSheet sheetObj = wbObj.getSheet("Sheet1");
		
		String x =sheetObj.getRow(1).getCell(2).getStringCellValue();
		String y = sheetObj.getRow(1).getCell(3).getStringCellValue();
		
		WebElement userName= driver.findElement(getLocator(x, y));
		enterText(userName, un, "username");
		
		String x1 =sheetObj.getRow(2).getCell(2).getStringCellValue();
		String y1 = sheetObj.getRow(2).getCell(3).getStringCellValue();
		WebElement password=driver.findElement(getLocator(x1, y1));
		enterText(password, pwd, "password");
		
		String x2 =sheetObj.getRow(3).getCell(2).getStringCellValue();
		String y2 = sheetObj.getRow(3).getCell(3).getStringCellValue();
		WebElement login = driver.findElement(getLocator(x2, y2));		
		clickButton(login, "Login");
		
		
		String userNameBtnObjType =sheetObj.getRow(9).getCell(2).getStringCellValue();
		String userNameBtnObjProperty = sheetObj.getRow(9).getCell(3).getStringCellValue();
		
		Thread.sleep(2000);
		WebElement userNameBtn = driver.findElement(getLocator(userNameBtnObjType, userNameBtnObjProperty));
		userNameBtn.getText();
		Thread.sleep(2000);
		clickButton(userNameBtn, "Sapna Gangwar");
		
		String myProfileObjtype =sheetObj.getRow(10).getCell(2).getStringCellValue();
		String myProfileObjproperty = sheetObj.getRow(10).getCell(3).getStringCellValue();
		WebElement myProfileBtn = driver.findElement(getLocator(myProfileObjtype, myProfileObjproperty));		
		clickButton(myProfileBtn, "My Profile");
		
		driver.close();
		
		bw.close();
		
	}
	
public static void clickRememberMe() throws Exception{
	
	startReport("clickRememberMeOnLoginpage", "/Users/sapna/Desktop/Report/");
		
		String dt_path = "/Users/sapna/Desktop/Abhi/SFDC/SFDCLogin.xls";
		File xlFile = new File(dt_path);
		FileInputStream xlDoc = new FileInputStream(xlFile);
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		
		String username = sheet.getRow(0).getCell(1).getStringCellValue();
		String password = sheet.getRow(0).getCell(2).getStringCellValue();
		
		System.setProperty("webdriver.gecko.driver", "/Users/sapna/Desktop/gecko driver");
		driver = new FirefoxDriver(); 

		/*Launch URL*/
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='rememberUn']")).click();
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		driver.findElement(By.xpath("//*[@id='userNavLabel']")).click();
		driver.findElement(By.linkText("Logout")).click();

		driver.close();
		bw.close();
		
	}

public static void logout() throws Exception{

	startReport("clickRememberMeOnLoginpage", "/Users/sapna/Desktop/Report/");
	
	System.setProperty("webdriver.gecko.driver", "/Users/sapna/Desktop/gecko driver");
	driver = new FirefoxDriver(); 

	/*Launch URL*/
	driver.get("https://login.salesforce.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("sapnagangwar@moka.com");

	WebElement passWord = driver.findElement(By.id("password"));
	passWord.sendKeys("anand4esa");

	WebElement login = driver.findElement(By.id("Login"));
	login.click();

	WebElement labelName = driver.findElement(By.id("userNavLabel"));
	labelName.click();

	driver.findElement(By.linkText("Logout")).click();

	driver.close();
	
	bw.close();
}

public static void testSalesForceMyProfile() throws Exception{

startReport("clickRememberMeOnLoginpage", "/Users/sapna/Desktop/Report/");
	
	System.setProperty("webdriver.gecko.driver", "/Users/sapna/Desktop/gecko driver");
	driver = new FirefoxDriver(); 

	/*Launch URL*/
	driver.get("https://login.salesforce.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("sapnagangwar@moka.com");

	WebElement passWord = driver.findElement(By.id("password"));
	passWord.sendKeys("anand4esa");

	WebElement login = driver.findElement(By.id("Login"));
	login.click();

	WebElement labelName = driver.findElement(By.id("userNavLabel"));
	labelName.click();

	
	//to check menu-items
	System.out.println();driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[2]")).getText();
	driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[3]")).getText();
	driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[4]")).getText();
	driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[5]")).getText();
	
	driver.findElement(By.linkText("My Profile")).click();

	driver.findElement(By.xpath("//*[@id='chatterTab']/div[2]/div[2]/div[1]/h3/div/div/a/img")).click();

	WebElement myFrame = driver.findElement(By.id("contactInfoContentId"));
	driver.switchTo().frame(myFrame);

	Thread.sleep(3000);

	driver.findElement(By.xpath("//*[@id='aboutTab']/a")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id='contactTab']/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='email']")).clear();
	
	driver.findElement(By.xpath("//*[@id='cell']")).sendKeys("4084427634");
	
	driver.findElement(By.xpath("//*[@id='street']")).sendKeys("20990 Valley Green Drive");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Cupertino");
	
	driver.findElement(By.xpath("//*[@id='postalCode']")).sendKeys("95014");
	
	
	//driver.findElement(By.xpath("//*[@id='state']]")).sendKeys("CA");
	//driver.findElement(By.xpath("//*[@id='country']")).clear();
	//driver.findElement(By.xpath("//*[@id='country']")).sendKeys("US");
	//Thread.sleep(2000);

	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//*[@id='contactInfoX']")).click();
	
	//post and share
	//driver.findElement(By.xpath("//*[@id='publisherAttachTextPost']/span[1]")).click();
	driver.findElement(By.xpath("//*[@id='publishereditablearea']")).sendKeys("Hello All!!!");
	
	driver.findElement(By.xpath("//*[@id='publishersharebutton']")).click();
	
	//upload a file
	
	driver.findElement(By.xpath("//*[@id='publisherAttachContentPost']")).click();
	//driver.findElement(By.linkText("Upload a file from your computer")).click();
	//driver.findElement(By.linkText("Select a file from Salesforce")).click();
	
	
	//driver.findElement(By.xpath("//*[@id='chatterFile']")).click();
	
	////driver.findElement(By.xpath("//*[@id='cke_publisherRichTextEditor']")).sendKeys("sales.txt");
	//driver.findElement(By.xpath("//*[@id='publishersharebutton']")).click();
	
	driver.close();
	
	bw.close();
}

}












