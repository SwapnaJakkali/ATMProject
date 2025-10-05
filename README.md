Problem Statement:-
Build a simple ATM Machine application in Java that allows users to perform basic banking operations such as checking balance, depositing money, withdrawing money, and viewing transaction history. The system should use predefined user accounts (with name, PIN, and balance) and allow users to securely perform transactions after verifying their credentials.

Features & Functionalities

Check Balance – Display the current balance of the logged-in user.

Deposit Money – Add a specified amount to the user's account balance.

Withdraw Money – Deduct a specified amount from the user's balance if sufficient funds are available.

Transaction History – Display all past transactions (deposits and withdrawals) for the logged-in user.

Exit Program – Safely close the application.


Data Structure
Accounts List (Predefined)
Each account is stored as an object with fields for name, PIN, and balance.

Example:
accounts = [
  {"name": "Ravi", "pin": 1234, "balance": 5000},
  {"name": "Priya", "pin": 2345, "balance": 7000},
  {"name": "Suresh", "pin": 3456, "balance": 10000},
  {"name": "Anita", "pin": 4567, "balance": 3000},
  {"name": "Kiran", "pin": 5678, "balance": 8500},
  {"name": "Meena", "pin": 6789, "balance": 12000},
  {"name": "Vamsi", "pin": 7890, "balance": 4500},
  {"name": "Rohit", "pin": 8901, "balance": 6000},
  {"name": "Sonia", "pin": 9012, "balance": 9000},
  {"name": "Neha", "pin": 1122, "balance": 11000}
]

Each account also stores a list of transaction strings:
transactions = ["Deposited ₹5000", "Withdrew ₹2000"]


Menu Example

===== ATM Machine =====
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Transaction History
5. Exit
Enter your choice:
