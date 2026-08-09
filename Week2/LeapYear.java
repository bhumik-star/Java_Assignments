/*49. TASK 2 - LEAP YEAR
----------------------

Required filename: LeapYear.java

Write a program that determines whether an entered year is a Gregorian leap
year.

Requirements:

- Create static boolean isLeapYear(int year).
- Test 2024, 1900, 2000, and 2023.
- Explain why checking only divisibility by 4 is insufficient. */

public class LeapYear {
    public static void main(){
        int[] test_years = {2024,1900,2000,2023};
        for(int year:test_years){
            boolean result = isLeapYear(year);
            System.out.println(year+" --> "+result);
        }
    }
    public static boolean isLeapYear(int year){
        return (year%4==0 && year%100 != 0) || (year%400==0);
    }
}
