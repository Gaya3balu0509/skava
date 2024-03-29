//question link   https://www.hackerrank.com/challenges/30-queues-stacks/problem
import java.io.*;
import java.util.*;
class Solution{
 Stack<Character> STACK = new Stack<Character>();  
 Queue<Character> waitingQueue = new LinkedList<>();
public void pushCharacter(char c)
{
        
        STACK.push(c); 
       
}
public Character popCharacter() 
    { Character y = (Character)STACK.pop(); 
       return y;
         
    } 

public void enqueueCharacter(char c)
{
      
        waitingQueue.add(c);
        
}
public Character dequeueCharacter()
{
    char st=waitingQueue.remove();  
    return  st;
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
