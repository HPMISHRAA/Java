package stack_unwinding;

public class Arithmetic2 {
static void foo() {
	int no=1/0;
}
static void foo1() {
	foo();
}
static void foo2() {
	foo1();
}
static void foo3() {
	foo2();
}
public static void main(String[] args) {
	try {
		foo3();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("hello");
}
}
