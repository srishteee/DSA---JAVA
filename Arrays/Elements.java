package Arrays;
import java.util.Scanner;

public class Elements {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        // initialize an array
        int [] arr= new int[n];

        for(int i=0; i<=arr.length;i++){
             arr [i]= scn.nextInt()  ;
        }
        int d= scn.nextInt();
        int idx=-1;
        for(int i=1;i<= arr.length;i++){
            if(arr[i]== d){
               idx= arr[i];
            break;
            }}
            System.out.println(idx);
        }




    }

