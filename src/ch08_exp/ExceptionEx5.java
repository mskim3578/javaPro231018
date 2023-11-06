package ch08_exp;
/*
 * throws 예외 처리 
 * throws Exception를 처리한 메소드는 콜한 메소드에서 처리 하여야함   
 * 단 RuntimeException은 처리 하지 않아도 됨
 */
public class ExceptionEx5 {
	public static void main(String[] args)    {
		try {
			first(); //1
		} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		}//1
		System.out.println("end main");
		}
	private static void first() throws Exception   {
			second();	//2	
			System.out.println("first");//4
	}
	private static void second() throws Exception{
		System.out.println("second 메서드");//3
		//NumberFormatException 예외 발생
		//s	System.out.println(Integer.parseInt("abc"));
		
		
	}
}

