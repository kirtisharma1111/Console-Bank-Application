Console Bank Application

A simple Java-based Banking Management System built using Object-Oriented Programming principles. This application allows users to manage bank accounts through a console interface, perform transactions, and maintain account records.

Features
Open new bank accounts
Deposit money
Withdraw funds with balance validation
Transfer money between accounts
View account transaction statements
Search accounts by customer name
List all accounts
Transaction history tracking
Unique account number generation (AC000001, AC000002, ...)
Tech Stack
Java
Collections Framework (List, Map)
OOP Concepts (Encapsulation, Abstraction, Interfaces)
Repository-Service Architecture
Java Streams API
Project Structure
domain/
├── Account
├── Customer
├── Transaction
└── Type

repository/
├── AccountRepository
├── CustomerRepository
└── TransactionRepository

service/
├── BankService
└── BankServiceImpl

app/
└── Main
Learning Outcomes
Designing a layered application architecture
Implementing CRUD-like operations using repositories
Working with Java Collections and Streams
Applying exception handling and validation
Building a complete console-based application using OOP principles
Future Enhancements
File/Database persistence
User authentication
Interest calculation for savings accounts
Transaction filtering and reporting
GUI/Web interface
