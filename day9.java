//question link  https://www.hackerrank.com/challenges/30-recursion/problem
import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    int number=sc.nextInt();
    System.out.println(factorial(number));
    }
   
     public static int factorial(int num) 
     {  
         if(num==0)
         {
             return 1;
         }
         else
         {
       return num*factorial(num-1);
         }
     }
}
