//question link https://www.hackerrank.com/challenges/angry-children/problem?h_l=interview&page=5&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
import java.io.*;
import java.util.*;
import java.util.Collections;
public class Main 
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
     int[] arr= new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int min=arr[m-1]-arr[0];
        
        for (int i = 1; i < n-m; i++) {
            int x=arr[m+i-1]-arr[i];
            
            min=min>x?x:min;
        }
        if(m==1)
            System.out.println(arr[0]);
    
        else
            System.out.println(min);
    }
}
