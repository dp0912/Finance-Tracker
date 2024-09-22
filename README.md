# Finance Tracker App

## Description
The Finance Tracker App is a Java-based application that allows users to create accounts, track their income and expenses, and manage their financial records. It provides a simple command-line interface for managing user accounts and viewing transactions.

## Features
- **Create New User**: Users can create a new account by entering their name, address, mobile number, and annual income.
- **Select Existing User**: Users can select an existing account to manage their finances.
- **Add Expense**: Users can add expenses with details including amount, description, and date.
- **View Expenses**: Users can view all recorded transactions associated with their account.

## Getting Started

### Prerequisites
- **Java Development Kit (JDK)**: Version 8 or higher
- A command-line interface to run the Java application

### Usage
1. **Creating a New User**: 
   - Choose option 1 from the main menu.
   - Enter the required details: name (no digits allowed), address, mobile number (10 digits), and annual income (0 or greater).
2. **Selecting an Existing User**: 
   - Choose option 2 from the main menu.
   - Enter the user's name and mobile number.
3. **Adding an Expense**: 
   - After selecting a user, choose option 1 from the manage user menu.
   - Enter the expense details: amount, description, and date (YYYY-MM-DD format).
4. **Viewing Expenses**: 
   - After selecting a user, choose option 2 from the manage user menu to view all recorded transactions.
5. **Exiting**: 
   - Choose option 3 from the main menu to quit the application.

## Code Structure
- `FinanceApp.java`: Main program logic for managing user accounts and transactions.
- `User.java`: Defines the User class with methods for handling user details and financial tracking.
- `FinanceTracker.java`: Manages the list of transactions for a user.
- `Transaction.java`: Represents individual transactions, including type, amount, description, and date.

## Validation Rules
- **Name**: Only alphabetic characters are allowed.
- **Mobile Number**: Must be exactly 10 digits.
- **Annual Income**: Must be 0 or greater.
- **Expense Date**: Must be in YYYY-MM-DD format.


