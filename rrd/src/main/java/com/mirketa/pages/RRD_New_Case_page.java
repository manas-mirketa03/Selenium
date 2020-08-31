package com.mirketa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mirketa.utility.SyncElement;

public class RRD_New_Case_page {
	
WebDriver driver;
	
	public RRD_New_Case_page(WebDriver ldriver) {
		
		this.driver = ldriver;
		
	}
	@FindBy(xpath="//one-app-nav-bar-item-root[7]//one-app-nav-bar-item-dropdown[1]//div[1]//one-app-nav-bar-menu-button[1]//a[1]//lightning-icon[1]//lightning-primitive-icon[1]//*[local-name()='svg']")
	WebElement Definecasedropdown;
	
	@FindBy(xpath="//one-app-nav-bar-item-root[@class='navItem slds-context-bar__item slds-shrink-none']//one-app-nav-bar-menu-item[1]//a[@href='/500/e?sObjectName=Case&save_new_url=%2F500%2Fe&navigationLocation=LIST_VIEW']")
	WebElement NewCase;
	
	@FindBy(xpath="//span[@class='slds-truncate'][contains(text(),'Cases')]")
	WebElement Definecase;
	
	@FindBy(xpath="//div[contains(text(),'New')]")
	WebElement New;
	
	@FindBy(xpath="//div[@class='dateTime-inputDate form-element form-element__control']//input[contains(@class,'input')]")
	WebElement Date;
	
	@FindBy(xpath="//div[@class='input-has-icon input-has-icon--right']//input[contains(@class,'input')]")
	WebElement Time;
	
	@FindBy(xpath="//ul[@class='datepicker--time__list']//li[@role='menuitem']")
	List<WebElement> Timelist;
	
	@FindBy(xpath="(//div//input[@type='text'and @class='slds-input slds-combobox__input'])[2]")
	WebElement status;
	
	@FindBy(xpath="//span[@class='slds-media__body']'")
	List<WebElement> statuslist;
	
	@FindBy(xpath="(//a[@class='select'])[1]")
	WebElement priority;
	
	@FindBy(xpath="//a[@role='menuitemradio']")
	List<WebElement> priolist;
	
	@FindBy(xpath="(//a[@class='select'])[2]")
	WebElement caseOrigin;
	
	@FindBy(xpath="//li[@class='uiMenuItem uiRadioMenuItem']")
	List<WebElement> CaseoriginList;
	
	@FindBy(xpath="//input[@title='Search Contacts']")
	WebElement Searchcontact;
	
	@FindBy(xpath="//li[@class='lookup__item  default uiAutocompleteOption forceSearchInputLookupDesktopOption']")
	List<WebElement> contactlist;

	@FindBy(xpath="//input[@placeholder='Search Round Robin Users...']")
	WebElement SearchAssignUser;
	
	@FindBy(xpath="//li[@class='lookup__item  default uiAutocompleteOption forceSearchInputLookupDesktopOption']")
	List<WebElement> lookupitems;
	
	@FindBy(xpath="//span[contains(text(),'New Round Robin User')]")
	WebElement newuser;

	
	@FindBy(xpath="//input[@placeholder='Search People...']")
	WebElement Searchpeople;
	
	@FindBy(xpath="//div[@title='Aman Singh']")
	WebElement peopleList;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search Accounts...')]")
	WebElement searchAccount;
	
	@FindBy(xpath="//ul[@class='lookup__list  visible']//li")
	List<WebElement> Accountlist;
	
	
	@FindBy(xpath="(//a[@class='select'])[3]")
	WebElement Type;
	
	@FindBy(xpath="(//a[@class='select'])[4]")
	WebElement CaseReason;
	
	@FindBy(xpath="//span[contains(text(),'Web Email')]//following::input[@type='email']")
	WebElement WebEmail;
	
	@FindBy(xpath="(//span[contains(text(),'Web Company')]//following::input[@type='text'])[4]")
	WebElement Webcompany;
	
	@FindBy(xpath="(//span[contains(text(),'Web Name')]//following::input[@type='text'])[5]")
	WebElement WebName;
	
