package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
		ServerSocket server=new ServerSocket(8088);
		System.out.println("Server started, waiting for message.");
		Socket client=server.accept();           //监听，等待客户端连接
		PrintWriter pw=null;
		while(true) {
			BufferedReader br=new BufferedReader(
					new InputStreamReader(client.getInputStream()));// 输入流读取客户端发送请求信息
			String content=br.readLine();
			if(content.equals("end")) {
				server.close();
				br.close();
				if(pw !=null) {
					pw.close();
				}
				break;				
			}
			System.out.println(content);
			System.out.print("Server:");
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			pw=new PrintWriter(client.getOutputStream(),true);   //输出流向客户端发送信息		
			String output="Server:"+in.readLine(); //
			pw.println(output);
			pw.flush();			
		}
		System.out.println("Client left! Server Closed");
	}
		catch(IOException e) {
			e.printStackTrace();
		}
}
}
