package compile_time_exception;

public class Ola {
static void book() throws OlaException{
	int no=4;
	if(no>10) {
		System.out.println("happy journey");
	}
	else {
		throw new OlaException("more no of passenger");
	}
}
public static void main(String[] args) {
	try{
		book();
	}
	catch(OlaException e) {
		System.out.println(e.get());
	}
}
}
class OlaException extends Exception{
	String passenger;
	OlaException(String passenger){
		this.passenger=passenger;
	}
	public String get() {
		return passenger;
	}
}
