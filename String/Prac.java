package String;

import java.util.Scanner;

public class Prac  {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // declaration and assign
//        String s1 = "hello";
        // input taking from user in string
//        String s1 = scn.nextLine();
//
////        String s2 = scn.nextLine();
//        System.out.println(s1);
//        // find a length that how many character on string
//        System.out.println(s1.length());
//        // location of the char
//        char ch = s1.charAt(0);
//        System.out.println(ch);
//        System.out.println(s2);
        // substring:
//        String s = "abcd";
//        for(int i =0; i<s.length();i++){
//            for(int j=i+1;j<=s.length();j++){
//                System.out.println(s.substring(i,j));
//            }
//
//        }
        // how to add two strings
//        String s1 ="hello";
//        s1 += "";
//        s1 += "c";
//        s1+= " 0";
//        s1+= 23;
////        String s2 ="world";
////         String s3 = s1 + "" + s2;
//        System.out.println(s1);
//

        String s = "abcd";
        for(int i=0;i<s.length();i++) {
            for(int j= i+1;j<=s.length();j++) {
                System.out.println(s.substring(i,j));
            }
        }
         



    }
}
