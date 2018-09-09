package com.doufu.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.junit.Test;

import com.doufu.dao.impl.ItStudentDaoImpl;
import com.doufu.dao.impl.MovieStudentDaoImpl;

public class TestReflect {

	@Test
	public void getClassMethod() throws Exception {
		

		String className = TestProperties.getClassName("ItStudent");
		Class it = Class.forName(className);

		it.newInstance();
		Constructor itcon=it.getDeclaredConstructor(String.class, int.class, String.class);
		itcon.setAccessible(true);
		Object newIT = itcon.newInstance("弗利沙",33,"c++");
		Field skill = it.getDeclaredField("skill");
		skill.setAccessible(true);
		
		Object objit = skill.get(newIT);
		System.out.println(objit);
		
		
		Method info2=it.getDeclaredMethod("info2", String.class);
		info2.setAccessible(true);
		
		info2.invoke(newIT, "java");
		//System.out.println(invoke);
		
		

	}

}
