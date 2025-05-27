package com.eox.functional.internal.project.Hrms.tests;

import org.testng.annotations.Test;

import com.eox.functional.internal.base.BaseTest;
import com.eox.functional.internal.project.Hrms.pages.ExitInterviewPage;
import com.eox.functional.internal.project.Procurement.pages.EmployeePage;
import com.eox.utils.CommonFunctionUtils;

public class Test02 extends BaseTest{
	@Test
	public void testMe() throws InterruptedException {
		CommonFunctionUtils.launchAnApp("HRMS","Employee HR Warning");
		ExitInterviewPage.validateCreateButton();
		System.out.println("this is test");
	}
	

}
