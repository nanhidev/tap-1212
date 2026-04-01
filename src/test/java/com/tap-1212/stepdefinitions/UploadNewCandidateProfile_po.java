package com.tap-1212.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-1212.pages.UploadNewCandidateProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class UploadNewCandidateProfile_po extends DriverFactory {
UploadNewCandidateProfilePage uploadNewCandidateProfilePage = new UploadNewCandidateProfilePage(driver);
@Given("the user is on the Profile section")
public void the_user_is_on_the_profile_section() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
@When("the user clicks on the upload (cloud) icon")
public void the_user_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user browses and selects a valid candidate profile file {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file(String validCandidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(validCandidateProfileFile);
}
@When("the user clicks on the Upload button")
public void the_user_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the user waits for the upload process to complete")
public void the_user_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@Then("the user should see a success confirmation message indicating the profile was uploaded successfully")
public void the_user_should_see_a_success_confirmation_message() {
uploadNewCandidateProfilePage.isSuccessMessageDisplayed();
}
@Then("{string} profile uploads successfully with a confirmation message")
public void profile_uploads_successfully_with_a_confirmation_message(String profileNumber) {
uploadNewCandidateProfilePage.isProfileUploadedSuccessfully(profileNumber);
}
@Then("both profiles are listed in the Profile section")
public void both_profiles_are_listed_in_the_profile_section() {
uploadNewCandidateProfilePage.areBothProfilesListed();
}
@When("the user browses and selects the {string}")
public void the_user_browses_and_selects_the_candidate_profile_file(String candidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile);
}
@Then("the metadata should be displayed correctly in the Profile section")
public void the_metadata_should_be_displayed_correctly_in_the_profile_section() {
uploadNewCandidateProfilePage.isMetadataDisplayedCorrectly();
}
@Then("the upload process should complete without errors")
public void the_upload_process_should_complete_without_errors() {
uploadNewCandidateProfilePage.isUploadProcessSuccessful();
}
@Then("all uploaded profiles should be listed in the Profile section")
public void all_uploaded_profiles_should_be_listed_in_the_profile_section() {
uploadNewCandidateProfilePage.areAllProfilesListed();
}
@When("the user browses and selects a candidate profile file in a supported format {string}")
public void the_user_browses_and_selects_a_candidate_profile_file_in_a_supported_format(String candidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile);
}
@When("the user waits for the upload to complete and confirms success")
public void the_user_waits_for_the_upload_to_complete_and_confirms_success() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
uploadNewCandidateProfilePage.isSuccessMessageDisplayed();
}
@When("the user browses and selects a candidate profile file with metadata {string}")
public void the_user_browses_and_selects_a_candidate_profile_file_with_metadata(String candidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile);
}
@When("the admin browses and selects multiple valid candidate profile files")
public void the_admin_browses_and_selects_multiple_valid_candidate_profile_files() {
// Assuming a method to handle multiple file selections
uploadNewCandidateProfilePage.selectMultipleCandidateProfileFiles();
}
@Then("the confirmation message should be displayed indicating the profile was uploaded successfully")
public void the_confirmation_message_should_be_displayed_indicating_the_profile_was_uploaded_successfully() {
uploadNewCandidateProfilePage.isSuccessMessageDisplayed();
}

@Given("the admin clicks on the upload (cloud) icon")
public void the_admin_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadCloudIconAdmin();
}
@Given("the recruiter clicks on the upload (cloud) icon")
public void the_recruiter_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadCloudIconRecruiter();
}
@When("the admin clicks on the upload button")
public void the_admin_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButtonAdmin();
}
@Then("the file selection dialog opens")
public void the_file_selection_dialog_opens() {
uploadNewCandidateProfilePage.isFileSelectionDialogOpen();
}
@When("the user browses selects a candidate profile file with metadata")
public void the_user_browses_selects_a_candidate_profile_file_with_metadata() {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileWithMetadata();
}
@Then("the admin waits for the upload process to complete confirms success for each file")
public void the_admin_waits_for_the_upload_process_to_complete_confirms_success_for_each_file() {
uploadNewCandidateProfilePage.isUploadSuccessful();
}
@When("the recruiter clicks on the upload button")
public void the_recruiter_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButtonRecruiter();
}
@When("the hiring manager clicks on the upload button")
public void the_hiring_manager_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButtonHiringManager();
}
@Then("a success confirmation message should appear indicating the profile was uploaded successfully")
public void a_success_confirmation_message_should_appear_indicating_the_profile_was_uploaded_successfully() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@When("the user clicks the upload button")
public void the_user_clicks_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButtonUser();
}
@Then("the {string} profile uploads successfully with a confirmation message")
public void the_profile_uploads_successfully_with_a_confirmation_message(String profileName) {
uploadNewCandidateProfilePage.isProfileUploadSuccessful(profileName);
}
@When("the hiring manager browses selects a valid candidate profile file")
public void the_hiring_manager_browses_selects_a_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.browseAndSelectValidCandidateProfileFile();
}
@When("the user browses selects the candidate profile file {string}")
public void the_user_browses_selects_the_candidate_profile_file(String fileName) {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileFile(fileName);
}
@Then("the hiring manager waits for the upload process to complete")
public void the_hiring_manager_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.isUploadProcessComplete();
}
@Then("a success confirmation message appears, indicating the profile was uploaded successfully")
public void a_success_confirmation_message_appears_indicating_the_profile_was_uploaded_successfully() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@When("the hiring manager browses selects a candidate profile file in a different format")
public void the_hiring_manager_browses_selects_a_candidate_profile_file_in_a_different_format() {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileFileInDifferentFormat();
}
@When("the user browses selects a valid candidate profile file")
public void the_user_browses_selects_a_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.browseAndSelectValidCandidateProfileFile();
}
@When("the user browses selects a candidate profile file in a supported format")
public void the_user_browses_selects_a_candidate_profile_file_in_a_supported_format() {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileFileInSupportedFormat();
}
@When("the hiring manager clicks on the upload (cloud) icon")
public void the_hiring_manager_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadCloudIconHiringManager();
}
@When("the recruiter selects a candidate profile file with a valid extension {string}")
public void the_recruiter_selects_a_candidate_profile_file_with_a_valid_extension(String fileName) {
uploadNewCandidateProfilePage.selectCandidateProfileFileWithValidExtension(fileName);
}
@When("the hiring manager clicks on the upload icon")
public void the_hiring_manager_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIconHiringManager();
}
}