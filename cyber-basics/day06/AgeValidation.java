// Day 06 - Secure Age Validation

class AgeValidation {
    public static void main(String[] args) {

        int age = -5;

        if (age < 0) {
            System.out.println("Invalid age entered");
        }

        if (age >= 18) {
            System.out.println("Eligible");
        }
    }
}
