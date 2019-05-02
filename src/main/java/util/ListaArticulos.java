package main.java.util;

public class ListaArticulos {

	private Articulo cabeza = null;

	/*
	* Interfaz
	* Nombre: add
	* Comentario: Esta función permite insertar un artículo
	* al final de la lista de artículos.
	* Cabecera: public void add(Articulo articulo)
	* Entrada:
	* 	-Articulo articulo
	* Postcondiciones: La función inserta un articulo detrás del último articulo
	* de la lista, si esta se encuentra vacía se inserta en la primera posición
	* de la lista.
	* */
	public void add(Articulo articulo) {
		Articulo puntero = null;

		if(cabeza == null){
			cabeza = articulo;
		}else{
			puntero = cabeza;
			while(puntero.getNext() != null){//Mientras puntero aún no apunte al último articulo
				puntero = puntero.getNext();
			}
			puntero.setNext(articulo);
			articulo.setPrevious(puntero);
		}
	}

	/*
	* Interfaz
	* Nombre: insert
	* Comentario: Esta función nos permite insertar un articulo en una
	* posición específica de la lista.
	* Cabecera: public int insert(Articulo articulo, int position)
	* Entrada:
	* 	-Articulo articulo
	* 	-entero posicion
	* Precondiciones:
	* 	-posicion debe ser mayor o igual a 0.
	* Salida:
	* 	-entero validez
	* Postcondiciones: La función devuelve un número entero asociado al nombre,
	* 0 si se ha conseguido insertar correctamente el producto o -1 si la posición
	* donde se quería insertar el producto sobrepasa el rango permitido. El rango permitido
	* es de la posición 0 hasta el número de articulos almacenados.
	* */
	public int insert(Articulo articulo, int position) {
		int validez = -1;
		Articulo puntero = null, aux = null;

		if(numeroDeArticulos() >= position){
			validez = 0;
			if(cabeza == null){
				cabeza = articulo;
			}else{
				puntero = cabeza;
				for(int contador = 0;contador < position-1 && puntero.getNext() != null;contador++){
					puntero = puntero.getNext();
				}

				aux = puntero.getNext();
				if(aux != null){
					aux.setPrevious(articulo);
				}
				articulo.setNext(puntero.getNext());//Hacemos que articulo apunte al siguiente articulo del puntero actual
				articulo.setPrevious(puntero);
				puntero.setNext(articulo);//Hacemos que el siguiente articulo del puntero actual sea el nuevo articulo.
			}
		}

		return validez;
	}

	/*
	* Interfaz
	* Nombre: remove
	* Comentario: Esta función nos permite eliminar un artículo de la lista.
	* Cabecera: public int remove(Articulo articulo)
	* Entrada:
	* 	-Articulo articulo
	* Salida:
	* 	-entero validez
	* Postcondiciones: La función devuelve un número entero asociado al nombre,
 	* 0 si se ha conseguido eliminar correctamente el artículo de la lista o -1
	* si el artículo no se encontraba en la lista.
	* */
	public int remove(Articulo articulo) {
		int validez = -1;
		Articulo puntero = null, aux1 = null, aux2 = null;

		if(cabeza != null){//Si la lista se encuentra vacía
			puntero = cabeza;
			//puntero.getCode() != articulo.getCode() && puntero.getNext() != null
			while (!puntero.getCode().equals(articulo.getCode()) && puntero.getNext() != null){//Buscamos el artículo
				puntero = puntero.getNext();
			}
			//puntero.getCode() == articulo.getCode()
			if(puntero.getCode().equals(articulo.getCode())){
				validez = 0;
				aux1 = puntero.getPrevious();//Conectamos el articulo anterior con el proximo articulo del puntero
				aux2 = puntero.getNext();
				if(aux1 != null){
					aux1.setNext(aux2);
				}else{
					cabeza = aux2;
				}
				if(aux2 != null){
					aux2.setPrevious(aux1);
				}
			}
		}

		return validez;
	}

	/*
	* Interfaz
	* Nombre: get
	* Comentario: Esta función permite obtener un artículo de la lista
	* según una posición específica.
	* Cabecera: public Articulo get(int position)
	* Entrada:
	* 	-entero position
	* Salida:
	* 	-Articulo articulo
	* Postcondiciones: La función devuelve un tipo Articulo asociado al nombre,
	* que es el artículo que ocupaba la posición especifica o null si position
	* apuntaba a una posición fuera del rango permitido de la lista.
	* */
	public Articulo get(int position) {
		Articulo articulo = null;

		if(numeroDeArticulos() > position){
			articulo = cabeza;
			for(int i = 0; i < position; i++){
				articulo = articulo.getNext();
			}
		}

		return articulo;
	}

	/*
	* Interfaz
	* Nombre: numeroDeArticulos
	* Comentario: Esta función nos permite obtener el número de articulos
	* que contiene la lista.
	* Cabecera: public int numeroDeArticulos()
	* Salida:
	* 	-entero numeroArticulos
	* Postcondiciones: La función devuelve un número entero asociado al nombre,
	* que es el número de artículos que almacena la lista.
	* */
	public int numeroDeArticulos(){
		int numeroArticulos = 0;
		Articulo puntero = null;

		if(cabeza != null){
			puntero = cabeza;
			numeroArticulos++;
			while(puntero.getNext() != null){
				puntero = puntero.getNext();
				numeroArticulos++;
			}
		}

		return numeroArticulos;
	}
}
