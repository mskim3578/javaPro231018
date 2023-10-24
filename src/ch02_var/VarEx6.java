package ch02_var;
/*
           sign bit
          1 1 1 1 1 1 1
255 :   1 1 1 1 1 1 1 1 
========================
                      0 + 1 = 1
     sign bit 1  ---->   -1 읽는다

      1111111111111111111111111111111
-1:  11111111111111111111111111111111
      ===============================
				  0 + 1 = -1				

      1111111111111111111111111111111
-10: 11111111111111111111111111110110
                                 1001
                                   +1
                               = 1010

9=1001
      1111111111111111111111111111111
-128:11111111111111111111111110000000
                              1111111
127:1111111
 */





public class VarEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = -1;
		byte b2 = -10;
		byte b3 = -128;
		//long Long
		System.out.println(b1+":  "+Integer.toBinaryString(b1));
		System.out.println(b2+": "+Integer.toBinaryString(b2));
		System.out.println("9="+Integer.toBinaryString(9));
		System.out.println(b3+":"+Integer.toBinaryString(b3));
		System.out.println("127:"+Integer.toBinaryString(127));
		}}