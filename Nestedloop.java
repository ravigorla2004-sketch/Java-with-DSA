import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the Array: ");
        int size = sc.nextInt();

        int[] num1 = new int[size];
        System.out.println("Enter the array numbers1: ");
        for(int i = 0;i<size;i++){
            num1[i] = sc.nextInt();
        }

        int[] num2 = new int[size];
        System.out.println("Enter the array numbers2: ");
        for(int i = 0;i<size;i++){
            num2[i] = sc.nextInt();
        }
        System.out.println("Duplicate number: ");
        for(int i=0;i<size;i++){
            for(int j = 0;j<size;j++){
                if (num1[i] == num2[j]){
                    System.out.println(num1[i]);
                }
            }
        }
    }
}
