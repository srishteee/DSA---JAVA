package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
// reverse loop
        for(int i=n; i>=1;i--){
            // abstraction == hiding bg details (magic)
            for(int j=1; j<=i;j++ ){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
