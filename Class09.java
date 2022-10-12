package java10;

class Cddd{
	private int num;
	public void display() {
		System.out.println("printed from Caaa class");
	}
}

class Ceee extends Cddd{
	public void display() {
		System.out.println("printed from Cbbb class");
	}
}
public class Class09 {
	public static void main(String args[]) {
		Cddd bb=new Ceee();
		bb.display();
	}
}
