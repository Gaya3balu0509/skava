//question link     https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
import java.io.*;
import java.util.*;
public class Main
{  public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        int temp,swapcount=0;
        int [] n=new int[len]; 
         for(int i=0;i<len;i++)
        {
            n[i]=sc.nextInt();
        }
        boolean v[]=new boolean[len];
        for(int i=0;i<len;i++)
        {
            int cycle=0;
           while(!v[i]){
                v[i]=true;
                i=n[i]-1;
                cycle++;
            }
             if(cycle!=0)
                swapcount+=cycle-1;
        }
        System.out.println(swapcount);
         }}
