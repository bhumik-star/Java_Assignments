/*57. TASK 10 - MODULAR NUMBER ANALYZER
-------------------------------------

Required filename: NumberAnalyzer.java

Build one program that reads an integer and produces a small analysis report.
The purpose is to practise designing, calling, and tracing multiple methods.

Create exactly these methods:

        static int readNumber(Scanner input)
        static boolean isEven(int number)
        static boolean isPositive(int number)
        static int absoluteValue(int number)
        static int countDigits(int number)
        static int sumDigits(int number)
        static void printReport(
                        int number,
                        boolean even,
                        boolean positive,
                        int digitCount,
                        int digitSum)

Required flow in main:

1. Create the Scanner.
2. Call readNumber and store the returned number.
3. Call isEven and store its result.
4. Call isPositive and store its result.
5. Call absoluteValue before digit processing.
6. Call countDigits with the absolute value.
7. Call sumDigits with the absolute value.
8. Call printReport with all calculated results.
9. Close the Scanner.

Additional requirements:

- countDigits and sumDigits must each use a loop.
- Treat 0 as a one-digit number.
- Test positive, negative, and zero inputs.
- Draw the active call stack when main calls countDigits.
- Explain why local variables in countDigits are not directly available to
    sumDigits or printReport.

Optional stack-depth extension:

Create static int analyzeMagnitude(int number) that calls absoluteValue and
then countDigits. Trace the deeper call sequence:

        main -> analyzeMagnitude -> absoluteValue
        main -> analyzeMagnitude -> countDigits
 */

import java.util.Scanner;

public class NumberAnalyser {
    
    static int readNumber(Scanner input) {
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        return number;
    }
    
    static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    static boolean isPositive(int number) {
        if(number > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    static int absoluteValue(int number) {
        if(number < 0) {
            return -number;
        }
        else {
            return number;
        }
    }
    
    static int countDigits(int number) {
        int count = 0;
        int temp = number;
        
        if(temp == 0) {
            return 1;
        }
        
        while(temp > 0) {
            count = count + 1;
            temp = temp / 10;
        }
        
        return count;
    }
    
    static int sumDigits(int number) {
        int sum = 0;
        int temp = number;
        
        while(temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
        
        return sum;
    }
    
    static void printReport(int number, boolean even, boolean positive, int digitCount, int digitSum) {
        System.out.println("\n--- Analysis Report ---");
        System.out.println("Number: " + number);
        System.out.println("Even: " + even);
        System.out.println("Positive: " + positive);
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Digit Sum: " + digitSum);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = readNumber(input);
        boolean even = isEven(number);
        boolean positive = isPositive(number);
        int absValue = absoluteValue(number);
        int digitCount = countDigits(absValue);
        int digitSum = sumDigits(absValue);
        
        printReport(number, even, positive, digitCount, digitSum);
        
        input.close();
    }
}
