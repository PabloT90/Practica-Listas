package main.java;

import main.java.model.Supermarket;
import main.java.util.Validaciones;

/*
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
*       repetir
*           Mostrar menu, LeerValidarOpcionMenu
*           segun opcionMenu
*               opcion 1
*                   Añadir productos por codigo
*               opcion 2
*                   añadir productos por nombre
*               opcion 3
*                   listaProductos
*               opcion 4
*                   productoMasBarato
*               opcion 5
*                   productoMasCaro
*               opcion 6
*                   precioMedioProductos
*               opcion 7
*                   productoMasVendido
*               opcion 8
*                   productoMenosVendido
*               opcion 9
*                   TerminarPedido
*               fin_segun
*       mientras no cambie de usuario
*       LeerValidarEjecutar
*   fin_mientras
*   fin_si
* FIN
* */
public class SuperMarketMain {
    public static void main(String[]args){
        char ejecutar;
        String usuario;
        int opcion;
        Supermarket supermercado = new Supermarket();

        if((ejecutar = Validaciones.leerValidarEjecutar()) == 'S') {//si quiere ejecutar
            while(ejecutar == 'S') {//mientras quiera ejecutar
                //LeerUsuario
                usuario = Validaciones.leerUsuario();
                System.out.println("Hola: " + usuario);
                do {//repetir
                    //Mostrar menu, LeerValidarOpcionMenu
                    opcion = Validaciones.OpcionesMenus();
                    switch(opcion) {//segun opcionMenu
                        case 1://opcion 1
                            //Añadir productos por codigo
                            System.out.println("En construccion");
                            break;
                        case 2://opcion 2
                            //añadir productos por nombre
                            System.out.println("En construccion");
                            break;
                        case 3://opcion 3
                            //listaProductos
                            System.out.println("En construccion");
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
                        case 9://opcion 9
                            //TerminarPedido
                            break;
                    }//fin_segun
                }while(Validaciones.cambiarUsuario() == 'N');//mientras no cambie de usuario
                //LeerValidarEjecutar
                ejecutar = Validaciones.leerValidarEjecutar();
            }//fin_mientras
        }//fin_si
    }
}