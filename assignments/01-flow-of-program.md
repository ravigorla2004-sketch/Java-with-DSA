Input a year and find whether it is a leap year or not.
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }

        sc.close();
    }
}
Enter a year: 2004
2004 is a Leap Year.
=== Code Execution Successful ===

Take two numbers and print the sum of both.
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
Enter first number: 10
Enter second number: 20
Sum = 30
=== Code Execution Successful ===

Take a number as input and print the multiplication table for it.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
Enter a number: 1
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
1 x 4 = 4
1 x 5 = 5
1 x 6 = 6
1 x 7 = 7
1 x 8 = 8
1 x 9 = 9
1 x 10 = 10

=== Code Execution Successful ===

Take 2 numbers as inputs and find their HCF and LCM.
import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int num1 = a;
        int num2 = b;

        // Find HCF using Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int hcf = a;
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
Enter first number: 1
Enter second number: 2
HCF = 1
LCM = 2

=== Code Execution Successful ===

Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Enter a number (or x to stop): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            sum += Integer.parseInt(input);
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
Enter a number (or x to stop): 10
Enter a number (or x to stop): 25
Enter a number (or x to stop): 15
Enter a number (or x to stop): x
Sum = 50

=== Code Execution Successful ===
