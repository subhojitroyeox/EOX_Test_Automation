package com.eox.functional.internal.project.QMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@title='Policies']")
	private static WebElement viewPolicyButton;

	@FindBy(xpath="//a[@title='Procedures']")
	private WebElement viewProcedureButton;

	@FindBy(xpath="//a[@title='New RCA']")
	private WebElement createRCAButton;
	
	@FindBy(xpath="//a[@title='RCAs']")
	private WebElement viewRCAButton;

	@FindBy(xpath="//a[@title='New Audit']")
	private WebElement createAuditButton;
	
	@FindBy(xpath="//a[@title='Audits']")
	private WebElement viewAuditButton;

	@FindBy(xpath="//a[@title='Change Managements']")
	private WebElement viewChangeMgtButton;

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
		CommonFunctionUtils.elementClick(viewAuditButton);
		return new ViewAuditRecords(driver);
	}

	public ViewCMRecords empViewChange() {
		CommonFunctionUtils.elementClick(viewChangeMgtButton);
		return new ViewCMRecords(driver);
	}

}
