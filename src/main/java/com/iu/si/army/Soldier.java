package com.iu.si.army;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//按眉积己
public class Soldier {
	
//	private Gun gun;
	
	@Autowired
	@Qualifier("sg")
	private Gun shotGun;
	
	@Autowired
	@Qualifier("rf")
	private Gun rifle;
	
	private String name;
	private int age;
	
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

//	public Gun getGun() {
//		return gun;
//	}

//	@Autowired
	//林涝
//	public void setGun(Gun gun) {
//		this.gun = gun;
//	}
//	public void useGun() {
//		this.gun.trigger();
//	}
	
}
