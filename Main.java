public class Main {
    public static void main(String[] args) {
        String str = "Welcome";

        int index = str.indexOf('e');

        if (index != -1) {
            System.out.println("Index of 'e' is: " + index);
        } else {
            System.out.println("'e' is not found in the string.");
        }
    }
}