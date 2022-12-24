package raunak;

class parent {
	String name;

	public parent(String n) {
		name = n;
	}
}

public class Child extends parent {

	String name;

	public Child(String n1, String n2) {
		super(n1);
		this.name = n2;
	}
	public void details() {
		System.out.println(super.name+" and "+name);
	}

	public static void main(String[] args) {
		Child obj=new Child("parent","child");
		obj.details();
	}
}
