package com.practice;

public class ClaculateProfitLoss {
    public static void main(String[] args){

        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;

        double profitPercentage = (profit / (double)costPrice) * 100;

        System.out.println("The cost price is INR " + costPrice + " and selling price is INR " + sellingPrice + "\n" + " " +
                "The profit is INR " + profit + " and the profit percentage is " +  String.format("%.2f", profitPercentage) + "%");

    }
}
