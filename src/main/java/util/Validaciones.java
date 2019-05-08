package main.java.util;

import java.util.Scanner;

public class Validaciones {

    public static char leerValidarEjecutar(){
        Scanner teclado = new Scanner(System.in);
        char ejecutar;

        do{
            System.out.println("Quieres ejecutar? S/N");
            ejecutar = Character.toUpperCase(teclado.next().charAt(0));
        }while(ejecutar != 'S' && ejecutar != 'N');

        return ejecutar;
    }

    public static String leerUsuario(){
        Scanner teclado = new Scanner(System.in);
        String usuario;

        System.out.println("Identificate:");
        usuario = teclado.nextLine();

        return usuario;
    }

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

    public static char cambiarUsuario(){
        Scanner teclado = new Scanner(System.in);
        char cambiar;
        do{
            System.out.println("Quieres cambiar de usuario?");
            cambiar =Character.toUpperCase(teclado.next().charAt(0));
        }while(cambiar != 'S' && cambiar != 'N');

        return cambiar;
    }
}
