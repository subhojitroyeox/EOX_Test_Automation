package com.eox.functional.internal.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.eox.functional.internal.project.Hrms.pages.ExitInterviewPage;
import com.eox.functional.internal.project.Procurement.pages.EmployeePage;
import com.eox.functional.internal.project.QMS.pages.QMSAdminHomePage;
import com.eox.utils.CommonFunctionUtils;
import com.eox.utils.WebDriverUtils;
public class BaseTest {
	public static WebDriver driver;
	public CommonFunctionUtils baseUtils;
	public EmployeePage empPage;
	public ExitInterviewPage exitInterviewPage;
	public QMSAdminHomePage qmsAdminHomePage;
	
	@BeforeSuite
	public void initialization() {
		driver = WebDriverUtils.getDriver();
		driver.get("https://appstag.eoxvantage.com/");
		baseUtils = new CommonFunctionUtils(driver);
		empPage= new EmployeePage(driver);
		exitInterviewPage= new ExitInterviewPage(driver);
		qmsAdminHomePage = new QMSAdminHomePage(driver);
	}
	
	@BeforeClass
	public void launchTheApplication() {
		
		CommonFunctionUtils.enterText(driver.findElement(By.id("username")),"subhojitroy");
		CommonFunctionUtils.enterText(driver.findElement(By.id("password")),"Welcome2eox!");
		CommonFunctionUtils.elementClick(driver.findElement(By.id("kc-login")));
		
		
	}
	
	@AfterSuite
	public void tearDown() {
		WebDriverUtils.quitDriver();
	}

}
