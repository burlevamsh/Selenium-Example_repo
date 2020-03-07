import java.util.*;

class Addscan{

  public static void main(String [] args){
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value");
	a=sc.nextInt();
	System.out.println("enter b value");
	b=sc.nextInt();
	sc.close();
	System.out.println("addition of 2 numbers"+ (a+b));
}
}