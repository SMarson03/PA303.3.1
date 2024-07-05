import java.io.*;
import java.util.*;

public class JavaStringsToken {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            // Write your code here.
            //"He is a very very good boy, isn't he?"

            s = s.trim();
            if(s.length()==0){
                System.out.println(0);
                return;
            }
            String[] words = s.split("[^a-zA-Z]+");
            System.out.println(words.length);
            for(String word:words){
                System.out.println(word);
            }
            scan.close();
        }
    }



