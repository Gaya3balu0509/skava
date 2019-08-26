//question link https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int diff=10000000;
        Scanner sc = new Scanner(System.in);
        String n= sc.nextLine();
        String[] newarr= sc.nextLine().split(" ");
        for(int i=0;i<newarr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                int difference=Integer.parseInt(newarr[j]) - Integer.parseInt(newarr[i]);
                if(difference<diff && difference>0)
                {
                    diff=Integer.parseInt(newarr[j]) - Integer.parseInt(newarr[i]);
                   
                }
            }
        }
        System.out.println(diff);
    }}
