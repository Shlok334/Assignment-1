//Write a program to perform addition, subtraction, multiplication, transpose, to check square matrix, to check matrix is diagonal, and to check matrix is identity.
package Assignment1;
import java.util.*;
public class program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int choice;

        do {
            System.out.println("\n--- Matrix Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Transpose");
            System.out.println("5. Check Square Matrix");
            System.out.println("6. Check Diagonal Matrix");
            System.out.println("7. Check Identity Matrix");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Addition
                    System.out.println("Addition of matrices:");

                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            System.out.print((a[i][j] + b[i][j]) + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Subtraction
                    System.out.println("Subtraction of matrices:");

                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            System.out.print((a[i][j] - b[i][j]) + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // Multiplication
                    if (c != r) {
                        System.out.println("Matrix multiplication is not possible.");
                    } else {

                        int[][] result = new int[r][c];

                        for (int i = 0; i < r; i++) {
                            for (int j = 0; j < c; j++) {
                                for (int k = 0; k < c; k++) {
                                    result[i][j] += a[i][k] * b[k][j];
                                }
                            }
                        }

                        System.out.println("Multiplication of matrices:");

                        for (int i = 0; i < r; i++) {
                            for (int j = 0; j < c; j++) {
                                System.out.print(result[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    // Transpose
                    System.out.println("Transpose of Matrix A:");

                    for (int j = 0; j < c; j++) {
                        for (int i = 0; i < r; i++) {
                            System.out.print(a[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    // Square Matrix
                    if (r == c) {
                        System.out.println("Matrix is a Square Matrix.");
                    } else {
                        System.out.println("Matrix is not a Square Matrix.");
                    }
                    break;

                case 6:
                    // Diagonal Matrix
                    if (r != c) {
                        System.out.println("Matrix is not a Diagonal Matrix.");
                    } else {

                        boolean diagonal = true;

                        for (int i = 0; i < r; i++) {
                            for (int j = 0; j < c; j++) {

                                if (i != j && a[i][j] != 0) {
                                    diagonal = false;
                                }
                            }
                        }

                        if (diagonal) {
                            System.out.println("Matrix is a Diagonal Matrix.");
                        } else {
                            System.out.println("Matrix is not a Diagonal Matrix.");
                        }
                    }
                    break;

                case 7:
                    // Identity Matrix
                    if (r != c) {
                        System.out.println("Matrix is not an Identity Matrix.");
                    } else {

                        boolean identity = true;

                        for (int i = 0; i < r; i++) {
                            for (int j = 0; j < c; j++) {

                                if (i == j && a[i][j] != 1) {
                                    identity = false;
                                }

                                if (i != j && a[i][j] != 0) {
                                    identity = false;
                                }
                            }
                        }

                        if (identity) {
                            System.out.println("Matrix is an Identity Matrix.");
                        } else {
                            System.out.println("Matrix is not an Identity Matrix.");
                        }
                    }
                    break;

                case 8:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
	}

}
