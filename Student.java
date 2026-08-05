package HomeWork1.StudentGradesValidator;

public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }


    public boolean isValidGrade() {
        return grade >= 1 && grade <= 12;
    }

    public GradeLevel getLevel() {

        if (grade <= 3) {
            return GradeLevel.LOW;
        } else if (grade <= 6) {
            return GradeLevel.MIDDLE;
        } else if (grade <= 9) {
            return GradeLevel.GOOD;
        } else {
            return GradeLevel.EXCELLENT;
        }
    }
}