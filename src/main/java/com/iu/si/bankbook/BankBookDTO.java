package com.iu.si.bankBook;

public class BankBookDTO {
	private  Long bookNumber;
	private String bookName;
	private double bookRate;
	private Long bookSale;
	private String bookDetail;
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
		return bookSale;
	}
	public void setBookSale(Long bookSale) {
		this.bookSale = bookSale;
	}
	public String getBookDetail() {
		return bookDetail;
	}
	public void setBookDetail(String bookDetail) {
		this.bookDetail = bookDetail;
	}




}
