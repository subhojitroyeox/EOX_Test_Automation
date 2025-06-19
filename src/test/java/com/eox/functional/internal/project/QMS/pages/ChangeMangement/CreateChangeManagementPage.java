package com.eox.functional.internal.project.QMS.pages.ChangeMangement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eox.utils.CommonFunctionUtils;

public class CreateChangeManagementPage {

	private WebDriver driver;

	public CreateChangeManagementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "data[submit]")
	static WebElement submit;

	public void createNewChangeManagement() {

		// Below line is mandatory for all form creation or edits
		CommonFunctionUtils.waitForSpinnerGoesOff();

		addNewCMTitle("Test New Change Management");
		selectCMDepartment("Admin");
		selectCMGroups("QA Team");
		selectCMStatus("Requested");
		addCMDateOfChange("06/09/2025");
		selectCMAssignedTo("Subhojit Roy");
		selectCMObserver("Prasun Ranjan");
		selectCMParent("");
		selectCMClient("Arrowhead");

		addCMReasonForChange("Test Reason for change via Function");
		addCMDescription("Test Description via Function");
		addCMAssumptions("Test Assumptions via Function");

		clickSubmitButton();

	}

	/**
	 * Adds text to the "Title" input field for a new Change Management.
	 * 
	 * @param title The text to be added to the title field.
	 */
	public static void addNewCMTitle(String title) {
		CommonFunctionUtils.addTextToTheInputField("Title", title);
	}

	/**
	 * Selects an item from the "Department" dropdown.
	 * 
	 * @param departmentName The name of the department to select.
	 */
	public static void selectCMDepartment(String departmentName) {
		CommonFunctionUtils.selectItemFromDropdown("Department", departmentName);
	}

	/**
	 * Selects an item from the "Groups" dropdown.
	 * 
	 * @param groupName The name of the group to select.
	 */
	public static void selectCMGroups(String groupName) {
		CommonFunctionUtils.selectItemFromDropdown("Groups", groupName);
	}

	/**
	 * Selects an item from the "Status" dropdown.
	 * 
	 * @param status The status to select (e.g., "Requested").
	 */
	public static void selectCMStatus(String status) {
		CommonFunctionUtils.selectItemFromDropdown("Status", status);
	}

	/**
	 * Adds text to the "Date Of Change" input field.
	 * 
	 * @param dateOfChange The date string to be added (e.g., "06/09/2025").
	 */
	public static void addCMDateOfChange(String dateOfChange) {
		CommonFunctionUtils.addTextToTheInputField("Date Of Change", dateOfChange);
	}

	/**
	 * Selects an item from the "Assigned to" dropdown.
	 * 
	 * @param assignedToName The name of the person to assign the CM to.
	 */
	public static void selectCMAssignedTo(String assignedToName) {
		CommonFunctionUtils.selectItemFromDropdown("Asssigned to", assignedToName);
	}

	/**
	 * Selects an item from the "Observers" dropdown.
	 * 
	 * @param observerName The name of the observer to select.
	 */
	public static void selectCMObserver(String observerName) {
		CommonFunctionUtils.selectItemFromDropdown("Observers", observerName);
	}

	/**
	 * Selects an item from the "Parent CM" dropdown.
	 * 
	 * @param parentCMId The ID or name of the parent Change Management to select
	 *                   (can be an empty string).
	 */
	public static void selectCMParent(String parentCMId) {
		CommonFunctionUtils.selectItemFromDropdown("Parent CM", parentCMId);
	}

	/**
	 * Selects an item from the "Client" dropdown.
	 * 
	 * @param clientName The name of the client to select.
	 */
	public static void selectCMClient(String clientName) {
		CommonFunctionUtils.selectItemFromDropdown("Client", clientName);
	}

	/**
	 * Adds text to the "Reason For Change" input field (Kendo Editor).
	 * 
	 * @param reason The reason text for the change.
	 */
	public static void addCMReasonForChange(String reason) {
		CommonFunctionUtils.addTextToTheInputField("Reason For Change", reason);
	}

	/**
	 * Adds text to the "Description" input field (Kendo Editor).
	 * 
	 * @param description The description text for the change.
	 */
	public static void addCMDescription(String description) {
		CommonFunctionUtils.addTextToTheInputField("Description", description);
	}

	/**
	 * Adds text to the "Assumptions" input field (Kendo Editor).
	 * 
	 * @param assumptions The assumptions text for the change.
	 */
	public static void addCMAssumptions(String assumptions) {
		CommonFunctionUtils.addTextToTheInputField("Assumptions", assumptions);
	}

	/**
	 * Clicks the submit element. Note: 'submit' WebElement must be accessible in
	 * this scope.
	 */
	public static void clickSubmitButton() {
		if (submit != null) {
			CommonFunctionUtils.elementClick(submit);
		} else {
			System.err.println("Error: 'submit' WebElement is not initialized. Cannot click.");
		}
	}
}
