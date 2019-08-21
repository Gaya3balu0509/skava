import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System. in);
		String s=sc.nextLine();
      String[] sp=s.split(" ");
      int k=1;
      int length=sp.length;
      for(int i=0;i<length;i++)
      {
          int p=Integer.parseInt(sp[i]);
           k=k*p;          
      }
      int se = (int) Math.pow((Math.sqrt(k)),2);
        if(se==k)
        { System.out.println("yes");}
        else{
        System.out.println("no");
      
	}}}
    
