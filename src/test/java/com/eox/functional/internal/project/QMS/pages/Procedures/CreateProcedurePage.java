package com.eox.functional.internal.project.QMS.pages.Procedures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.eox.utils.CommonFunctionUtils;

public class CreateProcedurePage {

	private WebDriver driver;

	public CreateProcedurePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void createNewProcedure() {

		// Below line is mandatory for all form creation or edits
		CommonFunctionUtils.waitForSpinnerGoesOff();
		fillTitleField(null);
		fillDocumentNumberField(null);
		
	}

	public void fillTitleField(String titleValue) {
		CommonFunctionUtils.addTextToTheInputField("Title", titleValue);
	}

	public void fillDocumentNumberField(String documentNumberValue) {
		CommonFunctionUtils.addTextToTheInputField("Document Number", documentNumberValue);
	}

	public void selectStatusDropdown(String statusValue) {
		CommonFunctionUtils.selectItemFromDropdown("Status", statusValue);
	}

	public void selectDepartmentDropdown(String departmentValue) {
		CommonFunctionUtils.selectItemFromDropdown("Department", departmentValue);
	}

	public void selectCategoryDropdown(String categoryValue) {
		CommonFunctionUtils.selectItemFromDropdown("Category", categoryValue);
	}

	public void selectGroupsDropdown(String groupsValue) {
		CommonFunctionUtils.selectItemFromDropdown("Groups", groupsValue);
	}

	public void selectTypeDropdown(String typeValue) {
		CommonFunctionUtils.selectItemFromDropdown("Type", typeValue);
	}

	public void selectApproverDropdown(String approverName) {
		CommonFunctionUtils.selectItemFromDropdown("Approver", approverName);
	}

	public void selectObserversDropdown(String observerName) {
		CommonFunctionUtils.selectItemFromDropdown("Observers", observerName);
	}

	public void selectParentProcedureDropdown(String parentProcedureName) {
		CommonFunctionUtils.selectItemFromDropdown("Parent Procedure", parentProcedureName);
	}

	public void fillInceptionDateField(String inceptionDate) {
		CommonFunctionUtils.addTextToTheInputField("Inception Date", inceptionDate);
	}

	public void fillReviewDateField(String reviewDate) {
		CommonFunctionUtils.addTextToTheInputField("Review Date", reviewDate);
	}

	public void fillExpiryDateField(String expiryDate) {
		CommonFunctionUtils.addTextToTheInputField("Expiry Date", expiryDate);
	}

	// need iframe code for these to work
	// These are the Iframe text area coming from Kendo editor (Need to check if the Utils works for them)
	public void fillObjectiveTextArea(String objectiveText) {
		CommonFunctionUtils.addTextToTheInputArea("Objective", objectiveText);
	}

	public void fillScopeTextArea(String scopeText) {
		CommonFunctionUtils.addTextToTheInputArea("Scope", scopeText);
	}

	public void fillRolesAndResponsibilitiesTextArea(String rolesText) {
		CommonFunctionUtils.addTextToTheInputArea("Roles and Responsibilities", rolesText);
	}

	public void fillApplicabilityTextArea(String applicabilityText) {
		CommonFunctionUtils.addTextToTheInputArea("Applicability", applicabilityText);
	}

	public void fillFlowchartTextArea(String flowchartText) {
		CommonFunctionUtils.addTextToTheInputArea("Flowchart", flowchartText);
	}

	public void fillDescriptionTextArea(String descriptionText) {
		CommonFunctionUtils.addTextToTheInputArea("Description", descriptionText);
	}

	public void fillPolicyTextArea(String policyText) {
		CommonFunctionUtils.addTextToTheInputArea("Policy", policyText);
	}

	public void fillEvidenceTextArea(String evidenceText) {
		CommonFunctionUtils.addTextToTheInputArea("Evidence", evidenceText);
	}

	public void fillAuditTextArea(String auditText) {
		CommonFunctionUtils.addTextToTheInputArea("Audit", auditText);
	}
}
