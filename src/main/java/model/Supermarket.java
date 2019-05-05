package main.java.model;

import java.util.*;

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
		this.orderDeque = new LinkedList<Order>();
	}
	
	private String name;
	private Integer code;
	
	private List<Product> products;
	private List<Order> orders;
	
	//TERCERA PARTE
	private Deque<Order> orderDeque;

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
	
	public Deque<Order> getOrderDeque() {
		return orderDeque;
	}

	public void setOrderDeque(Deque<Order> orderDeque) {
		this.orderDeque = orderDeque;
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
	/*
	* Interfaz
	* Nombre: pushOrder
	* Comentario: Esta función permite colocar un pedido al principio
	* de la cola de pedidos.
	* Cabecera: public void pushOrder(Order order)
	* Entrada:
	* 	-Order order
	* Postcondiciones: La función inserta un nuevo pedido al principio
	* de la cola de pedidos.
	* Lanza
	* */
	public void pushOrder(Order order) {
		orderDeque.push(order);
	}

	/*
	* Interfaz
	* Nombre: popOrder
	* Comentario: Esta función permite obtener el primer pedido de la
	* cola de pedidos. Esta función elimina el pedido obtenido de la cola.
	* Cabecera: public Order popOrder()
	* Salida:
	* 	-Order order
	* Postcondiciones: La función devuelve un tipo Order asociado al nombre,
	* que es el primer pedido de la cola o null si la cola se encuentra vacía.
	* */
	public Order popOrder() {
		Order order = null;

		if(!orderDeque.isEmpty()){//Si la lista no se encuentra vacía
			order = orderDeque.pop();
		}

		return order;
	}

	/*
	* Interfaz
	* Nombre: getFront
	* Comentario: La función nos permite obtener el primer pedido
	* de la cola, sin eliminarlo de esta.
	* Cabecera: public Order getFront()
	* Salida:
	* 	-Order order
	* Postcondiciones: La función devuelve un tipo Order asociado al nombre,
	* que es el primer pedido de la cola o null si la cola se encuentra vacía.
	* */
	public Order getFront() {
		Order order = null;

		if(!orderDeque.isEmpty()){//Si la lista no se encuentra vacía
			order = orderDeque.getFirst();
		}

		return order;
	}
	
	//Operaciones
	/*
	* Interfaz
	* Nombre: getMinPriceProduct
	* Comentario: Esta función devuelve el producto con el
	* precio más bajo de la lista de productos, si existe más de un producto
	* con el mismo precio la función devuelve el primero encontrado.
	* Cabecera: public Product getMinPriceProduct()
	* Entrada:
	* 	-Product producto
	* Postcondiciones: La función devuelve un tipo Product asociado al
	* nombre, que es el producto con el precio más bajo de la lista de
	* productos o null si la lista se encuentra vacía.
	* */
	public Product getMinPriceProduct() {
		Product producto = null;

		if(!products.isEmpty()){//Si la lista de productos no se encuentra vacía
			producto = products.get(0);
			for(int i = 1; i < products.size(); i++){
				if(products.get(i).getPrice() < producto.getPrice()){
					producto = products.get(i);
				}
			}
		}

		return producto;
	}

	/*
	* Interfaz
	* Nombre: getMaxPriceProduct
	* Comentario: Esta función nos permite obtener el producto
	* con mayor precio de la lista de productos, si existe más de un producto
	* con el mismo precio la función devuelve el primero encontrado.
	* Cabecera: public Product getMaxPriceProduct()
	* Salida:
	* 	-Product producto
	* Postcondiciones: La función devuelve un tipo Product asociado al
	* nombre, que es el producto con el precio más alto de la lista de
	* productos o null si la lista se encuentra vacía.
	* */
	public Product getMaxPriceProduct() {
		Product producto = null;

		if(!products.isEmpty()){//Si la lista de productos no se encuentra vacía
			producto = products.get(0);
			for(int i = 1; i < products.size(); i++){
				if(products.get(i).getPrice() > producto.getPrice()){
					producto = products.get(i);
				}
			}
		}

		return producto;
	}

	/*
	* Interfaz
	* Nombre: getAvgPriceProduct
	* Comentario: Esta función nos permite obtener la media de los
	* productos de la lista de productos.
	* Cabecera: public double getAvgPriceProduct()
	* Salida:
	* 	-real media
	* Postcondiciones: La función devuelve un número real asociado al
	* nombre, que es la media de los productos de la lista.
	* */
	public double getAvgPriceProduct() {
		double media = 0.0, suma = 0.0;

		if(!products.isEmpty()){
			for(int i = 0; i < products.size(); i++){
				suma += products.get(i).getPrice();
			}

			media = suma / products.size();
		}

		return media;
	}

	/*
	* Interfaz
	* Nombre: getPriceByCode
	* Comentario: La función devuelve el precio de un producto de
	* la lista de productos.
	* Cabecera: public double getPriceByCode(Integer productCode)
	* Entrada:
	* 	-Integer productCode
	* Salida:
	* 	-real precio
	* Postcondiciones: La función devuelve un número real asociado al
	* nombre, que es el precio del producto o -1.0 si no se ha encontrado el
	* producto en la lista.
	* */
	public double getPriceByCode(Integer productCode) {
		double precio = -1.0;

		for(int i = 0; i < products.size() && precio == -1; i++){
			if(products.get(i).getCode() == productCode){
				precio = products.get(i).getPrice();
			}
		}

		return precio;
	}

	/*
	* Interfaz
	* Nombre: getBestSellingProduct
	* Comentario: Esta función nos permite obtener el producto más vendido.
	* Salida: String masVendido
	* Postcondiciones: Asociado al nombre se manda un String que contiene el producto mas vendido y su numero de ventas.
	* Si varios productos tienen el mismo numero de ventas se mostrará el último obtenido.
	* Cabecera: public String getBestSellingProduct()
	* */
	public String getBestSellingProduct() {
		String masVendido = " ";
		int ventas = 0;

		if(!products.isEmpty()){
			int mayor = products.get(0).getCode();
			for(int i = 1; i < products.size(); i++){
				if(vecesVendido(mayor, products) <= (ventas =vecesVendido(products.get(i).getCode(), products))){ //Si el mayor anterior es menor que el siguiente que comprobamos, se cambia
					masVendido = "Producto: "+ products.get(i).getCode();
					mayor = products.get(i).getCode();
				}
			}
			masVendido = masVendido + " Ventas: " + ventas;
		}
		return masVendido;
	}

	/*
	* Comentario: Cuenta las veces que se ha vendido un producto.
	* Entrada: int num, List<Product> lista
	* Salida: int veces.
	* Precondiciones:
	* 	- La lista no puede estar vacía.
	* 	- El numero debe ser mayor a 0.
	* Postcondiciones: Asociado al nombre devuelve las veces que se ha vendido un producto.
	* Cabecera: public int vecesVendido(int num ,List<Product> lista)
	* */
	public int vecesVendido(int num ,List<Product> lista) {
		int veces = 0;
		for(int i = 0; i < lista.size(); i++){
			if(num == lista.get(i).getCode()){
				veces++;
			}
		}
		return veces;
	}

	/*
	 * Interfaz
	 * Nombre: getWorstSellingProduct
	 * Comentario: Esta función nos permite obtener el producto menos vendido.
	 * Salida: String masVendido
	 * Postcondiciones: Asociado al nombre se manda un String que contiene el producto menos vendido y su numero de ventas.
	 * Si varios productos tienen el mismo numero de ventas se mostrará el último obtenido.
	 * Cabecera: public String getWorstSellingProduct()
	 * */
	public String getWorstSellingProduct() {
		String menosVendido = " ";
		int ventas = 0;

		if(!products.isEmpty()){
			int mayor = products.get(0).getCode();
			for(int i = 1; i < products.size(); i++){
				if(vecesVendido(mayor, products) >= (ventas =vecesVendido(products.get(i).getCode(), products))){
					menosVendido = "Producto: "+ products.get(i).getCode();
					mayor = products.get(i).getCode();
				}
			}
			menosVendido = menosVendido + " Ventas: " + ventas;
		}
		return menosVendido;
	}
	
}
