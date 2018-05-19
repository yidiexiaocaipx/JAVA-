package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientThread implements Runnable{
	private Socket s;
	BufferedReader br=null;
	public ClientThread(Socket s)throws IOException{
		this.s=s;
		br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
	public void run(){
		try {
			String content=null; //从服务端读取数据
			while((content=br.readLine()) !=null) {
				System.out.println(content);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
