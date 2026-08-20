/*Required filename: ArrayPointerProblems.java

Implement and test:

- LC 1672, Richest Customer Wealth
- LC 27, Remove Element

Requirements:

- Use nested row traversal for customer wealth.
- Use a read/write pointer for Remove Element.
- Test empty, all-removed, none-removed, and repeated-target cases.
- State which parts of the modified array are meaningful after LC 27. */
public class ArrayPointerProblems {
        static int maximumWealth(int[][] accounts) {
        int[] total_wealth = new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int sum =0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            total_wealth[i] = sum;
        }
        int max = 0;
        for(int i=0;i<total_wealth.length;i++){
            if(total_wealth[i]>max){
                max = total_wealth[i];
            }
        }
        return max;
    }
        static int removeElement(int[] nums, int val) {

        int write = 0;

        for(int read = 0; read < nums.length; read++){

            if(nums[read] != val){
                nums[write] = nums[read];
                write++;
            }
        }

        return write;
    }

    static void printArray(int[] arr, int k) {
        for(int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // LC 1672
        System.out.println("LC 1672 - Richest Customer Wealth:");
        int[][] accounts = {{1,2,3}, {3,2,1}};
        System.out.println("Result: " + maximumWealth(accounts));

        // LC 27
        System.out.println("\nLC 27 - Remove Element:");

        int[] nums1 = {3,2,2,3};
        System.out.println("Repeated target:");
        int k = removeElement(nums1, 3);
        printArray(nums1, k);

        int[] nums2 = {};
        System.out.println("Empty:");
        k = removeElement(nums2, 3);
        System.out.println("k = " + k);

        int[] nums3 = {3,3,3};
        System.out.println("All removed:");
        k = removeElement(nums3, 3);
        System.out.println("k = " + k);

        int[] nums4 = {1,2,4};
        System.out.println("None removed:");
        k = removeElement(nums4, 3);
        printArray(nums4, k);
    }
}
