package main.test;

import main.java.model.Order;
import main.java.model.OrderLine;
import main.java.model.Product;
import main.java.model.Supermarket;
import main.java.util.Articulo;
import main.java.util.CodeUtils;
import main.java.util.ListaArticulos;

public class TestSupermarket {
    public static void main(String[] args) {
        Supermarket s1 = new Supermarket("Supermercado Nervión", CodeUtils.getSupermarketCode());
        Product p1 = new Product(CodeUtils.getProductCode(), "Champú 5L Familiar", 25.00, s1);
        Product p2 = new Product(CodeUtils.getProductCode(), "Cerveza Alhambra 1925", 1.00, s1);
        Product p3 = new Product(CodeUtils.getProductCode(), "Aceitunas chupadeos", 1.0, s1);
        Product p4 = new Product(CodeUtils.getProductCode(), "Pizza 4 quesos", 1.0, s1);
        Order o1 = new Order(CodeUtils.getOrderCode(), "Juan Uno", s1);
        Order o2 = new Order(CodeUtils.getOrderCode(), "Juan Dos", s1);
        Order o3 = new Order(CodeUtils.getOrderCode(), "Juan Tres", s1);
        Order o4 = new Order(CodeUtils.getOrderCode(), "Juan Cuatro", s1);
        /*OrderLine or1 = new OrderLine(1, 1, o1, p1);
        OrderLine or2 = new OrderLine(3, 5, o2, p1);
        OrderLine or3 = new OrderLine(6, 1, o4, p1);*/

        /*//addProduct
        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);
        s1.addProduct(p4);

        //getProduct
        System.out.println(s1.getProduct(3));
        System.out.println(s1.getProduct(1));

        //removeProduct
        System.out.println(s1.removeProduct(p2));

        System.out.println(s1.getProduct(2));
        //System.out.println(s1.getProduct(3));//Lanza IndexOutBoundException porque position marca
                                                     //una posición fuera del rango permitido.

        //addOrder
        s1.addOrder(o1);
        s1.addOrder(o2);
        s1.addOrder(o3);
        s1.addOrder(o4);

        //getOrder
        System.out.println(s1.getOrder(3));
        System.out.println(s1.getOrder(1));

        //removeOrder
        System.out.println(s1.removeOrder(o2));

        System.out.println(s1.getOrder(1));
        System.out.println(s1.getOrder(2));
        //System.out.println(s1.getOrder(3));//Lanza IndexOutBoundException porque position marca
        //una posición fuera del rango permitido.*/


        s1.pushOrder(o1);
        s1.pushOrder(o2);
        s1.pushOrder(o3);
        s1.pushOrder(o4);

        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);
        s1.addProduct(p4);

        //Pruebas de la 3 parte
        /*s1.pushOrder(o1);
        s1.pushOrder(o3);
        System.out.println("--Fin pushOrder()--");*/

        System.out.println("Primer pedido: "+s1.getFront());
        System.out.println("--Fin getFront()--");

        System.out.println("Primer pedido: "+s1.popOrder());
        System.out.println("--Fin popOrder()--");

        System.out.println("El mas barato "+s1.getMinPriceProduct());
        System.out.println("--Fin getMinPriceProduct()--");

        System.out.println("El mas caro: "+s1.getMaxPriceProduct());
        System.out.println("--Fin getMaxPriceProduct()--");

        System.out.println("Precio Medio: "+s1.getAvgPriceProduct());
        System.out.println("--Fin getAvgPriceProduct()--");

        System.out.println(s1.getPriceByCode(1));
        System.out.println("--Fin getPriceByCode()--");

        System.out.println(s1.getBestSellingProduct());
    }
}
