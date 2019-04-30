package main.test;

import main.java.model.Order;
import main.java.model.Product;
import main.java.model.Supermarket;
import main.java.util.CodeUtils;

public class TestSupermarket {
    public static void main(String[] args) {
        Supermarket s1 = new Supermarket("Supermercado Nervión", CodeUtils.getSupermarketCode());
        Product p1 = new Product(CodeUtils.getProductCode(), "Champú 5L Familiar", 25.00, s1);
        Product p2 = new Product(CodeUtils.getProductCode(), "Cerveza Alhambra 1925", 1.00, s1);
        Product p3 = new Product(CodeUtils.getProductCode(), "Aceitunas chupadeos", 5.00, s1);
        Product p4 = new Product(CodeUtils.getProductCode(), "Pizza 4 quesos", 2.20, s1);
        Order o1 = new Order(CodeUtils.getOrderCode(), "Juan Uno", s1);
        Order o2 = new Order(CodeUtils.getOrderCode(), "Juan Dos", s1);
        Order o3 = new Order(CodeUtils.getOrderCode(), "Juan Tres", s1);
        Order o4 = new Order(CodeUtils.getOrderCode(), "Juan Cuatro", s1);

        //addProduct
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
        //una posición fuera del rango permitido.
    }
}
