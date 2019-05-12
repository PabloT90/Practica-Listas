package main.java;

import main.java.model.OrderLine;
import main.java.model.Supermarket;
import main.java.util.CodeUtils;
import main.java.util.GestoraMain;
import main.java.util.Validaciones;
import java.util.ArrayList;
import java.util.List;

/*
Descripcion: este programa simula el funcionamiento de una cadena de supermercado como podria ser Mercadona.
* Entradas:
*   - int opcion //para controlar la opcion del menu que se muestra en pantalla.
*   - char ejecutar //para controlar si se ejecutar la aplicacion o no.
*   - String usuario //para mostrar dicho usuario en pantalla.
*   - char cambio //para saber si quiere cambiar de usuario.
*   - String nombreProd //nombre del producto.
*   - int codigo //codigo del producto.
*   - int cantidad //para conocer la cantidad de producto
* Salidas:
*   - mensajes de comuniacion con el usuario.
*   - lista de todos los productos.
*   - el producto mas barato.
*   - el producto mas caro.
*   - el precio medio de los productos.
*   - el producto mas vendido.
*   - el producto menos vendido.
* Restricciones:
*   - opcion debe estar entre 1 y 9.
*   - ejecutar debe ser 'S' o 'N'
*   - cambio debe ser 'S' o 'N'.
*   - codigo debe ser superior a 0.
*   - cantidad debe ser superior a 0.
*
*
* PG 0
* INICIO
*   si quiere ejecutar
*       añadirProductos*
        mientras quiera ejecutar
*           repetir
                si ha cambiado de usuario
*                   LeerUsuario
*                   MostrarUsuario
                fin_si
*               repetir
*                   AumentarNumeroPedido
*                   Mostrar menu, LeerValidarOpcionMenu*
*                   segun opcionMenu
*                       opcion 1
*                           AñadirProductosPorCodigo
*                       opcion 2
*                           añadirProductosPorNombre
*                       opcion 3
*                           listaProductos*
*                       opcion 4
*                           productoMasBarato*
*                       opcion 5
*                           productoMasCaro*
*                       opcion 6
*                           precioMedioProductos*
*                       opcion 7
*                           productoMasVendido*
*                       opcion 8
*                           productoMenosVendido*
*                   fin_segun
*               mientras opcion != 9
*           mientras no cambie de usuario
            leerValidarEjecutar*
        fin_mientras
*   fin_si
* FIN

PG 1
AñadirProductosPorCodigo
INICIO
    LeerValidarCodigo*
    si existe el producto
        LeerValidarCantidad*
        AñadirProductoPorCodigo*
        MostrarMensajeExito
    sino
        MostrarMensajeExplicatorio1
    fin_si
FIN

PG 1
AñadirProductoPorNombre
INICIO
    LeerNombre*
    si existe el producto
        LeerValidarCantidad*
        AñadirProductoPorNombre*
        MostrarMensajeExito
    sino
        MostrarMensajeExplicatorio1
    fin_si
FIN
* */
public class SuperMarketMain {
    public static void main(String[]args){
        char cambio ='S', ejecutar;
        String usuario, nombreProd;
        int opcion, codigo, cantidad, codigoPedido = 0;
        Supermarket supermercado = new Supermarket("Supermercado Nervión", CodeUtils.getSupermarketCode());
        GestoraMain gm = new GestoraMain();
        List<OrderLine> orderLines = new ArrayList<OrderLine>();

        if((ejecutar = Validaciones.leerValidarEjecutar()) == 'S') {//si quiere ejecutar
            //AñadirProductos*
             gm.generarProductos(supermercado);
            while(ejecutar == 'S') {//mientras quiera ejecutar
                do {
                    if (cambio == 'S') {//Si ha cambiado de usuario
                        //LeerUsuario*
                        usuario = Validaciones.leerUsuario();
                        //MostrarUsuario
                        System.out.println("Hola: " + usuario);
                    }
                    do {//repetir
                        //AumentarCodigoPedido
                        codigoPedido++;
                        //Mostrar menu, LeerValidarOpcionMenu
                        opcion = Validaciones.OpcionesMenus();
                        switch (opcion) {//segun opcionMenu
                            case 1://opcion 1
                                //AñadirProductosPorCodigo
                                //LeerValidarCodigo*
                                codigo = Validaciones.LeerValidarCodigo();
                                if (gm.buscarProducto(codigo, supermercado.getProducts()) != null) {//si existe el producto
                                    //LeerValidarCantidad*
                                    cantidad = Validaciones.LeerValidarCantidad();
                                    //AñadirProductoPorCodigo*
                                    gm.addProduct(codigo, codigoPedido, cantidad, orderLines, supermercado.getProducts());
                                    //MostrarMensajeExito
                                    System.out.println("Producto Añadido");
                                } else {//sino
                                    //MostrarMensajeExplicatorio1
                                    System.out.println("El producto no existe");
                                }//fin_si
                                break;
                            case 2://opcion 2
                                //añadirProductosPorNombre
                                //LeerNombre*
                                nombreProd = Validaciones.LeerNombre();
                                if (gm.buscarProducto(nombreProd, supermercado.getProducts()) != null) {//si existe el producto
                                    //LeerValidarCantidad*
                                    cantidad = Validaciones.LeerValidarCantidad();
                                    //AñadirProductoPorNombre*
                                    gm.addProduct(nombreProd, codigoPedido, cantidad, orderLines, supermercado.getProducts());
                                    //MostrarMensajeExito
                                    System.out.println("Producto Añadido");
                                } else {//sino
                                    //MostrarMensajeExplicatorio1
                                    System.out.println("El producto no existe");
                                }//fin_si
                                break;
                            case 3://opcion 3
                                //listaProductos*
                                gm.mostrarListaProductos(supermercado.getProducts());
                                break;
                            case 4://opcion 4
                                //productoMasBarato*
                                System.out.println(supermercado.getMinPriceProduct());
                                break;
                            case 5://opcion 5
                                //productoMasCaro*
                                System.out.println(supermercado.getMaxPriceProduct());
                                break;
                            case 6://opcion 6
                                //precioMedioProductos*
                                System.out.println(supermercado.getAvgPriceProduct());
                                break;
                            case 7://opcion 7
                                //productoMasVendido*
                                System.out.println("En construccion");
                                System.out.println(supermercado.getBestSellingProduct());
                                break;
                            case 8://opcion 8
                                //productoMenosVendido*
                                System.out.println("En construccion");
                                System.out.println(supermercado.getWorstSellingProduct());
                                break;
                        }//fin_segun
                    } while (opcion != 9);// mientras opcion != 9
                } while ((cambio = Validaciones.cambiarUsuario()) == 'N');//mientras no cambie de usuario
                //LeerValidarEjecutar*
                ejecutar = Validaciones.leerValidarEjecutar();
            }//fin_mientras
        }//fin_si
    }
}