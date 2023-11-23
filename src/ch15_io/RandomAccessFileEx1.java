package ch15_io;

import java.io.IOException;
import java.io.RandomAccessFile;

class RandomAccessFileEx1 {
	public static void main(String[] args) {
		
			RandomAccessFile raf;
			try {
				raf = new RandomAccessFile("test.dat", "rw");
				System.out.println("파일 포인터의 위치: " + raf.getFilePointer());  //0
				raf.writeInt(100);
				System.out.println("파일 포인터의 위치: " + raf.getFilePointer()); //4
				raf.writeLong(100L);
				System.out.println("파일 포인터의 위치: " + raf.getFilePointer());  //12
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
}