/*Required filename: LoopPatterns.java

Use nested loops to produce the following patterns for a user-entered size.

Pattern A for size 4:

    * * * *
    * * * *
    * * * *
    * * * *

Pattern B for size 4:

    *
    * *
    * * *
    * * * *

Pattern C for size 4:

    1
    1 2
    1 2 3
    1 2 3 4

Pattern D for size 4:

        * * * *
        * * *
        * *
        *

Pattern E for size 4:

        1
        2 2
        3 3 3
        4 4 4 4

Requirements:

- Complete at least two patterns: one rectangular or triangular star pattern
    and one number pattern.
- Create a separate static method for every completed pattern.
- Each method must receive size as a parameter.
- Reject a size less than 1 in main.
- For each completed pattern, identify the outer-loop responsibility and the
    inner-loop responsibility.
- State the time complexity in terms of size and justify it.
 */
import java.util.Scanner;
public class LoopPattern {
    public static void start(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number pattern size: ");
        int num = input.nextInt();
        patternA(num);
        System.out.println("Pattern A Done.");
        patternB(num);
        System.out.println("Pattern B Done.");
        patternC(num);
        System.out.println("Pattern C Done.");
        patternD(num);
        System.out.println("Pattern D Done.");
        patternE(num);
        System.out.println("Pattern E Done.");
       input.close();

    }
    public static void patternA(int num){
        for(int i =0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void patternB(int num){
        for(int i =1;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void patternC(int num){
        for(int i =0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.print("\n");
        }
    }
    public static void patternD(int num){
                for(int i =0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void patternE(int num){
                for(int i =1;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print((i)+" ");
            }
            System.out.print("\n");
        }
    }
}
