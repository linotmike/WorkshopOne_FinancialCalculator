package com.ps;
import java.util.Scanner;


public class FutureCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        System.out.println("What is your name?");
        String name  = scanner.nextLine();
        System.out.println("What is the amount of your deposit?");
        double deposit = depositMethod();
        System.out.println("What is the interest rate?");
        double interestRate = interestRateMethod();
        System.out.println("What is the number of years?");
        int years = numberOfYearsMethod();


    }


    public static double depositMethod(){
        int response = scanner.nextInt();

        if(response > 0 ){
            System.out.println("Your deposit is: " + response);
            return response;
        } else {
            System.out.println("please enter your deposit");
            return depositMethod();
        }
    }

    public static double interestRateMethod(){
        double response = scanner.nextDouble();

        if(response > 0){
            System.out.println("your interest rate is: " + response + "%");
            return response;
        } else {
            System.out.println("Please enter an interest rate? ");
            return interestRateMethod();
        }
    }
    public static int numberOfYearsMethod() {
        int response = scanner.nextInt();
        if (response > 0){
            System.out.println("The number of years you choose is: "+ response);
            return response;
        } else {
            System.out.println("please enter the number of years");
            return numberOfYearsMethod();
        }
    }


}
