package edu.profound;

public class Book {


	private String isbn;
	private String bname;
	private float bprice;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(String isbn, String bname, float bprice) {
		super();
		this.isbn = isbn;
		this.bname = bname;
		this.bprice = bprice;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public float getBprice() {
		return bprice;
	}


	public void setBprice(float bprice) {
		this.bprice = bprice;
	}
	
	
}
