package Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MyServer {

	public static ArrayList<Socket> socketList=new ArrayList<>();
 	public static void main(String[] args) throws IOException{
        ServerSocket server=new ServerSocket(9000);
        while(true) {  //ѭ������accept�ȴ������û�����
        	Socket s=server.accept();
        	socketList.add(s);
        	new Thread(new ServerThread(s)).start();             //�����߳�
        }
	}

}