	@FindBy(xpath="//span[contains(text(),'Web Phone')]//following::input[@type='text'][6]")
	WebElement WebPhone;
	
	
	@FindBy(xpath="//span[contains(text(),'Subject')]//following::input[@class=' input' and @type='text'][5]")
	WebElement subject;
	
	@FindBy(xpath="(//textarea[@class=' textarea'])[1]")
	WebElement Description;
	
	@FindBy(xpath="(//textarea[@class=' textarea'])[2]")
	WebElement InternalComments;
	
	@FindBy(xpath="//button[@title='Save']")
	WebElement Save;
	
	
	@FindBy(xpath="//slot//force-owner-lookup//div//span//force-lookup//div//span[@class='displayLabel']")
	public  WebElement AssignedRRD;
	
	//@FindBy(linktext="//*[@class='flex-wrap-ie11 owner-name slds-grow']//a[@id='window']")
	//public  WebElement AssignedRRDHover;
	
	@FindBy(xpath="(//span[@class='flex-wrap-ie11 owner-name slds-grow']//div[@class='slds-grid'])[2]/a")
	public  WebElement AssignedRRDHover;
	
	@FindBy(xpath="//label[@class='slds-checkbox__label uiLabel']//span[@class='slds-checkbox--faux']")
    WebElement Send_notification_email_to_contact;
	
	//div[@class="slds-grid"]//a[@id='window']
	
	public void clickoncasedrpdwn()
	{
		
		 Definecasedropdown.click();
	}
	
	 public void clickOnNewcase()
	 {
		 SyncElement.TobeClickable(driver, NewCase, 30);
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
	        executor.executeScript("arguments[0].click();", NewCase);
		 
		 
	 }
	
	 
	 public void clickOnDefineCase() throws InterruptedException
	 {
		     SyncElement.TobeClickable(driver, Definecase, 30);
	         JavascriptExecutor executor = (JavascriptExecutor)driver;
	        executor.executeScript("arguments[0].click();", Definecase);
	        SyncElement.TobeClickable(driver, New, 30);
	        Thread.sleep(5000);
	 }
	 public void clickOnNew() throws InterruptedException
	 {
		 SyncElement.TobeClickable(driver, New, 30);
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
	        executor.executeScript("arguments[0].click();", New);
	        SyncElement.TobeClickable(driver, status, 30);
	        Thread.sleep(3000);
		 
	 }
	 
	 public void TypeDate(String date)
	 {
		 Date.sendKeys(date);
	 }
	 
	 public void clickTime()
	 {
		 Time.click();
	 }
	 public void pickTime()
	 {
		 Timelist.get(2).click();
	 }
	
	 
	 public void pickstatus(String stts) throws InterruptedException
	 {
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(status));
		 
