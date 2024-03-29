//question link     https://www.hackerrank.com/challenges/30-scope/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

    Difference (int[] elements)
    { 
         this.elements=elements;
    }
  
    public void computeDifference()
    { 
    Arrays.sort(elements);
    ArrayList<Integer> Maxm = new ArrayList<Integer>();
        for(int i=0;i<elements.length;i++)
        {  
        for(int j=i;j<elements.length;j++)
        {
        int c=elements[j]-elements[i];
        Maxm.add(c);
        }
        }
        maximumDifference=Collections.max(Maxm);
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
