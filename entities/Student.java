package entities;

public class Student {
    public String name;
    public double grade;

    public double finalGrade(double grade1, double grade2, double grade3) {
        return grade1 + grade2 + grade3;
    }


    public String finalResult(double finalGrade) {
        return (finalGrade <= 60) ? "FAILED" : "PASS";
    }


    public double missing(double finalGrade) {
        return 60.0 - finalGrade;
    }
}
