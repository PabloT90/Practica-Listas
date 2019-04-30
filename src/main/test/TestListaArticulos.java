package main.test;

import main.java.model.Order;
import main.java.model.OrderLine;
import main.java.model.Product;
import main.java.util.Articulo;
import main.java.util.ListaArticulos;

public class TestListaArticulos {
    public static void main (String[] args){
        Order order = new Order();
        Product pr = new Product();
        OrderLine ol1 = new OrderLine(1,1, order, pr);
        OrderLine ol2 = new OrderLine(2,1, order, pr);
        OrderLine ol3 = new OrderLine(3,1, order, pr);
        OrderLine ol4 = new OrderLine(4,1, order, pr);
        OrderLine ol5 = new OrderLine(5,1, order, pr);
        OrderLine ol6 = new OrderLine(6,1, order, pr);
        Articulo articulo1 = new Articulo(null, null, ol1);
        Articulo articulo2 = new Articulo(null, null, ol2);
        Articulo articulo3 = new Articulo(null, null, ol3);
        Articulo articulo4 = new Articulo(null, null, ol4);
        Articulo articulo5 = new Articulo(null, null, ol5);
        Articulo articulo6 = new Articulo(null, null, ol6);
        ListaArticulos lista = new ListaArticulos();

        //add
        lista.add(articulo1);
        lista.add(articulo2);
        lista.add(articulo3);
        lista.add(articulo4);

        System.out.println("--Fin add--");

        //numeroDeArticulos
        System.out.println(lista.numeroDeArticulos());

        System.out.println();
        System.out.println("--Fin numeroDeArticulos--");
        //get
        System.out.println(lista.get(0).getCode());
        System.out.println(lista.get(1).getCode());
        System.out.println(lista.get(2).getCode());
        System.out.println(lista.get(3).getCode());
        System.out.println(lista.get(4));

        System.out.println();
        System.out.println("--Fin get--");
        //insert
        lista.insert(articulo5, 9);
        lista.insert(articulo5, 4);
        lista.insert(articulo6, 2);

        System.out.println();
        System.out.println("--Fin insert--");
        //get
        System.out.println(lista.get(0).getCode());
        System.out.println(lista.get(1).getCode());
        System.out.println(lista.get(2).getCode());
        System.out.println(lista.get(3).getCode());
        System.out.println(lista.get(4).getCode());
        System.out.println(lista.get(5).getCode());

        System.out.println();

        //remove
        //lista.remove(articulo3);
        lista.remove(articulo1);
        //get
        System.out.println("el 0:"+lista.get(0).getCode());
        System.out.println(lista.get(1).getCode());
        System.out.println(lista.get(2).getCode());
        System.out.println(lista.get(3).getCode());
        System.out.println(lista.get(4).getCode());
        System.out.println(lista.get(5));
        System.out.println("--Fin remove--");
        System.out.println(lista.numeroDeArticulos());
    }
}
