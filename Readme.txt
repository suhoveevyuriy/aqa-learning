# Student Grades Validator

## Description

Student Grades Validator is a simple Java console application for validating a student's grade using the Ukrainian 12-point grading system.

## Functionality

* Enter the student's name.
* Enter the student's grade.
* Validate that the grade is between **1** and **12**.
* If the grade is invalid, the program asks the user to enter it again.
* Display the student's achievement level.

## Grade Levels

| Grade | Level      |
| ----- | ---------- |
| 1–3   | LOW    |
| 4–6   | MIDDLE     |
| 7–9   | GOOD |
| 10–12 | EXCELLENT       |

## Example

```text
Enter student name:
Ivan

Enter grade (1-12):
15

Invalid grade! Please enter a grade from 1 to 12.

Enter grade (1-12):
10

===== Student Report =====
Name: Ivan
Grade: 10
Level: HIGH
```

## Technologies

* Java
* OOP
* Enum
* Scanner
