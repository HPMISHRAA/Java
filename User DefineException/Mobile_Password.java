package compile_time_exception;

public class Mobile_Password {
static void password() throws ScreenLockException {
	int no=5;
	if(no>6) {
		System.out.println("unlock ur mobile");
	}
	else {
		throw new ScreenLockException("due to try more than 3 times");
	}
}
public static void main(String[] args) {
	try{
		password();
	}
	catch(ScreenLockException e) {
		System.out.println(e.get());
	}
}
}
class ScreenLockException extends Exception{
	String password;
	ScreenLockException(String password){
		this.password=password;
	}
	String get() {
		return password;
	}
}
