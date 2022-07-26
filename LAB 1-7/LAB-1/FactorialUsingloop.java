import java.util.*;
public class FactorialUsingloop{
	public static void main(String[] args) {
		int fac=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number : ");
		int a = sc.nextInt();
		
		for(int i=1;i<=a;i++){
			fac=fac*i;
		}
		System.out.println("factorial of "+a+" is "+fac);
	}
}