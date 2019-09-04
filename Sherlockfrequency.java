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
        System.out.println("        Map 1       ");
        for (Map.Entry<Character,Integer> entry1 : Hmap.entrySet())  
        {   int d=entry1.getValue();
            

        if(Hmap2.containsKey(d))
            {
                 Hmap2.put(d,Hmap2.get(d) + 1);
            }
            else{
                 Hmap2.put(d, 1); 
            }
            
            System.out.println("Key = "+entry1.getKey()+", Value =   "+ entry1.getValue()); 
        }
        
        System.out.println("        Map 2       ");
        for (Map.Entry<Integer,Integer> entry : Hmap2.entrySet()) 
        {   
            System.out.println("Key = " + entry.getKey() +  ", Value = " + entry.getValue());  
        }        
        }}   
