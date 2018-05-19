package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
//import java.net.ServerSocket;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		 InetAddress ia=null;
		try {
			ia=InetAddress.getLocalHost();
		//	String localhost=ia.getHostAddress();
			System.out.println(ia.getHostAddress());
			Socket client=new Socket("localhost",8088);     //指定服务器地址和端口
			System.out.println("Client started, ready for write messsge.");
			//Socket client=server.accept();
			PrintWriter pw=null;
			InputStreamReader isr=null;
			while(true) {
				System.out.print("Client:");
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				String input=br.readLine();
				pw=new PrintWriter(client.getOutputStream(),true);  
				pw.println("Client:"+input);   // 通过输出流向服务器发送请求信息
				if(input.equals("end")) {
					client.close();
					br.close();
					if(isr !=null) {
						isr.close();
					}
					break;				
				}
				isr=new InputStreamReader(client.getInputStream());   //通过输入流获取服务器响应
				System.out.println(new BufferedReader(isr).readLine());					
			}
			System.out.println("Client Stopped!");
		}
			catch(IOException e) {
				e.printStackTrace();
			}
	}

}
