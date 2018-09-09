package com.doufu.dao.impl;

import com.doufu.dao.StudentDao;

public class ItStudentDaoImpl implements StudentDao {
	String name;
	int age;
	private String skill;

	public ItStudentDaoImpl() {
		super();
	}

	public ItStudentDaoImpl(String name, int age, String skill) {
		super();
		this.name = name;
		this.age = age;
		this.skill = skill;
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

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public void info() {
		System.out.println("姓名："+name+"年龄："+age);
		System.out.println("掌握的技能"+skill);
	}
	public void info2(String str) {
		System.out.println("姓名："+name+"年龄："+age);
		System.out.println("掌握的技能"+skill+"\t"+str);
	}

}
