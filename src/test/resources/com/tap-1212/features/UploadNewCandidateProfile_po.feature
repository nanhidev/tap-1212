
Feature: UploadNewCandidateProfile_po @feature_upload_candidate_profile

Background: 
  Given the user is on the Profile section

@valid-file-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects a valid candidate profile file
  And the user clicks on the Upload button
  And the user waits for the upload process to complete
  Then the user should see a success confirmation message indicating the profile was uploaded successfully

Examples:
  | valid_candidate_profile_file |
  | valid_candidate_profile.pdf   |
  | valid_candidate_profile.docx  |

@valid-upload-candidate 
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects the <candidate_profile_file>
  And the user clicks on the Upload button
  And the user waits for the upload to complete and confirms success
  Then the <profile_number> profile uploads successfully with a confirmation message
  And both profiles are listed in the Profile section

Examples:
  | candidate_profile_file               | profile_number |
  | first valid candidate profile file    | first          |
  | second valid candidate profile file   | second         |

  @upload-candidate-profile
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file in a supported format
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message appears, indicating the profile was uploaded successfully

    Examples:
      | candidate_profile_file |
      | valid_candidate_profile.pdf |
      | valid_candidate_profile.docx |

  @upload-long-filename
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects the candidate profile file "<candidate_profile_file>"
    And the user clicks the Upload button
    And the user waits for the upload process to complete
    Then the user should see a success confirmation message indicating the profile was uploaded successfully

    Examples:
      | candidate_profile_file                                         |
      | This_is_a_very_long_filename_for_a_candidate_profile_document.pdf |

@upload-candidate-profile
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects a candidate profile file with metadata
  And the user clicks on the Upload button
  And the user waits for the upload process to complete
  Then the metadata should be displayed correctly in the Profile section

Examples:
  | candidate_profile_file |
  | <candidate_profile_file> |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the recruiter clicks on the upload (cloud) icon
    And the file selection dialog opens
    And the recruiter selects a candidate profile file with a valid extension <file_extension>
    And the recruiter clicks on the Upload button
    Then the upload process should complete without errors
    And a success confirmation message should appear indicating the profile was uploaded successfully

    Examples:
      | file_extension |
      | RTF            |

@successful_upload
Scenario Outline: Upload New Candidate Profile
  When the Hiring Manager clicks on the upload icon
  And the Hiring Manager browses and selects a valid candidate profile file
  And the Hiring Manager clicks on the Upload button
  And the Hiring Manager waits for the upload process to complete
  Then the confirmation message should be displayed indicating the profile was uploaded successfully

Examples:
  | valid_candidate_profile_file |
  | <valid_candidate_profile_file> |

  @feature_upload_new_candidate_profile
  @upload-new-profile
  Scenario Outline: Upload New Candidate Profile
    When the Hiring Manager clicks on the upload (cloud) icon
    And the Hiring Manager browses and selects a candidate profile file in a different format
    And the Hiring Manager clicks on the Upload button
    And the Hiring Manager waits for the upload process to complete
    Then a success confirmation message appears, indicating the profile was uploaded successfully

    Examples:
      | candidate_profile_file |
      | <candidate_profile_file> |

@multiple-file-upload
Scenario Outline: Upload New Candidate Profile
  When the admin clicks on the upload (cloud) icon
  And the admin browses and selects multiple valid candidate profile files
  And the admin clicks on the Upload button
  And the admin waits for the upload process to complete and confirms success for each file
  Then all uploaded profiles should be listed in the Profile section

Examples:
  | candidate_profile_files |
  | file1.pdf              |
  | file2.pdf              |
  | file3.pdf              |
