package com.iu.si.board;

import java.sql.Date;

//전체 게시판 종류의 공통 요소를 모은 DTO
public class BbsDTO {
	private Long num;
	private String contents;
	private String writer;
	private Date regDate; 
	
	
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	
}
