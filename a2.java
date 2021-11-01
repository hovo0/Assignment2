import java.util.Scanner;
public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        System.out.println("Enter number");
        i = scanner.nextInt();
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("Bajanvum e");
        } else {
            System.out.println("chi bajanvum");

        }
    }
}
