import java.util.Scanner;
class Method_Implement_Demo{
		int countb=0;
		int counta=0;
		char array[]=new char[100];
		int top=-1;
	public  void push(char n){
		if(top>=10){
			System.out.println("Stack Overflow");
		}
		else{
			top++;
			array[top]=n;
		}
	}
	public  char pop(){
		if(top<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			char s = array[top];
			top--;
			return s;
		}
	}
	
	public  void power(int l){
		for(int i=0;i<l;i++){
			char s=pop();
			if(s=='a'){
				counta++;
			}
			if(s=='b'){
				countb++;
			}
		}
		if(counta==countb){
			System.out.println("Power of a and b are equal");
		}
		else {
			System.out.println("Power of a and b are not equal");
		}
	}
}

public class ParttenUsingSTACK {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Method_Implement_Demo mid=new Method_Implement_Demo();
		System.out.println("Enter a String : ");
		String str=sc.next();
		int l=str.length();
		for(int i=0;i<l;i++){
			mid.push(str.charAt(i));
		}
		mid.power(l);

	}
}