////import java.util.Scanner;
////
////public class ElementOfArray {
////    public static void main(String[] args) {
////        Scanner scn = new Scanner(System.in);
////        int n = scn.nextInt();
////        int arr[]= new int [n];
////
////        for(int i=0; i< arr.length; i++){
////            arr[i]= scn.nextInt();
////        }
////        int data = scn.nextInt();
////   int idx=-1;
////        for(int i=0; i< arr.length;i++){
////            if(arr[i]== data){
////                idx=i;
////                break;
////            }
////
////        }
////        System.out.println(idx);
////
//////    }
//////}
////
////import java.util.Scanner;
////
////public class ElementOfArray {
////    public static void main(String[] args) {
////        Scanner scn = new Scanner(System.in);
////        int n = scn.nextInt();
////        int[] arr = new int[n];
////        for (int i = 0; i < arr.length; i++) {
////            arr[i] = scn.nextInt();
////        }
////        int data = scn.nextInt();
////        int idx=-1;
////        for(int i=0; i< arr.length;i++){
////            if(arr[i]==data){
////                idx=i;
////                break;
////            }
////        }
////        System.out.println(idx);
////    }
////    }
//import java.io.*;
//import java.util.*;
//
//public class ElementOfArray{
//
//    public static void main(String[] args) throws Exception {
//        Scanner scn = new Scanner (System.in);
//        int n = scn.nextInt();
//        int [i] arr= scn.nextInt();
//
//        for(int i=0; i<arr.length;i++){
//
//        }
//
//        int max= arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(int arr[i]>= max){
//                max= arr[i];
//
//            }
//        }
//
//        for(int floor=max; floor>=1;floor--){
//            for(int i=0;i<arr.length;i++){
//                if(arr[i]>=floor){
//                    System.out.print("*\t");
//                } else {
//                    System.out.print("\t");
//                }
//            }
//            System.out.print();
//        }
//
//
//    }
//
//}