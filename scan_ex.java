import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("x = " + x);

        sc.close();
    }
}