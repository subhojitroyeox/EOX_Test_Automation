package com.eox.functional.internal.project.QMS.pages.Policies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.eox.utils.CommonFunctionUtils;

public class CreatePolicyPage {

	private WebDriver driver;
	public CreatePolicyPage(WebDriver driver) {
		this.driver = driver;
	}
	
	WebElement submitPolicyButton = driver.findElement(By.name("data[submit]"));	
	
	public void createNewPolicy() {
		
		CommonFunctionUtils.addTextToTheInputField("Title", "Test New Policy");
		CommonFunctionUtils.addTextToTheInputField("Document Number", "Test001");
		CommonFunctionUtils.selectItemFromDropdown("Status", "Draft");
		CommonFunctionUtils.selectItemFromDropdown("Department", "HR");
		CommonFunctionUtils.selectItemFromDropdown("Category", "Ethics");
		CommonFunctionUtils.selectItemFromDropdown("Groups", "QA Team");
		CommonFunctionUtils.selectItemFromDropdown("Approver", "Harsha C H");
		CommonFunctionUtils.selectItemFromDropdown("Observers", "Sudheshna Gururaj");
		CommonFunctionUtils.selectItemFromDropdown("Client", "Arrowhead");
		CommonFunctionUtils.selectItemFromDropdown("Parent Policy", "");
		CommonFunctionUtils.addTextToTheInputField("Inception Date", "06/03/2025");
		CommonFunctionUtils.addTextToTheInputField("Review Date", "07/03/2025");
		CommonFunctionUtils.addTextToTheInputField("Expiry Date", "07/03/2025");
		CommonFunctionUtils.addTextToTheInputField("Due Date", "07/03/2025");
		CommonFunctionUtils.addTextToTheInputArea("Policy Statement", "This is a Policy Statement");
		CommonFunctionUtils.addTextToTheInputArea("Scope", "This is Scope");
		CommonFunctionUtils.addTextToTheInputArea("Objective", "This is Policy Objective");
		CommonFunctionUtils.addTextToTheInputArea("Description", "This is Policy description");
		CommonFunctionUtils.addTextToTheInputArea("Standard Operating Procedure", "This is a Policy SOP");
		CommonFunctionUtils.addTextToTheInputArea("Evidence", "This is Policy Evidence");
		CommonFunctionUtils.addTextToTheInputArea("Audit", "This is Policy Audit");
		CommonFunctionUtils.elementClick(submitPolicyButton);

	}
}
