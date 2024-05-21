package com.e2eTestInterview.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import com.e2eTestInterview.automation.page_objects.ContactUsPage;
import com.e2eTestInterview.automation.utils.ConfigFileReader;
import com.e2eTestInterview.automation.utils.SeleniumUtils;
import com.e2eTestInterview.automation.utils.Setup;
import com.e2eTestInterview.automation.utils.UploadFile;
import com.e2eTestInterview.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsStepDefinition {

	public ContactUsPage contactUsPage;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validations;
	public UploadFile uploadFile;

	public ContactUsStepDefinition() {

		contactUsPage = new ContactUsPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
		uploadFile = new UploadFile();

	}

	@Given("Navigate to the url")
	public void navigateToTheUrl() {
		JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
		js.executeScript(
				"const elements = document.querySelectorAll('.adsbygoogle.adsbygoogle-noablate'); for (let i = 0; i < elements.length; i++) elements[i].remove()");
		seleniumUtils.get(configFileReader.getProperties("home.url"));

	}

	@When("Verify that home page is visible successfully")
	public void verifyThatHomePageIsVisibleSuccessfully() {
		String actualUrl = Setup.getDriver().getCurrentUrl();
		String expectedUrl = "https://automationexercise.com/";
		Assert.assertEquals(expectedUrl, actualUrl);

	}

	@Then("Click on contactUs button")
	public void clickOnContactUsButton() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
		js.executeScript(
				"const elements = document.querySelectorAll('.adsbygoogle.adsbygoogle-noablate'); for (let i = 0; i < elements.length; i++) elements[i].remove()");
		// Setup.getDriver().switchTo().frame("googlefcLoaded");
		Thread.sleep(5000);
		// seleniumUtils.click(ContactUsPage.getAutoriserBtn());
		seleniumUtils.click(ContactUsPage.getContactUsBtn());

	}

	@Then("Verify that contact us message form {string} is visible")
	public void verifyThatContactUsMessageFormIsVisible(String message) {
		validations.isElementDisplayed(ContactUsPage.getContactUsMsg());

	}

	@Then("Enter name {string}")
	public void enterName(String name) {
		seleniumUtils.writeText(ContactUsPage.getNameField(), name);

	}

	@Then("Enter email address {string}")
	public void enterEmailAddress(String email) {
		seleniumUtils.writeText(ContactUsPage.getEmailField(), email);

	}

	@Then("Enter the subject {string}")
	public void enterTheSubject(String subject) {
		seleniumUtils.writeText(ContactUsPage.getSubjectField(), subject);

	}

	@Then("Enter the message {string}")
	public void enterTheMessage(String message) {
		seleniumUtils.writeText(ContactUsPage.getMessageField(), message);

	}

	@Then("click on Download folder button")
	public void clickOnDownloadFolderButton() {
		uploadFile.uploadFileWithSendKeys(
				"C:\\Users\\33772\\eclipse-workspace\\JobInterviewQA\\src\\test\\java\\com\\e2eTestInterview\\automation\\utils\\Test.txt",
				ContactUsPage.getUploadBtn());
	}

	@Then("Click on submit button")
	public void clickOnSubmitButton() {
		seleniumUtils.click(ContactUsPage.getSubmitBtn());
	}

	@Then("Click on OK button alert")
	public void clickOnOKButtonAlert() {
		seleniumUtils.acceptAlert();

	}

	@Then("Verify the success message is visible {string}")
	public void verifyTheSuccessMessageIsVisible(String message) {
		validations.isElementDisplayed(ContactUsPage.getMsg());

	}

	@Then("click on Home button")
	public void clickOnHomeButton() {
		seleniumUtils.click(ContactUsPage.getHomeBtn());

	}

}
