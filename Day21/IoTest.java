package doufu;

import java.io.File;
import java.io.IOException;

public class IoTest {
	public static void main(String[] args) throws IOException {
		double a=1/0;
		File f=new File("D:/尚硅谷/test");
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.length());
		System.out.println(f.isFile());
		System.out.println(f.list());
		File f2=new File("D:/尚硅谷/test/LWAW");
		f2.mkdirs();
		File f3=new File("D:/尚硅谷/test/LWAW/111.java");
		f3.createNewFile();
		File ff=new File("D:/尚硅谷/test/LWAW/222.java");
		f3.renameTo(ff);
		f2.delete();
		f3.delete();//如果是文件就直接删除，如果是文件夹就删除最底层目录的空文件夹
		
		String dir="D:/尚硅谷/test/LWAW";
		//String file="D:/尚硅谷/test/LWAW/111.java";
		for (int i = 0; i < 20; i++) {
			dir=dir+"/woo";
			String	file=dir+"/111.java";
			File f4=new File(dir);
			f4.mkdirs();
			File f5=new File(file);
			f5.createNewFile();
		}
		
		for (String string : f.list()) {//只返回文件名而且是String型的
			System.out.println(string);
			
		}
		for (File file : f.listFiles()) {//返回带路径的文件名而且是File型的
			System.out.println(file);
			
		}
		System.out.println("----------------------");
		getDir(f);
		delDir(f);
		System.out.println(getFileSize(f));
	}

	public static void getDir(File file){
		if(file.isFile()){
			System.out.println(file.getAbsolutePath());
			//return;
		}else if (file.isDirectory()){
			File[] list=file.listFiles();
			for (File file2 : list) {
				getDir(file2);
		}	
		}
		
	}
	public static long getFileSize(File file){
		
		if(file.isFile()){
			//System.out.println(file.getAbsolutePath());
			return file.length();
			
		}else if(file.isDirectory()){
			
			File[] list=file.listFiles();
			long sum=0;
			for (File file2 : list) {
				sum+=getFileSize(file2);
				
			}
			return sum;
		}else{
			return 0;
		}
		
		//System.out.println(sum);
		
	}
	
	public static void delDir(File file){
		if(file.isDirectory()){
			File[] list=file.listFiles();
			if(list!=null&&list.length>0){
				for (File file2 : list) {
					delDir(file2);
				}
			}
		}
		
		file.delete();
	}

}
