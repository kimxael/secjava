import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String msg) {
        super(msg);
    }
}

public class invalidemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.next();

        try {
            if (!email.contains("@")) {
                throw new InvalidEmailException("Invalid email — '@' missing.");
            }
            System.out.println("Valid Email!");

        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
