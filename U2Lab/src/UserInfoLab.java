import java.util.Scanner;
public class UserInfoLab {
    public static void main(String[] args) {
        // Part 1
        // Create a Scanner for keyboard input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their first and last name and pass these
        // values to the generateUsername method and save the returned result.
        System.out.print("Enter Your First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Your Last Name: ");
        String lastName = scanner.nextLine();

        String username = generateUsername(firstName, lastName);
        System.out.println("Username: " + username);

        // Part 2
        // Ask the user to enter a password and pass this value to the validatePassword method.
        System.out.println("Enter Your Password: ");
        String password = scanner.nextLine();
        boolean validatePassword = validatePassword(password);
        // The validatePassword method will check if the password meets the criteria:

        // Part 3
        // If the user entered a valid password in step 2, then ask the user to enter their
        if (validatePassword) {
            System.out.println("Enter Your 16-Digit Credit Card Number: ");
            String creditCardNumber = scanner.nextLine();

            // credit card number and pass this value to the maskCreditCard method.
            String maskedCreditCard = maskCreditCard(creditCardNumber);
            System.out.println("\n--- User Information ---");
            System.out.println("Username: " + username);
            System.out.println("Masked Credit Card: " + maskedCreditCard);
        }



        // Part 4
        // If the user entered a valid password AND valid credit card number, display the output
        else{
            System.out.println("Program Terminated Due to Invalid Password.");
        }

        scanner.close();
    }

        }
        // as shown in the demo video
        // https://drive.google.com/file/d/1sMOw5wkOgSfuUcvQhFyZ5flnv_d9qQd3/view?usp=sharing

 //   }

    public static String generateUsername(String firstName, String lastName) {
        // Fill in this method and return an appropriate username
        String username = "";

        if(firstName.length() < 3) {
            username += firstName;
        }
        else{
            username+= firstName.substring(0,3) + "";
        }

        if(lastName.length() < 3) {
            username += lastName;
        }
        else {
            username += lastName.substring(0, 3) + "";
        }

        return username.toLowerCase();
    }
    public static boolean validatePassword(String password) {
        // Fill in this method and return true/false if the password is valid
        boolean valid = true;
        if(password.length() < 8){
            System.out.println("Password Must Be At Least 8 Charecters Long");
            valid = false;
        }
        boolean hasUppercase = false;
        for(int i = 0; i < password.length(); i ++) {
            
        }


        return true;
    }
    public static String maskCreditCard(String creditCardNumber) {
        // Fill in this method and if the credit card is valid, return a masked CC
        return "";
    }

    /**
     This method verifies that the string contains at least one numeric digit
     @param str The string to check
     @return true or false if a digit is present
     */
    public static boolean containsDigit(String str) {
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (Character.isDigit(c))
                return true;
        }
        return false;
    }

    /**
     * Checks if the entire String is all numerical
     * @param str The string to check
     * @return true or false if the string is ALL digits
     */
    public static boolean allDigits(String str) {
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

}
