package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread implements Runnable{
	Socket s=null;
	BufferedReader br=null;
	public ServerThread(Socket s) throws IOException{
		this.s=s;
		br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
	public void run(){
		try {			
			String content=null; //从客户端读取数据
			while((content=readFromClients()) !=null) {
				for(Socket s:MyServer.socketList) {
					PrintStream ps=new PrintStream(s.getOutputStream());
					ps.println(content);
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public String readFromClients() {
		try {
			return br.readLine();
		}
		catch(IOException e) {
			MyServer.socketList.remove(s);
		}
		return null;
	}

}
