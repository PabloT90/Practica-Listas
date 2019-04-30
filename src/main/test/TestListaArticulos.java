package main.test;

import main.java.util.Articulo;
import main.java.util.ListaArticulos;

public class TestListaArticulos {
    public static void main (String[] args){
        Articulo articulo1 = new Articulo(null, null, 1);
        Articulo articulo2 = new Articulo(null, null, 2);
        Articulo articulo3 = new Articulo(null, null, 3);
        Articulo articulo4 = new Articulo(null, null, 4);
        Articulo articulo5 = new Articulo(null, null, 5);
        Articulo articulo6 = new Articulo(null, null, 6);
        ListaArticulos lista = new ListaArticulos();

        //add
        lista.add(articulo1);
        lista.add(articulo2);
        lista.add(articulo3);
        lista.add(articulo4);

        System.out.println();

        //numeroDeArticulos
        System.out.println(lista.numeroDeArticulos());

        System.out.println();

        //get
        System.out.println(lista.get(0).getId());
        System.out.println(lista.get(1).getId());
        System.out.println(lista.get(2).getId());
        System.out.println(lista.get(3).getId());
        System.out.println(lista.get(4));

        System.out.println();

        //insert
        lista.insert(articulo5, 9);
        lista.insert(articulo5, 4);
        lista.insert(articulo6, 2);

        System.out.println();

        //get
        System.out.println(lista.get(0).getId());
        System.out.println(lista.get(1).getId());
        System.out.println(lista.get(2).getId());
        System.out.println(lista.get(3).getId());
        System.out.println(lista.get(4).getId());
        System.out.println(lista.get(5).getId());

        System.out.println();

        //remove
        lista.remove(articulo3);
        //get
        System.out.println(lista.get(0).getId());
        System.out.println(lista.get(1).getId());
        System.out.println(lista.get(2).getId());
        System.out.println(lista.get(3).getId());
        System.out.println(lista.get(4).getId());
        System.out.println(lista.get(5));
    }
}
