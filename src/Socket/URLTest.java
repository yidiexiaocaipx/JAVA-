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
      InputStream is=url.openStream();    //��ȡ��Դ�ֽ�������
      InputStreamReader isr=new InputStreamReader(is,"UTF-8");         //�ֽ�������תΪ�ַ�������
      BufferedReader br=new BufferedReader(isr);   //Ϊ�ַ���������ӻ���
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
