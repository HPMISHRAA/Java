package stack_unwinding;
public class Airthmetic {
	static void disp3(){
		int i=1/0;
	}
	static void disp2() {
		disp3();
	}
	static void disp1() {
		disp2();
	}

 
public static void main(String[] args) {
	System.out.println(" main starts  ");
	try {
	    disp1();
	}
	catch(ArithmeticException e) {
		System.out.println("end");
	}
}
}
