package com.tap-1212.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-1212.pages.CreateJobOpeningPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateJobOpening_positive extends DriverFactory {
CreateJobOpeningPage createJobOpeningPage = new CreateJobOpeningPage(driver);
@Given("the user is on the Dashboard")
public void the_user_is_on_the_dashboard() {
driver = DriverFactory.getDriver();
}
@When("the user clicks on the {string} option in the side navigation")
public void the_user_clicks_on_option_in_the_side_navigation(String action) {
createJobOpeningPage.clicksOnSideNavigationOption(action);
}
@Then("the Job Opening screen should be displayed")
public void the_job_opening_screen_should_be_displayed() {
createJobOpeningPage.isJobOpeningScreenDisplayed();
}
@And("the {string} button should be visible")
public void the_button_should_be_visible(String button) {
createJobOpeningPage.isButtonVisible(button);
}
@When("the user clicks on the {string} button")
public void the_user_clicks_on_button(String button) {
createJobOpeningPage.clicksOnButton(button);
}
@Then("the Create New Job Opening form should be opened")
public void the_create_new_job_opening_form_should_be_opened() {
createJobOpeningPage.isCreateNewJobOpeningFormOpened();
}
@And("the {string} and {string} buttons should be displayed")
public void the_buttons_should_be_displayed(String button1, String button2) {
createJobOpeningPage.areButtonsDisplayed(button1, button2);
}
@When("the recruiter selects a Job Role")
public void the_recruiter_selects_a_job_role() {
createJobOpeningPage.selectJobRole();
}
@And("the recruiter selects a Location")
public void the_recruiter_selects_a_location() {
createJobOpeningPage.selectLocation();
}
@And("the recruiter enters Minimum Experience")
public void the_recruiter_enters_minimum_experience() {
createJobOpeningPage.enterMinimumExperience();
}
@And("the recruiter enters Maximum Experience")
public void the_recruiter_enters_maximum_experience() {
createJobOpeningPage.enterMaximumExperience();
}
@And("the recruiter enters Qualification")
public void the_recruiter_enters_qualification() {
createJobOpeningPage.enterQualification();
}
@And("the recruiter enters Short Job Description")
public void the_recruiter_enters_short_job_description() {
createJobOpeningPage.enterShortJobDescription();
}
@And("the recruiter enters Responsibilities")
public void the_recruiter_enters_responsibilities() {
createJobOpeningPage.enterResponsibilities();
}
@And("the recruiter clicks on Save")
public void the_recruiter_clicks_on_save() {
createJobOpeningPage.clicksOnSave();
}
@Then("the job opening should be saved successfully")
public void the_job_opening_should_be_saved_successfully() {
createJobOpeningPage.isJobOpeningSavedSuccessfully();
}
@And("the job opening should be available in the Job Opening list")
public void the_job_opening_should_be_available_in_the_job_opening_list() {
createJobOpeningPage.isJobOpeningAvailableInList();
}
@When("the recruiter selects {string} as the Job Role")
public void the_recruiter_selects_as_the_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@And("the recruiter selects {string} as the Location")
public void the_recruiter_selects_as_the_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@And("the recruiter enters {string} as Minimum Experience")
public void the_recruiter_enters_as_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@And("the recruiter enters {string} as Maximum Experience")
public void the_recruiter_enters_as_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@And("the recruiter enters {string} as Qualification")
public void the_recruiter_enters_as_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@And("the recruiter enters {string} as Short Job Description")
public void the_recruiter_enters_as_short_job_description(String shortJobDescription) {
createJobOpeningPage.enterShortJobDescription(shortJobDescription);
}
@And("the recruiter enters {string} as Responsibilities")
public void the_recruiter_enters_as_responsibilities(String responsibilities) {
createJobOpeningPage.enterResponsibilities(responsibilities);
}
@And("the recruiter enters {string} as Primary Skills")
public void the_recruiter_enters_as_primary_skills(String primarySkills) {
createJobOpeningPage.enterPrimarySkills(primarySkills);
}
@And("the recruiter enters {string} as Secondary Skills")
public void the_recruiter_enters_as_secondary_skills(String secondarySkills) {
createJobOpeningPage.enterSecondarySkills(secondarySkills);
}
@And("the recruiter enters {string} as Total Openings")
public void the_recruiter_enters_as_total_openings(String totalOpenings) {
createJobOpeningPage.enterTotalOpenings(totalOpenings);
}
@And("the recruiter selects {string} as Employment Type")
public void the_recruiter_selects_as_employment_type(String employmentType) {
createJobOpeningPage.selectEmploymentType(employmentType);
}
@And("the recruiter selects {string} as Duration")
public void the_recruiter_selects_as_duration(String duration) {
createJobOpeningPage.selectDuration(duration);
}
@And("the recruiter selects {string} as Work Mode")
public void the_recruiter_selects_as_work_mode(String workMode) {
createJobOpeningPage.selectWorkMode(workMode);
}
@And("the recruiter selects {string} as Status")
public void the_recruiter_selects_as_status(String status) {
createJobOpeningPage.selectStatus(status);
}
@And("the recruiter enters {string} as Department")
public void the_recruiter_enters_as_department(String department) {
createJobOpeningPage.enterDepartment(department);
}
@And("the recruiter enters {string} as Industry Type")
public void the_recruiter_enters_as_industry_type(String industryType) {
createJobOpeningPage.enterIndustryType(industryType);
}
@And("the recruiter enters {string} as Tags")
public void the_recruiter_enters_as_tags(String tags) {
createJobOpeningPage.enterTags(tags);
}
@And("the recruiter selects {string} as Vendors")
public void the_recruiter_selects_as_vendors(String vendors) {
createJobOpeningPage.selectVendors(vendors);
}

@Given("the recruiter enters minimum experience as {string}")
public void the_recruiter_enters_minimum_experience_as(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@Given("the recruiter enters {string} as the qualification")
public void the_recruiter_enters_as_the_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@Given("the recruiter selects a valid status as {string}")
public void the_recruiter_selects_a_valid_status_as(String status) {
createJobOpeningPage.selectStatus(status);
}
@Given("the admin selects work mode as {string}")
public void the_admin_selects_work_mode_as(String workMode) {
createJobOpeningPage.selectWorkMode(workMode);
}
@When("the admin clicks on save")
public void the_admin_clicks_on_save() {
createJobOpeningPage.clickSaveButton();
}
@Given("the admin enters minimum experience as {string}")
public void the_admin_enters_minimum_experience_as(String minExperience) {
createJobOpeningPage.enterAdminMinimumExperience(minExperience);
}
@Given("the recruiter selects the location {string}")
public void the_recruiter_selects_the_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@Given("the recruiter enters the tags {string}")
public void the_recruiter_enters_the_tags(String tags) {
createJobOpeningPage.enterTags(tags);
}
@When("the user clicks on the job opening option in the side navigation")
public void the_user_clicks_on_the_job_opening_option_in_the_side_navigation() {
createJobOpeningPage.clickJobOpeningOption();
}
@Given("the recruiter enters {string} as the short job description")
public void the_recruiter_enters_as_the_short_job_description(String shortDescription) {
createJobOpeningPage.enterShortJobDescription(shortDescription);
}
@Then("the save cancel buttons should be displayed")
public void the_save_cancel_buttons_should_be_displayed() {
createJobOpeningPage.areSaveCancelButtonsDisplayed();
}
@When("the user clicks on the add job opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
createJobOpeningPage.clickAddJobOpeningButton();
}
@Given("the admin selects a location as {string}")
public void the_admin_selects_a_location_as(String location) {
createJobOpeningPage.selectAdminLocation(location);
}
@Given("the recruiter enters maximum experience as {string}")
public void the_recruiter_enters_maximum_experience_as(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@Given("the recruiter selects a valid duration")
public void the_recruiter_selects_a_valid_duration() {
createJobOpeningPage.selectValidDuration();
}
@Given("the recruiter leaves maximum experience blank")
public void the_recruiter_leaves_maximum_experience_blank() {
createJobOpeningPage.leaveMaximumExperienceBlank();
}
@Given("the recruiter selects a job role as {string}")
public void the_recruiter_selects_a_job_role_as(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@Given("the admin enters maximum experience as {string}")
public void the_admin_enters_maximum_experience_as(String maxExperience) {
createJobOpeningPage.enterAdminMaximumExperience(maxExperience);
}
@Then("the add job opening button should be visible")
public void the_add_job_opening_button_should_be_visible() {
createJobOpeningPage.isAddJobOpeningButtonVisible();
}
@Given("the admin selects employment type as {string}")
public void the_admin_selects_employment_type_as(String employmentType) {
createJobOpeningPage.selectEmploymentType(employmentType);
}
@Given("the recruiter selects the job role {string}")
public void the_recruiter_selects_the_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@Given("the recruiter selects the vendor {string}")
public void the_recruiter_selects_the_vendor(String vendor) {
createJobOpeningPage.selectVendor(vendor);
}
}