//queston link
import java.io.*;
import java.util.*;
public class Main
{  public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sum=0,cnt=0;
        int len=sc.nextInt();
        int total=sc.nextInt();
        int [] n=new int[len]; 
         for(int i=0;i<len;i++)
        {
            n[i]=sc.nextInt();
        }
        Arrays.sort(n);
        for(int i=0;i<len;i++){
            if(sum<total)
            {
                sum+=n[i];
                cnt++;
            }
        } System.out.println(cnt-1);
         }}
