package com.iu.si;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
//��ü����
public class Soldier {
	
	private Gun gun;
	
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

	public Gun getGun() {
		return gun;
	}

//	@Autowired
	//����
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	public void useGun() {
		this.gun.trigger();
	}
	
}
