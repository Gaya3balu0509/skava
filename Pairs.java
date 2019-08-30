//question link   https://www.hackerrank.com/challenges/pairs/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=search
import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int cnt=0;
        Scanner sc = new Scanner(System.in);
        Integer noele= sc.nextInt();
        Integer target= sc.nextInt();
        int[] newarr= new int[noele];
        for(int i=0;i<noele;i++){
            newarr[i]=sc.nextInt();
        }
        Arrays.sort(newarr);
        for(int i=0;i<newarr.length;i++)
        {
            for(int j=i+1;j<newarr.length;j++)
            {
                if(newarr[j]-newarr[i]==target || newarr[i] -newarr[j]==target)
                {
                    cnt=cnt+1;
                }
                if (newarr[j]-newarr[i]> target || newarr[i] -newarr[j]>target) 
                {
                    break;
            }}
        }System.out.println(cnt);
}}
