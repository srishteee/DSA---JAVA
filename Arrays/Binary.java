package Arrays;

public class Binary {
    public static void main(String[] args) {
        // sorted arrays
        int [] arr ={10,20,30,40,50,60,70,80,90,100};

        // to find the array
        int data = 10;
// set the value as used in binRY SEARCH ALGORITHM
        int l=0;
        int h= arr.length-1;
        while(l<h){
            int m = (l+h)/2;
            if(data > arr[m]){
                l= m+1;
            } else if (data<arr[m]) {
                h= m-1;
            } else  {
                System.out.println(m);
                return;
            }
        }

        System.out.println(-1);
    }
}
