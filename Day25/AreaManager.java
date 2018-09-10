package com.doufu.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class AreaManager {
	private HashMap<Province,HashSet<City>> map;
	
	public AreaManager(){
		map = new HashMap<Province,HashSet<City>>();
				
		HashSet<City> bj = new HashSet<City>();
		bj.add(new City(1,"北京市",1));
		map.put(new Province(1,"北京市"), bj);
		
		HashSet<City> hn = new HashSet<City>();
		hn.add(new City(1,"海口市",2));
		hn.add(new City(2,"三亚市",2));
		map.put(new Province(2,"海南省"), hn);
		
		HashSet<City> zj = new HashSet<City>();
		zj.add(new City(1,"绍兴市",3));
		zj.add(new City(2,"温州市",3));
		zj.add(new City(3,"湖州市",3));
		zj.add(new City(4,"嘉兴市",3));
		zj.add(new City(5,"台州市",3));
		zj.add(new City(6,"金华市",3));
		zj.add(new City(7,"舟山市",3));
		zj.add(new City(8,"衢州市",3));
		zj.add(new City(9,"丽水市",3));
		map.put(new Province(3,"浙江省"), zj);
	}
	
	public HashSet<City> findCity(int pid){
		HashSet<City> city =new HashSet<>();
		Collection<HashSet<City>> values = map.values();
		
		for (HashSet<City> hashSet : values) {
			for (City city2 : hashSet) {
				if(city2.getPid()==pid){
//					System.out.println(city2.getName());
					city.add(city2.getName());
				}
				
			}
			
		}
		
		
		return city;
	}
}

class Province{
	int id;
	String name;
	
	public Province() {
		super();
	}

	public Province(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
class City{
	int pid;
	int id;
	String name;
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City(int pid, String name, int id) {
		super();
		this.pid = pid;
		this.id = id;
		this.name = name;
	}
	
}