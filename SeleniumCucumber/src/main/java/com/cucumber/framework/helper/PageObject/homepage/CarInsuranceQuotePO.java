package com.cucumber.framework.helper.PageObject.homepage;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cucumber.framework.helper.DropDown.DropDownHelper;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;
import com.cucumber.framework.helper.TextBox.TextBoxHelper;
import com.cucumber.framework.settings.ObjectRepo;

public class CarInsuranceQuotePO extends PageBase {
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(CarInsuranceQuotePO.class);

	public CarInsuranceQuotePO(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/** Web Elements */
	
	@FindBy(how=How.XPATH,using="(//a[@href='/car-insurance/'])[3]")
	public WebElement insuranceLink;
	@FindBy(how=How.XPATH,using="//h1[text()='Compare car insurance']")
	public WebElement compareCarInsurancePageText;
	@FindBy(how=How.XPATH,using="//a[text()='Compare Now']")
	public WebElement CompareNowLink;
	@FindBy(how=How.XPATH,using="//input[@id='helpers.regoLabel']")
	public WebElement RegoTextField;
	@FindBy(how=How.XPATH,using="//button[@id='start.nextButton']")
	public WebElement QuoteNextButton;
	@FindBy(how=How.XPATH,using="//div[@id='NSW']/span")
	public WebElement StateButton;
	@FindBy(how=How.XPATH,using="//label[@for='coverDetail.coverType.COMPREHENSIVE']")
	public WebElement CovertTypeButton;
	@FindBy(how=How.XPATH,using="//label[@for='coverDetail.vehicle.hasOtherAccessories.NO']")
	public WebElement FactFitoptionButton;
	@FindBy(how=How.XPATH,using="//div[@id='N']/..")
	public WebElement CarModificationButtonNo;
	@FindBy(how=How.XPATH,using="//label[@for='coverDetail.vehicle.damaged.N']")
	public WebElement UnrepairHailButtonNo;
	@FindBy(how=How.XPATH,using="//label[@for='coverDetail.financeType.LEASE']/..")
	public WebElement CarFiancneButtonYes;
	@FindBy(how=How.XPATH,using="//div[@id='PRIVATE_AND_COMMUTING_TO_WORK']/..")
	public WebElement UserTypePrivateButtonYes;
	@FindBy(how=How.XPATH,using="//label[@for='coverDetail.currentlyInsured.N']/..")
	public WebElement InsuredButtonNo;
	@FindBy(how=How.ID,using="coverDetail.annualKilometres")
	public WebElement EntrerkmsText;
	@FindBy(how=How.ID,using="annual_kms.nextButton")
	public WebElement NextButton;
	@FindBy(how=How.ID,using="helpers.overnightParkingPostcode")
	public WebElement PostCodeText;
	@FindBy(how=How.XPATH,using="//input[@id='helpers.overnightParkingAddressLabel']")
	public WebElement AddressText;
	@FindBy(how=How.ID,using="car_address.nextButton")
	public WebElement AddressNextButton;
	@FindBy(how=How.XPATH,using="//div[@id='GARAGED']/..")
	public WebElement GaragedButton;
	@FindBy(how=How.XPATH,using="//label[@for='coverDetail.driver.gender.MALE']")
	public WebElement GenderMaleButton;
	@FindBy(how=How.XPATH,using="//select[@id='coverDetail.driver.dob_day']")
	public WebElement DaySelect;
	@FindBy(how=How.XPATH,using="//select[@id='coverDetail.driver.dob_month']")
	public WebElement MonthSelect;
	@FindBy(how=How.XPATH,using="//select[@id='coverDetail.driver.dob_year']")
	public WebElement YearSelect;
	@FindBy(how=How.XPATH,using="//button[@id='regular_driver_dob.nextButton']")
	public WebElement AgeNextButton;
	@FindBy(how=How.XPATH,using="//label[@for='coverDetail.driver.employmentStatus.EMPLOYED_FULL_TIME']/..")
	public WebElement FullTimeEmployeeButton;
	@FindBy(how=How.XPATH,using="//input[@id='coverDetail.driver.licenceAge']")
	public WebElement LiceceAgeText;
	@FindBy(how=How.ID,using="regular_driver_licence_age.nextButton")
	public WebElement LiceceAgeNextButton;
	@FindBy(how=How.XPATH,using="//label[@for='coverDetail.driver.anyPreviousClaims.NO']/..")
	public WebElement PreviousClaimNoButton;
	@FindBy(how=How.XPATH,using="//label[@for='coverDetail.driver.noClaimRating.RATING_1']")
	public WebElement DiscountRating1Button;
	@FindBy(how=How.XPATH,using="//label[@for='coverDetail.ownsAnotherCar.N']")
	public WebElement OwnAnotherCarNoButton;
	@FindBy(how=How.XPATH,using="//label[@for='coverDetail.hasYoungerDriver.N']")
	public WebElement YoungerDriverNoButton;
	@FindBy(how=How.XPATH,using="//label[@for='coverDetail.driverOption.DRIVERS_30_AND_OVER']")
	public WebElement AllDriverAgeThrirtyButton;
	@FindBy(how=How.XPATH,using="//input[@id='applicant.firstName']")
	public WebElement FirstNameText;
	@FindBy(how=How.XPATH,using="//input[@id='applicant.lastName']")
	public WebElement LastNameText;
	@FindBy(how=How.XPATH,using="//button[@id='applicant_details.nextButton']")
	public WebElement ApplicantNextButton;
	@FindBy(how=How.XPATH,using="//input[@name='applicant.optInPrivacy']/..")
	public WebElement TermsofUseCheckbox;
	@FindBy(how=How.XPATH,using="//button[@id='commencement_date.nextButton']")
	public WebElement GetQuoteButton;
	/** Default Methods **/
	
/*	String getMenuLocator(){
		log.debug("Click on Car Insurance");
		return "(//a[@href='/car-insurance/'])[3]";
	}
	*/
	
	
	/** Public Methods  **/
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void navigateTo() {
	//driver.findElement(By.xpath(getMenuLocator())).click();
			log.info("click on button");
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.elementToBeClickable(insuranceLink)).click();;
			waitForElement(insuranceLink, ObjectRepo.reader.getExplicitWait());
			insuranceLink.click();
	}
	public boolean viewCompareCarInsurancePage() {
		try {
		Thread.sleep(2000);
		log.info("Verify Compare Care Insurance text");
		waitForElement(compareCarInsurancePageText, ObjectRepo.reader.getExplicitWait());
		return compareCarInsurancePageText.isDisplayed();
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			return false;
		}
	}
	public void clikonCompareNow() {
		log.info("Click on Compare now link");
		waitForElement(CompareNowLink, ObjectRepo.reader.getExplicitWait());
		CompareNowLink.click();
	}
	public boolean verifyQuotePageTitle(String QuotePageTitle) throws InterruptedException {
		log.info("Check Quote Page Title");
		Thread.sleep(2000);
		System.out.println("Current Page title: "+driver.getTitle());
		if(QuotePageTitle.contains(driver.getTitle())) {
			return true;}
		else {
			return false;
		}
	}
	public void enterRegoNumber(String regono) {
		log.info("Entering Rego number");
		waitForElement(RegoTextField, ObjectRepo.reader.getExplicitWait());
		RegoTextField.sendKeys(regono);
		}
	public void clickQuoteNext() {
		log.info("Click on Next Button on Quote Page");
		waitForElement(QuoteNextButton, ObjectRepo.reader.getExplicitWait());
		QuoteNextButton.click();
		}
	public void clickonState() throws InterruptedException {
		log.info("Click on State button on Car Rego Page");
		waitForElement(StateButton, ObjectRepo.reader.getExplicitWait());
		Thread.sleep(2000);
		StateButton.click();
		}
	public void selectCoverType() {
	
		waitForElement(CovertTypeButton, ObjectRepo.reader.getExplicitWait());
		log.info("Click on Cover Type button on Cover Type Page");
		CovertTypeButton.click();
		}
	public void selectFactFitoption() {
		
		waitForElement(FactFitoptionButton, ObjectRepo.reader.getExplicitWait());
		log.info("Click on factory acessory fit option");
		FactFitoptionButton.click();
		}
public void selectCarModifications() {
		
		waitForElement(CarModificationButtonNo, ObjectRepo.reader.getExplicitWait());
		log.info("Click on Car modifications option as No");
		CarModificationButtonNo.click();
		}
public void selectUnrepairedoption() {
	
	waitForElement(UnrepairHailButtonNo, ObjectRepo.reader.getExplicitWait());
	log.info("Click on unrepaired accident or hail damage option as No");
	UnrepairHailButtonNo.click();
	}
public void selectcarfinanceoption() {
	
	waitForElement(CarFiancneButtonYes, ObjectRepo.reader.getExplicitWait());
	log.info("Click on car finance as Yes");
	CarFiancneButtonYes.click();
	}	
public void selectUsertypeOption() {
	
	waitForElement(UserTypePrivateButtonYes, ObjectRepo.reader.getExplicitWait());
	log.info("Click on user type as private");
	UserTypePrivateButtonYes.click();
	}	
public void selectCurrentlyInsuredOption() {
	
	waitForElement(InsuredButtonNo, ObjectRepo.reader.getExplicitWait());
	log.info("Click on currently insured as No");
	InsuredButtonNo.click();
	}
public void enterkms(String kms) {
waitForElement(EntrerkmsText, ObjectRepo.reader.getExplicitWait());
log.info("Enter kms in text field as" +kms);
EntrerkmsText.sendKeys(kms);
}
public void clickOnNext() {
waitForElement(NextButton, ObjectRepo.reader.getExplicitWait());
log.info("Click on next on annual kilometer page");
NextButton.click();
}
public void enterPostCode(String postcode) {
waitForElement(PostCodeText, ObjectRepo.reader.getExplicitWait());
log.info("Enter post code on addrexs page");
PostCodeText.sendKeys(postcode);
PostCodeText.sendKeys(Keys.TAB);
}
public void enterAddress(String address) throws InterruptedException {
waitForElement(AddressText, ObjectRepo.reader.getExplicitWait());
log.info("Enter address on address page");
AddressText.sendKeys(address);
Thread.sleep(2000);
AddressText.sendKeys(Keys.TAB);
}
public void clickOnAddressNext() {
waitForElement(AddressNextButton, ObjectRepo.reader.getExplicitWait());
log.info("Click on next on annual kilometer page");
AddressNextButton.click();
}
public void clickParkingType() {
waitForElement(GaragedButton, ObjectRepo.reader.getExplicitWait());
log.info("Click on next on annual kilometer page");
GaragedButton.click();
}
public void selectGender() {
waitForElement(GenderMaleButton, ObjectRepo.reader.getExplicitWait());
log.info("Click on next on annual kilometer page");
GenderMaleButton.click();
}
public void selectDateofBirth(String Day,String Month,String Year) {
waitForElement(DaySelect, ObjectRepo.reader.getExplicitWait());
waitForElement(MonthSelect, ObjectRepo.reader.getExplicitWait());
waitForElement(YearSelect, ObjectRepo.reader.getExplicitWait());
log.info("Select date of birth from regular date of birth page");
Select day=new Select(DaySelect);
day.selectByVisibleText(Day);
Select month=new Select(MonthSelect);
month.selectByVisibleText(Month);
Select year=new Select(YearSelect);
year.selectByVisibleText(Year);
}
public void clickAgeNext() {
waitForElement(AgeNextButton, ObjectRepo.reader.getExplicitWait());
log.info("Click on next on Age Page");
AgeNextButton.click();
}
public void clickEmployment() {
waitForElement(FullTimeEmployeeButton, ObjectRepo.reader.getExplicitWait());
log.info("Select Full time employee on employment page");
FullTimeEmployeeButton.click();
}
public void enterLicenceAge(String Age) {
waitForElement(LiceceAgeText, ObjectRepo.reader.getExplicitWait());
log.info("enter age at licence age page");
LiceceAgeText.sendKeys(Age);
}
public void clickLicenceNext() {
waitForElement(LiceceAgeNextButton, ObjectRepo.reader.getExplicitWait());
log.info("click on Next on Licence Page");
LiceceAgeNextButton.click();
}
public void clickPreviousClaimNo() {
waitForElement(PreviousClaimNoButton, ObjectRepo.reader.getExplicitWait());
log.info("Click No on previous claim page");
PreviousClaimNoButton.click();
}
public void clickonRating() {
waitForElement(DiscountRating1Button, ObjectRepo.reader.getExplicitWait());
log.info("Select rating on discount page");
DiscountRating1Button.click();
}
public void clickOwnAnotherCarNo() {
waitForElement(OwnAnotherCarNoButton, ObjectRepo.reader.getExplicitWait());
log.info("click on No on Own another car page");
OwnAnotherCarNoButton.click();
}
public void clickYoungerDriverNo() {
waitForElement(YoungerDriverNoButton, ObjectRepo.reader.getExplicitWait());
log.info("click on No on Adding younger driver page");
YoungerDriverNoButton.click();
}
public void clickAllDriverAbove30() {
waitForElement(AllDriverAgeThrirtyButton, ObjectRepo.reader.getExplicitWait());
log.info("click on option of above 30 years");
AllDriverAgeThrirtyButton.click();
}
public void enterName(String FirstName,String LastName) {
waitForElement(FirstNameText, ObjectRepo.reader.getExplicitWait());
waitForElement(LastNameText, ObjectRepo.reader.getExplicitWait());
log.info("Enter First Name and Last Name");
FirstNameText.sendKeys(FirstName);
LastNameText.sendKeys(LastName);
LastNameText.sendKeys(Keys.TAB);
}
public void clickApplicantNext() {
waitForElement(ApplicantNextButton, ObjectRepo.reader.getExplicitWait());
log.info("click on Next on Applicant details page");
ApplicantNextButton.click();
}
public void selectCommencentDate(String comdate) {
WebElement comDateElement= driver.findElement(By.xpath("//button[@aria-label='"+comdate+"']"));
waitForElement(comDateElement, ObjectRepo.reader.getExplicitWait());
log.info("Select date of commencement date of page");
comDateElement.click();
}
public void selectTermsofUse() {
waitForElement(TermsofUseCheckbox, ObjectRepo.reader.getExplicitWait());
log.info("select terms of use check box");
TermsofUseCheckbox.click();
}
public void clickOnGetQuote() {
waitForElement(GetQuoteButton, ObjectRepo.reader.getExplicitWait());
log.info("click on get quote button commencement date page");
GetQuoteButton.click();
}
public void getNoOfIndicativeQuotes(String noOfIndicativeQuote) throws InterruptedException {
Thread.sleep(5000);
 List<WebElement> noOfQuotes= driver.findElements(By.xpath("//span[text()='"+noOfIndicativeQuote+"']"));
 System.out.println("//span[text()='"+noOfIndicativeQuote+"']");
log.info("click on get quote button commencement date page");
System.out.println("Found: " + noOfQuotes.size() + " "+noOfIndicativeQuote);
}
}
