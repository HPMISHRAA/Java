//Abstraction example of multiple Abstract method, overriden in single sub class
package practice;
abstract class Demo2{
	abstract public void area();
	abstract public void sum();
}
public class Abstract2 extends Demo2 {
   public void area() {
			System.out.println("area of the circle");
		}
   public void sum() {
	   System.out.println("sum of the two number");
	}
   public static void main(String[] args) {
	Abstract2 a=new Abstract2();
	a.area();
	a.sum();
}

}
