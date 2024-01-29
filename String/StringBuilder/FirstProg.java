package String.StringBuilder;

public class FirstProg {
    public static void main(String[] args) {
        //
//        StringBuilder sb = new StringBuilder("hello");
//        System.out.println(sb);
//        char ch = sb.charAt(0); // get
//        // set a value in string builder
//        sb.setCharAt(0,'k'); // update
//        //
//        sb.insert(2,'y'); // add
//        System.out.println(sb);
//        sb.deleteCharAt(2); // remove
//        System.out.println(sb);
//    sb.append('g'); // add something on the last
//        System.out.println(sb.length());
//    }
        // using string
//    int n =10000;
//    long start = System.currentTimeMillis();
//String s  = "";
//   for(int i=0;i<n;i++){
// s += i;
//
//   }

        int n =10000000;
   long start = System.currentTimeMillis();
// using string builder
   StringBuilder sb =  new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(i);

        }

long end = System.currentTimeMillis();
long duration = end -start;
        System.out.println(duration);

    }
}
