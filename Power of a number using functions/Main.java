import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int power=power(base,exponent);
      System.out.println(power);
	}
  public static int power(int a,int b)
  {
    int p=1;
    for(int i=1;i<=b;i++)
    {
      p=p*a;
    }
    return p;
    
  }
  
}