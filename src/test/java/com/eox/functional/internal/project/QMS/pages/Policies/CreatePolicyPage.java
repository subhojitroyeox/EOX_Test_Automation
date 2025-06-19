package com.eox.functional.internal.project.QMS.pages.Policies;

import java.util.Map;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eox.utils.CommonFunctionUtils;

public class CreatePolicyPage {

	private WebDriver driver;

	public CreatePolicyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "data[submit]")
	private static WebElement submitPolicyButton;

	@FindBy(name = "data[title]")
	private WebElement title;

	public void createNewPolicy() {

		// Below line is mandatory for all form creation or edits
		CommonFunctionUtils.waitForSpinnerGoesOff();

		addNewPolicyTitle("Test Policy Creation");
		addPolicyDocumentNumber("123");
		// selectPolicyStatus("Test");
		selectPolicyDepartment("HR");
		selectPolicyCategory("Ethics");
		// selectPolicyGroups("Test");
		selectPolicyApprover("Sudheshna Gururaj");
		selectPolicyObserver("Sudarshan Venkatesan");
		selectPolicyClient("Arrowhead");
		// selectPolicyParent("Test");
		// addPolicyInceptionDate("Test");
		addPolicyReviewDate("06/18/2025");
		addPolicyExpiryDate("06/18/2026");

		addPolicyStatement("Test");
		addPolicyScope("Test");
		addPolicyObjective("Test");
		addPolicyDescription("Test");
		addPolicySOP("Test");
		addPolicyEvidence("Test");
		addPolicyAudit("Test");

		clickPolicySubmitButton();
	}

	/**
	 * Adds text to the "Title" input field for the new policy.
	 * 
	 * @param policyTitle The title text to be added.
	 */
	public static void addNewPolicyTitle(String policyTitle) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonFunctionUtils.addTextToTheInputField("Title", policyTitle);
	}

	/**
	 * Adds text to the "Document Number" input field.
	 * 
	 * @param documentNumber The document number to be added.
	 */
	public static void addPolicyDocumentNumber(String documentNumber) {
		CommonFunctionUtils.addTextToTheInputField("Document Number", documentNumber);
	}

	/**
	 * Selects an item from the "Status" dropdown.
	 * 
	 * @param status The status to select (e.g., "Draft").
	 */
	public static void selectPolicyStatus(String status) {
		CommonFunctionUtils.selectItemFromDropdown("Status", status);
	}

	/**
	 * Selects an item from the "Department" dropdown.
	 * 
	 * @param departmentName The name of the department to select.
	 */
	public static void selectPolicyDepartment(String departmentName) {
		CommonFunctionUtils.selectItemFromDropdown("Department", departmentName);
	}

	/**
	 * Selects an item from the "Category" dropdown.
	 * 
	 * @param categoryName The name of the category to select.
	 */
	public static void selectPolicyCategory(String categoryName) {
		CommonFunctionUtils.selectItemFromDropdown("Category", categoryName);
	}

	/**
	 * Selects an item from the "Groups" dropdown.
	 * 
	 * @param groupName The name of the group to select.
	 */
	public static void selectPolicyGroups(String groupName) {
		CommonFunctionUtils.selectItemFromDropdown("Groups", groupName);
	}

	/**
	 * Selects an item from the "Approver" dropdown.
	 * 
	 * @param approverName The name of the approver to select.
	 */
	public static void selectPolicyApprover(String approverName) {
		CommonFunctionUtils.selectItemFromDropdown("Approver", approverName);
	}

	/**
	 * Selects an item from the "Observers" dropdown.
	 * 
	 * @param observerName The name of the observer to select.
	 */
	public static void selectPolicyObserver(String observerName) {
		CommonFunctionUtils.selectItemFromDropdown("Observers", observerName);
	}

	/**
	 * Selects an item from the "Client" dropdown.
	 * 
	 * @param clientName The name of the client to select.
	 */
	public static void selectPolicyClient(String clientName) {
		CommonFunctionUtils.selectItemFromDropdown("Client", clientName);
	}

	/**
	 * Selects an item from the "Parent Policy" dropdown.
	 * 
	 * @param parentPolicyId The ID or name of the parent policy to select (can be
	 *                       an empty string).
	 */
	public static void selectPolicyParent(String parentPolicyId) {
		CommonFunctionUtils.selectItemFromDropdown("Parent Policy", parentPolicyId);
	}

	/**
	 * Adds text to the "Inception Date" input field.
	 * 
	 * @param inceptionDate The inception date string (e.g., "06/03/2025").
	 */
	public static void addPolicyInceptionDate(String inceptionDate) {
		CommonFunctionUtils.addTextToTheInputField("Inception Date", inceptionDate);
	}

	/**
	 * Adds text to the "Review Date" input field.
	 * 
	 * @param reviewDate The review date string (e.g., "07/03/2025").
	 */
	public static void addPolicyReviewDate(String reviewDate) {
		CommonFunctionUtils.addTextToTheInputField("Review Date", reviewDate);
	}

	/**
	 * Adds text to the "Expiry Date" input field.
	 * 
	 * @param expiryDate The expiry date string (e.g., "07/03/2025").
	 */
	public static void addPolicyExpiryDate(String expiryDate) {
		CommonFunctionUtils.addTextToTheInputField("Expiry Date", expiryDate);
	}

	/**
	 * Adds text to the "Due Date" input field.
	 * 
	 * @param dueDate The due date string (e.g., "07/03/2025").
	 */
	public static void addPolicyDueDate(String dueDate) {
		CommonFunctionUtils.addTextToTheInputField("Due Date", dueDate);
	}

	/**
	 * Adds text to the "Policy Statement" input area (Kendo editor).
	 * 
	 * @param statement The policy statement text.
	 */
	public static void addPolicyStatement(String statement) {
		CommonFunctionUtils.addTextToTheInputArea("Policy Statement", statement);
	}

	/**
	 * Adds text to the "Scope" input area (Kendo editor).
	 * 
	 * @param scope The scope text.
	 */
	public static void addPolicyScope(String scope) {
		CommonFunctionUtils.addTextToTheInputArea("Scope", scope);
	}

	/**
	 * Adds text to the "Objective" input area (Kendo editor).
	 * 
	 * @param objective The objective text.
	 */
	public static void addPolicyObjective(String objective) {
		CommonFunctionUtils.addTextToTheInputArea("Objective", objective);
	}

	/**
	 * Adds text to the "Description" input area (Kendo editor).
	 * 
	 * @param description The policy description text.
	 */
	public static void addPolicyDescription(String description) {
		CommonFunctionUtils.addTextToTheInputArea("Description", description);
	}

	/**
	 * Adds text to the "Standard Operating Procedure" input area (Kendo editor).
	 * 
	 * @param sop The SOP text.
	 */
	public static void addPolicySOP(String sop) {
		CommonFunctionUtils.addTextToTheInputArea("Standard Operating Procedure", sop);
	}

	/**
	 * Adds text to the "Evidence" input area (Kendo editor).
	 * 
	 * @param evidence The evidence text.
	 */
	public static void addPolicyEvidence(String evidence) {
		CommonFunctionUtils.addTextToTheInputArea("Evidence", evidence);
	}

	/**
	 * Adds text to the "Audit" input area (Kendo editor).
	 * 
	 * @param audit The audit text.
	 */
	public static void addPolicyAudit(String audit) {
		CommonFunctionUtils.addTextToTheInputArea("Audit", audit);
	}

	/**
	 * Clicks the policy submit button. Note: 'submitPolicyButton' WebElement must
	 * be accessible in this scope.
	 * 
	 * @param buttonName A descriptive string for the button (e.g., "Policy Submit
	 *                   Button").
	 */
	public static void clickPolicySubmitButton() {
		if (submitPolicyButton != null) {
			CommonFunctionUtils.elementClick(submitPolicyButton);
		} else {
			System.err.println("Error: 'submitPolicyButton' WebElement is not initialized. Cannot click.");
		}
	}
}
