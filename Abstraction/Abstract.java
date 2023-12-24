//Abstraction example with abstract method

package practice;
abstract class Demo{
	abstract public void area();
}
public class Abstract extends Demo {
	public void area() {
		int a=14;
		int b=12;
		int c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Abstract a=new Abstract();
		a.area();
	}

}
