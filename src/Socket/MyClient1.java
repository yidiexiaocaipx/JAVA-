package Socket;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MyClient1 {

	public static void main(String[] args) throws Exception{
		
		Socket s=new Socket("LocalHost",9000);
		new Thread(new ClientThread(s)).start();
		PrintStream ps=new PrintStream(s.getOutputStream());
		System.out.print("Client1:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String content=null;
		while((content=br.readLine()) !=null) {
			ps.println("Client1:"+content);   // ͨ������������������������Ϣ
		}
		
//		if(content.equals("end")) {
//			s.close();
//			br.close();
//			if(ps !=null) {
//				ps.close();
//			}
//		//	break;				
//		}
//		if(content !="end") {
//			ps.println("Client:"+content);
//		}
	}

}

