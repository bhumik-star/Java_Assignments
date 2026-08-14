/*55. TASK 8 - LEETCODE 2011: FINAL VALUE AFTER PERFORMING OPERATIONS
------------------------------------------------------------------

Required Week 2 filename: FinalValueOperations.java

Problem summary:

The variable X starts at 0. Each operation increments or decrements X. Valid
operations are:

    ++X
    X++
    --X
    X--

Implement the required LeetCode method after arrays and enhanced for loops are
introduced. For Week 2, first solve an equivalent console version:

- Read the number of operations.
- Read each operation as a String.
- Use a loop and conditional logic to update X.
- Display the final value.

Important observation:

- If an operation contains '+', increment X.
- Otherwise, decrement X.

When the array version is revisited, the method will have this form:

    class Solution {
        public int finalValueAfterOperations(String[] operations) {
            // Process every operation and return the final value.
        }
    }

This staged approach practices Week 2 control flow without requiring array
syntax before Week 3. FinalValueOperations.java is the required Week 2 console
program. The official LeetCode array-method submission will be revisited in
Week 3 after arrays and enhanced for loops are taught.
 */

import java.util.Scanner;

public class FinalValueOperation {
    public static void start(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number X : ");
        int num = input.nextInt();
        input.nextLine();
        do{
            System.out.print("Enter any operation to implement on X: \n+ = increment by 1\n- = decrement by 1\n 0 = close: ");
            String opp = input.next();
            if(opp.equals("+")){
                num++;
            }
            else if(opp.equals("-")){
                num--;
            }
            else if(opp.equals("0")){
                break;
            }
            else{
                System.out.println("Enter a valid operation: ");
            }
        }while(true);
        System.out.print("Final Value: "+num);
        input.close();
    }
}
