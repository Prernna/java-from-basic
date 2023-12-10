import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCredits = 0;
        double totalGradePoints = 0;

        // Array to store the grades for 5 exams
        char[] grades = new char[5];
        
        // Taking input for 5 exams
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter grade for exam " + (i + 1) + " (A/B/C/D/F): ");
            grades[i] = scanner.next().charAt(0);
        }

        // Calculating total credits and grade points
        for (int i = 0; i < 5; i++) {
            double credits = 0;
            double gradePoints = 0;

            switch (grades[i]) {
                case 'A':
                    credits = 4.0;
                    gradePoints = 4.0;
                    break;
                case 'B':
                    credits = 3.0;
                    gradePoints = 3.0;
                    break;
                case 'C':
                    credits = 2.0;
                    gradePoints = 2.0;
                    break;
                case 'D':
                    credits = 1.0;
                    gradePoints = 1.0;
                    break;
                case 'F':
                    credits = 0.0;
                    gradePoints = 0.0;
                    break;
                default:
                    System.out.println("Invalid grade entered!");
            }

            totalCredits += credits;
            totalGradePoints += gradePoints;
        }

        // Calculating CGPA
        double cgpa = totalGradePoints / totalCredits;

        System.out.println("CGPA: " + cgpa);

        scanner.close();
    }
}
