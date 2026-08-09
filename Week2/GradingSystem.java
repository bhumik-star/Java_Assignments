import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");
        int marks = input.nextInt();
        String Grade = classifyMark(marks);
        System.out.println("Your Grade is "+Grade);
        input.close();
    }

    public static String classifyMark(int marks) {
        if (marks < 0 || marks > 100) {
            return ("Invalid Marks");
        } else if (marks >= 90) {
            return ("A");
        } else if (marks >= 80) {
            return ("B");
        } else if (marks >= 70) {
            return ("C");
        } else if (marks >= 60) {
            return ("D");
        } else {
            return ("F");
        }
    }
}
