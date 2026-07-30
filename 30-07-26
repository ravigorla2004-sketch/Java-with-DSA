Q1. Print all elements of an array.
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

output:
10 20 30 40 50 

Q2. Find the sum of all elements.
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}

output:
Sum = 150

Q3.Find the average of array elements.
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;

        System.out.println("Average = " + average);
    }
}

output:
Average = 30.0

Q4. Find the largest element.
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 30};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element = " + largest);
    }
}

output:
Largest element = 40

Q5. Find the smallest element
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 30};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element = " + smallest);
    }
}

output:
Smallest element = 5

Q6. Count even and odd numbers
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35};

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers = " + evenCount);
        System.out.println("Odd numbers = " + oddCount);
    }
}

output:
Even numbers = 3
Odd numbers = 3

Q7. Reverse an array.
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

output:
Reversed array: 50 40 30 20 10 

Q8. Search for a given element
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}

output:
Element found at index 2

Q9.Count the occurrence of a specific number
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 20, 50};
        int key = 20;
        int count = 0;

        for (int num : arr) {
            if (num == key) {
                count++;
            }
        }

        System.out.println("Occurrence of " + key + " = " + count);
    }
}

output:
Occurrence of 20 = 3

Q10.Find the second largest element 
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 30};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist.");
        } else {
            System.out.println("Second largest element = " + secondLargest);
        }
    }
}

output:
Second largest element = 30

Q11. Remove duplicate elements.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates: " + set);
    }
}

output:
Array after removing duplicates: [50, 20, 40, 10, 30]

Q12.Merge two arrays
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};

        int[] merged = new int[arr1.length + arr2.length];

        // Copy elements of first array
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy elements of second array
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        System.out.print("Merged array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}

output:
Merged array: 10 20 30 40 50 60

Q13.
Find the missing number (1 to N)
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int N = 6;

        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number = " + missingNumber);
    }
}

output:
Missing number = 4

Q14.Move all zeros to the end.
import java.util.Arrays;

public class MoveZeros {

    public static void moveZerosToEnd(int[] arr) {
        int index = 0;

        // Move all non-zero elements to the front
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Fill the remaining positions with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        moveZerosToEnd(arr);

        System.out.println(Arrays.toString(arr));
    }
}

output:
[1, 3, 12, 5, 0, 0, 0]

Q15.Rotate array left by one position.
import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int first = arr[0];

        // Shift elements one position to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Put the first element at the end
        arr[arr.length - 1] = first;

        System.out.println("Array after left rotation by one position:");
        System.out.println(Arrays.toString(arr));
    }
}

output:
Array after left rotation by one position:
[2, 3, 4, 5, 1]

Q16.Rotate array right by one position.
import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int last = arr[arr.length - 1];

        // Shift elements one position to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Put the last element at the beginning
        arr[0] = last;

        System.out.println("Array after right rotation by one position:");
        System.out.println(Arrays.toString(arr));
    }
}

output:
Array after right rotation by one position:
[5, 1, 2, 3, 4]

Q17.Find the frequency of each element.
import java.util.HashMap;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 3, 2};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        // Count frequency of each element
        for (int i = 0; i < arr.length; i++) {
            frequency.put(arr[i], frequency.getOrDefault(arr[i], 0) + 1);
        }

        // Print frequency
        System.out.println("Frequency of each element:");
        for (int key : frequency.keySet()) {
            System.out.println(key + " : " + frequency.get(key));
        }
    }
}

output:
Frequency of each element:
1 : 2
2 : 3
3 : 2
4 : 1

Q18.Sort an array in ascending order (without using Arrays.sort()).
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after sorting in ascending order:");
        System.out.println(Arrays.toString(arr));
    }
}

output:
Array after sorting in ascending order:
[1, 2, 3, 5, 8]

Q19.Sort an array in descending order.
import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 1, 7, 3};

        // Sort in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

output:
Array in descending order:
9 7 5 3 2 1 

