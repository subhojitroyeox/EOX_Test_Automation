package com.eox.functional.internal.project.QMS.pages.RCA;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eox.utils.CommonFunctionUtils;

public class CreateRCAPage {

	private WebDriver driver;
	public CreateRCAPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name ="data[submit]")
	WebElement submit;
	
	public void createNewRCA() {
		CommonFunctionUtils.waitForSpinnerGoesOff();
		CommonFunctionUtils.addTextToTheInputField("Title", "Test RCA");
		CommonFunctionUtils.selectItemFromDropdown("Department", "Product");
		CommonFunctionUtils.selectItemFromDropdown("Groups", "Project Manager");
//		CommonFunctionUtils.selectItemFromDropdown("Status", "Open");
//		CommonFunctionUtils.addTextToTheInputField("Error Reported Date", "06/09/2025");
		CommonFunctionUtils.selectItemFromDropdown("Time of Error", "Night (6PM to 7AM)");
		CommonFunctionUtils.selectItemFromDropdown("Type of Error", "Customer Reported Error");
		CommonFunctionUtils.selectItemFromDropdown("Error Category", "Quality");
		CommonFunctionUtils.selectItemFromDropdown("Error Cause", "Assumption");
		CommonFunctionUtils.selectItemFromDropdown("Severity", "L1 High");
		CommonFunctionUtils.selectItemFromDropdown("Process", "Developement");
		CommonFunctionUtils.selectItemFromDropdown("Location", "Work From Home");
		CommonFunctionUtils.selectItemFromDropdown("Assigned To", "Sudha P S");
		CommonFunctionUtils.selectItemFromDropdown("Client", "Arrowhead");
		CommonFunctionUtils.selectItemFromDropdown("Observers", "Subhojit Roy");
		CommonFunctionUtils.selectItemFromDropdown("Parent RCA", "");
		CommonFunctionUtils.selectItemFromDropdown("LOB", "EOS");
		CommonFunctionUtils.selectItemFromDropdown("Tenure of the Processor", "2 years to 4 years");
		CommonFunctionUtils.radioButtonSelect("Error Repeated", "Yes");
		
		// Kendo Editors
		CommonFunctionUtils.addTextToTheInputArea("Description", "This is RCA Description");
		CommonFunctionUtils.addTextToTheInputArea("Impact of the Error", "This is Impact of the Error");
		CommonFunctionUtils.addTextToTheInputArea("1) Why", "This is 1st Why");
		CommonFunctionUtils.addTextToTheInputArea("2) Why", "This is 2nd Why");
		CommonFunctionUtils.addTextToTheInputArea("3) Why", "This is 3rd Why");
		CommonFunctionUtils.addTextToTheInputArea("4) Why", "This is 4th Why");
		CommonFunctionUtils.addTextToTheInputArea("5) Why", "This is 5th Why");
		CommonFunctionUtils.addTextToTheInputArea("Conclusion & Corrective Measures", "This is Conclusion & Corrective Measures");
		CommonFunctionUtils.addTextToTheInputArea("Risk Analysis & Preventive Measures", "This is Risk Analysis & Preventive Measures");
		
		CommonFunctionUtils.elementClick(submit);
	}
}
