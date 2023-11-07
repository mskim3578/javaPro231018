package ch09_lang;


class CloneEx1 {
	public static void main(String[] args)   {
		Point original = new Point(3, 5);
		Point copy = (Point) original.clone2(); // 복제(clone)해서 새로운 객체를 생성
		copy.y=999;
		System.out.println(original);
		System.out.println(copy);
	}
}
class Point  implements Cloneable {
	int x;	int y;
	public Point(int x, int y) {
		super();
		this.x = x;		this.y = y;	}
	@Override
	protected Object clone()  {
		// TODO Auto-generated method stub
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	protected Object clone2()  {
		// TODO Auto-generated method stub
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";	}

	}

