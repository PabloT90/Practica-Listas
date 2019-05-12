package main.java.util;

import main.java.model.OrderLine;
import main.java.model.Product;
import main.java.model.Supermarket;
import java.util.List;

public class GestoraMain {
    /*
    * Interfaz
    * Nombre: addProduct
    * Comentario: Esta función permite insertar un producto en una lista de lineas de pedidos.
    * Cabecera: public int addProduct(int codeProduct,  int codeOrderLine, int quantity, List<OrderLine> orderLines, List<Product> productos)
    * Entrada/Salida:
    *   -List<OrderLine> orderLines
    * Entrada:
    *   -entero codeProduct
    *   -entero codeOrderLine
    *   -entero quantity
    *   -List<Product> productos
    * Postcondiciones: La función devuelve un número entero asociado al nombre, 0 si se
    * ha conseguido insertar el producto en la lista de pedidos o -1 si el producto no
    * existe en la lista de productos del supermercado.
    * */
    public int addProduct(int codeProduct, int codeOrderLine, int quantity, List<OrderLine> orderLines, List<Product> productos){
        int validez = -1;
        Product product = buscarProducto(codeProduct, productos);
        if(product != null){//Si el producto existe en la lista de productos
            validez = 0;
            OrderLine orderLine = new OrderLine(codeOrderLine, quantity, null, product);
            orderLines.add(orderLine);
        }
        return validez;
    }

    /*
    * Interfaz
    * Nombre: buscarProducto
    * Comentario: Esta función permite buscar un producto en una lista de productos.
    * Cabecera: public Product buscarProducto(int codigo, List<Product> productos)
    * Entrada:
    *   -entero codigo
    *   -List<Product> productos
    * Salida:
    *   -Product producto
    * Postcondiciones: La función devuelve un tipo Product asociado al nombre, que es un
    * producto de la lista de productos o null si no existe en la lista un producto con
    * el mismo código.
    * */
    public Product buscarProducto(int codigo, List<Product> productos){
        Product product = null;

        for(int i = 0; i < productos.size() && product == null; i++){
            if(productos.get(i).getCode() == codigo){
                product = productos.get(i);
            }
        }

        return product;
    }

    /*
     * Interfaz
     * Nombre: addProduct
     * Comentario: Esta función permite insertar un producto en una lista de lineas de pedidos.
     * Cabecera: public int addProduct(String nameProduct,  int codeOrderLine, int quantity, List<OrderLine> orderLines, List<Product> productos)
     * Entrada/Salida:
     *   -List<OrderLine> orderLines
     * Entrada:
     *   -Cadena nameProduct
     *   -entero codeOrderLine
     *   -entero quantity
     *   -List<Product> productos
     * Postcondiciones: La función devuelve un número entero asociado al nombre, 0 si se
     * ha conseguido insertar el producto en la lista de pedidos o -1 si el producto no
     * existe en la lista de productos del supermercado.
     * */
    public int addProduct(String nameProduct, int codeOrderLine, int quantity, List<OrderLine> orderLines, List<Product> productos){
        int validez = -1;
        Product product = buscarProducto(nameProduct, productos);
        if(product != null){//Si el producto existe en la lista de productos
            validez = 0;
            OrderLine orderLine = new OrderLine(codeOrderLine, quantity, null, product);
            orderLines.add(orderLine);
        }
        return validez;
    }

    /*
     * Interfaz
     * Nombre: buscarProducto
     * Comentario: Esta función permite buscar un producto en una lista de productos.
     * Cabecera: public Product buscarProducto(String nombre, List<Product> productos)
     * Entrada:
     *   -Cadena nombre
     *   -List<Product> productos
     * Salida:
     *   -Product producto
     * Postcondiciones: La función devuelve un tipo Product asociado al nombre, que es un
     * producto de la lista de productos o null si no existe en la lista un producto con
     * el mismo nombre.
     * */
    public Product buscarProducto(String nombre, List<Product> productos){
        Product product = null;

        for(int i = 0; i < productos.size() && product == null; i++){
            if(productos.get(i).getName() == nombre){
                product = productos.get(i);
            }
        }

        return product;
    }

    /*
    * Interfaz
    * Nombre: mostrarListaProductos
    * Comentario: Esta función permite mostrar una lista de productos por pantalla.
    * Cabecera: public void mostrarListaProductos(List<Product> productos)
    * Entrada:
    *   -List<Product> productos
    * Postcondiciones: La función muestra por pantalla los productos de una lista.
    * */
    public void mostrarListaProductos(List<Product> productos){
        for(int i = 0; i < productos.size(); i++){
            System.out.println(productos.get(i));
        }
    }

    /*
    * Esta funcion añade unos productos predefinidos a la lista de productos.
    * Entrada: Supermarket s1
    * Postcondiciones: Se añaden los productos a la lista de productos del supermercado.
    * Cabecera: public void generarProductos(Supermarket s1)
    * */
    public void generarProductos(Supermarket s1){
        Product p1 = new Product(CodeUtils.getProductCode(), "Champú 5L Familiar", 25.00, s1);
        Product p2 = new Product(CodeUtils.getProductCode(), "Cerveza Alhambra 1925", 1.00, s1);
        Product p3 = new Product(CodeUtils.getProductCode(), "Aceitunas chupadeos", 1.0, s1);
        Product p4 = new Product(CodeUtils.getProductCode(), "Pizza 4 quesos", 1.0, s1);

        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);
        s1.addProduct(p4);
    }


    /*
    * Comentario: muestra la lista de pedidos realizados.
    * Entrada: List<OrderLine> lista
    * Postcondiciones: muestra en pantalla la lista de pedidos.
    * Cabecera: public void mostrarListaPedidos(List<OrderLine> lista)
    * */
    public void mostrarListaPedidos(List<OrderLine> lista){
        System.out.println("--- Lista de pedidos ---");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println("-------------");
    }
}
