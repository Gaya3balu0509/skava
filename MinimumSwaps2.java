//question link
import java.io.*;
import java.util.*;
public class Main
{  public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        int temp,swapcount=0;
        int [] n=new int[len]; 
         for(int i=0;i<len;i++)
        {
            n[i]=sc.nextInt();
        }
        boolean v[]=new boolean[len];
        for(int i=0;i<len;i++)
        {
            int j=i,cycle=0;
           while(!v[j]){
                v[j]=true;
                j=n[j]-1;
                cycle++;
            }
             if(cycle!=0)
                swapcount+=cycle-1;
        }
        System.out.println(swapcount);
         }}
