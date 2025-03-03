package org.functional.Streams2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Basics {


    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
        System.out.println("This is task");
        });
        t1.run();

        mathOperation sd = (int a, int b) -> a+b;
        mathOperation sd1 = (int a, int b) -> a-b;
        int rs = sd1.sum(1,4);
        System.out.println(rs);

        //Predicate -> Functional Interface (Boolean valued Function )
        Predicate<Integer> isEven = x -> x % 2 == 0 ;
        System.out.println(isEven.test(4));
        Predicate<String> isStartwithA = name -> name.startsWith("A")|| name.startsWith("a");
        Predicate<String> isEndswithT = name -> name.endsWith("T")|| name.endsWith("t");
        Predicate<String> s =   isStartwithA.and(isEndswithT);

        System.out.println(s.test("Rnkit"));

        //Function -> works for you (Do operations)
        Function<Integer,Integer> doubleIt = num -> num *2 ;
        Function<Integer,Integer> tripleIt = num -> num *3 ;
        Function<Integer,Integer> finalFuncation = doubleIt.andThen(tripleIt);
        Function<Integer,Integer> finaFuncation = doubleIt.compose(tripleIt);

        System.out.println("Output of Double it -> "+ doubleIt.apply(10) + " Output of Triple it " + tripleIt.apply(10) + " Final output => " + finaFuncation.apply(10));

        //Consumer -> Only consumes return nothing
        Consumer<String> con = st -> System.out.println(st);
        con.accept("Hello world consumer ! ");

        //Supplier -> Consumes nothing supply everything

        Supplier<String> su = ()->"Hello world Supplier";
        System.out.println(su.get());


        // Combined Example

        Predicate<Integer> predicate = num -> num % 2 == 0;
        Function<Integer,Integer> function = num -> num * num;
        Consumer<Integer> consumer = num -> System.out.println(num);
        Supplier<Integer> supplier = () -> 60;


        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }


    }




}







@FunctionalInterface
interface mathOperation{
    int sum(int a,int b);
}