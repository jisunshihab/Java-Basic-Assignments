public class le16StringSplit {
    public static void main(String[] args) {
        String s = "I@love@Bangladesh";

        String[] a = s.split("@");

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}