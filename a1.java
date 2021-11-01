public class a1 {
    public static void main(String[] args) {
        int a = 16;
        int b = 99;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        // Addition
        System.out.println("a+b = " + (a + b));
        // Substraction
        System.out.println("a-b = " + (a - b));
        // Multipication
        System.out.println("a*b = " + (a * b));
        // Division
        System.out.println("a/b = " + (a / b));
        // Modulus
        System.out.println("a%b = " + (a % b));
        // Increment
        System.out.println("a++ = " + (++a));
        // Decrement
        System.out.println("a-- = " + (--a));


        // Relational Operators
        System.out.println();
        System.out.println("Relational Operators");

        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));

        // Logical Operators
        System.out.println();
        System.out.println("Logical Operators");

        System.out.println("a && b = " + (a < b && b < a));
        System.out.println("a || b = " + (a > b || b < a));
        System.out.println("a ! b = " + !(a < b && b > a));

        // Bitwise Operators
        System.out.println();
        System.out.println("Bitwise Operators");

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));

        // Assignment Operators
        System.out.println();
        System.out.println("Assignment Operators");

        System.out.println("a = b = " + (a = b));
        System.out.println("a += b = " + (a += b));
        System.out.println("a -= b = " + (a -= b));
        System.out.println("a *= b = " + (a *= b));
        System.out.println("a /= b = " + (a /= b));
        System.out.println("a %= b = " + (a %= b));
        System.out.println("a &= b = " + (a &= b));
        System.out.println("a |= b = " + (a |= b));
        System.out.println("a ^= b = " + (a ^= b));
        System.out.println("a >>= b = " + (a >>= b));
        System.out.println("a <<= b = " + (a <<= b));


    }
}