Access Modifiers

Access Modifiers are of 4 types private, <package>, public and protected. If no access specifier is given then the default access specifier is <package>. A 'class' can be of either public or <package>. 'protected' is used for variables, methods and constructors and during inheritance. Access modifiers cannot be used for 'blocks'.


Example

package a;
class A{
       private int a;
       int b;
       protected int c;
       public int d;
}


package a;
class B{
      
}


package b;
class C extends A{
      
}

package b;
class D{
      }


Since in class A has a variable 'a' is declared with access specifier private then variable 'a' can be accessed with class A. Since variable 'b' doesn't have any access specifier its of having default access specifier that is <package>, hence variable 'b' is accessed anywhere where 'package a ' is used ( So 'b' variable available in class A and class B since 'package a ' is used for class A and class B). Variable 'c' is declared with access specifier 'protected', hence variable 'c' is available by classes with package name 'package a ', since variable 'c' declared in class A declared with 'package a'. Additionally variable 'c' can be used also by 'Class C' because 'Class C' extends 'Class A'. Variable 'd' can be used by class A, Class B , Class C and class D because variable 'd' declared as 'public'.



Example


package p1;

public class A {
	private int a=30;
	int b=40;
	protected int c=50;
	public int d=60;
	public static void main(String[] args) {
	 A aObject = new A();
	 System.out.println(aObject.a);
	 System.out.println(aObject.b);
	 System.out.println(aObject.c);
	 System.out.println(aObject.d);
	}
}


Output

30
40
50
60




package p1;

public class B {

	public static void main(String[] args) {
		A aObject = new A();
		System.out.println(aObject.b); //only b, c and d can be accessed not 'a', since declared private
		System.out.println(aObject.c);
		System.out.println(aObject.d);
	}

}



Output
40
50
60



package p2;

import p1.A;

public class C extends A{

	public static void main(String[] args) {
         A aObject = new A();
         System.out.println(aObject.d); 
	C cObject = new C();
	System.out.println(cObject.c);	}

}

Output

60
50



 System.out.println(aObject.d); //when class A object created only public members are accessible
System.out.println(cObject.c);// but class A variable 'c' can be accessed through class C instance not by class instance of class A in class C. Protected is the access Modifiers is used only with inheritance 
