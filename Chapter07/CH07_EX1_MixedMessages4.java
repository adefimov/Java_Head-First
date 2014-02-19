//Output: B's m1, A's m2, C's m3, 13
class A {
	int ivar = 7;
	void m1() {
		System.out.print("A's m1, ");
	}
	void m2() {
		System.out.print("A's m2, ");
	}
	void m3() {
		System.out.print("A's m3, ");
	}
}

class B extends A {
	void m1() {
		System.out.print("B's m1, ");
	}
}

class C extends B {
	void m3() {
		System.out.print("C's m3, " + (ivar + 6));
	}
}

public class CH07_EX1_MixedMessages4 {
	public static void main(String [] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		A a2 = new C();

		//Changing Code - Start
		a2.m1();
		a2.m2();
		a2.m3();
		//Changing Code - End

		System.out.print("\n");
	}
}
