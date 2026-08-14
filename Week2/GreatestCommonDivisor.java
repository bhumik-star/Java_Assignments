/*52. TASK 5 - GREATEST COMMON DIVISOR
------------------------------------

Required filename: GreatestCommonDivisor.java

Write static int gcd(int first, int second) using Euclid's algorithm.

Repeatedly apply:

    remainder = first % second
    first = second
    second = remainder

until second becomes zero.

Requirements:

- Handle negative inputs using Math.abs().
- Test (48, 18), (21, 14), (7, 5), and (100, 0).
- Trace the variables for gcd(48, 18) in the notebook. */
public class GreatestCommonDivisor {
    public void start(){
        int[][] arr= {{48,18},{21,14},{7,5},{100,0}};
        for(int[] set:arr){
            int first = set[0];
            int second = set[1];
            int result = gcd(first, second);
            System.out.println(result);

        }
    }
    public static int gcd(int first,int second){
        int remainder;
        while(second!=0){
            remainder = first%second;
            first = second;
            second = remainder;
        }
        return first;
    }
}
