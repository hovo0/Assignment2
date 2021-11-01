import java.util.Scanner;
public class a7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int n1, n2, n3, n4;
        int a, b, c, d;
        int sum = 0;
        System.out.println("Enter number");
        n = scanner.nextInt();
        if (n > 999 && n < 10000){
            n1 = n % 1000;
            a = (n - n1) / 1000;
            n2 = n1 % 100;
            b = (n1 - n2) / 100;
             n3 = n2 % 10;
            c = (n2 - n3) / 10;
            d = n3;
            sum=a+b+c+d;
        if(sum%2==0)
            System.out.println("Evenish");
        else{
            System.out.println("Oddish");}
        }else {
            System.out.println("tivy qaranish che ");

            }
        }


    }





