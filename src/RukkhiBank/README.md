RukkhiBankApp

RukkhiBankApp is a Java-based console application that simulates a banking system. 
It allows users to perform essential banking operations 
like creating accounts, depositing, withdrawing funds, checking balances, and managing accounts 
using a MySQL database for data persistence. 
The app also includes an admin panel with password-protected access for managing accounts.

📌 Purpose

The purpose of this project is to demonstrate:
•	How to build a console-based banking application using Java.
•	Database integration with MySQL for data storage and retrieval.
•	Implementation of user roles (customer and admin) with restricted access to certain features.
•	Practical usage of Object-Oriented Programming (OOP) concepts and JDBC.

🚀 Features

General Features
•	Account Management:
•	Create new accounts (Savings/Current).
•	View account details and balance.
•	Delete accounts (Admin only).
•	Transactions:
•	Deposit funds into an account.
•	Withdraw funds from an account.
•	Check account balance.
•	Database Integration:
•	Store all account details and transactions in a MySQL database.
•	Persistent data across sessions.

Admin Features
•	View all accounts in the system.
•	Delete accounts with admin password verification.

💻 How to Use

Prerequisites
1.	Install Java Development Kit (JDK) 8 or higher.
2.	Install MySQL Server and MySQL Workbench.
3.	Configure your MySQL database:
•	Create a database named RukkhiBank.
•	Create a table BankAccount with the following structure:

CREATE TABLE BankAccount (
accountNumber VARCHAR(20) PRIMARY KEY,
accountHolderName VARCHAR(100),
accountType VARCHAR(20),
email VARCHAR(100),
balance DOUBLE
);



Running the Application
1.	Clone or download the project.
2.	Open the project in your preferred IDE (e.g., IntelliJ IDEA or Eclipse).
3.	Configure the MySQL database connection in RukkhiBankJdbc:
•	Update the url, username, and password in the RukkhiBankJdbc class to match your MySQL configuration.
4.	Run the RukkhiBankApp class to start the application.

🗂️ Menu Options

Customer Options
1.	Create Account:
•	Enter details like account holder name, account type (Savings/Current), account number, and email.
2.	Deposit Cash:
•	Enter the account number and amount to deposit.
3.	Withdraw Cash:
•	Enter the account number and amount to withdraw.
4.	View Balance:
•	Enter the account number to view the current balance.
5.	Exit:
•	Safely exit the application.

Admin Options
•	Enter the admin password to access:
•	View All Accounts:
•	Displays all accounts stored in the database.
•	Delete Account:
•	Delete an account using its account number.

🛠️ Technologies Used
•	Programming Language: Java
•	Database: MySQL
•	JDBC: Java Database Connectivity
•	Tools: IntelliJ IDEA, MySQL Workbench

📝 Future Enhancements
•	Implement transaction history for each account.
•	Add a GUI using JavaFX or a web interface using Spring Boot.
•	Secure admin login with hashed passwords.
•	Enable account-to-account fund transfers.

📄 License

This project is open-source and free to use. Modify it as you like to fit your requirements!
 🚀