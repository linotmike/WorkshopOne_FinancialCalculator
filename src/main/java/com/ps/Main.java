package com.ps;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What is the principal amount?");
        int principal = principalMethod();
        System.out.println("What is the interest rate?");
        double interest = interestMethod();
        System.out.println("Please enter the loan term in years?");
        int loanTermInYear = loanTermMethod();
        calculateMortgage(principal,interest, loanTermInYear);







//        System.out.println("Hello world!");
    }
    public static int principalMethod() {
        int response = scanner.nextInt();
        if(response > 0){
            System.out.println("your principal is: " + response);
            return response;
        }else {
            System.out.println("Please enter your principal");
            return principalMethod();
        }

    }


    public static double interestMethod(){
        double response = scanner.nextDouble();
        if (response > 0){
            System.out.println("your interest method is: " + response);
            return response;
        } else{
            System.out.println("Please enter interest method");
            return interestMethod();
        }
    }

    public static int loanTermMethod(){
        int response = scanner.nextInt();
        if (response > 0) {
            System.out.println("your loan term is: " + response + " years!");
            return response;
        } else {
            System.out.println("Please enter loan term in years");
            return loanTermMethod();
        }
        }

    public static void calculateMortgage(int principal, double interest, int loanTermInYear){
        double monthlyInterest = (interest/100)/12;
        int monthlyTotal = loanTermInYear * 12;
        double monthlyPayment = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, monthlyTotal))/
                (Math.pow(1 +monthlyInterest, monthlyTotal) -1);
        System.out.println("The monthly payment is: " + monthlyPayment);
    }




}