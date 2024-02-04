package compile_time_exception;
class notfoundException extends Exception{
	String msg;
	notfoundException(String msg) {
		this.msg=msg;
	}
	public String get() {
		return msg;
	}
}

class Amazon{
	static void search() throws notfoundException {
	int no=5;
	if(no>5) {
		System.out.println("u get the output");
	}
	else {
	throw new notfoundException("invalid no of search");
	}
	}
	public static void main(String[] args) {
		try{
			search();
		}
		catch(notfoundException e) {
			System.out.println(e.get());
		}
	}
}
	

