package org.calculator.calimpl;
import org.calculator.calapi.Calculator;
public class Application {
    public static void main(String[] args) {

        Calculator obj = new Calculator();
        System.out.println(obj.add(2,3));
        System.out.println(obj.subtract(5,2));
        System.out.println(obj.multiply(6,8));
        System.out.println(obj.divide(14,7));

    }
}
