package doufu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class EncodingTest {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		FileInputStream fis = new FileInputStream("d:/bbb.txt");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		
		 FileOutputStream fos = new FileOutputStream("d:/ccc.txt");
		OutputStreamWriter osw = new  OutputStreamWriter(fos,"utf-8");
		
		
		
		
	}

}
