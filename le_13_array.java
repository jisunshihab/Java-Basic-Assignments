public class le13array {
    public static void main(String[] args) {
        int a[] = new int [3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        int x = a[0] + a[2];
        System.out.println("Value of x: " + x);

        a[2] = 100;
        x = a[0] + a[2];
        System.out.println("Value of x: " + x);
    }
}
    
