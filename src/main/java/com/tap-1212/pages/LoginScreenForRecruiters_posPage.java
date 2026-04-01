package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class LoginScreenForRecruiters_posPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public LoginScreenForRecruiters_posPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "emailField")
    private WebElement emailField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "showPassword")
    private WebElement showPasswordOption;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "dashboard")
    private WebElement dashboard;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "logoutButton")
    private WebElement logoutButton;

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickShowPassword() {
        try {
            elementUtils.clickElement(showPasswordOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isDashboardDisplayed() {
        try {
            return elementUtils.isElementDisplayed(dashboard);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getErrorMessage() {
        try {
            return elementUtils.getElementText(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void logout() {
        try {
            elementUtils.clickElement(logoutButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToLoginScreen() {
        driver.get("http://localhost/login");
    }

    public void leavePasswordFieldEmpty() {
        try {
            elementUtils.clearElement(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isErrorMessageDisplayed() {
        try {
            String expectedErrorMessage = "incorrect email id or password";
            String actualErrorMessage = getErrorMessage();
            Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isPasswordVisible() {
        try {
            boolean isVisible = passwordField.isDisplayed();
            Assert.assertTrue(isVisible, "Password field is not visible!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isLoginButtonEnabled() {
        try {
            boolean isEnabled = loginButton.isEnabled();
            Assert.assertTrue(isEnabled, "Login button is not enabled!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isDashboardLoadedSuccessfully() {
        try {
            boolean isDisplayed = dashboard.isDisplayed();
            Assert.assertTrue(isDisplayed, "Dashboard did not load successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isLoginSuccessfulAfterToggling() {
        // Implement the logic to validate login success after toggling password visibility
        // This could involve checking if the dashboard is displayed after logging in
        if (isDashboardDisplayed()) {
            System.out.println("Login was successful after toggling password visibility.");
        } else {
            Assert.fail("Login was not successful after toggling password visibility.");
        }
    }
}