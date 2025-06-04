package com.eox.functional.internal.project.QMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.eox.functional.internal.project.QMS.pages.Audit.ViewAuditRecords;
import com.eox.functional.internal.project.QMS.pages.ChangeMangement.CreateChangeManagementPage;
import com.eox.functional.internal.project.QMS.pages.ChangeMangement.ViewCMRecords;
import com.eox.functional.internal.project.QMS.pages.Policies.ViewPolicyRecords;
import com.eox.functional.internal.project.QMS.pages.Procedures.ViewProcedureRecords;
import com.eox.functional.internal.project.QMS.pages.RCA.CreateRCAPage;
import com.eox.functional.internal.project.QMS.pages.RCA.ViewRCARecords;
import com.eox.utils.CommonFunctionUtils;

public class QMSEmployeeHomePage {

	private WebDriver driver;

	public QMSEmployeeHomePage(WebDriver driver) {
		this.driver = driver;
	}

	private WebElement viewPolicyButton = driver.findElement(By.xpath("//a[@title='Policies']"));

	private WebElement viewProcedureButton = driver.findElement(By.xpath("//a[@title='Procedures']"));

	private WebElement createRCAButton = driver.findElement(By.xpath("//a[@title='New RCA']"));
	private WebElement viewRCAButton = driver.findElement(By.xpath("//a[@title='RCAs']"));

	private WebElement createAuditButton = driver.findElement(By.xpath("//a[@title='New Audit']"));
	private WebElement viewAuditButton = driver.findElement(By.xpath("//a[@title='Audits']"));

	private WebElement viewChangeMgtButton = driver.findElement(By.xpath("//a[@title='Change Managements']"));

	public ViewPolicyRecords empViewPolicy() {
		CommonFunctionUtils.elementClick(viewPolicyButton);
		return new ViewPolicyRecords(driver);
	}

	public ViewProcedureRecords empViewProcedure() {
		CommonFunctionUtils.elementClick(viewProcedureButton);
		return new ViewProcedureRecords(driver);
	}

	public CreateRCAPage empCreateNewRCA() {
		CommonFunctionUtils.elementClick(createRCAButton);
		return new CreateRCAPage(driver);
	}

	public ViewRCARecords empViewRCA() {
		CommonFunctionUtils.elementClick(viewRCAButton);
		return new ViewRCARecords(driver);
	}

	public CreateChangeManagementPage empCreateNewAudit() {
		CommonFunctionUtils.elementClick(createAuditButton);
		return new CreateChangeManagementPage(driver);
	}

	public ViewAuditRecords empViewAudit() {
		CommonFunctionUtils.elementClick(viewChangeMgtButton);
		return new ViewAuditRecords(driver);
	}

	public ViewCMRecords empViewChange() {
		CommonFunctionUtils.elementClick(viewChangeMgtButton);
		return new ViewCMRecords(driver);
	}

}
