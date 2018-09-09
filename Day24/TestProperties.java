package com.doufu.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class TestProperties {
	 //private  static String classname;
	
	
	
	@Test
	public static String getClassName(String name) throws FileNotFoundException, IOException{
		
		Properties pro = new Properties();
		//pro.load(new FileInputStream("proj1.properties"));
		pro.load(ClassLoader.getSystemResourceAsStream("proj1.properties"));
		
		String classname=pro.getProperty(name);
		
		return classname;
		
	}

}
