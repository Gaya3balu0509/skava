import java.io.*;
import java.util.*;
public class Main
{       public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int[] a=new int[3];
        HashMap<Character, Integer> Hmap= new HashMap<Character, Integer>(); 
        HashMap<Integer, Integer> Hmap2= new HashMap<Integer,Integer>();
        char[] arr = str.toCharArray();       
        for (char c:arr) { 
            if (Hmap.containsKey(c)) { 
                Hmap.put(c,Hmap.get(c)+ 1); 
            } 
            else { 
                Hmap.put(c, 1); 
            } 
        }
        
        for (Map.Entry<Character,Integer> entry1 : Hmap.entrySet())  
        {   int d=entry1.getValue();
                 Hmap2.put(d, 2); 
        }
         if(Hmap2.size()==1)
         {
             System.out.println("YES");
         }
         
         else if(Hmap2.size()==2){
             int i=0;
         for (Map.Entry entry : Hmap2.entrySet()) 
        {   
           a[i++]= (int)entry.getKey();
        }
            int c=a[1]-a[0];
            System.out.println(a[1]+" "+" "+a[0]+" "+c);
            if(c==1 ||c==-1)
            System.out.println("YES");
            else
            System.out.println("NO"); 
         }  
         else{
             System.out.println("NO"); 
         } 
        }}   
