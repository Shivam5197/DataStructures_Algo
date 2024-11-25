package org.functional.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {


        System.out.println(        IncrementByOne(1));

        System.out.println("        //Functional takes 1 Argument produce 1 Result");
        System.out.println(IncrementByOneFunction.apply(1));

        Integer apply = MultiplyByTenFunction.andThen(IncrementByOneFunction).apply(5);
        System.out.println(apply);

        System.out.println("        //Functional takes 1 Argument produce 1 Result");

        System.out.println(IncrementByOneAndMultiplyByHundredBiFunction.apply(5,100));


    }

    static Function<Integer,Integer> IncrementByOneFunction = number -> number +1;
    static Function<Integer,Integer> MultiplyByTenFunction = number -> number *10;


    static BiFunction<Integer,Integer,Integer> IncrementByOneAndMultiplyByHundredBiFunction =
            (NumbertoIncrementByOne , NumberMultiplyByTenFunction)
                    -> (NumbertoIncrementByOne +1) * NumberMultiplyByTenFunction;


    static  int IncrementByOne(int num){
        return num+1;
    }



}
