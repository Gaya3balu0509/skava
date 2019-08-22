import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             int total= sc.nextInt();
             int count=0;
             for(int i=0;i<total;i++)
             {
                  count=0;
                 String s=sc.next();
                 char[] ch=s.toCharArray();
                 int len=ch.length;
                 for(int j=0;j<len-1;j++)
                 {
                     if(ch[j]==ch[j+1])
                     count++;
                 }
                 System.out.println(count);
             }}}

