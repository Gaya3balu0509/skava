//question link    https://www.hackerrank.com/challenges/30-more-exceptions/problem
import java.util.*;
import java.io.*;
import java.lang.Math; 
class Calculator{
     int power(int a,int b)
     {   int ans=0;
         if(a>=0 && b>=0)
         {
              ans=(int)Math.pow(a,b);
         }
         else{
             throw new ArithmeticException("n and p should be non-negative");
         }
        return ans;
     }
} 
class Solution{
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
