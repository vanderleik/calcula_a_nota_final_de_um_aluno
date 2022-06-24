package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class FinalGradeProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Enter student name: ");
        student.name = sc.nextLine();
        double grade1, grade2, grade3, finalGrade;
        System.out.println("Enter student grade to: ");
        System.out.print("First quarter: ");
        grade1 = sc.nextDouble();
        System.out.print("Second quarter: ");
        grade2 = sc.nextDouble();
        System.out.print("Third quarter: ");
        grade3 = sc.nextDouble();

        finalGrade = student.finalGrade(grade1, grade2, grade3);
        String finalResult = student.finalResult(finalGrade);

        System.out.println();
        System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
        System.out.println(finalResult);
        if ("FAILED".equals(finalResult)) {
            double missing = student.missing(finalGrade);
            System.out.printf("MISSING: %.2f POINTS", missing);
        }
        sc.close();
    }
}
