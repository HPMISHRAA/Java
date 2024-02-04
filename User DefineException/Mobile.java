package compile_time_exception;

public class Mobile {
static void battery() throws BatteryAlertException {
	int no=20;
	if(no>21) {
		System.out.println("use continue ur mobile");
	}
	else {
		throw new BatteryAlertException("low battery");
	}
}
public static void main(String[] args) {
	try{
		battery();
	}
	catch(BatteryAlertException b) {
		System.out.println(b.alert());
	}
}
}
class BatteryAlertException extends Exception{
	String battery;
	BatteryAlertException(String battery){
		this.battery=battery;
	}
	public String alert() {
		return battery;
	}
}
