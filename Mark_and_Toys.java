//question link   https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting&h_r=next-challenge&h_v=zen
import java.io.*;
import java.util.*;
public class Main
{  public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sum=0,cnt=0;
        int len=sc.nextInt();
        int total=sc.nextInt();
        int [] n=new int[len]; 
         for(int i=0;i<len;i++)
        {
            n[i]=sc.nextInt();
        }
        Arrays.sort(n);
        for(int i=0;i<len;i++){
            if(sum<total)
            {
                sum+=n[i];
                cnt++;
            }
        } System.out.println(cnt-1);
         }}
