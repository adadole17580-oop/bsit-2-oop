import java.util.Scanner;

public class Main {

    static String studentId = "";
    static String firstName = "";
    static String lastName = "";
    static String course = "";
    static String section = "";

    static int midtermExamScore = 0;
    static int finalExamScore = 0;
    static int projectScore = 0;
    static int attendance = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        studentId = scanner.nextLine();

        System.out.print("Enter First Name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter Course: ");
        course = scanner.nextLine();

        System.out.print("Enter Section: ");
        section = scanner.nextLine();

        System.out.println();
        System.out.println("        STUDENT INFORMATION");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + firstName + " " + lastName);
        System.out.println("Course       : " + course);
        System.out.println("Section      : " + section);

        System.out.println();
        System.out.println("Please enter the following scores (out of 100):");
        System.out.println();

        System.out.print("Midterm Exam Score: ");
        midtermExamScore = scanner.nextInt();

        System.out.print("Final Exam Score  : ");
        finalExamScore = scanner.nextInt();

        System.out.print("Project Score     : ");
        projectScore = scanner.nextInt();

        System.out.print("Attendance (%)    : ");
        attendance = scanner.nextInt();

        int totalScore = midtermExamScore + finalExamScore + projectScore + attendance;
        double averageScore = (double) totalScore / 400 * 100;

        String remarks;
        if (averageScore < 75) {
            remarks = "FAILED";
        } else {
            remarks = "PASSED";
        }

        System.out.println();
        System.out.println("           STUDENT GRADE");
        System.out.println("Midterm Exam Score : " + midtermExamScore);
        System.out.println("Final Exam Score   : " + finalExamScore);
        System.out.println("Project Score      : " + projectScore);
        System.out.println("Attendance Score   : " + attendance);
        System.out.printf("Average Score     : %.2f", averageScore);
        System.out.println();
        System.out.println("Remarks          : " + remarks);

        scanner.close();
    }
}
