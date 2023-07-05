public class HW1 {
     public static void main(String[] args) {
        System.out.println(method1(1, 0));
//        System.out.println(method2());
//        System.out.println(method3(5, 17, 2));
    }

    public static int method1(int a, int b) {
        return a / b;  // ArithmeticException
    }

    public static int method2() {
        String input = null;
        return input.length(); // NullPointerException
    }

    public static int[] method3(int a, int b, int c) {
        int[] array = new int[a];
        array[b] = c;
        return array; // ArrayIndexOutOfBoundsException
    }
}