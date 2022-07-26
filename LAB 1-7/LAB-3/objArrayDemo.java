import java.util.Scanner;
class StudentDtails{
Scanner sc = new Scanner(System.in);
	long enrollment_no;
	String name;
	int sem;
	double cpi;

void getDetail(){
		System.out.print("enter enrollment_no: ");
		enrollment_no=sc.nextLong();
		System.out.print("enter name: ");
		name=sc.next();
		System.out.print("enter sem : ");
		sem=sc.nextInt();
		System.out.print("enter cpi: ");
		cpi=sc.nextDouble();
	}

void display(){
		System.out.println("enrollment_no: "+enrollment_no);
		System.out.println("name: "+name);
		System.out.println("sem: "+sem);
		System.out.println("cpi: "+cpi);
	}
}

public class objArrayDemo{
	public static void main(String[] args) {
		StudentDtails s[]= new StudentDtails[5];

		for (int i=0;i<5 ;i++) {
			s[i]=new StudentDtails();
			s[i].getDetail();
			s[i].display();
		}
	}
}