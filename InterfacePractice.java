package interfacepractice;


//1. The java compiler adds public
	//and abstract keywords before the interface methods.
	//2. Java compiler also adds public , static and final keywords before 
	// data members.


interface Printable {
	public abstract void printInterface();
}
public class InterfacePractice implements Printable {
	public void printInterface() {
		System.out.println("Interface is printed.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfacePractice ip = new InterfacePractice();
		ip.printInterface();
	}

}
