//question link  https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
import java.io.*;
import java.util.*;
public class Main
{  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        int temp,count=0;
        int [] n=new int[25]; 
         for(int i=0;i<len;i++)
        {
            int a=sc.nextInt();
             n[i]=a;  
        }
          for(int i=0;i<len;i++)
        { 
            for(int j=0;j<len-i-1;j++)
        {  
            if (n[j]>n[j+1])
        {   count++;
            temp=n[j];
            n[j]=n[j+1];
            n[j+1]=temp;
        }}}
        System.out.println("Array is sorted in "+count+ " swaps.");
        System.out.println("First Element: "+n[0]); 
        System.out.println("Last Element: "+n[len-1]); 
         }}
