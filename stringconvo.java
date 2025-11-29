import java.util.Scanner;

public class stringconvo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = sc.next();

            String first3 = name.substring(0, 3);
            int num = Integer.parseInt(first3);

            System.out.println("Converted integer = " + num);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Name must have at least 3 characters.");
        } catch (NumberFormatException e) {
            System.out.println("Error: First 3 characters are not numbers.");
        }
    }
}
