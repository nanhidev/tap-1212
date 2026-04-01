package com.tap-1212.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-1212.pages.LoginScreenForRecruiters_posPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginScreenForRecruiters_pos extends DriverFactory {
LoginScreenForRecruiters_posPage loginPage = new LoginScreenForRecruiters_posPage(driver);
@Given("the user is on the Login Screen")
public void the_user_is_on_the_login_screen() {
driver = DriverFactory.getDriver();
loginPage.navigateToLoginScreen();
}
@When("I enter a valid email ID {string}")
public void i_enter_a_valid_email_id(String email) {
loginPage.enterEmail(email);
}
@When("I enter a valid password {string}")
public void i_enter_a_valid_password(String password) {
loginPage.enterPassword(password);
}
@When("I click on the 'Show Password' option")
public void i_click_on_the_show_password_option() {
loginPage.clickShowPassword();
}
@When("I click the Login button")
public void i_click_the_login_button() {
loginPage.clickLoginButton();
}
@Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_the_dashboard() {
loginPage.isDashboardDisplayed();
}
@Then("the dashboard loads successfully without errors")
public void the_dashboard_loads_successfully_without_errors() {
loginPage.isDashboardLoadedSuccessfully();
}
@Then("the Login button should be disabled")
public void the_login_button_should_be_disabled() {
loginPage.isLoginButtonEnabled();
}
@Then("the Login button should be enabled")
public void the_login_button_should_be_enabled() {
loginPage.isLoginButtonEnabled();
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
loginPage.isPasswordVisible();
}
@Then("the password should be hidden")
public void the_password_should_be_hidden() {
loginPage.isPasswordVisible();
}
@When("the user enters {string}")
public void the_user_enters(String email) {
loginPage.enterEmail(email);
}
@Then("an error message {string} should be displayed")
public void an_error_message_should_be_displayed(String errorMessage) {
Assert.assertEquals(errorMessage, loginPage.getErrorMessage());
}
@When("the user logs out")
public void the_user_logs_out() {
loginPage.logout();
}
@When("the user returns to the Login Screen")
public void the_user_returns_to_the_login_screen() {
loginPage.navigateToLoginScreen();
}
@When("the user enters {string} in the Email ID field")
public void the_user_enters_in_the_email_id_field(String email) {
loginPage.enterEmail(email);
}
@When("the user enters {string} in the Password field")
public void the_user_enters_in_the_password_field(String password) {
loginPage.enterPassword(password);
}
@Then("the user should be redirected to the dashboard successfully")
public void the_user_should_be_redirected_to_the_dashboard_successfully() {
loginPage.isDashboardDisplayed();
}
@Then("the user logs out and returns to the Login Screen")
public void the_user_logs_out_and_returns_to_the_login_screen() {
loginPage.logout();
loginPage.navigateToLoginScreen();
}
@When("the user enters <email>")
public void the_user_enters_email(String email) {
loginPage.enterEmail(email);
}
@When("the user enters <password>")
public void the_user_enters_password(String password) {
loginPage.enterPassword(password);
}
@When("the user enters <incorrect_password>")
public void the_user_enters_incorrect_password(String incorrectPassword) {
loginPage.enterPassword(incorrectPassword);
}

@Given("I leave the password field empty")
public void iLeaveThePasswordFieldEmpty() {
loginScreen.leavePasswordFieldEmpty();
}
@When("I enter {string}")
public void iEnter(String email) {
loginScreen.enterEmail(email);
}
@When("the user clicks the login button")
public void theUserClicksTheLoginButton() {
loginScreen.clickLoginButton();
}
@When("the user enters the correct password")
public void theUserEntersTheCorrectPassword() {
loginScreen.enterCorrectPassword();
}
@Then("the user is redirected to the dashboard successfully")
public void theUserIsRedirectedToTheDashboardSuccessfully() {
loginScreen.isDashboardDisplayed();
}
@Then("the user can still log in successfully after toggling")
public void theUserCanStillLogInSuccessfullyAfterToggling() {
loginScreen.isLoginSuccessfulAfterToggling();
}
@When("the user clicks on the 'show password' option")
public void theUserClicksOnShowPasswordOption() {
loginScreen.clickShowPasswordOption();
}
@When("I enter a valid email id {string} in the email id field")
public void iEnterAValidEmailIdInTheEmailIdField(String email) {
loginScreen.enterEmail(email);
}
@When("I log out")
public void iLogOut() {
loginScreen.logOut();
}
@Then("an error message incorrect email id or password should be displayed")
public void anErrorMessageIncorrectEmailIdOrPasswordShouldBeDisplayed() {
loginScreen.isErrorMessageDisplayed();
}
@When("the user enters the valid email id {string}")
public void theUserEntersTheValidEmailId(String email) {
loginScreen.enterEmail(email);
}
@When("I enter a valid password {string} in the password field")
public void iEnterAValidPasswordInThePasswordField(String password) {
loginScreen.enterPassword(password);
}
@When("I log out return to the login screen")
public void iLogOutReturnToTheLoginScreen() {
loginScreen.logOutAndReturnToLogin();
}
@When("I return to the login screen")
public void iReturnToTheLoginScreen() {
loginScreen.returnToLoginScreen();
}
@When("the user clicks on the 'hide password' option")
public void theUserClicksOnHidePasswordOption() {
loginScreen.clickHidePasswordOption();
}
}