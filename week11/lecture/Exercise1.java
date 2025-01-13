package week11.lecture;

public class Exercise1 {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3 };
        String s1 = "Hello";
        String s2 = null;

        try {
            System.out.println(x[4]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(s1.charAt(8));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(x[1] / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(s2.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
