//question  link    https://www.hackerrank.com/challenges/30-nested-logic/problem
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int e= sc.nextInt();
        int f= sc.nextInt();
        int dd=a-d;
        int mm=b-e;
        int yy=c-f;
        if(yy==0){
            if(mm==0)
            {
                if(dd>0)
                {
                System.out.println(dd*15);  
                }
            }
            else if(mm>0){
                 System.out.println(mm*500);
                
            }
            else{
                System.out.println("0");  
            }
        }     
        
        else if(yy>0) {
            System.out.println("10000");
        }
        else{
            System.out.println("0");
        }
    }
}

