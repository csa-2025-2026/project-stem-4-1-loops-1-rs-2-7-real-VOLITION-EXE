import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    

    Scanner N = new Scanner(System.in);
    
    //#1&#2
    
    int sum = 0;
    int most = 0;
    System.out.println("Enter any numbers (Enter -1 to stop)");
    int s = N.nextInt();
    while(s>=0){
      sum += s;
      most = Math.max(s, most);
      s = N.nextInt();
    }
    System.out.println("Sum is "+sum);
    System.out.println("The largest score is "+most);
    N.nextLine();
    
    //#3
    System.out.println("Input a word:");
    String k = N.nextLine();
    String H ="";
    int i = 0;
    while(i<k.length()){
      H+=k.substring(i, Math.min(k.length()-1,i+2));
      i+=3;
    }
    System.out.println(H+k.substring(k.length()-1));
  }
}
