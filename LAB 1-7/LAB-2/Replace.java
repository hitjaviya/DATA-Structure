import java.util.Scanner;
public class Replace{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arrys[] = new int[n];
		for (int i =0 ;i<n ; i++ ) {
			System.out.println("Enter Arry element");
			arrys[i]=sc.nextInt();
		}
		System.out.println("Enter Replace Number");
		int a = sc.nextInt();
		System.out.println("Enter new Number");
		int b = sc.nextInt();
		boolean flag=true;
		for (int k = 0 ;k<n ;k++ ) {
			if(arrys[k]==a){
				System.out.println("Number Has Founded on "+k);
				arrys[k]=b;
				flag=false;
			}
			if (flag==true) {
				System.out.println("Number not found");
			}
			if(flag==false){
				System.out.println("new arry");
				for (int j = 0;j<n ;j++ ) {
					System.out.println(arrys[j]);
				}
			}
		}
	}
}