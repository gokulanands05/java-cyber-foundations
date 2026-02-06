 
class SafeDivision {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        if (b == 0) {
            System.out.println("Invalid input: division by zero not allowed");
        } else {
            System.out.println(a / b);
        }
    }
}
