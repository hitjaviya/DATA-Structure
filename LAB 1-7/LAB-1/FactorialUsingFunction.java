import java.util.*;
class FactorialUsingFunction{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter number : ");
		int a = sc.nextInt();
		fact fc = new fact();
		int u = fc.fact(a);
		System.out.println(u);
	}

}
class fact{
	int fact (int x){

		if(x==1)
			return 1 ;

		return fact(x-1)*x;
	}
}
