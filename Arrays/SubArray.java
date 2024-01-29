package Arrays;
import java.io.*;
import java.util.*;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        // initialize an array
        int [] arr= new int[n];

        for(int i =0;i< arr.length; i++){
            for(int j=0; j< arr.length;j++){
                for(int k=0; k<=j ; k++){
                    System.out.print(arr[k] + "\t");

                }
                System.out.println();
            }
        }
    }
}
