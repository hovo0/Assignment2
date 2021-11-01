import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day;
        System.out.println("Enter a day of a week ");
        day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Erkushabti");
                break;
            case 2:
                System.out.println("Ereqshabti");
                break;
            case 3:
                System.out.println("Choreqshabti");
                break;
            case 4:
                System.out.println("Hingshabti");
                break;
            case 5:
                System.out.println("Urbat");
                break;
            case 6:
                System.out.println("Shabat");
                break;
            case 7:
                System.out.println("Kiraki");
                break;
            default:
                System.out.println("goyutyun chuni");

        }
    }
}