Q20.Find the intersection of two arrays.
import java.util.HashSet;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        HashSet<Integer> set = new HashSet<>();

        // Add elements of first array to set
        for (int num : arr1) {
            set.add(num);
        }

        System.out.println("Intersection of arrays:");

        // Check elements of second array
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                set.remove(num); // Avoid duplicate output
            }
        }
    }
}

output:
Intersection of arrays:
3 4 5 

Q21.Find the union of two arrays.
import java.util.HashSet;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        HashSet<Integer> union = new HashSet<>();

        // Add elements from first array
        for (int num : arr1) {
            union.add(num);
        }

        // Add elements from second array
        for (int num : arr2) {
            union.add(num);
        }

        System.out.println("Union of arrays:");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}

output:
Union of arrays:
1 2 3 4 5 6 7 

Q22.Find all pairs whose sum equals a target value.
import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 3, 6};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Pairs with sum " + target + ":");

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }

            set.add(num);
        }
    }
}

output:
Pairs with sum 9:
(2, 7)
(3, 6)

Q23.Find the maximum subarray sum (Kadane's Algorithm).
public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = kadane(arr);

        System.out.println("Maximum subarray sum: " + maxSum);
    }

    public static int kadane(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Either start a new subarray or extend the existing one
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

output:
Maximum subarray sum: 6

Q24.Find leaders in an array.
public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        System.out.println("Leaders in the array:");

        findLeaders(arr);
    }

    public static void findLeaders(int[] arr) {
        int maxRight = arr[arr.length - 1];

        System.out.print(maxRight + " ");

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                System.out.print(maxRight + " ");
            }
        }
    }
}

output:
Leaders in the array:
2 5 17 

Q25.Find the equilibrium index.
public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};

        int index = findEquilibriumIndex(arr);

        if (index != -1) {
            System.out.println("Equilibrium index: " + index);
        } else {
            System.out.println("No equilibrium index found");
        }
    }

    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;

        // Calculate total sum
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        // Check each index
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // Now totalSum is right sum

            if (leftSum == totalSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }
}

output:
Equilibrium index: 2

Q26.Print all elements of a matrix.
public class PrintMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix elements:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

output:
Matrix elements:
1 2 3 
4 5 6 
7 8 9 

Q27.Find the sum of all elements.
public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        // Calculate sum of all elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
}

output:
Sum of all elements: 45

Q28.Find the largest element.
public class LargestElementMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 25, 3},
            {45, 5, 60},
            {7, 80, 9}
        };

        int largest = matrix[0][0];

        // Find largest element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        System.out.println("Largest element: " + largest);
    }
}

output:
Largest element: 80

Q29.Find the smallest element.
public class SmallestElementMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 25, 3},
            {45, 5, 60},
            {7, 80, 9}
        };

        int smallest = matrix[0][0];

        // Find smallest element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }

        System.out.println("Smallest element: " + smallest);
    }
}

output:
Smallest element: 3

Q30.Print row-wise sums.
public class RowWiseSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Row-wise sums:");

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            System.out.println("Row " + (i + 1) + ": " + sum);
        }
    }
}

output:
Row-wise sums:
Row 1: 6
Row 2: 15
Row 3: 24

Q31.Print column-wise sums.
public class ColumnWiseSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Column-wise sums:");

        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;

            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Column " + (j + 1) + ": " + sum);
        }
    }
}

output:
Column-wise sums:
Column 1: 12
Column 2: 15
Column 3: 18

Q32.Find the average of all elements.
public class MatrixAverage {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        int count = 0;

        // Calculate sum and count of elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Average of all elements: " + average);
    }
}

output:
Average of all elements: 5.0

Q33.Count even and odd numbers
public class CountEvenOdd {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int evenCount = 0;
        int oddCount = 0;

        // Count even and odd numbers
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}

output:
Even numbers count: 4
Odd numbers count: 5

Q34.Print the main diagonal.
public class MainDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Main diagonal elements:");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }
}

output:
Main diagonal elements:
1 5 9 

Q35.Print the secondary diagonal.
public class SecondaryDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Secondary diagonal elements:");

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - i - 1] + " ");
        }
    }
}

output:
Secondary diagonal elements:
3 5 7
