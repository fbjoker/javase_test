package com.doufu.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FolderTest {
	public static void main(String[] args) {
		File f0=new File("D:/尚硅谷/尚硅谷_0808班_柴林燕_JavaSE/笔记");
		File f1=new File("e:/尚硅谷/");
		File f3=new File(f0,f1.getName());
		
		System.out.println(f0.getAbsolutePath().contains(f1.getAbsolutePath()));
		System.out.println(f3);
	}
	/**
	 * 将srcPath的内容剪切到destPath路径中
	 * 
	 * @param srcPath
	 *            源文件或目录路径
	 * @param destPath
	 *            目标目录路径
	 * @throws FileNotFoundException
	 * @throws IOException
	 */

	public static void cutDirectory(String srcPath, String destPath) throws FileNotFoundException, IOException {
		File src = new File(srcPath);
		File destDirectory = new File(destPath);
		cutDirectory(src, destDirectory);
	}

	/**
	 * 将src的内容剪切到destDirectory对象中
	 * 
	 * @param src
	 *            源文件或目录对象
	 * @param destDirectory
	 *            目标目录对象，不能是非目录
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void cutDirectory(File src, File destDirectory) throws FileNotFoundException, IOException {
		if (!destDirectory.isDirectory()) {
			throw new IOException("目标对象不是目录");
		}
		File dest = new File(destDirectory, src.getName());
		// 如果srcPath是个文件，那么直接复制文件
		if (src.isFile()) {
			copy(src, dest);
		} else {
			dest.mkdirs();// 先在destPath目录中创建srcPath文件夹
			File[] list = src.listFiles();// 准备复制srcPath的子目录或子文件
			for (File f : list) {
				cutDirectory(f, dest);
			}
		}
		//src.delete();
	}
	
	public static void copy(File src, File dest) throws FileNotFoundException, IOException {
		if(!src.isFile() || dest.isDirectory()){
			throw new IOException("只能拷贝文件");
		}

		// 2、选择IO流
		InputStream input = new FileInputStream(src);
		OutputStream output = new FileOutputStream(dest);
		
		// 3、（1）大小
		byte[] data = new byte[1024];
		int len;
		// （2）读取
		while ((len = input.read(data)) != -1) {
			output.write(data, 0, len);
		}

		// 4、关闭
		input.close();
		output.close();
	}

}