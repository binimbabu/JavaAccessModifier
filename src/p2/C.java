package p2;

import p1.A;

public class C extends A {

	public static void main(String[] args) {
		A aObject = new A();
		System.out.println(aObject.d); // when class A object created only public members are accessible
		C cObject = new C();
		System.out.println(cObject.c);// but class A variable 'c' can be accessed through class C instance not by
										// class instance of class A in class C
	}

}
