package Arrays;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        // initialize an array
        int [] arr= new int[n];

        for(int i=0; i<=10;i++){
            arr [i]= scn.nextInt()  ;
        }
        int max = arr[0];
        for(int i=1; i<= arr.length;i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
        for(int floor=max; floor>=1;floor--){
            for(int i=0;i< arr.length;i++){
                if(arr[i]>= floor){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
            }

            }
            }


        System.out.println();
    }
}