/*Required filename: ArrayConstructionProblems.java

Implement and test these LeetCode methods in one class:

- LC 2011, Final Value After Performing Operations
- LC 1920, Build Array from Permutation
- LC 1929, Concatenation of Array
- LC 1480, Running Sum of 1D Array

Requirements:

- Use the official array method signatures.
- Revisit Week 2's console version of LC 2011 and explain the difference.
- Write the problem number above each method.
- State time and auxiliary-space complexity for each solution.
 */
public class ArrayConstructionProblems {
    public static void main(String[] args) {
        // LC 2011
        System.out.println("LC 2011 - Final Value:");
        String[] ops1 = {"--X","++X","X++"};
        System.out.println("Result: " + finalValueAfterOperations(ops1));
        
        // LC 1920
        System.out.println("\nLC 1920 - Build Array:");
        int[] perm1 = {0,1,2};
        printArray(buildArray(perm1));
        
        // LC 1929
        System.out.println("\nLC 1929 - Concatenation:");
        int[] nums1 = {1,2,1};
        printArray(getConcatenation(nums1));
        
        // LC 1480
        System.out.println("\nLC 1480 - Running Sum:");
        int[] nums2 = {1,2,3,4};
        printArray(runningSum(nums2));
    }

    static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String op : operations) {
            if(op.contains("++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int j =nums.length;
        for(int n=0;n<2;n++){
        for(int i=0;i<nums.length;i++){
            ans[i+(j*n)] = nums[i];
        }}
        return ans;
    }

    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }

    static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}