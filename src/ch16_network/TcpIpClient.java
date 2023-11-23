package ch16_network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient {
	public static void main(String args[]) {
		
			String serverIp = "192.168.0.155";  //cmd ipconfig
		
  			// 소켓을 생성하여 연결을 요청한다.
			try {
				Socket socket = new Socket(serverIp, 7777);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("서버에 연결되었습니다.");
			
		
	} // main
} // class