/*51. TASK 4 - PRIME NUMBER
-------------------------

Required filename: PrimeNumber.java

Write static boolean isPrime(int number), then use it to display whether an
entered integer is prime.

Requirements:

- Values less than 2 are not prime.
- Test possible divisors only while divisor * divisor <= number.
- Test -5, 0, 1, 2, 3, 4, 17, 25, and 97.
- Explain the loop condition. */
public class PrimeNumber {
    public void start(){
        int[] numbers = {-5,0,1,2,3,4,17,25,97};
        for(int number: numbers){
            boolean check = isPrime(number);
            System.out.println(number+"-->"+check);
        }
    }
    public boolean isPrime(int number){
        int i =2;
        if(number<2){
            return false;
        }
        else{
        while(i*i<=number){
            if(number%i==0){
                return false;
            }
            else{
                i += 1;
                continue;
            }
        }
        return true;
}
}}

