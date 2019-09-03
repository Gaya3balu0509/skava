//question link    https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
import java.io.*;
import java.util.*;
public class Main
{       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character, Integer> Hmap= new HashMap<Character, Integer>(); 
        char[] arr = str.toCharArray();       
        for (char c:arr) { 
            if (Hmap.containsKey(c)) { 
                Hmap.put(c,Hmap.get(c)+ 1); 
            } 
            else { 
                Hmap.put(c, 1); 
            } 
        } 
        int cnt=0;
        char c=arr[0];
        int d=Hmap.get(c);
     
        for(char s:arr)
        {  
            if(Hmap.get(s)==d)
            
            {
                cnt+=1;
            }
        }
        if(cnt==str.length())
        {
            System.out.println("True");
        }
        else{
            {
            System.out.println("False");
        }
        }
    }
}
