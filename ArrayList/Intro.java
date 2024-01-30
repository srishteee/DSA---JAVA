package ArrayList;
import java.util.*;
public class Intro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + "->"  +   list.size());



        // addition
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + "-->"  +   list.size());
// to add
        list.add(1,1000);

        // to set -- it means to replace
         list.set(2,7000);
        System.out.println(list + "-->"  +   list.size());
       // to remove
        list.remove(2);
        System.out.println(list + "-->"  +   list.size());


        

        // get
//        int val = list.get(1);
//        System.out.println(val);
  // loop using arraylist
//        for(int i=0 ;i< list.size();i++){
//            int val = list.get(i);
//            System.out.println(val);


        // alternative way of loop using
//        for(int val:list){
//            System.out.println(val);
//        }
        // if you want to print the full content then simply used sout
        System.out.println(list);
        }
    }

