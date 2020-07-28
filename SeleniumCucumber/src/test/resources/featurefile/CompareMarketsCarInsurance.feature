Feature: Comparte Car Insurance Quotes
  @chrome
  Scenario: Compare Insurance Quote
    Given : I am at the home page
    When : I click on the Car Insurance search filter
    Then : I should be at compare car insurance page
    When : at compare care insurance page click on Compare Now link
    Then : I should be at "Welcome - Car Quote" page
    When : at quote page I enter "EHU94Z" as rego number
    And : at page click on Next button
    Then : I should be at "Car Registration state - Car Quote" page
    When : at Car registration state page I select state
 		Then : I should be at "Cover Type - Car Quote" page
 		When : at Cover Type select cover type as Comprehensive insurance
    Then : I should be at "Factory Options - Car Quote" page
    When : at factory optios page selected No to factory accessories fit
    Then : I should be at "Car Modifications - Car Quote" page
    When : at Car modification page I should select No 
    Then : I should be at "Unrepaired Accident or Hail Damage - Car Quote" page
    When : at unrepaired accident or hail damage page I should select No 
    Then : I should be at "Finance - Car Quote" page
    When : at finance car quote page I should select Yes 
    Then : I should be at "Use Type - Car Quote" page
    When : at user type car I should select Private and/or commuting to work only
    Then : I should be at "Currently Insured - Car Quote" page
    When : at currently insured page I should select No
    Then : I should be at "Annual Kilometres - Car Quote" page
    When : at annual kilometers page I enter "6000" driven for per year
    And : at annual kilometers page I click on Next button
    Then : I should be at "Cover Type - Car Quote" page
    When : at address page I should enter "2150"
    And  : at address page I should eneter "109-113 George street, Parramatta, NSW, 2150"
    And : at address page I click on Next button
   	Then : I should be at "Overnight Parking Type - Car Quote" page
   	When : at overnight parking page select parking type
   	Then : I should be at "Regular Driver Gender - Car Quote" page 
   	When : at driver gender I should select gender type
   	Then : I should be at "Regular Driver Date of Birth - Car Quote" page 
   	When : at regular driver date of birth I should able to enter "5" and "Mar" and "1990" 
   	And : at driver age page I should click on Next button
   	Then : I should be at "Regular Driver Employment - Car Quote" page 
   	When : at regular driver employment page I should select Employed full-time 
   	Then : I should be at "Regular Driver Licence Age - Car Quote" page
   	When : at regular driver licence age page I should enter age as "18"
   	And  : at regular driver licence age page I should click on next
   	Then : I should be at "Regular Driver Claims - Car Quote" page
   	When : at regular driver claim page select previous claim as No
   	Then : I should be at "Regular Driver No Claims Discount - Car Quote" page
   	When : at no claim discount page I should select rating1
   	Then : I should be at "Regular Driver Owns Another Car - Car Quote" page
   	When : at does drive have another car page I should select No
   	Then : I should be at "Youngest Driver - Car Quote" page
   	When : at youngest driver dirving page I should select No
   	Then : I should be at "Driver Option - Car Quote" page
   	When : at driver option page I should select all dirvers above AgeThirty
   	Then : I should be at "Applicant Details - Car Quote" page
   	When : at applicant details page I should enter "Vinay" as First Name "Kumar" as Last Name
   	And  : at applicant details page I should click on Next button
   	Then : I should be at "Commencement Date - Car Quote" page
   	When : at commencement date page I should select date as "Saturday, August 15, 2020"
   	And  : at commencement date page I should select terms of use
   	And  : at commencement date page I should click on quote page 
    Then : I should be at "Results - Car Quote" page
    Then : at results page I should find number of quotes with "Indicative quote based on 6,000 annual kilometres." and display the number on console.