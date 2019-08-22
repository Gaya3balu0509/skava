import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            String[] n= sc.nextLine().split(" ");
            int len = Integer.parseInt(n[0]);
            int no = Integer.parseInt(n[1]);
            String[] newarr= sc.nextLine().split(" ");
            for(int i=0;i<len;i++)
             {
                 int x= (i + no) % len;
                System.out.print(newarr[x]+" ");
    }}}
