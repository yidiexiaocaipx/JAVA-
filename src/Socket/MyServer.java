package Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MyServer {

	public static ArrayList<Socket> socketList=new ArrayList<>();
 	public static void main(String[] args) throws IOException{
        ServerSocket server=new ServerSocket(9000);
        while(true) {  //循环调用accept等待接收用户请求
        	Socket s=server.accept();
        	socketList.add(s);
        	new Thread(new ServerThread(s)).start();             //创建线程
        }
	}

}
