//question link   https://www.hackerrank.com/challenges/recursive-digit-sum/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=recursion-backtracking
import java.io.*;
import java.util.*;
public class Main
{    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        Integer n=sc.nextInt();
        String s="";
        for(int i=0;i<n;i++)
        { s+=a;
        }
        double num=Double.parseDouble(s);      
        while(num>9){
        int sum=0;
        while(num!=0)
        {
        sum+=num%10;
        num/=10;
        } 
        num=sum;
        }
        int value = (int)num;
        System.out.println(value);
    }
}
