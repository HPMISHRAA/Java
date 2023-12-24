//Abstraction example with abstract body and concrete method

package practice;
abstract class Demo1{
//	it is a abstract method
	abstract public void area_Of_Circle();
//	it is not a concrete method(normal method),as we know that it is not necessary to abstract class have abstract method
	public void area_of_Square() {
		int a=15;
		int result=a*a;
		System.out.println(result);
	}
}
public class Abstract1 extends Demo1 {
	public void area_Of_Circle() {
		System.out.println("area of the circle");
	}
	public static void main(String[] args) {
		Abstract1 a=new Abstract1();
		a.area_Of_Circle();
		a.area_of_Square();
	}

}
