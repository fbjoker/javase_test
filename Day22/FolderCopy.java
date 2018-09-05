package doufu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*思考题：
编写一个方法，可以实现复制一个文件夹

public static void copyDir(String srcDir ,String destDir){
	....
}

public static void main(String[] args){
	copyDir("d:\成绩与作业", "d:\atguigu");
	//结果就是在“d:\atguigu”文件中中，有一个“成绩与作业”
	//包括"成绩与作业"下面的也过去了
}*/
public class FolderCopy {
	String srcDir;
	String destDir;
	
	public FolderCopy() {
		super();
	}

	public FolderCopy(String srcDir, String destDir) {
		super();
		this.srcDir = srcDir;
		this.destDir = destDir;
	}

	
	
	public  void copyDir(String srcDir ,String destDir) throws IOException{
		File file=new File(srcDir);
		String dir=file.getParent();
		if(file.isFile()){
			String finldir=dir.replace(this.srcDir, destDir.replace("\\", "\\\\"));
			
			(new File(finldir)).mkdirs();
			copy(file.getAbsolutePath(),finldir+"\\"+file.getName());
		}else if (file.isDirectory()){
			File[] list=file.listFiles();
			for (File file2 : list) {
				copyDir(file2.getAbsolutePath(), destDir);
		}	
		}
	}


	
	public  void copy(String srcFilePath, String destFilePath) throws IOException{
		FileInputStream filein = new FileInputStream(srcFilePath);
		FileOutputStream fileout = new FileOutputStream(destFilePath);
		byte[] barr=new byte[1024];
		int len;
		while((len=filein.read(barr))!=-1){
			fileout.write(barr,0,len);//注意最后一次去多少用多少
		}
		filein.close();
		fileout.close();
		
		
	}
	
		
		

}
