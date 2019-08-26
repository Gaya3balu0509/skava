import java.io.*;
import java.util.*;
public class Solution {
	    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";		
        Scanner scan = new Scanner(System.in);
         Integer inte=scan.nextInt();
         Double doubl=scan.nextDouble();
         String str=scan.next();
         str+=scan.nextLine();
        System.out.println(i+inte);
        System.out.println(d+doubl);
        System.out.println(s+str);
    }
}
