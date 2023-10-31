import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n1];

        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }
        int[] dif= new int [n1<n2? n2 :n1];
    }

}
