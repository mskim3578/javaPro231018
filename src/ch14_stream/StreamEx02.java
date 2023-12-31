package ch14_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx02 {
	/* Stream 생성하기
	 * Array  to Stream
	 * Stream<String> strStream = Arrays.stream(strArray);*/
	public static void main(String[] args) {
		String[] strArray = { "홍길동", "신용권", "김미나"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream = Arrays.asList(strArray).stream();
		strStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
		
		
		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> System.out.print(a + ","));
		System.out.println();	// TODO Auto-generated method stub

	}

}
