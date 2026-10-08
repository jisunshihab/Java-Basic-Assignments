public class le12nestedloop {
    public static void main(String[] args) {
        int i, j;
        for(i = 1; i <= 2; i++) {
            System.out.println("Outer loop start");

            for(j = 1; j <= 3; j++) {
                System.out.println("****************** Hi");
            }

            System.out.println("Outer loop end");
        }
    }
}