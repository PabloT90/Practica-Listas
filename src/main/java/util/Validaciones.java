package main.java.util;

import java.util.Scanner;

public class Validaciones {

    /*
    * Comentario: Lee y valida si se quiere ejecutar.
    * Salida: caracter ejecutar.
    * Postcondiciones: Asociado al nombre se devuelve 'S' si quiere ejecutar. 'N' en caso contrario
    * Cabecera: public static char leerValidarEjecutar()
    * */
    public static char leerValidarEjecutar(){
        Scanner teclado = new Scanner(System.in);
        char ejecutar;

        do{
            System.out.println("Quieres ejecutar? S/N");
            ejecutar = Character.toUpperCase(teclado.next().charAt(0));
        }while(ejecutar != 'S' && ejecutar != 'N');

        return ejecutar;
    }

    /*
     * Comentario: Lee un usuario
     * Salida: cadena usuario.
     * Postcondiciones: Asociado al nombre se manda el usuario escrito.
     * Cabecera: public static String leerUsuario()
     * */
    public static String leerUsuario(){
        Scanner teclado = new Scanner(System.in);
        String usuario;

        System.out.println("Identificate:");
        usuario = teclado.nextLine();

        return usuario;
    }

    /*
     * Comentario: Muestra un menú con 9 opciones, Lee y valida la opcion elegida.
     * Salida: entero opcion.
     * Postcondiciones: asociado al nombre se devuelve un numero entre 1 y 9, que es la opcion valida del menu.
     * Cabecera: public static int OpcionesMenus()
     * */
    public static int OpcionesMenus(){
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("1) Añadir producto por codigo");
            System.out.println("2) Añadir producto por nombre");
            System.out.println("3) Lista de productos");
            System.out.println("4) Obtener producto mas barato");
            System.out.println("5) Obtener producto mas caro");
            System.out.println("6) Obtener precio medio de los productos");
            System.out.println("7) Obtener producto mas vendido");
            System.out.println("8) Obtener producto menos vendido");
            System.out.println("9) Terminar pedido");
            opcion = teclado.nextInt();
        }while(opcion < 1 || opcion > 9);

        return opcion;
    }

    /*
     * Comentario: lee y valida si se quiere cambiar de usuario.
     * Salida: caracter cambiar.
     * Postcondiciones: asociado al nombre se devuelve 'S' si se quiere cambiar de usuario. 'N' en caso contrario.
     * Cabecera: public static char cambiarUsuario()
     * */
    public static char cambiarUsuario(){
        Scanner teclado = new Scanner(System.in);
        char cambiar;
        do{
            System.out.println("Quieres cambiar de usuario?");
            cambiar =Character.toUpperCase(teclado.next().charAt(0));
        }while(cambiar != 'S' && cambiar != 'N');

        return cambiar;
    }

    /*
     * Comentario: lee y valida un codigo.
     * Salida: entero codigo.
     * Postcondiciones: Asociado al nombre devuelve un codigo mayor que 0.
     * Cabecera: public static int LeerValidarCodigo()
     * */
    public static int LeerValidarCodigo(){
        Scanner teclado = new Scanner(System.in);
        int codigo;

        do{
            System.out.println("Dime el codigo.");
            codigo = teclado.nextInt();
        }while(codigo < 0);

        return codigo;
    }

    /*
     * Comentario: lee un Nombre
     * Salida: cadena nombre
     * Postcondiciones: asociado al nombre devuelve una cadena con el nombre leido de teclado.
     * Cabecera: public static String LeerNombre()
     * */
    public static String LeerNombre(){
        Scanner teclado = new Scanner(System.in);
        String nombre;

        System.out.println("Escribe el nombre del producto.");
        nombre = teclado.nextLine();

        return nombre;
    }

    /*
     * Comentario: Lee y valida una cantidad.
     * Salida: entero cantidad.
     * Postcondiciones: asociado al nombre devuelve la cantidad leida por teclado que sera mayor que 0.
     * Cabecera: public static int LeerValidarCantidad()
     * */
    public static int LeerValidarCantidad(){
        Scanner teclado = new Scanner(System.in);
        int cantidad;

        do{
            System.out.println("Escribe la cantidad");
            cantidad = teclado.nextInt();
        }while(cantidad < 0);

        return cantidad;
    }
}
