package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       String s = "abcd";
       for(int i=0;i<s.length();i++) {
           for(int j= i+1;j<=s.length();j++) {
               System.out.println(s.substring(i,j));
           }
       }
    }
}
