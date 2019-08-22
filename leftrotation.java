import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String[] n= sc.nextLine().split(" ");
            int len = Integer.parseInt(n[0]);
            int no = Integer.parseInt(n[1]);
             String arr[] = new String[len];
             for(int i=0;i<len;i++)
             {
                 arr[i] = sc.next();
             }
             String newarr[] = new String[len];
             for(int i=0;i<len;i++)
             {
                 int x= (i + no) % len;
                 newarr[i]=arr[x];
                System.out.print(newarr[i]+" ");
    }}}
