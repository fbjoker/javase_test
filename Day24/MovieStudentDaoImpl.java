package com.doufu.dao.impl;


import com.doufu.dao.StudentDao;

public class MovieStudentDaoImpl implements StudentDao {
	String name;
	int age;
	

	private MovieStudentDaoImpl() {
		super();
	}
	public MovieStudentDaoImpl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void info() {
		System.out.println("姓名："+name+"\t年龄："+age);
	}

}
