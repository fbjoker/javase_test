package doufu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferTest {
	public static void main(String[] args) throws IOException {
		FileReader isr = new FileReader("D:/bbb.txt");
		BufferedReader br = new BufferedReader(isr);
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
	}

}
