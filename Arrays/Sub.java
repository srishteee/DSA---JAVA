package Arrays;

import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn .nextInt();

        int [] arr = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
       // 2power N
        int limit = (int)Math.pow(2, arr.length);
        for(int i=0;i<limit;i++){
            int temp =i;
            String set= "";
            // convert i to binary and then use as 0s and 1s.
            for(int j= arr.length-1; j>0;j--){
                int r = temp %2;
                temp=temp/2;
                if(r==0){
                set = "-\t" + set;
                } else {
                    set = arr[j]+ "\t" + set;
                }
                System.out.println(set);
            }
        }
    }
}
