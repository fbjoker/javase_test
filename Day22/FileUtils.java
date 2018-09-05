package doufu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
	public static void main(String[] args) {
		/*try {
			copy("D:/尚硅谷/课堂录像/day06_全天资料/day06_video/day06_01晨考.avi","D:/1.avi");
			System.out.println("成功");
		} catch (IOException e) {
			System.out.println("失败");
		}*/
		try {
			copy("D:/aaa.txt","D:/bbb.txt");
			System.out.println("成功");
		} catch (IOException e) {
			System.out.println("失败");
		}
	}
	
	
		//把srcFile的文件内容复制到destFile中
		//srcFile必须是存在的文件,destFile可以不存在
		//要求：支持任意类型文件的复制
		public static void copy(String srcFilePath, String destFilePath) throws IOException{
			FileInputStream filein = new FileInputStream(srcFilePath);
			FileOutputStream fileout = new FileOutputStream(destFilePath);
			byte[] barr=new byte[1024];
			while(true){
				int len=filein.read(barr);
				if(len==-1){
					break;
				}
				fileout.write(barr,0,len);//注意最后一次去多少用多少
				
			}
			filein.close();
			fileout.close();
			
			
		}
		
		//要求：只支持纯文本文件的复制
		public static void copyTxt(String srcFilePath, String destFilePath) throws IOException{
			 FileReader fread = new FileReader(srcFilePath);
			 FileWriter fwrite = new FileWriter(destFilePath,true);
			 char[] carr=new char[1024];
			 
			 while(true){
				 int len=fread.read(carr);
				 if(len==-1){
					 break;
				 }
				 fwrite.write(carr,0,len);//注意最后一次去多少用多少
			 }
			 fwrite.close();
			 fread.close();
		}
	

}
