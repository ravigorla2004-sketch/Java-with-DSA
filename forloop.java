import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int x = sc.nextInt();

        String num = String.valueOf(x);
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sum += Math.pow(digit, 3);
        }

        if (sum == x) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
