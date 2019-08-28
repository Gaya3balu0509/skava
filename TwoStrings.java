//question link   https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        for(int k=0;k<Integer.parseInt(n);k++)
        {
       int cnt=0,flag=0;
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        for(int i=0;i<str1.length();i++)
    {
        for(int j=i;j<str2.length();j++)
        {
            if(str1.charAt(i)==str2.charAt(j))
            {
                flag=1;
                break;
            }
        }
    }
    
    if(flag==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO"); }
}}}
