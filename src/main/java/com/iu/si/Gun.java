package com.iu.si;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
//��ü����
public class Gun {
	private Bullet bullet;
	 
	
	public Gun() {
		
	}
	//�ڵ��ϼ� ������
	
//	@Autowired
	//����
	public Gun(Bullet bullet) {
		this.bullet = bullet;
	}
	
	
	public void trigger() {
		this.bullet.sound();
	}
	
	
}
