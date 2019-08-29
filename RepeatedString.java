//question link  https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    long n=sc.nextLong();
    long count=0;
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)=='a')
            count++;
    }
     long f = n/str.length();
     long rem = n%str.length();
     count =  f*count;
    for(int i=0;i<rem;i++)
    {
        if(str.charAt(i)=='a')
            count++;
    }
    System.out.println(count);
}}
    

