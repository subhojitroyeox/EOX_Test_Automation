package com.eox.functional.internal.project.QMS.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.eox.functional.internal.base.BaseTest;
import com.eox.functional.internal.project.QMS.pages.QMSAdminHomePage;
import com.eox.functional.internal.project.QMS.pages.Policies.CreatePolicyPage;
import com.eox.utils.CommonFunctionUtils;

@Listeners
public class CreateNewPolicy extends BaseTest {

	@Test
	public void createNewPolicy() {
		CommonFunctionUtils.launchAnApp("Quality Management", "Home");
		QMSAdminHomePage.checkModuleNumbers();
		QMSAdminHomePage.checkSummaryNumbers();
		CreatePolicyPage policyForm = QMSAdminHomePage.adminCreateNewPolicy();
		policyForm.createNewPolicy();
	}
}
