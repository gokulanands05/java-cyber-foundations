// Day 07 - Simple Login Validation

class SimpleLogin {
    public static void main(String[] args) {

        String correctPassword = "secure123";
        String enteredPassword = "secure123";

        if (enteredPassword.equals(correctPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid password");
        }
    }
}
