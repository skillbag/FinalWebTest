Feature: Functioning of the online learning platform
 #Позитивный тест1
  Scenario: Enter the online platform and exit
    Given URL online platform
    Then Close site
#позитивный тест2
  Scenario: Enter the online platform and chose all courses
    Given URL online platform
    Then Select All Courses
#позитивный тест3
  Scenario: Enter the online platform and chose courses start IT
    Given URL online platform
    Then Select All Courses
    And Select start IT
#позитивный тест4
  Scenario: Enter the online platform and chose courses start IT and enroll in a course
    Given URL online platform
    Then Select All Courses
    And Select start IT
    And Click button enroll in a courses
 #позитивный тест5
  Scenario: open online messenger assistant
    Given URL online platform
    Then Click online messenger assistant
#негативный тест6
  Scenario: Enter the online platform and send incorrect data  a request for a consultation
    Given URL online platform
    Then insert Name
    Then insert a non-existent email in the feedback form
    And insert a non-existent number telephone
    Then click on the button to get a consultation
 #позитивный тест7
  Scenario: Enter the online platform and send correct data  a request for a consultation
  Given URL online platform
    Then insert Name
    Then insert a valid email
    And insert a valid telephone
    Then click on the button to get a consultation
#позитивный тест8
  Scenario: View the real stories of our students
    Given URL online platform
    Then Click button read history
#позитивный тест9
  Scenario: View the real stories of our students and share
    Given URL online platform
    Then Click button read history
    And click social telegram share button
#позитивный тест10
  Scenario: website logo check
    Given URL online platform
    Then Select All Courses
    And Click Logo
#позитивный тест11
    Scenario: Open social networks in footer
      Given URL online platform
      Then Click Habr
      Then Click Vkontakte
      And Click Youtube
#позитивный тест12
  Scenario: The difference between profession, specialization
    Given URL online platform
    Then Сlick programming
    And Click difference between profession, specialization
#позитивный тест13
  Scenario: Open a course and view course description
    Given URL online platform
    Then Сlick programming
    Then Click java QA engineer profession
    And Click introduction and collapse tab
    And Click test design and collapse tab
#негативный тест14
  Scenario: Disagreement with the provision of personal data
  Given URL online platform
    Then Click is free
    Then Сhoose the first master class how to become a tester
    And Submit the form with an email to participate
#позитивный тест15
  Scenario: Search by past materials in the tab for free
    Given URL online platform
    Then Click is free
    Then Click past events
    And Write java in the search engine and go to the first news about java
#Позитивный тест16
  Scenario: Launch a webinar on how to become a developer
    Given URL online platform
    Then Click Blog and webinar
    And launching a webinar analytic date scan
#Позитивный тест17
  Scenario: run video testimonial of students
    Given URL online platform
    Then Сlick programming
    Then Choose java course developer
    And Click on the real story of our students
#Позитивный тест18
  Scenario: Apply for job
    Given URL online platform
    Then click on vacancies
    And Click send resume
#Позитивный тест19
  Scenario: information about the teacher
    Given URL online platform
    Then go to higher education and choose a course
    And Click on teacher
#Позитивный тест20
  Scenario: Using a skillfactory link on a third-party resource
    Given URL online platform
    Then Click Habr
    And click the skillfactory link in the Habr group
#Позитивный тест21
  Scenario: view multiple courses and apply
    Given URL online platform
    And Select All Courses
    Then Open the intensive python developer course and click the course program
    Then go to the python tester course and see the faq about the course
    And enter the C++ developer course, watch the short program and open the application form
#Позитивный тест22
  Scenario: read the student's story and follow the link to the course and display the enrollment form
    Given URL online platform
    Then click on the student's story
    And follow the link to the course and sign up