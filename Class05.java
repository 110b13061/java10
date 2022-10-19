package java10;
class Cgg{
	private int num;
	public Cgg(int n) {
		num=n;
	}
	public int get() {
		return num;
	}
}
class Chh extends Cgg{
	public Chh() {
		super(2);
	}
	public void show() {
		System.out.println("num="+get());
	}
}
public class Class05 {
	public static void main(String args[]) {
		Chh hh = new Chh();
		hh.show();
	}
}
