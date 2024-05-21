@contactUs
Feature: 
  ETQ user je souhaite envoyer un message

  @contactUsForm
  Scenario: je souhaite remplir le formulaire de contact
    Given Navigate to the url
    When Verify that home page is visible successfully
    Then Click on contactUs button
    And Verify that contact us message form "CONTACT US" is visible
    And Enter name "mouna"
    And Enter email address "mounaaloulou@gmail.com"
    And Enter the subject "Automation test request"
    And Enter the message "please send me the monthly newsletter"
    And click on Download folder button
    And Click on submit button
    And Click on OK button alert
    And Verify the success message is visible "Success! Your details have been submitted successfully"
    Then click on Home button
    
    
