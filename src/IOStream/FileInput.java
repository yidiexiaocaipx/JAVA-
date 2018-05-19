package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInput {

	public static void main(String[] args) {
		try {
			int[] bWrite= {11,21,3,40,5};
			File f=new File("test1.txt");
			OutputStream os=new FileOutputStream(f);
			for(int i=0;i<bWrite.length;i++) {
				os.write(bWrite[i]);
			}
		    os.close();
		    InputStream in=new FileInputStream(f);
		    int size=in.available();
		    for(int i=0;i<size;i++) {
		    	System.out.println(in.read());
		    }
		    
		}
		catch(IOException e) {
			System.out.print("Exception");
		}
		
	}

}
