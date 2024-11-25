package org.functional.FunctionalInterface;

import java.util.function.Supplier;

public class _Suppliers {


    public static void main(String[] args) {

        System.out.println(getStringResult());
        System.out.println(getStringResultSupplioer.get());
    }

    static Supplier<String> getStringResultSupplioer = () -> "his is a value Supplier";

    static String getStringResult(){
        return "This is a value";
    }
}
