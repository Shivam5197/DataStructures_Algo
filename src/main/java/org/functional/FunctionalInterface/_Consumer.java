package org.functional.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {


    public static void main(String[] args) {
        customer customer = new customer("John Doe","654321645132");

    greetCustomer(customer);
        greetCustomerConsumer.accept(customer);

        greetCustomerBiConsumer.accept(customer,false);

    }

    static  void greetCustomer(customer customer){
        System.out.println("Hello and Welcome "+customer.getName()+ " Phone is : -> " + customer.getPhone());
    }

    static Consumer<customer> greetCustomerConsumer = customer ->
            System.out.println("Hello and Welcome "+customer.getName()+ " Phone is : -> " + customer.getPhone());

    static BiConsumer<customer,Boolean> greetCustomerBiConsumer = (customer,showphone)
            -> System.out.println("Hello and Welcome "+customer.getName()+ " Phone is : -> " + (showphone ? customer.getPhone() : "**********"));


}



 class customer{

    private String name;
    private String phone;

    customer(String name , String phone){
        this.name = name;
        this.phone = phone;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getPhone() {
         return phone;
     }

     public void setPhone(String phone) {
         this.phone = phone;
     }
 }