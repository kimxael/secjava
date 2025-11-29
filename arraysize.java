import java.util.Scanner;

public class arraysize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            System.out.println("Array created with size = " + size);

        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative!");
        }
    }
}

