//question link     https://www.hackerrank.com/challenges/recursive-digit-sum/problem?filter=java&filter_on=language&h_l=interview&page=1&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=recursion-backtracking
import java.util.Scanner;
import java.io.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Integer n = sc.nextInt();
        long value;
        String s = "";
        for (int i = 0; i < n; i++) {
            s += a;
        }
        long num = Long.parseLong(s);    
        value =num%9;
        if(value==0)
        value =(num-1)%9 +1;
        System.out.println(value);
    }

}
