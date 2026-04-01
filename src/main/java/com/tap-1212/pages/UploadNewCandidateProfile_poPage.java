package com.backend.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class UploadNewCandidateProfilePage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "uploadIcon")
    private WebElement uploadIcon;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    @FindBy(id = "fileSelectionDialog")
    private WebElement fileSelectionDialog;

    @FindBy(id = "multipleFileSelection")
    private WebElement multipleFileSelection;

    @FindBy(id = "profileSection")
    private WebElement profileSection;

    @FindBy(id = "metadataDisplay")
    private WebElement metadataDisplay;

    public UploadNewCandidateProfilePage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickUploadIcon() {
        try {
            elementUtils.clickElement(uploadIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadButton() {
        try {
            elementUtils.clickElement(uploadButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCandidateProfileFile(String filePath) {
        WebElement fileInput = driver.findElement(By.id("fileInput"));
        try {
            elementUtils.clearAndSendKeys(fileInput, filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isSuccessMessageDisplayed() {
        try {
            String actualMessage = elementUtils.getElementText(successMessage);
            Assert.assertEquals("Profile was uploaded successfully", actualMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isFileSelectionDialogOpen() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(fileSelectionDialog));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areBothProfilesListed() {
        // Logic to verify both profiles are listed
        // Placeholder for actual implementation
    }

    public void isMetadataDisplayedCorrectly() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(metadataDisplay));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUploadProcessSuccessful() {
        // Logic to confirm the upload process was successful
        // Placeholder for actual implementation
    }

    public void clickUploadCloudIconAdmin() {
        try {
            elementUtils.clickElement(uploadIcon); // Replace with actual WebElement for admin
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadButtonAdmin() {
        try {
            elementUtils.clickElement(uploadButton); // Replace with actual WebElement for admin
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void browseAndSelectCandidateProfileWithMetadata() {
        // Logic to browse and select a profile with metadata
        // Placeholder for actual implementation
    }

    public void isUploadSuccessful() {
        // Logic to check if the upload was successful
        // Placeholder for actual implementation
    }

    public void clickUploadButtonUser() {
        try {
            elementUtils.clickElement(uploadButton); // Assuming same button for user
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isProfileUploadSuccessful(String profileName) {
        // Logic to confirm a specific profile upload was successful
        // Placeholder for actual implementation
    }

    public void isSuccessConfirmationMessageDisplayed() {
        // Logic to check if the success confirmation message is displayed
        // Placeholder for actual implementation
    }

    public void clickUploadCloudIconRecruiter() {
        // Logic for recruiter specific upload cloud icon
        // Placeholder for actual implementation
    }

    public void clickUploadIconHiringManager() {
        // Logic for hiring manager specific upload icon
        // Placeholder for actual implementation
    }

    public void browseAndSelectCandidateProfileFile() {
        try {
            WebElement fileInput = driver.findElement(By.id("candidateProfileFile"));
            elementUtils.clearAndSendKeys(fileInput, "path/to/candidate/profile/file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectMultipleCandidateProfileFiles() {
        try {
            WebElement fileInput = driver.findElement(By.id("candidateProfileFile"));
            elementUtils.clearAndSendKeys(fileInput, "path/to/multiple/candidate/profile/files");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isProfileUploadedSuccessfully() {
        try {
            WebElement successMessage = driver.findElement(By.id("uploadSuccessMessage"));
            String actualMessage = elementUtils.getElementText(successMessage);
            String expectedMessage = "Profile uploaded successfully.";
            Assert.assertEquals(actualMessage, expectedMessage, "Upload success message does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void browseAndSelectCandidateProfileFileInDifferentFormat() {
        try {
            WebElement fileInput = driver.findElement(By.id("candidateProfileFile"));
            elementUtils.clearAndSendKeys(fileInput, "path/to/different/format/candidate/profile/file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToProfileSection() {
        try {
            WebElement profileSectionLink = driver.findElement(By.id("profileSectionLink"));
            elementUtils.clickElement(profileSectionLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void browseAndSelectValidCandidateProfileFile() {
        try {
            WebElement fileInput = driver.findElement(By.id("candidateProfileFile"));
            elementUtils.clearAndSendKeys(fileInput, "path/to/valid/candidate/profile/file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUploadProcessComplete() {
        try {
            WebElement uploadStatus = driver.findElement(By.id("uploadStatus"));
            String actualStatus = elementUtils.getElementText(uploadStatus);
            String expectedStatus = "Upload Complete";
            Assert.assertEquals(actualStatus, expectedStatus, "Upload process status does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForUploadToComplete() {
        try {
            WebElement loadingIndicator = driver.findElement(By.id("uploadLoadingIndicator"));
            while (elementUtils.isElementDisplayed(loadingIndicator)) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadButtonHiringManager() {
        try {
            WebElement uploadButton = driver.findElement(By.id("uploadButtonHiringManager"));
            elementUtils.clickElement(uploadButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areAllProfilesListed() {
        try {
            WebElement profileList = driver.findElement(By.id("profileList"));
            int actualProfileCount = profileList.findElements(By.tagName("li")).size();
            int expectedProfileCount = 5; // Example expected count
            Assert.assertEquals(actualProfileCount, expectedProfileCount, "Number of profiles listed does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCandidateProfileFileWithValidExtension(String filePath) {
        try {
            WebElement fileInput = driver.findElement(By.id("candidateProfileFile"));
            elementUtils.clearAndSendKeys(fileInput, filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadCloudIconHiringManager() {
        try {
            WebElement cloudIcon = driver.findElement(By.id("uploadCloudIconHiringManager"));
            elementUtils.clickElement(cloudIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadButtonRecruiter() {
        try {
            WebElement uploadButton = driver.findElement(By.id("uploadButtonRecruiter"));
            elementUtils.clickElement(uploadButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void browseAndSelectCandidateProfileFileInSupportedFormat() {
        try {
            WebElement fileInput = driver.findElement(By.id("candidateProfileFile"));
            elementUtils.clearAndSendKeys(fileInput, "path/to/supported/format/file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}