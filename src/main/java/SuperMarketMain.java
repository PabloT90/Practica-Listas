package main.java;

import main.java.model.OrderLine;
import main.java.model.Product;
import main.java.model.Supermarket;
import main.java.util.GestoraMain;
import main.java.util.Validaciones;

import java.util.List;

/*
Descripcion: este programa simula
* Entradas:
*   - int opcion //para controlar la opcion del menu que se muestra en pantalla.
*   - char ejecutar //para controlar si se ejecutar la aplicacion o no.
*   - String usuario //para mostrar dicho usuario en pantalla.
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
*
*
* PG 0
* INICIO
*   si quiere ejecutar
*   mientras quiera ejecutar
*       LeerUsuario
        MostrarUsuario
*       repetir
            AumentarNumeroPedido
*           Mostrar menu, LeerValidarOpcionMenu*
*           segun opcionMenu
*               opcion 1
*                   AñadirProductosPorCodigo
*               opcion 2
*                   añadirProductosPorNombre
*               opcion 3
*                   listaProductos*
*               opcion 4
*                   productoMasBarato*
*               opcion 5
*                   productoMasCaro*
*               opcion 6
*                   precioMedioProductos*
*               opcion 7
*                   productoMasVendido*
*               opcion 8
*                   productoMenosVendido*
*               fin_segun
*       mientras no cambie de usuario
*       LeerValidarEjecutar
*   fin_mientras
*   fin_si
* FIN

PG 1
AñadirProductosPorCodigo
INICIO
    LeerValidarCodigo*
    si existe el producto
        LeerValidarCantidad*
        AddProduct*
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
        AddProduct*
    sino
        MostrarMensajeExplicatorio1
    fin_si
FIN
* */
public class SuperMarketMain {
    public static void main(String[]args){
        char ejecutar;
        String usuario, nombreProd;
        int opcion, codigo, cantidad, codigoPedido = 0;
        Supermarket supermercado = new Supermarket();
        GestoraMain gm = new GestoraMain();
        List<Product> products = null;
        List<OrderLine> orderLines = null;

        //Queda añadir los productos y las orderLine.
        //Ademas falta arreglar las funciones de mas y menos vendido, que lo habiamos entendido mal.

        if((ejecutar = Validaciones.leerValidarEjecutar()) == 'S') {//si quiere ejecutar
            while(ejecutar == 'S') {//mientras quiera ejecutar
                //LeerUsuario
                usuario = Validaciones.leerUsuario();
                //MostrarUsuario
                System.out.println("Hola: " + usuario);
                do {//repetir
                    //AumentarCodigoPedido
                    codigoPedido++;
                    //Mostrar menu, LeerValidarOpcionMenu
                    opcion = Validaciones.OpcionesMenus();
                    switch(opcion) {//segun opcionMenu
                        case 1://opcion 1
                            //AñadirProductosPorCodigo
                            //LeerValidarCodigo*
                            codigo = Validaciones.LeerValidarCodigo();
                            if(gm.buscarProducto(codigo, products) != null) {//si existe el producto
                                //LeerValidarCantidad*
                                cantidad = Validaciones.LeerValidarCantidad();
                                //AñadirProductoXCodigo*
                                gm.addProduct(codigo, codigoPedido, cantidad, orderLines, products);
                            }else {//sino
                                //MostrarMensajeExplicatorio1
                                System.out.println("El producto no existe");
                            }//fin_si
                            break;
                        case 2://opcion 2
                            //añadirProductosPorNombre
                            //LeerNombre*
                            nombreProd = Validaciones.LeerNombre();
                            if(gm.buscarProducto(nombreProd, products) != null) {//si existe el producto
                                //LeerValidarCantidad*
                                cantidad = Validaciones.LeerValidarCantidad();
                                //AñadirProductoPorNombre*
                                gm.addProduct(nombreProd, codigoPedido, cantidad, orderLines, products);
                            }else {//sino
                                //MostrarMensajeExplicatorio1
                                System.out.println("El producto no existe");
                            }//fin_si
                            break;
                        case 3://opcion 3
                            //listaProductos
                            gm.mostrarListaProductos(products);
                            break;
                        case 4://opcion 4
                            //productoMasBarato
                            System.out.println(supermercado.getMinPriceProduct());
                            break;
                        case 5://opcion 5
                            //productoMasCaro
                            System.out.println(supermercado.getMaxPriceProduct());
                            break;
                        case 6://opcion 6
                            //precioMedioProductos
                            System.out.println(supermercado.getAvgPriceProduct());
                            break;
                        case 7://opcion 7
                            //productoMasVendido
                            System.out.println(supermercado.getBestSellingProduct());
                            break;
                        case 8://opcion 8
                            //productoMenosVendido
                            System.out.println(supermercado.getWorstSellingProduct());
                            break;
                    }//fin_segun
                }while(Validaciones.cambiarUsuario() == 'N');//mientras no cambie de usuario
                //LeerValidarEjecutar
                ejecutar = Validaciones.leerValidarEjecutar();
            }//fin_mientras
        }//fin_si
    }
}