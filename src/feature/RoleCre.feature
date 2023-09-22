Feature: Role Creation

Scenario Outline: Verify Role Creation with Multiple sets of Data

Given User Should on Ranford Home Page

When User Enter Login details

Then User Click on Role button

When User Click on New Role and enter "<RoleName>" and "<RoleType>"

Then User Close the Application

Examples:

          | RoleName | RoleType |
          | Cashierhydd | E |
          | Managerhydd | E |
          | Tellerhydd | E |