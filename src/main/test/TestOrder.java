package main.test;

import main.java.model.Order;
import main.java.model.OrderLine;
import main.java.model.Product;
import main.java.model.Supermarket;
import main.java.util.CodeUtils;

public class TestOrder {
    public static void main (String[] args){
        Supermarket s1 = new Supermarket("Supermercado Nervión", CodeUtils.getSupermarketCode());

        Product p1 = new Product(CodeUtils.getProductCode(), "Champú 5L Familiar", 25.00, s1);
        Product p2 = new Product(CodeUtils.getProductCode(), "Cerveza Alhambra 1925", 1.00, s1);
        Product p3 = new Product(CodeUtils.getProductCode(), "Aceitunas chupadeos", 5.00, s1);
        Product p4 = new Product(CodeUtils.getProductCode(), "Pizza 4 quesos", 2.20, s1);

        Order o1 = new Order(CodeUtils.getOrderCode(), "Juan Uno", s1);

        OrderLine ol1 = new OrderLine(CodeUtils.getOrderLineCode(), 2, o1, p2);
        OrderLine ol2 = new OrderLine(CodeUtils.getOrderLineCode(), 1, o1, p4);

        //addOrderLine
        o1.addOrderLine(ol1);
        o1.addOrderLine(ol2);

        //getOrderLine
        System.out.println(o1.getOrderLine(0));
        System.out.println(o1.getOrderLine(1));

        //removeOrderLine
        System.out.println(o1.removeOrderLine(ol1));

        System.out.println(o1.getOrderLine(0));
        //System.out.println(s1.getProduct(1));//Lanza IndexOutBoundException porque position marca
        //una posición fuera del rango permitido.
    }
}
