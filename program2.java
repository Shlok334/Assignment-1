// write a menu driven program in java to perform insertion, deletion, linear search, binary search, to find maximum value, to count even/odd and to perform insertion sort operation in one dimensional array
package Assignment1;
import java.util.*;
public class program2 {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int[] arr = new int[100];
	        int n;

	        System.out.print("Enter number of elements: ");
	        n = sc.nextInt();

	        System.out.println("Enter array elements:");

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int choice;

	        do {
	            System.out.println("\n===== MENU =====");
	            System.out.println("1. Insertion");
	            System.out.println("2. Deletion");
	            System.out.println("3. Linear Search");
	            System.out.println("4. Binary Search");
	            System.out.println("5. Find Maximum");
	            System.out.println("6. Count Even and Odd");
	            System.out.println("7. Insertion Sort");
	            System.out.println("8. Display Array");
	            System.out.println("9. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                // INSERTION
	                case 1:
	                    if (n == arr.length) {
	                        System.out.println("Array is full!");
	                        break;
	                    }

	                    System.out.print("Enter position: ");
	                    int pos = sc.nextInt();

	                    System.out.print("Enter value: ");
	                    int value = sc.nextInt();

	                    if (pos < 0 || pos > n) {
	                        System.out.println("Invalid position!");
	                    } else {

	                        for (int i = n; i > pos; i--) {
	                            arr[i] = arr[i - 1];
	                        }

	                        arr[pos] = value;
	                        n++;

	                        System.out.println("Element inserted successfully.");
	                    }
	                    break;


	                // DELETION
	                case 2:
	                    System.out.print("Enter position to delete: ");
	                    pos = sc.nextInt();

	                    if (pos < 0 || pos >= n) {
	                        System.out.println("Invalid position!");
	                    } else {

	                        for (int i = pos; i < n - 1; i++) {
	                            arr[i] = arr[i + 1];
	                        }

	                        n--;

	                        System.out.println("Element deleted successfully.");
	                    }
	                    break;


	                // LINEAR SEARCH
	                case 3:
	                    System.out.print("Enter value to search: ");
	                    value = sc.nextInt();

	                    int linearIndex = -1;

	                    for (int i = 0; i < n; i++) {
	                        if (arr[i] == value) {
	                            linearIndex = i;
	                            break;
	                        }
	                    }

	                    if (linearIndex != -1) {
	                        System.out.println("Element found at index: " + linearIndex);
	                    } else {
	                        System.out.println("Element not found.");
	                    }
	                    break;


	                // BINARY SEARCH
	                case 4:
	                    System.out.print("Enter value to search: ");
	                    value = sc.nextInt();

	                    int low = 0;
	                    int high = n - 1;
	                    int binaryIndex = -1;

	                    while (low <= high) {

	                        int mid = (low + high) / 2;

	                        if (arr[mid] == value) {
	                            binaryIndex = mid;
	                            break;
	                        } else if (arr[mid] < value) {
	                            low = mid + 1;
	                        } else {
	                            high = mid - 1;
	                        }
	                    }

	                    if (binaryIndex != -1) {
	                        System.out.println("Element found at index: " + binaryIndex);
	                    } else {
	                        System.out.println("Element not found.");
	                    }
	                    break;


	                // MAXIMUM
	                case 5:
	                    if (n == 0) {
	                        System.out.println("Array is empty.");
	                    } else {

	                        int max = arr[0];

	                        for (int i = 1; i < n; i++) {
	                            if (arr[i] > max) {
	                                max = arr[i];
	                            }
	                        }

	                        System.out.println("Maximum value = " + max);
	                    }
	                    break;


	                // EVEN / ODD COUNT
	                case 6:
	                    int even = 0;
	                    int odd = 0;

	                    for (int i = 0; i < n; i++) {

	                        if (arr[i] % 2 == 0) {
	                            even++;
	                        } else {
	                            odd++;
	                        }
	                    }

	                    System.out.println("Even numbers = " + even);
	                    System.out.println("Odd numbers = " + odd);
	                    break;


	                // INSERTION SORT
	                case 7:

	                    for (int i = 1; i < n; i++) {

	                        int key = arr[i];
	                        int j = i - 1;

	                        while (j >= 0 && arr[j] > key) {
	                            arr[j + 1] = arr[j];
	                            j--;
	                        }

	                        arr[j + 1] = key;
	                    }

	                    System.out.println("Array sorted successfully.");

	                    System.out.println("Sorted array:");

	                    for (int i = 0; i < n; i++) {
	                        System.out.print(arr[i] + " ");
	                    }

	                    System.out.println();
	                    break;


	                // DISPLAY
	                case 8:
	                    System.out.println("Array elements:");

	                    for (int i = 0; i < n; i++) {
	                        System.out.print(arr[i] + " ");
	                    }

	                    System.out.println();
	                    break;


	                // EXIT
	                case 9:
	                    System.out.println("Program exited.");
	                    break;


	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 9);

	        sc.close();
	    }

}
