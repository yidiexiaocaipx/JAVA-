package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
      URL url=new URL("http://www.baidu.com");
      InputStream is=url.openStream();    //获取资源字节输入流
      InputStreamReader isr=new InputStreamReader(is,"UTF-8");         //字节输入流转为字符输入流
      BufferedReader br=new BufferedReader(isr);   //为字符输入流添加缓冲
      String data=br.readLine();
      while(data!=null) {
    	  System.out.println(data);
    	  data=br.readLine();
      }
      br.close();
      isr.close();
      is.close();
      
	}

}
