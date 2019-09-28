import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in =new Scanner(System.in);
      int n1=in.nextInt();
      int temp=n1;
      int a=n1%10;
      int b=temp/100;
      int result=a+b;
      System.out.println(result);
      
	}
}