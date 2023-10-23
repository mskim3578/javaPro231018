package ch02_var;

public class VarEx1 {

	public static void main(String[] args) { // 실행 메소드
		// TODO Auto-generated method stub
		// 변수의 선언 및 초기화
		byte b1 = -22; // 1 byte 8bit
		byte b2; // 변수의 선언. b2 저장공간 메모리 1바이트(8bit) 할당.
		// 바이트로 저장할 수 있는 값의 범위. -128 ~ 127 저장가능
		// 정수 리터럴은 기본 int
		b2 = -128; // 변수의 초기화
		b1 = 127;
		short s1 = -220; // 2 byte 16bit
		int i1 = 100; // 4 byte 32bit
		long l1 = 1000; // 8 byte 64bit
		int i2 = (int) l1;
		// 변수값 내용을 화면에 출력하기
		// System.out.println : 화면에 값을 출력.
		System.out.println("b1=" + b1); // b1=-22
		System.out.println("s1=" + s1);
		System.out.println("i1=" + i1);
		System.out.println("l1=" + l1);
		// 실수 리터럴은 기본 double
		float f1 = 1.0F; // float
		f1 = l1;
		double d1 = 1.0;
		double d12 = 1L;

		System.out.println("f1=" + f1);
		System.out.println("d1=" + d1);

	}// main end

}// end class
