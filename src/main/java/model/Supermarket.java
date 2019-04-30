package main.java.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Supermarket {

	public Supermarket(){
		name = "DEFAULT";
		code = 0;
	}

	public Supermarket(String name, Integer code) {
		this.name = name;
		this.code = code;
		this.products = new ArrayList<Product>();
		this.orders = new ArrayList<Order>();
	}
	
	private String name;
	private Integer code;
	
	private List<Product> products;
	private List<Order> orders;
	
	//TERCERA PARTE
	private Queue<Order> orderQueue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	public Queue<Order> getOrderQueue() {
		return orderQueue;
	}

	public void setOrderQueue(Queue<Order> orderQueue) {
		this.orderQueue = orderQueue;
	}

	public String toString() {
		return String.format("%o - %s", this.code, this.name);
	}
	
	//Métodos a completar
	//PRIMERA PARTE
	/*
	 * Interfaz
	 * Nombre: addProduct
	 * Comentario: Esta función permite añadir un producto a la lista.
	 * Cabecera: public void addProduct(Product product)
	 * Entrada:
	 * 	-Product product
	 * Postcondiciones: La función inserta un producto en la lista.
	 * */
	public void addProduct(Product product) {
		products.add(product);
	}

	/*
	 * Interfaz
	 * Nombre: removeProduct
	 * Comentario: Esta función permite eliminar un producto de la lista.
	 * Cabecera: public boolean removeProduct(Product product)
	 * Entrada:
	 * 	-Product product
	 * Salida:
	 * 	-booleano productoEncontrado
	 * Postcondiciones: La función devuelve un valor booleano asociado al nombre,
	 * verdadero si el producto se ha eliminado o falso si el producto no se encontraba
	 * en la lista.
	 * */
	public boolean removeProduct(Product product) {
		boolean productoEncontrado;

		productoEncontrado = products.remove(product);

		return productoEncontrado;
	}

	/*
	 * Interfaz
	 * Nombre: getProduct
	 * Comentario: Esta función permite obtener un producto de la lista
	 * según su posición.
	 * Cabecera: public Product getProduct(int position)
	 * Entrada:
	 * 	-entero position
	 * Salida:
	 * 	-Product producto
	 * Precondiciones:
	 * 	-position debe marcar una posición dentro del rango permitido (position >= 0 && position < products.size()).
	 * Postcondiciones: La función devuelve un tipo Product asociado al nombre,
	 * según la posición indicada en la lista, si no existe un producto en esa
	 * posición la función devuelve null.
	 * */
	public Product getProduct(int position) {
		Product producto = null;

		//if(position >= 0 && position < products.size())//Por si nos interesa controlar la excepción
		producto = products.get(position);

		return producto;
	}

	/*
	* Interfaz
	* Nombre: addOrder
	* Comentario: Esta función permite insertar pedidos en la lista de
	* pedidos.
	* Cabecera: public void addOrder(Order order)
	* Entrada:
	* 	-Order order
	* Postcondiciones: La función inserta un pedido en la lista de pedidos.
	* */
	public void addOrder(Order order) {
		orders.add(order);
	}

	/*
	* Interfaz
	* Nombre: removeOrder
	* Comentario: Esta función permite eliminar un pedido de la lista de
	* pedidos.
	* Cabecera: public boolean removeOrder(Order order)
	* Entrada:
	* 	-Order order
	* Salida:
	* 	-booleano pedidoEncontrado
	* Postcondiciones: La función devuelve un valor booleano asociado al nombre,
	* verdadero si el pedido se ha eliminado o falso si el pedido no se encontraba
	* en la lista.
	* */
	public boolean removeOrder(Order order) {
		boolean pedidoEncontrado;

		pedidoEncontrado = orders.remove(order);

		return pedidoEncontrado;
	}

	/*
	* Interfaz
	* Nombre: getOrder
	* Comentario: Esta función permite obtener un pedido de la lista
	* según su posición.
	* Cabecera: public Order getOrder(int position)
	* Entrada:
	* 	-entero position
	* Salida:
	* 	-Order pedido
	* Precondiciones:
	* 	-position debe marcar una posición dentro del rango permitido (position >= 0 && position < orders.size()).
	* Postcondiciones: La función devuelve un tipo Order asociado al nombre,
	* según la posición indicada en la lista, si no existe un producto en esa
	* posición la función devuelve null.
	* */
	public Order getOrder(int position) {
		Order pedido = null;

		pedido = orders.get(position);

		return pedido;
	}
	
	//TERCERA PARTE
	//Cola de pedidos
	public void pushOrder(Order order) {
		//TODO Añadir pedido
		
	}
	
	public Order popOrder() {
		//TODO Obtener pedido
		
		return null;
	}
	
	public Order getFront() {
		//TODO Devuelve el primer pedido de la cola
		//OJO!! No hay que sacarlo, solo devolver el primer pedido
		
		return null;
	}
	
	//Operaciones
	public void getMinPriceProduct() {
		//TODO Devolver el producto con el precio más bajo
		
	}
	
	public void getMaxPriceProduct() {
		//TODO Devolver el producto con el precio más alto
		
	}
	
	public void getAvgPriceProduct() {
		//TODO Devolver la media de precios de los productos
		
	}
	
	public void getPriceByCode(Integer productCode) {
		//TODO Delvover el precio del producto
	}
	
	public void getBestSellingProduct() {
		//TODO Devolver el producto más vendido junto con el número de ventas
		
	}
	
	public void getWorstSellingProduct() {
		//TODO Devolver el producto más vendido junto con el número de ventas
		
	}
	
}
