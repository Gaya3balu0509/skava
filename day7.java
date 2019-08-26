//question link  https://www.hackerrank.com/challenges/30-arrays/problem
import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    String number=sc.nextLine();
    String [] arr= sc.nextLine().split(" ");
     int num = Integer.parseInt(number);

    for(int i=num-1;i>=0;i--)
    {   
         System.out.print(arr[i]+" ");
    }
    }
}
