//question link  https://www.hackerrank.com/challenges/30-bitwise-and/problem
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i= 0; i<t;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j= 1; j<=a;j++) {
                for (int k= j+1;k<=a;k++)
                {  int gg=j&k;
                   if(gg < b)
            {
                arr.add(gg);
            }      
        }} 
System.out.println(Collections.max(arr)); 
arr.clear();
}

}}
