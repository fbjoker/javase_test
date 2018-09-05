package doufu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ReadOnlyBufferException;

public class FileIOTest {
	public static void main(String[] args) throws IOException {
		FileReader fread= new FileReader("111.txt");
		char[] carr=new char[5];
		StringBuffer sb=new StringBuffer();
		while(true){
			int len=fread.read(carr);
			if(len==-1){
				break;
			}
			sb.append(new String(carr,0,len));
		}
		System.out.println(sb);
	}

}
