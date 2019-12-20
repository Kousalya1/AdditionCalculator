Feature: Propine Addition Calculator

  Background: 
    Given user is on Addition Calculator Page

  Scenario Outline: Add two valid numbers and verify the results
    When title of the addition calculator page is "Propine Addition Calculator"
    Then user enters valid numbers "<FirstNumber>" and "<SecondNumber>" and checks the result successfully

    Examples: 
      | FirstNumber         | SecondNumber      |
      |                  21 |                16 |
      |               33.58 |                50 |
      |                  75 |             88.99 |
      |               46.79 |             21.58 |
      |                   0 |                 0 |
      |                   0 |                12 |
      |                  34 |                 0 |
      | 198.123456789987988 | 67.98764268877897 |


  Scenario Outline: Add two invalid numbers and verify the results
    When title of the addition calculator page is "Propine Addition Calculator"
    Then user enters invalid numbers "<FirstNumber>" and "<SecondNumber>" and checks the result as NaN

    Examples: 
      | FirstNumber | SecondNumber |
      | GAFHASG     | KFSAJKF      |
      | jgkdajg     | jgdgh        |
      |          75 | vbdkg        |
      | jjbbjd      |           67 |
      | null        |           78 |
      |          90 | null         |
      | gwgf        |        89.65 |
      |       65.23 | gtduy        |
      | @#%^&*      |       235235 |
      |        3534 | $#%$*(&*)    |
      | %#$^%&*()!  | !@#$%^&*()_+ |
      | %$#  ^&*    | 3%#%    56   |
      | @$!543      | 432@#%$#%    |
      | @#$@RGEREG  | EFEwrT#@%#^  |
      | efwegw      | #!@$#@^      |
      | #%#@$^#$^   | TWErutyT     |
      |             |              |
      |        2423 |              |
      |             |         8408 |
      | @$@#%       |              |
      |             | %#$&%&       |
      | AET$#Sda    |              |
      |             | tet#$TET     |


  Scenario: Verify Logo, Subtitle labels, Placeholders
    When title of the addition calculator page is "Propine Addition Calculator"
    Then logo of the application should be displayed
    And subtitle should be displayed
    And label for First number, Second number, and Results should be displayed
    And placeholder for First number and Second number should be displayed


  # This scenario will fail due to Bug #1: Submit button is not in the disabled state when not entering numbers to add
  Scenario: Check submit button
    When title of the addition calculator page is "Propine Addition Calculator"
    Then submit button should be in disabled state when not entering numbers to add


  # This scenario will fail due to Bug #2 First number and second number values should be in the text box even after clicking on Submit button to see the result
  Scenario: Check the first number and second number value
    When title of the addition calculator page is "Propine Addition Calculator"
    Then user enters valid numbers "12" and "45" and checks the result successfully
    And first number and second number values should be in the text box
