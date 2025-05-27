package com.eox.functional.internal.project.Procurement.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.eox.utils.CommonFunctionUtils;


public class EmployeePage{
	public static WebDriver driver;
	public EmployeePage(WebDriver driver) {
		EmployeePage.driver=driver;
	}
	
	@FindBy(xpath = "//i[@class='fa fa-plus']//parent::button[@class='btn btn-primary']")
    private WebElement createElement;
	
	
	public static void validateCreateButton() throws InterruptedException {
		CommonFunctionUtils.clickOperationalButtons("create");
		WebElement editor = driver.findElement(By.cssSelector("div.ck-content"));
		editor.sendKeys("Your text goes here!"); 
		CommonFunctionUtils.addTextToTheInputField("Request Title", "John Dow");
		CommonFunctionUtils.selectItemFromDropdown("Request Type", "Internal");
		CommonFunctionUtils.selectItemFromDropdown("Category", "Reimbursement Requests");
		CommonFunctionUtils.selectItemFromDropdown("Sub-category", "Meals and Entertainment");
		CommonFunctionUtils.selectItemFromDropdown("Priority", "High");		
		CommonFunctionUtils.selectItemFromDropdown("Department", "Account Management");
		CommonFunctionUtils.selectItemFromDropdown("Observers", " Anindita H Kahanii");
		CommonFunctionUtils.addTextToTheInputField("Quantity", "20");
		CommonFunctionUtils.addTextToTheInputField("Unit Price", "20");
		CommonFunctionUtils.addTextToTheInputField("GST %", "20");
		CommonFunctionUtils.addTextToTheInputField("Total Cost", "20");
		CommonFunctionUtils.addTextToTheInputField("Preferred Vendor", "John Dow");
		Thread.sleep(2000);
	}
	

}
