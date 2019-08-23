//question  https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues

import java.util.*;
import java.io.*; 
public class Main {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int j=0;j<n;j++)
        {
        String str=in.next();
         Stack st = new Stack<>();
         for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') 
            {
                   st.push(str.charAt(i));
            } 
            else if ( !st.empty() && ((str.charAt(i) == ']' && st.peek() == '[') || (str.charAt(i) == '}' && st.peek() == '{') ||(str.charAt(i) == ')' && st.peek() == '(')))
       { st.pop();
 
             } else {
                  st.push(str.charAt(i));
             }
         }
 
         if(st.empty()) {
              System.out.println("YES");
         } else {
              System.out.println("NO");
         }
   }}
}
