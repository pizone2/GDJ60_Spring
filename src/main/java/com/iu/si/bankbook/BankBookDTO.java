package com.iu.si.bankbook;

public class BankBookDTO {
	private  Long bookNumber;
	private String bookName;
	private double bookRate;
	private Long bookSale;
	private String bookDetail;
	private BankBookImgDTO bankBookImgDTO;
	
	
	
	public BankBookImgDTO getBankBookImgDTO() {
		return bankBookImgDTO;
	}
	public void setBankBookImgDTO(BankBookImgDTO bankBookImgDTO) {
		this.bankBookImgDTO = bankBookImgDTO;
	}
	public Long getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(Long bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookRate() {
		return bookRate;
	}
	public void setBookRate(double bookRate) {
		this.bookRate = bookRate;
	}
	public Long getBookSale() {
		if(this.bookSale == null || this.bookSale !=1) {
			this.bookSale=0L;
		}
		return bookSale;
	}
	public void setBookSale(Long bookSale) {
		if(bookSale == null || bookSale !=1) {
			this.bookSale = 0L ;
		}
		this.bookSale = bookSale;
	}
	public String getBookDetail() {
		return bookDetail;
	}
	public void setBookDetail(String bookDetail) {
		this.bookDetail = bookDetail;
	}




}
