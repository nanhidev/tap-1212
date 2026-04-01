
Feature: CreateJobOpening_positive @feature_user_login

Background: 
  Given the user is on the Dashboard

@navigate_to_job_opening
Scenario Outline: Create Job Opening
  When the user clicks on the "Job Opening" option in the side navigation
  Then the Job Opening screen should be displayed
  And the "Add Job Opening" button should be visible

Examples:
  | action                          |
  | Click on the "Job Opening" option in the side navigation |

  @job-opening-form
  Scenario Outline: Create Job Opening
    When the user clicks on the "Add Job Opening" button
    Then the Create New Job Opening form should be opened
    And the "Save" and "Cancel" buttons should be displayed

  Examples:
    | action                       |
    | Add Job Opening              |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role
  And the recruiter selects a Location
  And the recruiter enters Minimum Experience
  And the recruiter enters Maximum Experience
  And the recruiter enters Qualification
  And the recruiter enters Short Job Description
  And the recruiter enters Responsibilities
  And the recruiter clicks on Save
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | Job Role          | Location   | Minimum Experience | Maximum Experience | Qualification       | Short Job Description | Responsibilities |
  | Software Engineer  | New York   | 2                  | 5                  | Bachelor's Degree    | a * 100              | a * 100          |

@create-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects <job_role> as the Job Role
  And the recruiter selects <location> as the Location
  And the recruiter enters <minimum_experience> as the Minimum Experience
  And the recruiter leaves Maximum Experience blank
  And the recruiter enters <qualification> as the Qualification
  And the recruiter enters <short_job_description> as the Short Job Description
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | job_role          | location   | minimum_experience | qualification       | short_job_description                                                                 |
  | Software Engineer  | New York   | 2                  | Bachelor's Degree    | This is a short job description that outlines the responsibilities and requirements of the position. |

@valid-job-opening
Scenario Outline: Create Job Opening
  Given the admin selects a Job Role as <job_role>
  And the admin selects a Location as <location>
  And the admin enters Minimum Experience as <min_experience>
  And the admin enters Maximum Experience as <max_experience>
  And the admin selects Employment Type as <employment_type>
  And the admin selects Work Mode as <work_mode>
  When the admin clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | job_role         | location   | min_experience | max_experience | employment_type | work_mode |
  | Software Engineer | New York   | 2              | 5              | Full-time       | Remote    |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects the Job Role <job_role>
    And the recruiter selects the Location <location>
    And the recruiter enters the Minimum Experience <minimum_experience>
    And the recruiter enters the Maximum Experience <maximum_experience>
    And the recruiter enters the Tags <tags>
    And the recruiter selects the Vendor <vendor>
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

  Examples:
    | job_role          | location   | minimum_experience | maximum_experience | tags           | vendor     |
    | Software Engineer  | New York   | 2                  | 5                  | Urgent, Tech   | Vendor A   |

@valid-job-opening-creation
Scenario Outline: Create Job Opening
  When the recruiter selects "<job_role>" as the Job Role
  And the recruiter selects "<location>" as the Location
  And the recruiter enters "<minimum_experience>" as Minimum Experience
  And the recruiter enters "<maximum_experience>" as Maximum Experience
  And the recruiter enters "<qualification>" as Qualification
  And the recruiter enters "<short_job_description>" as Short Job Description
  And the recruiter enters "<responsibilities>" as Responsibilities
  And the recruiter enters "<primary_skills>" as Primary Skills
  And the recruiter enters "<secondary_skills>" as Secondary Skills
  And the recruiter enters "<total_openings>" as Total Openings
  And the recruiter selects "<employment_type>" as Employment Type
  And the recruiter selects "<duration>" as Duration
  And the recruiter selects "<work_mode>" as Work Mode
  And the recruiter selects "<status>" as Status
  And the recruiter enters "<department>" as Department
  And the recruiter enters "<industry_type>" as Industry Type
  And the recruiter enters "<tags>" as Tags
  And the recruiter selects "<vendors>" as Vendors
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | job_role          | location   | minimum_experience | maximum_experience | qualification        | short_job_description       | responsibilities           | primary_skills | secondary_skills | total_openings | employment_type | duration   | work_mode | status | department   | industry_type         | tags          | vendors   |
  | Software Engineer  | New York   | 2                  | 5                  | Bachelor's Degree     | Short job description a * 100 | Responsibilities a * 100 | Java, Python   | JavaScript      | 3              | Full-time      | 6 months  | Remote    | Active | Engineering   | Information Technology | Tag1, Tag2   | Vendor1   |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role as "<job_role>"
  And the recruiter selects a Location as "<location>"
  And the recruiter enters Minimum Experience as "<min_experience>"
  And the recruiter enters Maximum Experience as "<max_experience>"
  And the recruiter selects a valid Status as "<status>"
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | job_role         | location   | min_experience | max_experience | status |
  | Software Engineer | New York   | 2              | 5              | Open   |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects <job_role> as the Job Role
    And the recruiter selects <location> as the Location
    And the recruiter enters <minimum_experience> as Minimum Experience
    And the recruiter enters <maximum_experience> as Maximum Experience
    And the recruiter enters <responsibilities> as Responsibilities
    And the recruiter enters <primary_skills> as Primary Skills
    And the recruiter enters <secondary_skills> as Secondary Skills
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

  Examples:
    | job_role          | location   | minimum_experience | maximum_experience | responsibilities                                               | primary_skills         | secondary_skills         |
    | Software Engineer  | New York   | 2                  | 5                  | Develop software applications, Collaborate with cross-functional teams | Java, Python, SQL      | JavaScript, HTML, CSS    |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects a Job Role
    And the recruiter selects a Location
    And the recruiter enters Minimum Experience
    And the recruiter enters Maximum Experience
    And the recruiter selects a valid Duration
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | Job Role          | Location    | Minimum Experience | Maximum Experience | Duration    |
      | Software Engineer  | New York    | 2                  | 5                  | 6 months    |
