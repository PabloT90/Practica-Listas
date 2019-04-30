package main.java.model;

public class OrderLine {

	public OrderLine(){
		code = 0;
		quantity = 0;
		order = new Order();
		product = new Product();
	}

	public OrderLine(Integer code, Integer quantity, Order order, Product product) {
		this.code = code;
		this.quantity = quantity;
		this.order = order;
		this.product = product;
	}
	
	private Integer code;
	private Integer quantity;
	
	private Order order;
	private Product product;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String toString() {
		return String.format("%o - %s  Q: %o", this.code, this.product.getName(), this.quantity);
	}

}
