package main.java.model;

import java.util.ArrayList;
import java.util.List;

import main.java.util.Articulo;
import main.java.util.ListaArticulos;

public class Order {

	public Order(){
		code = 0;
		consumer = "DEFAULT";
		supermarket = new Supermarket();
	}

	public Order(Integer code, String consumer, Supermarket supermarket) {
		this.code = code;
		this.consumer = consumer;
		this.supermarket = supermarket;
		this.orderLines = new ArrayList<OrderLine>();
	}

	private Integer code;
	private String consumer;
	
	private Supermarket supermarket;
	private List<OrderLine> orderLines;
	
	//SEGUNDA PARTE
	private ListaArticulos linkedOrderLines;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getConsumer() {
		return consumer;
	}
	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}
	public Supermarket getSupermarket() {
		return supermarket;
	}
	public void setSupermarket(Supermarket supermarket) {
		this.supermarket = supermarket;
	}
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}	
	public ListaArticulos getListaPedidos() {
		return linkedOrderLines;
	}
	public void setListaPedidos(ListaArticulos linkedOrderLines) {
		this.linkedOrderLines = linkedOrderLines;
	}
	
	public String toString() {
		return String.format("%o - %s   Supermarket: %s", this.code, this.consumer, this.supermarket.getName());
	}
	
	//Métodos a completar
	//PRIMERA PARTE
	/*
	* Interfaz
	* Nombre: addOrderLine
	* Comentario: Esta función permite insertar una línea de pedidos en
	* la lista de líneas de pedidos.
	* Cabecera: public void addOrderLine(OrderLine orderLine)
	* */
	public void addOrderLine(OrderLine orderLine) {
		orderLines.add(orderLine);
	}

	/*
	* Interfaz
	* Nombre: removeOrderLine
	* Comentario: Esta función permite eliminar una línea de pedido de
	* la lista de líneas de pedidos.
	* Cabecera: public boolean removeOrderLine(OrderLine orderLine)
	* Entrada:
	* 	-OrderLine orderLine
	* Salida:
	* 	-boolean lineaEncontrada
	* Postcondiciones: La función devuelve un valor booleano asociado al nombre,
	* verdadero si se ha eliminado la línea de pedido o falso si no se ha
	* encontrado la línea de pedido en la lista.
	* */
	public boolean removeOrderLine(OrderLine orderLine) {
		boolean lineaEncontrada;

		lineaEncontrada = orderLines.remove(orderLine);

		return lineaEncontrada;
	}

	/*
	* Interfaz
	* Nombre: getOrderLine
	* Comentario: esta función permite obtener una línea de pedido
	* de la lista según una posición.
	* Cabecera: public OrderLine getOrderLine(int position)
	* Entrada:
	* 	-entero position
	* Salida:
	* 	-OrderLine lineaPedido
	* Precondiciones:
	* 	-position debe marcar una posición dentro del rango permitido (position >= 0 && position < orderLines.size()).
	* Postcondiciones: La función devuelve un tipo OrderLine asociado al nombre,
	* según la posición indicada en la lista, si no existe un producto en esa
	* posición la función devuelve null.
	* */
	public OrderLine getOrderLine(int position) {
		OrderLine lineaPedido = null;

		lineaPedido = orderLines.get(position);

		return lineaPedido;
	}
	
	//SEGUNDA PARTE
	public void addLinkedOrderLine(OrderLine orderLine) {
		Articulo articulo = new Articulo(null, null, orderLine);
		linkedOrderLines.add(articulo);
	}
	
	public void removeLinkedOrderLine(OrderLine orderLine) {
		//TODO Eliminar artículo
		
	}
	
	public OrderLine getLinkedOrderLine(int position) {
		//TODO Coger artículo
		
		return null;
	}
	
	public OrderLine getLastOrderLine() {
		//TODO Coger último artículo
		
		return null;
	}
	
	//TERCERA PARTE
	public Double getTotalPrice() {
		//TODO Calcular el total del pedido
		
		return 0.0;
	}

}
