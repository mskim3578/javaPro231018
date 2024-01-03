package ch02_var;

import java.util.Arrays;

public class Hello {

	public static void main(String[] args) {
		System.out.println("hello");
		name1("aaa", "a","b","c");
		name2("aaa", "a","b","c");
	}
	
	public static void name1(String ...b) {
		System.out.println(Arrays.asList(b));
		
	}
	
	public static void name2(String a, String ...b) {
		System.out.println(a);
		System.out.println(b);
	}

}
