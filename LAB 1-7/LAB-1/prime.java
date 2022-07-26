import java.util.*;
class prime{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number : ");
		int a = sc.nextInt();
		int sum=0;
		for(int i = 1 ; i <=a/2; i++)
		{
			
			if(a%i==0){
				sum=1;
			}
		}
		if(sum==1)
			System.out.println(" prime number");
		else {
			System.out.println("not prime number");
		}
	}
}