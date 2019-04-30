package main.java.model;

public class Product {

	public Product(){
		code = 0;
		name = "DEFAULT";
		price = 0.0;
		supermarket = new Supermarket();
	}

	public Product(Integer code, String name, Double price, Supermarket supermarket) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.supermarket = supermarket;
	}
	
	private Integer code;
	private String name;
	private Double price;
	
	private Supermarket supermarket;
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Supermarket getSupermarket() {
		return supermarket;
	}

	public void setSupermarket(Supermarket supermarket) {
		this.supermarket = supermarket;
	}
	
	public String toString() {
		return String.format("%o - %s  Price: %.2f €", this.code, this.name, this.price);
	}

}
