//question link    https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             int total= sc.nextInt();
             int count=0;
             for(int i=0;i<total;i++)
             { 
		         //initialse count
                  count=0;
                 String s=sc.next();
                 char[] ch=s.toCharArray();
                 int len=ch.length;
                 for(int j=0;j<len-1;j++)
                 {
                     if(ch[j]==ch[j+1])
                     count++;
                 }
                 System.out.println(count);
             }}}

