package com.e2eTestInterview.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTestInterview.automation.utils.BasePage;
import com.e2eTestInterview.automation.utils.Setup;

public class ContactUsPage extends BasePage {

	/* Retrieve element */

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Contact us']")
	private static WebElement contactUsBtn;

	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-12']//h2[@class='title text-center']")
	private static WebElement contactUsMsg;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private static WebElement nameField;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Email']")
	private static WebElement emailField;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Subject']")
	private static WebElement subjectField;

	@FindBy(how = How.XPATH, using = "//textarea[@id='message']")
	private static WebElement messageField;
	

	@FindBy(how = How.NAME, using = "googlefcLoaded") 
	private static WebElement frame;
	
	@FindBy(how = How.XPATH, using = "//p[@class='fc-button-label']")
	private static WebElement autoriserBtn;
	//p[@class='fc-button-label']
	
	@FindBy(how = How.XPATH, using = "//input[@name='upload_file']") 
	private static WebElement uploadBtn;
	
	@FindBy(how = How.XPATH, using = "//input[@name='submit']") 
	private static WebElement submitBtn;
	

	@FindBy(how = How.XPATH, using = "//div[@class='status alert alert-success']") 
	private static WebElement msg;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Home']") 
	private static WebElement homeBtn;
	
	
	
	
	
	
	
	public ContactUsPage() {
		super(Setup.getDriver());
	}

	public static WebElement getContactUsBtn() {
		return contactUsBtn;
	}

	public static WebElement getContactUsMsg() {
		return contactUsMsg;
	}
	public static WebElement getEmailField() {
		return emailField;
	}

	public static WebElement getNameField() {
		return nameField;
	}

	public static WebElement getSubjectField() {
		return subjectField;
	}
	public static WebElement getMessageField() {
		return messageField;
	}
	
	public static WebElement getFrame() {
			return frame;
		}
	public static WebElement getAutoriserBtn() {
				return autoriserBtn;
			}
			
	
	public static WebElement getUploadBtn() {
		return uploadBtn;
	}
	public static WebElement getSubmitBtn() {
		return submitBtn;
	}
public static WebElement getMsg() {
	return msg;
}

public static WebElement getHomeBtn() {
	return homeBtn;
	
	}
}

