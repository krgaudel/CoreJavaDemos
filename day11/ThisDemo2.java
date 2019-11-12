package day11;

public class ThisDemo2 {
	//instance variable
	int a=5;
	public void show() {
		System.out.println(a);// prints 5-instance variable
		int a=4;
		System.out.println(a);// prints 4-local variable
		System.out.println(this.a);// prints 5- instance variable because of this.a
	}
	public static void main(String[] args) {
		ThisDemo2 obj=new ThisDemo2();
		obj.show();
	}

}
