//question link    https://www.hackerrank.com/challenges/30-review-loop/problem?h_r=next-challenge&h_v=zen
import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    
    int number=sc.nextInt();
    for(int i=0;i<number;i++)
    {   String odd="",even="";
        String s=sc.next();
        for(int j=0;j<s.length();j++)
        {   char c=s.charAt(j);
             if(j%2==0)
            {
               even+=c;
            }
            else{
                odd+=c;
            }
        }System.out.println(even+" "+odd);
    }
    }
}
