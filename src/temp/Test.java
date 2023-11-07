package temp;

public class Test {
	/*
	=====
	B
	A*/
	public static void main(String[] args) {
		String s1 = "abc"; // 대입연산자로 객체 생성
		String s2 = "abc";
		String s3 = new String("abc"); // new 연산자로 객체 생성
		String s4 = new String("abc");
		System.out.println(s3==s4);
		
	}

}

class A {
	static void method() {
		System.out.println("A");
	}
}
class B extends A {
     static void method() {
		System.out.println("B");
	}
}
