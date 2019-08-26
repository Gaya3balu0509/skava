//question link   https://www.hackerrank.com/challenges/pairs/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=search
import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int cnt=0;
        Scanner sc = new Scanner(System.in);
        String[] n= sc.nextLine().split(" ");
        int noele = Integer.parseInt(n[0]);
        int diff = Integer.parseInt(n[1]);
        String[] newarr= sc.nextLine().split(" ");
        Arrays.sort(newarr);
        for(int i=0;i<newarr.length;i++)
        {
            for(int j=i;j<newarr.length;j++)
            {
                if(Integer.parseInt(newarr[j]) - Integer.parseInt(newarr[i])==diff)
                {
                    cnt=cnt+1;
                }
            }
        }System.out.println(cnt);
    }}
