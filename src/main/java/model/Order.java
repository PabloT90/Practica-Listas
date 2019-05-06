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
	private ListaArticulos linkedOrderLines = new ListaArticulos();
	
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
	/*
	* Interfaz
	* Nombre: addLinkedOrderLine
	* Comentario: Esta función permite añadir una línea de pedido a
	* la lista de artículos.
	* Cabecera: public void addLinkedOrderLine(OrderLine orderLine)
	* Entrada:
	* 	-OrderLine orderLine
	* Postcondiciones: La función añade una línea de pedido a la lista de artículos.
	* */
	public void addLinkedOrderLine(OrderLine orderLine) {
		Articulo articulo = new Articulo(null, null, orderLine);
		linkedOrderLines.add(articulo);
	}

	/*
	* Interfaz
	* Nombre: removeLinkedOrderLine
	* Comentario: Esta función permite eliminar una línea de pedido
	* de la lista de articulos. La función devuelve -1 si no se ha
	* encontrado el artículo a eliminar.
	* Cabecera: public int removeLinkedOrderLine(OrderLine orderLine)
	* Entrada:
	* 	-OrderLine orderLine
	* Salida:
	* 	-entero validez
	* Postcondiciones: La función devuelve un número entero asociado al
	* nombre, 0 si se ha conseguido eliminar el artículo de la lista o
	* -1 si el artículo no se encontraba en la lista.
	* */
	public int removeLinkedOrderLine(OrderLine orderLine) {
		int validez;
		Articulo articulo = new Articulo(null, null, orderLine);

		validez = linkedOrderLines.remove(articulo);

		return validez;
	}

	/*
	* Interfaz
	* Nombre: getLinkedOrderLine
	* Comentario: Esta función permite obtener una línea de pedido de
	* la lista de artículos.
	* Cabecera: public OrderLine getLinkedOrderLine(int position)
	* Entrada:
	* 	-entero position
	* Salida:
	* 	-OrderLine orderLine
	* Postcondiciones: La función devuelve un tipo OrderLine asociado al
	* nombre, según la posición indicada o null si position sobrepasa el rango
	* permitido. El rango permitido es de la posición 0 hasta el número de
	* articulos almacenados.
	* */
	public OrderLine getLinkedOrderLine(int position) {
		OrderLine orderLine = null;
		Articulo articulo;

		articulo = linkedOrderLines.get(position);
		if(articulo != null){
			orderLine = articulo.getOrderLine();//Pablo cambia el nombre de getOrderLine
		}

		return orderLine;
	}

	/*
	* Interfaz
	* Nombre: getLastOrderLine
	* Comentario: Esta función permite obtener la última
	* línea de pedido de la lista de artículos.
	* Cabecera: public OrderLine getLastOrderLine()
	* Salida:
	* 	-OrderLine orderLine
	* Postcondiciones: La función devuelve un tipo OrderLine asociado al
	* nombre, que es la última línea de pedido de la lista o null si la
	* lista se encuentra vacía.
	* */
	public OrderLine getLastOrderLine() {
		Articulo articulo = linkedOrderLines.get(linkedOrderLines.numeroDeArticulos()-1);
		OrderLine orderLine = null;

		if(articulo != null){
			orderLine = articulo.getOrderLine();
		}

		return orderLine;
	}
	
	//TERCERA PARTE
	/*
	* Nos permite calcular el precio total del pedido.
	* Precondiciones: el pedido no puede estar vacío.
	* Salida: precioTotal double.
	* Postcondiciones: Asociado al nombre se manda el precio total del pedido.
	* */
	public Double getTotalPrice() {
		double precioTotal = 0.0;

		for(int i = 0; i < orderLines.size(); i++) {
			precioTotal = precioTotal + orderLines.get(i).getProduct().getPrice();
		}

		return precioTotal;
	}

}
