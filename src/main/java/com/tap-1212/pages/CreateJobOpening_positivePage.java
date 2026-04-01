package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class CreateJobOpeningPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "dashboard")
    private WebElement dashboard;
    @FindBy(id = "sideNavJobOpening")
    private WebElement jobOpeningSideNav;
    @FindBy(id = "jobOpeningScreen")
    private WebElement jobOpeningScreen;
    @FindBy(id = "buttonVisible")
    private WebElement buttonVisible;
    @FindBy(id = "createJobOpeningForm")
    private WebElement createJobOpeningForm;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "jobOpeningSavedMessage")
    private WebElement jobOpeningSavedMessage;
    @FindBy(id = "jobOpeningList")
    private WebElement jobOpeningList;
    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButton;
    @FindBy(id = "jobRoleDropdown")
    private WebElement jobRoleDropdown;
    @FindBy(id = "locationDropdown")
    private WebElement locationDropdown;
    @FindBy(id = "minExperienceInput")
    private WebElement minExperienceInput;
    @FindBy(id = "maxExperienceInput")
    private WebElement maxExperienceInput;
    @FindBy(id = "qualificationInput")
    private WebElement qualificationInput;
    @FindBy(id = "shortJobDescriptionInput")
    private WebElement shortJobDescriptionInput;
    @FindBy(id = "totalOpenings")
    private WebElement totalOpeningsField;
    @FindBy(id = "vendorDropdown")
    private WebElement vendorDropdown;
    @FindBy(id = "duration")
    private WebElement durationDropdown;
    @FindBy(id = "workMode")
    private WebElement workModeDropdown;
    @FindBy(id = "adminMaxExperience")
    private WebElement adminMaxExperienceField;
    @FindBy(id = "validDuration")
    private WebElement validDurationDropdown;
    @FindBy(id = "department")
    private WebElement departmentField;
    @FindBy(id = "status")
    private WebElement statusDropdown;
    @FindBy(id = "adminLocation")
    private WebElement adminLocationDropdown;
    @FindBy(id = "adminMinExperience")
    private WebElement adminMinExperienceField;
    @FindBy(id = "industryType")
    private WebElement industryTypeField;
    @FindBy(id = "tags")
    private WebElement tagsField;
    @FindBy(id = "primarySkills")
    private WebElement primarySkillsField;
    @FindBy(id = "secondarySkills")
    private WebElement secondarySkillsField;

    // Constructor
    public CreateJobOpeningPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void clicksOnSideNavigationOption(String action) {
        try {
            elementUtils.clickElement(jobOpeningSideNav);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(jobOpeningScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isButtonVisible() {
        try {
            return elementUtils.isElementDisplayed(buttonVisible);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clicksOnButton() {
        try {
            elementUtils.clickElement(buttonVisible);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCreateNewJobOpeningFormOpened() {
        try {
            return elementUtils.isElementDisplayed(createJobOpeningForm);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectJobRole(String jobRole) {
        try {
            elementUtils.clickElement(jobRoleDropdown);
            elementUtils.selectOptionInDropdown(jobRoleDropdown, jobRole);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMinimumExperience(String minExperience) {
        try {
            elementUtils.clearAndSendKeys(minExperienceInput, minExperience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMaximumExperience(String maxExperience) {
        try {
            elementUtils.clearAndSendKeys(maxExperienceInput, maxExperience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterQualification(String qualification) {
        try {
            elementUtils.clearAndSendKeys(qualificationInput, qualification);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterShortJobDescription(String shortDescription) {
        try {
            elementUtils.clearAndSendKeys(shortJobDescriptionInput, shortDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnSave() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningSavedSuccessfully() {
        try {
            return elementUtils.isElementDisplayed(jobOpeningSavedMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isJobOpeningAvailableInList() {
        try {
            return elementUtils.isElementDisplayed(jobOpeningList);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isAddJobOpeningButtonVisible() {
        try {
            return elementUtils.isElementDisplayed(addJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickAddJobOpeningButton() {
        try {
            elementUtils.clickElement(addJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterTotalOpenings(String totalOpenings) {
        try {
            elementUtils.clearAndSendKeys(totalOpeningsField, totalOpenings);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectVendors(String vendor) {
        try {
            elementUtils.selectOptionInDropdown(vendorDropdown, vendor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areSaveCancelButtonsDisplayed() {
        try {
            WebElement cancelButton = driver.findElement(By.id("cancelButton"));
            Assert.assertTrue(elementUtils.isElementDisplayed(saveButton), "Save button is not displayed!");
            Assert.assertTrue(elementUtils.isElementDisplayed(cancelButton), "Cancel button is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDuration(String duration) {
        try {
            elementUtils.selectOptionInDropdown(durationDropdown, duration);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectWorkMode(String workMode) {
        try {
            elementUtils.selectOptionInDropdown(workModeDropdown, workMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterAdminMaximumExperience(String experience) {
        try {
            elementUtils.clearAndSendKeys(adminMaxExperienceField, experience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidDuration(String validDuration) {
        try {
            elementUtils.selectOptionInDropdown(validDurationDropdown, validDuration);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDepartment(String department) {
        try {
            elementUtils.clearAndSendKeys(departmentField, department);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectLocation(String location) {
        try {
            elementUtils.selectOptionInDropdown(locationDropdown, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectEmploymentType(String employmentType) {
        try {
            elementUtils.selectOptionInDropdown(employmentTypeDropdown, employmentType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterSecondarySkills(String skills) {
        try {
            elementUtils.clearAndSendKeys(secondarySkillsField, skills);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterResponsibilities(String responsibilities) {
        try {
            elementUtils.clearAndSendKeys(responsibilitiesField, responsibilities);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectStatus(String status) {
        try {
            elementUtils.selectOptionInDropdown(statusDropdown, status);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectAdminLocation(String adminLocation) {
        try {
            elementUtils.selectOptionInDropdown(adminLocationDropdown, adminLocation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterAdminMinimumExperience(String experience) {
        try {
            elementUtils.clearAndSendKeys(adminMinExperienceField, experience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveMaximumExperienceBlank() {
        try {
            elementUtils.clearElement(adminMaxExperienceField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterIndustryType(String industryType) {
        try {
            elementUtils.clearAndSendKeys(industryTypeField, industryType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterTags(String tags) {
        try {
            elementUtils.clearAndSendKeys(tagsField, tags);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPrimarySkills(String skills) {
        try {
            elementUtils.clearAndSendKeys(primarySkillsField, skills);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}