//question link   https://www.hackerrank.com/challenges/30-binary-numbers/problem
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) 
    {
        int n, count=0,op=0;
        String x = "";
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while(n > 0)
        {   int a = n % 2;
            x = a + x;
            n = n / 2;
        }       
       for(int i = 0;i<x.length();i++)
        {
            if(x.charAt(i) == '1')
            {
                count++;
                if(count > op)
                    op = count;
            }
            else
            {
                count = 0;
            }}        
        System.out.println(op);
} 
} 
     
