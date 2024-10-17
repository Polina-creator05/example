/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class Launcher {

    public static void main(final String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(add(a, b));
        System.out.println(sub(a, b));
        System.out.println(mul(a,
                b));

    }

    private static int add(final int a, final int b) {
        return a + b;
    }

    private static int sub(final int a, final int b) {
        return a - b;
    }

    private static int mul(final int a, final int b) {
        return a * b;
    }
}
