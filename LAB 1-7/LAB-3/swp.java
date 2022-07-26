import java.util.*;
public class swp{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter two numbers");
		int a=sc.nextInt();
		int b =sc.nextInt();
		System.out.println("before swap a="+a);
		System.out.println("before swap b="+b);
		
		int temp = a;
		a=b;
		b=temp;
		System.out.println("after swap a="+a);
		System.out.println("after swap b="+b);

	}
}