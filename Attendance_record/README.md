# Employee Attendance System

 I build a console based attendance record system by implementing OOP concepts.

## What is project does?

 It weekly attendance records for employees.

 Each employee should be able to mark their attendance for 7 days (1 for present, 0 for 
 absent). 

 After storing the attendance, the program displays the employee’s basic 
 details, daily attendance, and total present days.

## Project Structure

 Main.java // Runs the program
 Person.java // Abstract base class with common fields
 Employee.java // Inherits from Person
 Markable.java // Interface to mark attendance
 AttendanceEmployee.java // Extends Employee, adds attendance logic

## OOP Concepts I Applied!
 
 Abstraction: Person is an abstract class with common methods for all people.
 Inheritance: Employee class extends Person.
 Interface: Markable interface defines methods for attendance marking.
 Aggregation: AttendanceEmployee has an array to store attendance data.
 Static Variable: employeeCount tracks the number of employees created.

##Program Fuctionality
 
 #Main Class
 
  Handles user input (name, ID, department, attendance).
  Creates AttendanceEmployee objects.
  Calls methods to display employee details and attendance.
  Prints total number of employees.

 #Person Class (abstract)

 Holds common fields: name, id
 Provides getter and setter methods
 Declares an abstract method showDetail() which must be implemented by child classes

 #Employee Class (extends Person)

 Adds department field
 Inherits name and id from Person
 Contains static variable employeeCount to keep track of how many employees are created
 Implements showEmployeeCount() to print total count
 Overrides showDetail() to display complete employee info

 #Markable Interface

 Declares markAttendance(int[] attendance) to set attendance
 Declares calculatePresentDays(int[] attendance) to count present days

 #AttendanceEmployee Class (extends Employee, implements Markable)

 Contains a private array attendanceArray to store 7 days of attendance (0 or 1)
 Implements markAttendance() to copy the attendance into the array
 Implements calculatePresentDays() to count number of present days
 Provides displayAttendance() to show the attendance array and total present days

## Working

 1. The program asks you to enter the details of 4 employees.
 2. For each employee:
    - You enter name, ID, department.
    - Then enter 7 values for attendance (0 = Absent, 1 = Present).
 3. The program:
    - Stores all the data.
    - Calculates the number of present days.
    - Displays each employee’s details and their attendance.
 4. Finally, it shows the total number of employees created.

