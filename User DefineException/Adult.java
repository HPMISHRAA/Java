package compile_time_exception;

public class Adult {
static void permission() throws TakePermissionException {
	int age=15;
	if(age>18) {
		System.out.println("simply u can enter");
	}
	else {
		throw new TakePermissionException("age restricion");
	}
}
public static void main(String[] args) {
	try{
		permission();
	}
	catch(TakePermissionException p) {
		System.out.println(p.accepttheterm());
	}
}
}
class TakePermissionException extends Exception{
	String age;
	TakePermissionException(String age){
		this.age=age;
	}
	public String accepttheterm() {
		return age;
	}
}
