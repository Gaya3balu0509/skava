//question link  https://www.hackerrank.com/challenges/ctci-big-o/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=miscellaneous
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
                for(int i=1;i<=a;i++)
                {
                    if(a%i==0)
                    {
                        cnt=cnt+1;
                    }
                    
                }
                    if(cnt==2)
                    {
                        System.out.println("Prime");
                    }
                    else{
                        System.out.println("Not prime");
                    }
                }}}
