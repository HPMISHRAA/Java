//Inheriting form Interface to Interface
package interface1;
interface Nike{
	void shoes();
}
interface Puma extends Nike{
	void bags();
//	void shoes();
}
public class Hari_Outlet implements Puma{
public void bags() {
	System.out.println("bags are available");
}
public void shoes() {
	System.out.println("shoes are also available");
}
public static void main(String[] args) {
	Hari_Outlet h=new Hari_Outlet();
	h.bags();
	h.shoes();
}
}
