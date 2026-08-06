1.Write a program to print whether a number is even or odd, also take input from the user.
program code:
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

        sc.close();
    }
}
Output:
Enter a number: 6
6 is Even.

2.Take name as input and print a greeting message for that particular name.
Program code:
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Print greeting
        System.out.println("Hello, " + name + "! Welcome.");

        sc.close();
    }
}
Output:
Enter your name: Ravi
Hello, Ravi! Welcome

3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
Program code:
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Principal, Time, and Rate
        System.out.print("Enter Principal: ");
        float principal = sc.nextFloat();

        System.out.print("Enter Time (in years): ");
        float time = sc.nextFloat();

        System.out.print("Enter Rate of Interest: ");
        float rate = sc.nextFloat();

        // Calculate Simple Interest
        float simpleInterest = (principal * time * rate) / 100;

        // Display Result
        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }
}
Output:
Enter Principal: 50000
Enter Time (in years): 1
Enter Rate of Interest: 1.5
Simple Interest = 750.0

4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
Program code:
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        // Perform calculation using if conditions
        if (op == '+') {
            System.out.println("Result = " + (num1 + num2));
        } else if (op == '-') {
            System.out.println("Result = " + (num1 - num2));
        } else if (op == '*') {
            System.out.println("Result = " + (num1 * num2));
        } else if (op == '/') {
            if (num2 != 0) {
                System.out.println("Result = " + (num1 / num2));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator.");
        }

        sc.close();
    }
}
Oputput:
Enter first number: 8
Enter second number: 4
Enter operator (+, -, *, /): +
Result = 12.0

5.Take 2 numbers as input and print the largest number.
Program code:
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Find the largest number
        if (num1 > num2) {
            System.out.println("Largest number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("Largest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}
Output:
Enter first number: 826
Enter second number: 283
Largest number is: 826

6.Input currency in rupees and output in USD.
program code:
import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input amount in Rupees
        System.out.print("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();

        // Exchange rate (1 USD = 83 INR)
        double usd = rupees / 83.0;

        // Display result
        System.out.println("Amount in USD = " + usd);

        sc.close();
    }
}
Output:
Enter amount in Rupees: 4000
Amount in USD = 48.19277108433735

7.To calculate Fibonacci Series up to n numbers.
Program code:
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of terms
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
Output:
Enter the number of terms: 8
Fibonacci Series:
0 1 1 2 3 5 8 13

8.To find out whether the given String is Palindrome or not.
program code:
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Reverse the string
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Check palindrome
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is not a Palindrome.");
        }

        sc.close();
    }
}
output:
Enter a string: haii
The string is not a Palindrome.

9.To find Armstrong Number between two given number.
program code:
import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input range
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;
            int digits = String.valueOf(num).length();
            int temp = num;

            while (temp > 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, digits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}
output:
Enter the starting number: 1
Enter the ending number: 500
Armstrong numbers between 1 and 500 are:
1
2
3
4
5
6
7
8
9
153
370
371
407
