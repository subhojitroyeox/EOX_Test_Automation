package com.eox.functional.internal.project.QMS.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	private static WebDriver driver;

	public QMSAdminHomePage(WebDriver driver) {
		QMSAdminHomePage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div.qms-home div div div.top_cnt")
	static List<WebElement> moduleList;
	
	@FindBy(css = "div.data-box")
	static List<WebElement> summaryList;

	@FindBy(xpath = "//a[@title='New Policy']")
	private static WebElement createPolicyButton;

	@FindBy(xpath = "//a[@title='Policies']")
	private static WebElement viewPolicyButton;

	@FindBy(xpath = "//a[@title='New Procedure']")
	private static WebElement createProcedureButton;

	@FindBy(xpath = "//a[@title='Procedures']")
	private static WebElement viewProcedureButton;

	@FindBy(xpath = "//a[@title='New RCA']")
	private static WebElement createRCAButton;

	@FindBy(xpath = "//a[@title='RCAs']")
	private static WebElement viewRCAButton;

	@FindBy(xpath = "//a[@title='New Audit']")
	private static WebElement createAuditButton;

	@FindBy(xpath = "//a[@title='Audits']")
	private static WebElement viewAuditButton;

	@FindBy(xpath = "//a[@title='New Change Management']")
	private static WebElement createChangeMgtButton;

	@FindBy(xpath = "//a[@title='Change Managements']")
	private static WebElement viewChangeMgtButton;

	public static CreatePolicyPage adminCreateNewPolicy() {
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

	// Prints the summary details for each module shown in the OI 
	public static void checkSummaryNumbers() {
		try {
			// To make sure OIs are loaded
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		summaryList.stream().forEach(s -> {
			List<WebElement> qmsData = s.findElements(By.cssSelector("p"));

			String qmsNumbers = qmsData.stream()
					.map(WebElement::getText)
					.collect(Collectors.joining(" : "));
			System.out.println(qmsNumbers);
		});
	}

	// Prints the Individual module numbers with each status as shown in the OI
	public static void checkModuleNumbers() {
		try {
			// To make sure OIs are loaded
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		moduleList.stream().forEach(s -> {
			List<WebElement> moduleList = s.findElements(By.cssSelector("div.top_cnt_header span"));
			String moduleNumber = moduleList.stream().map(WebElement::getText).collect(Collectors.joining(" : "));
			System.out.println(moduleNumber);
			
			List<WebElement> qmsData = s.findElements(By.cssSelector("div.top_cnt_body div div p"));
			String moduleNumbers = qmsData.stream()
					.map(WebElement::getText)
					.collect(Collectors.joining(" : "));
			System.out.println(moduleNumbers+"\n");
		});
	}
}
