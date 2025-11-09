# PROG2004 Assignment 1 - Health Service Appointment System

This repository contains the solution for **PROG2004 Assignment 1**, focusing on a health service appointment system implemented in Java. It demonstrates concepts of **object-oriented programming**, including **inheritance**, **polymorphism**, and **collection management**.


## Project Structure
The project consists of five core classes:
- `HealthProfessional.java`: Base class that defines common attributes (ID, name, department) and methods for health professionals.
- `GeneralPractitioner.java`: Subclass that inherits from `HealthProfessional` and adds a "clinic hours" attribute, representing a general practitioner.
- `Radiologist.java`: Subclass that inherits from `HealthProfessional` and adds an "equipment type" attribute, representing a radiologist.
- `Appointment.java`: Appointment class that manages patient information, time slots, and the associated doctor (supports polymorphic references to different doctor types).
- `AssignmentOne.java`: Main class that implements object creation, and appointment CRUD (create, read, update, delete) functionality, managing appointments via an `ArrayList`.


## Key Features
1. **Object Creation & Polymorphism**：
   - Capable of creating `GeneralPractitioner` and `Radiologist` objects, and using polymorphism to uniformly call the `printDetails()` method to output differentiated information.
2. **Appointment Management**：
   - Supports creating appointments (linking patients, time slots, and doctors), printing all appointment details, and canceling appointments by mobile number.
3. **Inheritance Hierarchy**：
   - `GeneralPractitioner` and `Radiologist` inherit the common attributes of `HealthProfessional` while extending their own unique attributes, demonstrating the code reusability of inheritance.


## Submission Progress
- **Commit 1**: Completed the design of the `HealthProfessional` base class, including attributes, constructors, and `get/set` methods.
- **Commit 2**: Implemented the `GeneralPractitioner` and `Radiologist` subclasses, overriding the `printDetails()` method to achieve polymorphism.
- **Commit 3**: Completed the development of the `Appointment` class, supporting patient information and doctor association.
- **Commit 4**: Implemented appointment creation, listing, and cancellation functions in `AssignmentOne`, managing appointments through an `ArrayList`.


## How to Run
1. Clone this repository to your local machine.
2. Open the project in IntelliJ IDEA (or any Java IDE).
3. Run `AssignmentOne.java` to execute the program.
   - It will first print details of 3 General Practitioners and 2 Radiologists.
   - Then, it will demonstrate appointment creation, listing, and cancellation.


## Video Explanation Link
https://scuonline-my.sharepoint.com/:v:/g/personal/h_li_81_student_scu_edu_au/EU4uPopJH4lOjXXOGTuCPj0B9MVW9besqpzB87WtblW4eg?e=YRxBuk

## GitHub Repository
https://github.com/Alex-Li-bit/HaoranLi-A1
