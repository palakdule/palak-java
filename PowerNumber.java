import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        int power = 1;

        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }

        System.out.println("Power = " + power);
    }
}