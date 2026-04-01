package com.backend.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class OpenCreateNewJobOpeningForPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButton;
    @FindBy(id = "jobTitleField")
    private WebElement jobTitleField;
    @FindBy(id = "jobDescriptionField")
    private WebElement jobDescriptionField;
    @FindBy(id = "jobRequirementsField")
    private WebElement jobRequirementsField;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "cancelButton")
    private WebElement cancelButton;
    @FindBy(id = "createNewJobOpeningForm")
    private WebElement createNewJobOpeningForm;
    @FindBy(id = "successMessage")
    private WebElement successMessage;

    public OpenCreateNewJobOpeningForPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void clicksOnAddJobOpeningButton() {
        elementUtils.clickElement(addJobOpeningButton);
    }

    public void fillJobTitle(String jobTitle) {
        elementUtils.clearAndSendKeys(jobTitleField, jobTitle);
    }

    public void fillJobDescription(String jobDescription) {
        elementUtils.clearAndSendKeys(jobDescriptionField, jobDescription);
    }

    public void fillJobRequirements(String jobRequirements) {
        elementUtils.clearAndSendKeys(jobRequirementsField, jobRequirements);
    }

    public void clickSaveButton() {
        elementUtils.clickElement(saveButton);
    }

    public void clickCancelButton() {
        elementUtils.clickElement(cancelButton);
    }

    public boolean isCreateNewJobOpeningFormDisplayed() {
        return elementUtils.isElementDisplayed(createNewJobOpeningForm);
    }

    public boolean isSuccessMessageDisplayed() {
        return elementUtils.isElementDisplayed(successMessage);
    }

    public void isJobOpeningSaved() {
        String actualMessage = elementUtils.getElementText(successMessage);
        String expectedMessage = "Job opening created successfully"; 
        Assert.assertEquals(actualMessage, expectedMessage, "Job opening was not saved successfully!");
    }

    public boolean isUserOnJobOpeningScreen() {
        return driver.getCurrentUrl().equals("http://localhost/job_opening");
    }

    public boolean areFieldsPresent() {
        return elementUtils.isElementDisplayed(jobTitleField) &&
               elementUtils.isElementDisplayed(jobDescriptionField) &&
               elementUtils.isElementDisplayed(jobRequirementsField);
    }

    public boolean areSaveAndCancelButtonsDisplayed() {
        return elementUtils.isElementDisplayed(saveButton) &&
               elementUtils.isElementDisplayed(cancelButton);
    }

    public boolean areFieldsReset() {
        return jobTitleField.getAttribute("value").isEmpty() &&
               jobDescriptionField.getAttribute("value").isEmpty() &&
               jobRequirementsField.getAttribute("value").isEmpty();
    }

    public void navigateToJobOpeningScreen() {
        driver.get("http://localhost/job-opening");
    }

    public void fillInMandatoryAndSomeOptionalFields() {
        WebElement mandatoryField1 = driver.findElement(By.id("mandatoryField1"));
        elementUtils.clearAndSendKeys(mandatoryField1, "Some Value");

        WebElement optionalField1 = driver.findElement(By.id("optionalField1"));
        elementUtils.clearAndSendKeys(optionalField1, "Optional Value");
    }

    public void fillInAllFields() {
        WebElement field1 = driver.findElement(By.id("field1"));
        elementUtils.clearAndSendKeys(field1, "Field 1 Value");

        WebElement field2 = driver.findElement(By.id("field2"));
        elementUtils.clearAndSendKeys(field2, "Field 2 Value");
    }

    public void areMandatoryFieldsMarked() {
        WebElement mandatoryField = driver.findElement(By.id("mandatoryField1"));
        boolean isMandatory = mandatoryField.getAttribute("class").contains("mandatory");
        Assert.assertTrue(isMandatory, "Mandatory field is not marked correctly!");
    }

    public void fillInJobTitleAndDescription() {
        elementUtils.clearAndSendKeys(jobTitleField, "Job Title");
        elementUtils.clearAndSendKeys(jobDescriptionField, "Job Description");
    }

    public void areLabelsClearAndDescriptive() {
        WebElement jobTitleLabel = driver.findElement(By.xpath("//label[@for='jobTitle']"));
        String actualLabelText = jobTitleLabel.getText();
        String expectedLabelText = "Job Title";
        Assert.assertEquals(actualLabelText, expectedLabelText, "Job Title label is not descriptive!");
    }

    public void isSaveButtonActivated() {
        Assert.assertTrue(saveButton.isEnabled(), "Save button is not activated!");
    }

    public void areFieldLabelsDescriptive() {
        WebElement descriptionLabel = driver.findElement(By.xpath("//label[@for='description']"));
        String actualDescriptionLabel = descriptionLabel.getText();
        String expectedDescriptionLabel = "Job Description";
        Assert.assertEquals(actualDescriptionLabel, expectedDescriptionLabel, "Description label is not descriptive!");
    }

    public void isAddJobOpeningButtonDisplayed() {
        Assert.assertTrue(elementUtils.isElementDisplayed(addJobOpeningButton), "Add Job Opening button is not displayed!");
    }

    public void isJobOpeningFormDisplayed() {
        WebElement jobOpeningForm = driver.findElement(By.id("jobOpeningForm"));
        Assert.assertTrue(elementUtils.isElementDisplayed(jobOpeningForm), "Job Opening form is not displayed!");
    }
}