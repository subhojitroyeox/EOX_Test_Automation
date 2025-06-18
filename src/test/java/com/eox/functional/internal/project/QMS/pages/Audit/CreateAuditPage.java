package com.eox.functional.internal.project.QMS.pages.Audit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eox.utils.CommonFunctionUtils;

public class CreateAuditPage {

	private WebDriver driver;

	public CreateAuditPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "data[submit]")
	private static WebElement submit;

	@FindBy(css = ".formio-button-add-row")
	WebElement addAnother;

	public void createNewAudit() {
		// Below line is mandatory for all form creation or edits
		CommonFunctionUtils.waitForSpinnerGoesOff();
		addAuditTitle("Audit Test Title");
        selectAuditModule("EOX Quality Index via Function");
        selectAuditGroups("Project Manager via Function");
        selectAuditDepartment("Admin via Function");
        selectAuditClient("Arrowhead via Function");
        selectAuditObserver("Subhojit Roy via Function");
        selectAuditParent(""); // No parent audit
        addAuditDate("06/09/2025");
        selectAuditStatus("Non Compliant");
        selectAssignedAuditor("Prasun Ranjan");
        addAuditDescription("This is Audit Description via Function");
        clickSubmitButton();

	}

	/**
	 * Adds text to the "Title" input field.
	 * 
	 * @param title The text to be added to the title field.
	 */
	public static void addAuditTitle(String title) {
		CommonFunctionUtils.addTextToTheInputField("Title", title);
	}

	/**
	 * Selects an item from the "Module" dropdown.
	 * 
	 * @param moduleName The name of the module to select.
	 */
	public static void selectAuditModule(String moduleName) {
		CommonFunctionUtils.selectItemFromDropdown("Module", moduleName);
	}

	/**
	 * Selects an item from the "Groups" dropdown.
	 * 
	 * @param groupName The name of the group to select.
	 */
	public static void selectAuditGroups(String groupName) {
		CommonFunctionUtils.selectItemFromDropdown("Groups", groupName);
	}

	/**
	 * Selects an item from the "Department" dropdown.
	 * 
	 * @param departmentName The name of the department to select.
	 */
	public static void selectAuditDepartment(String departmentName) {
		CommonFunctionUtils.selectItemFromDropdown("Department", departmentName);
	}

	/**
	 * Selects an item from the "Client" dropdown.
	 * 
	 * @param clientName The name of the client to select.
	 */
	public static void selectAuditClient(String clientName) {
		CommonFunctionUtils.selectItemFromDropdown("Client", clientName);
	}

	/**
	 * Selects an item from the "Observers" dropdown.
	 * 
	 * @param observerName The name of the observer to select.
	 */
	public static void selectAuditObserver(String observerName) {
		CommonFunctionUtils.selectItemFromDropdown("Observers", observerName);
	}

	/**
	 * Selects an item from the "Parent Audit" dropdown.
	 * 
	 * @param parentAuditId The ID or name of the parent audit to select (can be an
	 *                      empty string).
	 */
	public static void selectAuditParent(String parentAuditId) {
		CommonFunctionUtils.selectItemFromDropdown("Parent Audit", parentAuditId);
	}

	/**
	 * Adds text to the "Audit Date" input field.
	 * 
	 * @param auditDate The date string to be added (e.g., "06/09/2025").
	 */
	public static void addAuditDate(String auditDate) {
		CommonFunctionUtils.addTextToTheInputField("Audit Date", auditDate);
	}

	/**
	 * Selects an item from the "Satus" dropdown.
	 * 
	 * @param status The status to select (e.g., "Non Compliant").
	 */
	public static void selectAuditStatus(String status) {
		CommonFunctionUtils.selectItemFromDropdown("Satus", status);
	}

	/**
	 * Selects an item from the "Assigned Auditor" dropdown.
	 * 
	 * @param auditorName The name of the auditor to select.
	 */
	public static void selectAssignedAuditor(String auditorName) {
		CommonFunctionUtils.selectItemFromDropdown("Assigned Auditor", auditorName);
	}

	/**
	 * Adds text to the "Audit Description" text area (Kendo Editor).
	 * 
	 * @param description The text to be added as audit description.
	 */
	public static void addAuditDescription(String description) {
		CommonFunctionUtils.addTextToTheInputArea("Audit Description", description);
	}

	/**
	 * Clicks the submit element. Note: 'submit' WebElement must be accessible in
	 * this scope.
	 */
	public static void clickSubmitButton() {
		// Ensure 'submit' WebElement is properly initialized before calling this.
		if (submit != null) {
			CommonFunctionUtils.elementClick(submit);
		} else {
			System.err.println("Error: 'submit' WebElement is not initialized. Cannot click.");
		}
	}
}
