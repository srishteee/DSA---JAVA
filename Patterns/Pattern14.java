package Patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = scn.nextInt();

        int num = scn.nextInt();

        for(int i=1; i<=10;i++){
            System.out.println(num + "*" + i+ "=" + num*i);

        }
    }
}
