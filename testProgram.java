import java.util.Scanner;

public class testProgram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Please enter marks for English: ");
        int English = scanner.nextInt();

        System.out.print("Please enter marks for Math: ");
        int Math = scanner.nextInt();

        System.out.print("Please enter marks for Accounting: ");
        int Accounting = scanner.nextInt();

        // Check if the student passed
        if (hasPassed(English, Math, Accounting)) {
            System.out.println("The student has passed.");
            System.out.println("Grade in English: " + getGrade(English));
            System.out.println("Grade in Math: " + getGrade(Math));
            System.out.println("Grade in Accounting: " + getGrade(Accounting));
        } else {
            System.out.println("The student has failed.");
        }

        scanner.close();
    }

    // Method to determine if the student has passed
    public static boolean hasPassed(int English, int Math, int Accounting) {
        int passCount = 0;
        if (English >= 40) passCount++;
        if (Math >= 40) passCount++;
        if (Accounting >= 40) passCount++;
        return passCount >= 2;
    }

    // Method to determine the grade based on marks
    public static String getGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else if (marks >= 50) {
            return "E";
        } else {
            return "F";
        }
    }
}
