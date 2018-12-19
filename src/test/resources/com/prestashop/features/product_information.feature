Feature: Product Information

Background:
   Given the user is on the home page
   When the user selected Printed Summer Dress


Scenario: Display the correct product name
   
   Then product information page should be displayed
   And product name should be Printed Summer Dress
  
  
 @temp 
 Scenario: Default count and size information
   Then correct default count size should be displayed
     