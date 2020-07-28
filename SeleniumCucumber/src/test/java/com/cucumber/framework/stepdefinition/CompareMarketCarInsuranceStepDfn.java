package com.cucumber.framework.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.cucumber.framework.helper.PageObject.homepage.CarInsuranceQuotePO;
import com.cucumber.framework.settings.ObjectRepo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.utilclass;

/**
 * @author Vinay Kumar
 *
 *         27/07/2020
 *
 */
public class CompareMarketCarInsuranceStepDfn {
	utilclass util;
	
	private CarInsuranceQuotePO ciQuotePO;
	public CompareMarketCarInsuranceStepDfn(){
		util = new utilclass(ObjectRepo.driver);
	}
	@Given("^: I am at the home page$")
	public void _i_am_at_the_home_page() throws Throwable {
		ObjectRepo.driver.get(ObjectRepo.reader.getWebsite());
		ciQuotePO = new CarInsuranceQuotePO(ObjectRepo.driver);
		ObjectRepo.data.put("HomePage", ciQuotePO);
		util.takeScreenShot();
	}

	@When("^: I click on the Car Insurance search filter$")
	public void _i_click_on_the_something_search_filter()
			throws Throwable {
		ciQuotePO.navigateTo();
		util.takeScreenShot();
	}
	@Then("^: I should be at compare car insurance page$")
	public void _should_be_at_comapre_car_insurnace_page()
			throws Throwable {
		Assert.assertTrue(ciQuotePO.viewCompareCarInsurancePage());
		util.takeScreenShot();
	}
	
	@When("^: at compare care insurance page click on Compare Now link$")
	public void _i_click_on_the_CompareNow_link()
			throws Throwable {
		ciQuotePO.clikonCompareNow();
		util.takeScreenShot();
	}
	
