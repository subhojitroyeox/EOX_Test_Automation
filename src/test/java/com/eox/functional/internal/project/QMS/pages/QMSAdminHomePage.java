package com.eox.functional.internal.project.QMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.eox.functional.internal.project.QMS.pages.Audit.ViewAuditRecords;
import com.eox.functional.internal.project.QMS.pages.ChangeMangement.CreateChangeManagementPage;
import com.eox.functional.internal.project.QMS.pages.ChangeMangement.ViewCMRecords;
import com.eox.functional.internal.project.QMS.pages.Policies.CreatePolicyPage;
import com.eox.functional.internal.project.QMS.pages.Policies.ViewPolicyRecords;
import com.eox.functional.internal.project.QMS.pages.Procedures.CreateProcedurePage;
import com.eox.functional.internal.project.QMS.pages.Procedures.ViewProcedureRecords;
import com.eox.functional.internal.project.QMS.pages.RCA.CreateRCAPage;
import com.eox.functional.internal.project.QMS.pages.RCA.ViewRCARecords;
import com.eox.utils.CommonFunctionUtils;

public class QMSAdminHomePage {

	private WebDriver driver;

	public QMSAdminHomePage(WebDriver driver) {
		this.driver = driver;
	}

	private WebElement createPolicyButton = driver.findElement(By.xpath("//a[@title='New Policy']"));
	private WebElement viewPolicyButton = driver.findElement(By.xpath("//a[@title='Policies']"));

	private WebElement createProcedureButton = driver.findElement(By.xpath("//a[@title='New Procedure']"));
	private WebElement viewProcedureButton = driver.findElement(By.xpath("//a[@title='Procedures']"));

	private WebElement createRCAButton = driver.findElement(By.xpath("//a[@title='New RCA']"));
	private WebElement viewRCAButton = driver.findElement(By.xpath("//a[@title='RCAs']"));

	private WebElement createAuditButton = driver.findElement(By.xpath("//a[@title='New Audit']"));
	private WebElement viewAuditButton = driver.findElement(By.xpath("//a[@title='Audits']"));

	private WebElement createChangeMgtButton = driver.findElement(By.xpath("//a[@title='New Change Management']"));
	private WebElement viewChangeMgtButton = driver.findElement(By.xpath("//a[@title='Change Managements']"));

	public CreatePolicyPage adminCreateNewPolicy() {
		CommonFunctionUtils.elementClick(createPolicyButton);
		return new CreatePolicyPage(driver);
	}
	
	public ViewPolicyRecords adminViewPolicy() {
		CommonFunctionUtils.elementClick(viewPolicyButton);
		return new ViewPolicyRecords(driver);
	}
	
	
	public CreateProcedurePage adminCreateNewProcedure() {
		CommonFunctionUtils.elementClick(createProcedureButton);
		return new CreateProcedurePage(driver);
	}
	
	public ViewProcedureRecords adminViewProcedure() {
		CommonFunctionUtils.elementClick(viewProcedureButton);
		return new ViewProcedureRecords(driver);
	}

	public CreateRCAPage adminCreateNewRCA() {
		CommonFunctionUtils.elementClick(createRCAButton);
		return new CreateRCAPage(driver);
	}
	
	public ViewRCARecords adminViewRCA() {
		CommonFunctionUtils.elementClick(viewRCAButton);
		return new ViewRCARecords(driver);
	}

	
	public CreateChangeManagementPage adminCreateNewAudit() {
		CommonFunctionUtils.elementClick(createAuditButton);
		return new CreateChangeManagementPage(driver);
	}
	
	public ViewAuditRecords adminViewAudit() {
		CommonFunctionUtils.elementClick(viewChangeMgtButton);
		return new ViewAuditRecords(driver);
	}
	
	public CreateChangeManagementPage adminCreateNewChange() {
		CommonFunctionUtils.elementClick(createChangeMgtButton);
		return new CreateChangeManagementPage(driver);
	}
	
	public ViewCMRecords admminViewChange() {
		CommonFunctionUtils.elementClick(viewChangeMgtButton);
		return new ViewCMRecords(driver);
	}

}
