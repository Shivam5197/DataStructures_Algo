package org.functional.FunctionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(        isPhoneNumberValid("9958045125"));
        System.out.println(        isPhoneNumberValid("591695804512"));


        System.out.println(isPhoneNumberValidPredicate.test("9958045125"));

    }

    static Predicate<String> isPhoneNumberValidPredicate = number -> number.startsWith("99") && number.length() == 10;

    static boolean isPhoneNumberValid(String phone){
        return  phone.startsWith("99") && phone.length() == 10;
    }

}