		 status.sendKeys(stts+"\n");
		 Thread.sleep(2000);
		 }
	 
		 
		 
	 
	 public void pickpriority() throws InterruptedException
	 {
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(priority));
		 priority.click();
		 Thread.sleep(1500);
		
	 
	 } 
	 public void pickpriorityfromlist(String priorityname) throws InterruptedException
	 {
		 for(int i=0;i<priolist.size();i++)
		 {
			 String prio= priolist.get(i).getText();
			 if(prio.contains(priorityname))
			 {
				 priolist.get(i).click();
			 }
			 
		 }
		 Thread.sleep(1500);
	 }
	 public void clickcaseorigin() throws InterruptedException
	 {
		 SyncElement.TobeClickable(driver, caseOrigin, 20);
		 caseOrigin.click();
		 Thread.sleep(1500);
	 } 
	 
	 public void pickcaseorigin(String origin) throws InterruptedException
	 {
		 for(int i=0;i<CaseoriginList.size();i++)
		 {
			 String origincase= CaseoriginList.get(i).getText();
			 if(origincase.contains(origin))
			 {
				 CaseoriginList.get(i).click();
			 }
		 }
		 Thread.sleep(1500);
	 }
	 
	 public void clickcearchcontact() throws InterruptedException
	 {
		 SyncElement.TobeClickable(driver, Searchcontact, 20);
		 Searchcontact.click();  
		 Thread.sleep(3500);
	 }
	 
	 public void pickfromcontactlist(String  Contactlisting)
	 {
		 for(int i=0;i<contactlist.size();i++)
		 {
			 String contacts= contactlist.get(i).getText();
			 if(contacts.contains( Contactlisting))
			 {
				 contactlist.get(i).click();
			 }
		 }
		
	 }
	 
	 public void scrolldowntosearchpeople()
	 {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", Searchpeople);
	 }
	 public void clicksearchpeople()
	 {
		 Searchpeople.click();
	 }
	 
	 public void picksearchpeople()
	 {
		 peopleList.click();
	 }
	 
	 
	 
	 
	
	 public void scrolldowntosearchAcc() throws InterruptedException
	 {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", searchAccount);
		 Thread.sleep(3000);
	 }
	 public void clicksearchAcc() throws InterruptedException
	 {
		 SyncElement.TobeClickable(driver, searchAccount, 30);
		 searchAccount.click();
		 Thread.sleep(3000);
		 
	 }
	 public void pickAcc()
	 {
		 Accountlist.get(0).click();
	 }
	 
	 
	 public void scrolldowntopicktype() throws InterruptedException
	 {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", Type);
		 Thread.sleep(2000);
		 
	 }
	 public void pickfromType(String tpe) throws InterruptedException
	 {
		 SyncElement.isElementPresnt(driver, Type, 30);
		 Type.sendKeys(tpe+"\n");
		 Thread.sleep(5000);
	 }
	 
	 public void scrolldowntopickcasereason() throws InterruptedException
	 {
		 SyncElement.TobeClickable(driver, CaseReason, 30);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", CaseReason);
		 Thread.sleep(2000);
	 }
	 
	 public void pickfromcasereason(String CaseR) throws InterruptedException
	 {
		 SyncElement.isElementPresnt(driver, CaseReason, 30);
		 CaseReason.sendKeys(CaseR+"\n");
		 Thread.sleep(5000);
	 }
	 
	 public void scrolldowntoviewwebinfo() throws InterruptedException
	 {
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", WebEmail);
		 Thread.sleep(2000);
	 }
	 
	 public void TypeWebemail(String email) throws InterruptedException
	 {
		 SyncElement.isElementPresnt(driver, WebEmail, 30);
		 WebEmail.sendKeys(email);
		 Thread.sleep(1500);
		
	 }
	 
	 public void TypeWebCompany(String company)
	 {
		 
		 Webcompany.sendKeys(company);
		
	 }
	 
	 public void TypeWebName(String name)
	 {
		 WebName.sendKeys(name);
		
	 }
	 
	 public void TypeWebPhone(String phone)
	 {
		 WebPhone.sendKeys(phone);
		
	 }
	 
	 public void scrolldowntoviewdescinfo() throws InterruptedException
	 {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", InternalComments);
		 Thread.sleep(2500);
	 }
	 
	 public void Typesubject(String sub) throws InterruptedException
	 {
		 SyncElement.isElementPresnt(driver, subject, 20);
		 subject.sendKeys(sub);
		 Thread.sleep(1500);
	 }
	 
	 public void TypeDescription(String desc) throws InterruptedException
	 {
		 SyncElement.isElementPresnt(driver, Description, 20);
		 Description.sendKeys(desc);
		 Thread.sleep(1500);
	 }
	 
	 public void TypeInternalComments(String comment) throws InterruptedException
	 {
		 SyncElement.isElementPresnt(driver, InternalComments, 20);
		 InternalComments.sendKeys(comment);
		 Thread.sleep(1500);
	 }
	 
	 public void clickOnSave() throws InterruptedException
	 {
		 SyncElement.TobeClickable(driver, Save, 30);
		 Save.click();
		 Thread.sleep(10000);
	 }
	
	public String getAssignedRRD()
	{
		String Username=AssignedRRD.getText();
		System.out.println("Assigned case owner is:"+Username );
		return Username;
	}
	
	
	

	
	
	 

}
