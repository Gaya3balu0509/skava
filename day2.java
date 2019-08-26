//question link  hackerrank.com/challenges/30-operators/problem
import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    double meal=sc.nextDouble();
    double tip1,tax1,total;
    int tip=sc.nextInt();
    int tax=sc.nextInt();
    tip1=(meal*tip)/100;
    tax1=(meal*tax)/100;
    total=meal+tip1+tax1;
    System.out.println(Math.round(total));
    }
}
    
