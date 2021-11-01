import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;
        int result = 9;

        System.out.println("Input number a = ");
        a = scanner.nextInt();
        System.out.println("Input number b = ");
        b = scanner.nextInt();

        result *= (a > b) ? (a - b) : (a + b);
        System.out.println("result = " + result);
    }
}
