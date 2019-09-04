import java.io.*;
import java.util.*;
public class Main
{       public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
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
         else if(Hmap2.size()==2)
         {
           
            int a = Hmap2.keySet().iterator().next(); 
            int b = Hmap2.keySet().iterator().next(); 
            int c=a-b;
            if(c==1 ||c==-1)
            System.out.println("YES");
            else
            System.out.println("NO"); 
         }  
         else{
             System.out.println("NO");
         }  
        }}   
