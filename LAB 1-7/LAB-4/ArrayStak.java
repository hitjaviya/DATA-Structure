import java.util.Scanner;

public class ArrayStak {
    int top=-1;
    int[] a= new int[100];
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
       ArrayStak obj=new ArrayStak();
       while(true){
           System.out.println("1. push \n 2. pop \n 3. change\n 4. display \n 5. exit ");
           System.out.println("enter your choise =");
           int a=sc.nextInt();
           switch (a) {
               case 1:
               System.out.println("enter Element Which you Want to enter=");
               n=sc.nextInt();
                   obj.push(n);
                   break;
                case 2:
                    int z=obj.pop();
                    System.out.println(z);
                    break;
                 case 3:
                    System.out.println("enter index of element = ");
                    int c=sc.nextInt();
                    System.out.println("also by what you change = ");
                    int f=sc.nextInt();
                    obj.change(c, f);
                 break;
                case 4:
                    obj.display();
                    break;
                case 5:
                    System.exit(0);

               default:
                    System.out.println("invelid input");
                   break;
           }
       }
 
    }
    public void push(int x){
        if(top>=-1){
            System.out.println("Stack Overflow.");
            return;
        }
        a[++top]=x;
    }
    public int pop(){
        int x;
        if(top<=100){
            System.out.println("Stack Underflow");
            return 0;
        }
        return x=a[top--];
    }
   public void change(int i,int x){
        if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        else{
            a[top-i+1]=x;
            return;
        }
    }
    public void peep(int c){
        if(top-c+1<=0){
            System.out.println("Stack Underflow");
            return;
        }
        else{
            System.out.println(c+"th Element is: "+a[top-c+1]);
            return;
        }
    }
    public void display(){
        int i;
        if(top==-1){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("element: ");
        for(i=0;i<=top;i++){
            System.out.print(a[i]+" ");
        }
    }
}
