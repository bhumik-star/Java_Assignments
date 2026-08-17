/*
64. TASK 2 - LINEAR SEARCH TOOLKIT
---------------------------------

Required filename: LinearSearchToolkit.java

Implement:

    static boolean contains(int[] values, int target)
    static int firstIndexOf(int[] values, int target)
    static int lastIndexOf(int[] values, int target)
    static int countOccurrences(int[] values, int target)

Test empty, absent, first-position, last-position, and duplicate cases. State
the best and worst behavior of each search where appropriate. */
import java.util.Scanner;

public class LinearSearchToolkit {
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
        System.out.print("Enter Target Value: ");
        int target = input.nextInt();
        boolean res1=contains(arr, target);
        System.out.println("Contains: "+ res1);
        int res2=firstIndexOf(arr, target);
        System.out.println("First Index Of: "+ res2);
        int res3=lastIndexOf(arr, target);
        System.out.println("Last Index Of: "+ res3);
        int res4=countOccurrences(arr, target);
        System.out.println("Count Occurrences: "+ res4);
        input.close();
    }
    static boolean contains(int[] values,int target){
        for(int i=0;i<values.length;i++){
            if(values[i]==target){
                return true;
            }else{continue;}
        }
        return false;
    }
    static int firstIndexOf(int[] value, int target){
        for(int i=0;i<value.length;i++){
            if(value[i]==target){
                return i;
            }else{continue;}
        }
        return -1;
    }
    static int lastIndexOf(int[] value, int target){
        for(int i=value.length-1;i>=0;i--){
            if(value[i]==target){
                return i;
            }else{continue;}
        }
        return -1;
    }
    static int countOccurrences(int[] value, int target){
        int count=0;
        for(int i=0;i<value.length;i++){
            if(value[i]==target){
                count++;
            }else{continue;}
        }
        return count;
    }
}
