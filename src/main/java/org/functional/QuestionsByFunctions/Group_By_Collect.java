package org.functional.QuestionsByFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_By_Collect {

    public static void main(String[] args) {

        System.out.println("Problem: Given a list of transactions (each with a type and amount), group the transactions by type and sum the amounts for each type.");
        List<Transaction> transactions = Arrays.asList(
                new Transaction("Groceries", 150.0),
                new Transaction("Clothing", 1555.0),
                new Transaction("Electronics", 200.0),
                new Transaction("Groceries", 100.0),
                new Transaction("Clothing", 75.0),
                new Transaction("Electronics", 50.0)
        );

         Map<String,Double> result =  transactions.stream()
                        .collect(Collectors.groupingBy(Transaction::getType
                        ,Collectors.summingDouble(Transaction::getAmount)));


         result.forEach((type,total)-> System.out.println("For "+type+ " Spent - "+ total));


    }

}

class Transaction {
    String type;
    double amount;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    // Getters, toString(), etc.


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}



