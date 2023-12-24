//Example of inheriting from Interface to class by implements
package interface1;
interface Demo{
void area();
void sum();
}
public class Sample implements Demo {
	public void area() {
		System.out.println("125");
	}
	public void sum() {
		System.out.println(225);
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.area();
		s.sum();
		
	}

}
