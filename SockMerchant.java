//question link   https://www.hackerrank.com/challenges/sock-merchant/problem?filter=java&filter_on=language&h_l=interview&page=1&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    Integer n=sc.nextInt();
    int[] c=new int[n];
    int cnt=0;
     for(int i=0;i<n;i++)
     {
         c[i]=sc.nextInt();
     }
     HashMap<Integer, Integer> map = new HashMap<>();
     for (Integer item : c)
     {
          if (map.remove(item) == null)
         map.put(item, 1); 
     else { 
         cnt=cnt+ 1;
         } } 
      System.out.println(cnt);
    
}}
