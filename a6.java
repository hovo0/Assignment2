import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.println("Enter n ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if(i%3==0 && i%5==0) {
                System.out.println(i);
            }
        }

    }
}

