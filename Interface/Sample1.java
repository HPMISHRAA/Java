//Inheriting from interface to between the classes
package interface1;
interface Demo1{
	void add();
	void mul();
}
abstract class Hari implements Demo1{
	public void add() {
		System.out.println(154);
	}
}
public class Sample1 extends Hari{
public void mul() {
	System.out.println(147);
}
public static void main(String[] args) {
	Sample1 s=new Sample1();
	s.mul();
	s.add();
}
}