	@Then("^: I should be at \"([^\"]*)\" page$")
	public void _at_quote_page_verify_title(String quoteTitle)
			throws Throwable {
		Assert.assertTrue(ciQuotePO.verifyQuotePageTitle(quoteTitle));
		
		util.takeScreenShot();
	}
	@When("^: at quote page I enter \"([^\"]*)\" as rego number$")
	public void at_quote_page_I_enter_as_rego_number(String regono) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	     ciQuotePO.enterRegoNumber(regono);
	     util.takeScreenShot();
	}

	@When("^: at page click on Next button$")
	public void at_page_click_on_Next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.clickQuoteNext();
		util.takeScreenShot();
	}
	@When("^: at Car registration state page I select state$")
	public void at_Car_registration_state_page_I_select_state() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.clickonState();
		util.takeScreenShot();
	}
	@When("^: at Cover Type select cover type as Comprehensive insurance$")
	public void at_Cover_Type_select_cover_type_as_Comprehensive_insurance() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.selectCoverType();
		util.takeScreenShot();
	}
	@When("^: at factory optios page selected No to factory accessories fit$")
	public void at_factory_optios_page_selected_No_to_factory_accessories_fit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.selectFactFitoption();
		util.takeScreenShot();
	}
	@When("^: at Car modification page I should select No$")
	public void at_Car_modification_page_I_should_select_No() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.selectCarModifications();
		util.takeScreenShot();
	}
	@When("^: at unrepaired accident or hail damage page I should select No$")
	public void at_unrepaired_accident_or_hail_damage_page_I_should_select_No() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.selectUnrepairedoption();
		util.takeScreenShot();
	}
	@When("^: at finance car quote page I should select Yes$")
	public void at_finance_car_quote_page_I_should_select_Yes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.selectcarfinanceoption();
		util.takeScreenShot();
	}
	@When("^: at user type car I should select Private and/or commuting to work only$")
	public void at_user_type_car_I_should_select_Private_and_or_commuting_to_work_only() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.selectUsertypeOption();
		util.takeScreenShot();
	}
	@When("^: at currently insured page I should select No$")
	public void at_currently_insured_page_I_should_select_No() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.selectCurrentlyInsuredOption();
		util.takeScreenShot();
	}
	@When("^: at annual kilometers page I enter \"([^\"]*)\" driven for per year$")
	public void at_annual_kilometers_page_I_enter_driven_for_per_year(String kms) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.enterkms(kms);
		util.takeScreenShot();
	}

	@When("^: at annual kilometers page I click on Next button$")
	public void at_annual_kilometers_page_I_click_on_Next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.clickOnNext();
		util.takeScreenShot();
	}
	@When("^: at address page I should enter \"([^\"]*)\"$")
	public void at_address_page_I_should_enter(String postcode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.enterPostCode(postcode);
		util.takeScreenShot();
	}

	@When("^: at address page I should eneter \"([^\"]*)\"$")
	public void at_address_page_I_should_eneter(String address) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.enterAddress(address);
		util.takeScreenShot();
	}

	@When("^: at address page I click on Next button$")
	public void at_address_page_I_click_on_Next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.clickOnAddressNext();
		util.takeScreenShot();
	}
	@When("^: at overnight parking page select parking type$")
	public void at_overnight_parking_page_select_parking_type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.clickParkingType();
		util.takeScreenShot();
	}
	@When("^: at driver gender I should select gender type$")
	public void at_driver_gender_I_should_select_gender_type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.selectGender();
		util.takeScreenShot();
	}
	@When("^: at regular driver date of birth I should able to enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void at_regular_driver_date_of_birth_I_should_able_to_enter_and_and(String day, String month, String year) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ciQuotePO.selectDateofBirth(day,month,year);
	    util.takeScreenShot();
	}
	@When("^: at driver age page I should click on Next button$")
	public void at_driver_age_page_I_should_click_on_Next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ciQuotePO.clickAgeNext();
	    util.takeScreenShot();
	}
	@When("^: at regular driver employment page I should select Employed full-time$")
	public void at_regular_driver_employment_page_I_should_select_Employed_full_time() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 ciQuotePO.clickEmployment();
		 util.takeScreenShot();
	}

	@When("^: at regular driver licence age page I should enter age as \"([^\"]*)\"$")
	public void at_regular_driver_licence_age_page_I_should_enter_age_as(String Age) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		 ciQuotePO.enterLicenceAge(Age);
		 util.takeScreenShot();
	}

	@When("^: at regular driver licence age page I should click on next$")
	public void at_regular_driver_licence_age_page_I_should_click_on_next() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		 ciQuotePO.clickLicenceNext();
		 util.takeScreenShot();
	}
	@When("^: at regular driver claim page select previous claim as No$")
	public void at_regular_driver_claim_page_select_previous_claim_as_No() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 ciQuotePO.clickPreviousClaimNo();
		 util.takeScreenShot();
	}
	@When("^: at no claim discount page I should select rating1$")
	public void at_no_claim_discount_page_I_should_select_rating() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 ciQuotePO.clickonRating();
		 util.takeScreenShot();
	}
	@When("^: at does drive have another car page I should select No$")
	public void at_does_drive_have_another_page_I_should_select_No() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 ciQuotePO.clickOwnAnotherCarNo();
		 util.takeScreenShot();
	}
	@When("^: at youngest driver dirving page I should select No$")
	public void at_youngest_driver_dirving_page_I_should_select_No() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.clickYoungerDriverNo();
		util.takeScreenShot();
	}
	@When("^: at driver option page I should select all dirvers above AgeThirty$")
	public void at_driver_option_page_I_should_select_all_dirvers_above_Age() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.clickAllDriverAbove30();
		util.takeScreenShot();
	}
	@When("^: at applicant details page I should enter \"([^\"]*)\" as First Name \"([^\"]*)\" as Last Name$")
	public void at_applicant_details_page_I_should_enter_as_First_Name_as_Last_Name(String FirstName, String LastName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.enterName(FirstName,LastName);
		util.takeScreenShot();
	}

	@When("^: at applicant details page I should click on Next button$")
	public void at_applicant_details_page_I_should_click_on_Next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.clickApplicantNext();
		util.takeScreenShot();
	}
	@When("^: at commencement date page I should select date as \"([^\"]*)\"$")
	public void at_commencement_date_page_I_should_select_date_as(String comdate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.selectCommencentDate(comdate);
		util.takeScreenShot();
	}

	@When("^: at commencement date page I should select terms of use$")
	public void at_commencement_date_page_I_should_select_terms_of_use() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.selectTermsofUse();
		util.takeScreenShot();
	}

	@When("^: at commencement date page I should click on quote page$")
	public void at_commencement_date_page_I_should_click_on_quote_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.clickOnGetQuote();
		util.takeScreenShot();
	}
	@Then("^: at results page I should find number of quotes with \"([^\"]*)\" and display the number on console\\.$")
	public void at_results_page_I_should_find_number_of_quotes_with_and_display_the_number_on_console(String noOfIndicativeQuote) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ciQuotePO.getNoOfIndicativeQuotes(noOfIndicativeQuote);
		util.takeScreenShot();
	}
}
