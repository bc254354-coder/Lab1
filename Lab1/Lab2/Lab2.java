package eisya;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = scan.nextInt();

        int digit1 = number % 10;
        number = number / 10;

        int digit2 = number % 10;
        number = number / 10;

        int digit3 = number % 10;

        int product = digit1 * digit2 * digit3;

        System.out.println("The multiplication of all digits is " + product);
    }
}