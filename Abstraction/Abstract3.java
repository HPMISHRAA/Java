//Abstraction example with multiple Abstract class overriden in multiple sub class
package practice;
abstract class Demo3{
	abstract public void sum();
	abstract public void mul();
}
abstract class Prasad1 extends Demo3{
	public void sum() {
		System.out.println(1250);
	}
}
public class Abstract3 extends Prasad1{
	public void mul() {
		System.out.println(225);
	}
	public static void main(String[] args) {
		Abstract3 p=new Abstract3();
		p.mul();
		p.sum();
		
	}

}
