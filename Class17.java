package java10;
class car{
	protected String owner;
	protected String id; 
}
	class CColor extends car{
	protected String color;
	
	public void CColor(String own,String s) {
		owner=own;
		id=s;
	}
	public void show() {
		System.out.println("車主名字:"+owner);
		System.out.println("車牌號碼:"+id);
		System.out.println("車身顏色:"+color);
	}
}

public class Class17 {
	public static void main(String args[]) {
		CColor mycar = new CColor("Riaan","Al-2345","Black");
		mycar.show();
	}
}
