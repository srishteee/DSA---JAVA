package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int sp=n-1;
        int st=1;
        for(int i=1;i<=n;i++){
            // this loop control space
            for(int j=1;j<=sp;j++) {
                System.out.print("\t");
            }
            /// this loop control star
                for(int j=1;j<=st;j++){
                    System.out.print ("*\t");
                }
                sp--;
                st++;
            System.out.println();
            }
        }
    }

