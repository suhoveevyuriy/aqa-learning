package HomeWork1.StudentGradesValidator;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("========= Student Grades Validator ==========");

        System.out.print("Enter student name please: ");
        String name = scanner.nextLine();

        Student student;

        while (true) {

            System.out.print("Enter grade from 1 to 12 please: ");

            int grade = scanner.nextInt();

            student = new Student(name, grade);

            if (student.isValidGrade()) {
                break;
            }

            System.out.println("Invalid grade! Please enter a grade from 1 to 12.\n");
        }

        System.out.println("\n===== Student Report =====");
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Level: " + student.getLevel());

    }
}