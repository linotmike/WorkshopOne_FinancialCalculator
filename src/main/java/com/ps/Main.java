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





}