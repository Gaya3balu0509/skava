import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
      System.out.println(fib(a));
    
    } 
     public static int fib(int num) 
     {  if (num == 0) {
            return 0;   }
        else if(num == 1)
        { return 1;
        }
       return fib(num-1) + fib(num-2);
    }
}
