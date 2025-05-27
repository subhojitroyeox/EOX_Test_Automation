package com.eox.functional.internal.project.Procurement.tests;

import org.testng.annotations.Test;

import com.eox.functional.internal.base.BaseTest;
import com.eox.functional.internal.project.Procurement.pages.EmployeePage;
import com.eox.utils.CommonFunctionUtils;

public class Test01 extends BaseTest{
	@Test
	public void testMe() throws InterruptedException {
		CommonFunctionUtils.launchAnApp("Procurement","Employee");
		EmployeePage.validateCreateButton();
	}
	

}
