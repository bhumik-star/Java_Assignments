import java.util.Scanner;
public class numberReversal {
    public static void start(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num = input.nextInt();
        int result = reverse(num);
        System.out.print(result);
        input.close();
    }
    public static int reverse(int num){
        int digits = String.valueOf(num).length();
        int digit = 0;
        int reversed =0;
        int number = num;
        for(int i=0;i<digits;i++){
        digit = number % 10;
        reversed = reversed * 10 + digit;
        number = number / 10;
        }
        return reversed;

    }
    
}