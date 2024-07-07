import java.io.*;
import java.util.*;

//Java String Introduction
public class JavaStringToken {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len=A.length()+B.length();

        System.out.println(len);

        int result = A.compareTo(B);
        if(result > 0) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " "+ B.substring(0, 1).toUpperCase() + B.substring(1));

    }
}