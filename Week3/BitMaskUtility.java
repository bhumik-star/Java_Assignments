/*Required filename: BitMaskUtility.java

Implement:

    static boolean isBitSet(int number, int position)
    static int setBit(int number, int position)
    static int clearBit(int number, int position)
    static int toggleBit(int number, int position)
    static String toBinary32(int number)

Build a menu that reads a number, bit position, and operation. Validate bit
positions from 0 through 31. Display values before and after in decimal and
32-bit binary.
 */
import java.util.Scanner;

public class BitMaskUtility {

    static boolean isBitSet(int number, int position) {
        return (number & (1 << position)) != 0;
    }

    static int setBit(int number, int position) {
        return number | (1 << position);
    }

    static int clearBit(int number, int position) {
        return number & ~(1 << position);
    }

    static int toggleBit(int number, int position) {
        return number ^ (1 << position);
    }

    static String toBinary32(int number) {
        return String.format("%32s", Integer.toBinaryString(number))
                     .replace(' ', '0');
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n--- Bit Mask Utility ---");
            System.out.println("1. Check Bit");
            System.out.println("2. Set Bit");
            System.out.println("3. Clear Bit");
            System.out.println("4. Toggle Bit");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if(choice == 5) {
                break;
            }

            if(choice < 1 || choice > 5) {
                System.out.println("Invalid choice.");
                continue;
            }

            System.out.print("Enter number: ");
            int number = sc.nextInt();

            System.out.print("Enter bit position (0-31): ");
            int position = sc.nextInt();

            if(position < 0 || position > 31) {
                System.out.println("Invalid bit position. Enter 0 through 31.");
                continue;
            }

            System.out.println("Before: " + number);
            System.out.println("Binary: " + toBinary32(number));

            if(choice == 1) {

                System.out.println("Bit " + position + " is set: "
                        + isBitSet(number, position));

            } else {

                int result = number;

                if(choice == 2) {
                    result = setBit(number, position);
                }
                else if(choice == 3) {
                    result = clearBit(number, position);
                }
                else if(choice == 4) {
                    result = toggleBit(number, position);
                }

                System.out.println("After: " + result);
                System.out.println("Binary: " + toBinary32(result));
            }
        }

        sc.close();
    }
}