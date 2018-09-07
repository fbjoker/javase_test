package com.java.bean;

import java.util.Random;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account("1111",0);
		Husband h = new Husband("小崔",a);
		Wife w = new Wife("如花",a);
		
		new Thread(h).start();
		new Thread(w).start();
	}
}
class Account{
	private String id;
	private double balance;
	
	public Account(String id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}
	
	public void save(double money){
		if(money<0){
			throw new IllegalArgumentException("参数设置错误");
		}
		balance += money;
	}	
	
	public void withdraw(double money){
		if(money<0){
			throw new IllegalArgumentException("参数设置错误");
		}
		if(money>balance){
			throw new RuntimeException("本次欲取款"+ money + "失败，余额不足");
		}
		balance -= money;
		
	}
}
class Husband implements Runnable{
	private String name;
	private Account account;
	public Husband(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		Random r = new Random();
		while(true){
			synchronized (account) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("老公存钱之前余额：" + account.getBalance());
				double rand = r.nextInt(100) + 1;//随机生成存款金额[1,100]
				account.save(rand);
				System.out.println("存了：" + rand + "，余额：" + account.getBalance());
				account.notify();
			}
		}
	}
}
class Wife implements Runnable{
	private String name;
	private Account account;
	public Wife(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		Random r = new Random();
		while(true){
			synchronized (account) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(account.getBalance()<0){
					try {
						account.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("老婆钱之前余额：" + account.getBalance());
				double rand = r.nextInt(100) + 1;//随机生成取款金额[1,100]
				try {
					account.withdraw(rand);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					continue;
				}
				System.out.println("取了：" + rand + "，余额：" + account.getBalance());
			}
		}
	}
}