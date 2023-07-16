@US_03
  Feature: US_03 Users should be able to send messages from the page (contact)
      Background:
        Given user goes to "MosUrl"
        When user clicks on Contact button
    @US_03_TC_001
    Scenario: TC01_your_name field can write any character
      And User fill out your name "Ahmet01*"
      And user click on your name field
      Then close the application
    @US_03_TC_002
    Scenario: TC02_your_name containing any character and cannot be left blank must be entered
      And user click on your name field
      And user click your email
      Then close the application
    @US_03_TC_003
    Scenario: TC03_The user must enter their email address.
      And user click your email
      And User click subject
      Then close the application
    @US_03_TC_004
    Scenario: TC04_The email address must contain the characters "@" and ".".
      And User fill out your name "Ahmet01*"
      And user fill out your email fill out "sdkahmtshn"
      And user fill out subject "deneme"
      And user fill out message "deneme01"
      And user click send message
      Then close the application
    @US_03_TC_005
    Scenario: TC05_The user must enter a subject about the message they will write
      And user click subject field
      And user click message
      Then close the application
    @US_03_TC_006
    Scenario: TC06_The user able to write a message.
      And user fill out message "deneme01"
      And close the application
    @US_03_TC_007
    Scenario: TC07_The user must write a message. The user must not send empty message
      And user click message
      And user click subject field
      Then close the application
    @US_03_TC_008
    Scenario: TC08_The user should be able to send their message.
      And User fill out your name "Ahmet01*"
      And user fill out your email "sdkahmtshn@gmail.com"
      And user fill out subject "deneme"
      And user fill out message "deneme01"
      And user click send message
      Then close the application