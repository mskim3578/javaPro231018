package ch04_controll;

public class ExCont03 {
	/*
	 * 중첩 반복문 : 반복문 내부에 반복문이 존재.
	 *           구구단 가로 출력하기 
	 * 
2*2=4	3*2=6	4*2=8	5*2=10	6*2=12	7*2=14	8*2=16	9*2=18	
2*3=6	3*3=9	4*3=12	5*3=15	6*3=18	7*3=21	8*3=24	9*3=27	
2*4=8	3*4=12	4*4=16	5*4=20	6*4=24	7*4=28	8*4=32	9*4=36	
2*5=10	3*5=15	4*5=20	5*5=25	6*5=30	7*5=35	8*5=40	9*5=45	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <=9 ; i++) {
			for (int j = 2; j <= 9 ; j++) {
				System.out.print(j + "*" + i+ "="+(j*i)+ "\t");
			}
			System.out.println();
		}

	}

}
