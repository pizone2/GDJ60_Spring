package com.iu.si.board;


//중간단계
public class BoardDTO extends BbsDTO {
	private String title;
	private Long hit;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getHit() {
		return hit;
	}
	public void setHit(Long hit) {
		this.hit = hit;
	}
	
	
}
