//question link   https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            int len= sc.nextInt();
            for(int j=0;j<len;j++)
            {  int cnt=0;
                int a= sc.nextInt();
                for(int i=2;i<=a/2;i++)
                {
                    if(a%i==0)
                    {
                        cnt=cnt+1;
                        break;
                    }
                    
                }
                    if(cnt==0 && a!=1)
                    {
                        System.out.println("Prime");
                    }
                    else{
                        System.out.println("Not prime");
                    }
                }}}
