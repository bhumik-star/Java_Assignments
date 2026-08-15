/*56. TASK 9 - SENTINEL-CONTROLLED MARKS PROCESSOR
------------------------------------------------

Required filename: MarksProcessor.java

Write a program that repeatedly reads marks. Enter -1 to end input. The
sentinel must stop the loop and must not be included as a mark.

After input ends, display:

- number of valid marks entered
- sum of the marks
- average mark
- highest mark
- number of passes (mark >= 50)
- number of failures (mark < 50)

Requirements:

- Use -1 as the sentinel.
- Accept ordinary marks only from 0 through 100.
- Reject an invalid value and continue without including it in any result.
- Avoid division by zero when the first input is -1.
- Use static boolean isValidMark(int mark).
- Use at least two additional methods to print or calculate results.
- Dry-run this input sequence:

            70, 45, 105, 80, -1
 */
import java.util.Scanner;

public class MarksProcessor {
    public static boolean isValidMark(int mark) {
        return mark >= 0 && mark <= 100;
    }

    public static double calculateAverage(int sum, int count) {
        if (count == 0) {
            return 0;
        }
        return (double) sum / count;
    }

    public static void printResults(int count, int sum, double average, int highest, int pass, int fail) {
        System.out.println("\nNumber of valid marks entered: " + count);
        System.out.println("Sum of the marks: " + sum);
        System.out.println("Average mark: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Number of passes: " + pass);
        System.out.println("Number of failures: " + fail);
    }

    public static void start() {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int highest = 0;
        int pass = 0;
        int fail = 0;

        System.out.println("Enter marks (enter -1 to end): ");

        while (true) {
            System.out.print("Enter a mark: ");
            int mark = input.nextInt();

            if (mark == -1) {
                break;
            }

            if (isValidMark(mark)) {
                count++;
                sum += mark;

                if (mark > highest) {
                    highest = mark;
                }

                if (mark >= 50) {
                    pass++;
                }
                else {
                    fail++;
                }
            }
            else {
                System.out.println("Invalid mark! Enter a value from 0 to 100.");
            }
        }

        double average = calculateAverage(sum, count);

        if (count == 0) {
            highest = 0;
        }

        printResults(count, sum, average, highest, pass, fail);

        input.close();
    }
}