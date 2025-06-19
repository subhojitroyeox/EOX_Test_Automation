package com.eox.functional.internal.project.QMS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eox.functional.internal.project.QMS.pages.Audit.ViewAuditRecords;
import com.eox.functional.internal.project.QMS.pages.ChangeMangement.ViewCMRecords;
import com.eox.functional.internal.project.QMS.pages.Policies.ViewPolicyRecords;
import com.eox.functional.internal.project.QMS.pages.Procedures.ViewProcedureRecords;
import com.eox.functional.internal.project.QMS.pages.RCA.ViewRCARecords;
import com.eox.utils.CommonFunctionUtils;

public class QMSExecutiveHomePage {

	private WebDriver driver;

	public QMSExecutiveHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Policies']")
	private static WebElement viewPolicyButton;

	@FindBy(xpath = "//a[@title='Procedures']")
	private static WebElement viewProcedureButton;

	@FindBy(xpath = "//a[@title='RCAs']")
	private static WebElement viewRCAButton;

	@FindBy(xpath = "//a[@title='Audits']")
	private static WebElement viewAuditButton;

	@FindBy(xpath = "//a[@title='Change Managements']")
	private static WebElement viewChangeMgtButton;

	public ViewPolicyRecords execViewPolicy() {
		CommonFunctionUtils.elementClick(viewPolicyButton);
		return new ViewPolicyRecords(driver);
	}

	public ViewProcedureRecords execViewProcedure() {
		CommonFunctionUtils.elementClick(viewProcedureButton);
		return new ViewProcedureRecords(driver);
	}

	public ViewRCARecords execViewRCA() {
		CommonFunctionUtils.elementClick(viewRCAButton);
		return new ViewRCARecords(driver);
	}

	public ViewAuditRecords execViewAudit() {
		CommonFunctionUtils.elementClick(viewChangeMgtButton);
		return new ViewAuditRecords(driver);
	}

	public ViewCMRecords execViewChange() {
		CommonFunctionUtils.elementClick(viewChangeMgtButton);
		return new ViewCMRecords(driver);
	}
}
