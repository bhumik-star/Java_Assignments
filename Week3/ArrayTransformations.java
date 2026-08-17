/*65. TASK 3 - ARRAY TRANSFORMATIONS
---------------------------------

Required filename: ArrayTransformations.java

Implement:

    static void reverseInPlace(int[] values)
    static int[] reversedCopy(int[] values)
    static int removeValue(int[] values, int target)
    static int[] runningSum(int[] values)

Requirements:

- Use two pointers for in-place reversal.
- Do not call a library reverse method.
- Explain original versus logical length after removeValue.
- Compare mutation, returned copy, time, and auxiliary space. */

import java.util.Scanner;

public class ArrayTransformations {
    
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        if(size==0){
            System.out.println("Invalid Size.");
        }
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Element "+i+": ");
            arr[i] = input.nextInt();
        }
        input.close();
    }
    static void reverseInPlace(int[] values){
        int left = 0;
        int right = values.length - 1;
        while(left < right){
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;
            left++;
            right--;
        }
    }
    

    static int[] reversedCopy(int[] values){
        int[] reversed = new int[values.length];
        for(int i = 0; i < values.length; i++){
            reversed[i] = values[values.length - 1 - i];
        }
        return reversed;
    }
    

    static int removeValue(int[] values, int target){
        int writeIndex = 0;
        for(int i = 0; i < values.length; i++){
            if(values[i] != target){
                values[writeIndex] = values[i];
                writeIndex++;
            }
        }
        return writeIndex;
    }
    
    static int[] runningSum(int[] values){
        int[] result = new int[values.length];
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
            result[i] = sum;
        }
        return result;
    }
}
