package com.iu.si.member;

import java.util.List;

public class MemberDTO {
	
	private String id;
	private String pw;
	private String memberName;
	private String memberPhone;
	private String email;
	private RoleDTO roleDTO;
	
	
	

	public RoleDTO getRoleDTO() {
		return roleDTO;
	}
	public void setRoleDTO(RoleDTO roleDTO) {
		this.roleDTO = roleDTO;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberphone() {
		return memberPhone;
	}
	public void setMemberphone(String memberphone) {
		this.memberPhone = memberphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
