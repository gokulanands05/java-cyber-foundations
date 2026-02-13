// Day 08 - Strong Password Validation

class StrongPasswordCheck {
    public static void main(String[] args) {

        String password = "Secure123";

        if (password.length() < 8) {
            System.out.println("Weak: Too short");
        } else if (!password.matches(".*[A-Z].*")) {
            System.out.println("Weak: Must contain uppercase letter");
        } else if (!password.matches(".*[0-9].*")) {
            System.out.println("Weak: Must contain a number");
        } else {
            System.out.println("Strong password");
        }
    }
}
