//question link   https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
import java.io.*;
import java.util.*;
public class Main
{       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int[] c=new int[26];
        for(int i=0;i<str.length();i++)
        {
            char d=str.charAt(i);
            int x=d-'a';
            c[x]=c[x]+1;
        }
        int k=0;
        int[] arr=new int[26];
        //count of letters in string
        for(int i=0;i<26;i++)
        {
            if(c[i]!=0)
            {
                arr[k]=c[i];
                k++;
            }
        }
        int z=1;
        for(int j=1;j<k;j++)
            {
                if(arr[0]==arr[j])
                {
                    z++;
                }
            }
        if(k==z)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
}}
