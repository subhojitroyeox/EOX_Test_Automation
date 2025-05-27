package com.eox.functional.internal.project.Hrms.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.eox.utils.CommonFunctionUtils;


public class ExitInterviewPage{
	public static WebDriver driver;
	public ExitInterviewPage(WebDriver driver) {
		ExitInterviewPage.driver=driver;
	}
	//input[contains(@class,'choices__input')]
	@FindBy(xpath = "//div[@class='choices__item choices__placeholder choices__item--selectable']")
    private WebElement createElement;
	
	
	public static void validateCreateButton() throws InterruptedException {
		CommonFunctionUtils.openSideNavBar("Exit Interview");
		CommonFunctionUtils.clickOperationalButtons("create");
		//CommonFunctionUtils.elementClick(driver.findElement(By.xpath("//*[contains(text(),'Observers')]/..//*[contains(text(),'Darshan Kademani')]/..")));
		CommonFunctionUtils.selectItemFromDropdown("Employee Name", "Avula Sai Mohith");
		CommonFunctionUtils.selectItemFromDropdown("Status", "Not Completed");
		CommonFunctionUtils.addTextToTheInputField("Hire Date", "2025-05-22");
		CommonFunctionUtils.addTextToTheInputField("Last Working Date", "2025-05-30");
		CommonFunctionUtils.selectItemFromDropdown("Business Unit", "Quality");
		CommonFunctionUtils.selectItemFromDropdown("Department", "Quality Control");
		//CommonFunctionUtils.selectItemFromDropdown("Observers", "Anindita H Kahanii");
		CommonFunctionUtils.addTextToTheInputField("What circumstances would have prevented your departure?", "this is text");
		CommonFunctionUtils.addTextToTheInputField("Why are you leaving EOX Vantage?", "this is text");
		Thread.sleep(1000);
		
		
	}
	

}
