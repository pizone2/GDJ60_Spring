package com.iu.si;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
//객체생성
public class Gun {
	private Bullet bullet;
	 
	
	public Gun() {
		
	}
	//자동완성 못했음
	
//	@Autowired
	//주입
	public Gun(Bullet bullet) {
		this.bullet = bullet;
	}
	
	
	public void trigger() {
		this.bullet.sound();
	}
	
	
}
