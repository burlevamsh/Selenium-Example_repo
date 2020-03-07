package Polymorphsim;

class Program1{
	 void Test() {
		System.out.println("running programm in example 1");
	}
}
class Program2 extends Program1{
	 void Test() {
		System.out.println("running programm in example subclass");
	}
}

public class OverridingeExp1 {
	
	public static void main(String[] args) {
		Program2 p2=new Program2();
		p2.Test();
	}

}
