package com.ps;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What is the principal amount?");
        double principal = principalMethod();





//        System.out.println("Hello world!");
    }
    public static double principalMethod() {
        double response = scanner.nextDouble();
        if(response > 0){
            System.out.println("your principal is: " + response);
        }else {
            System.out.println("Please enter your principal");
            return principalMethod();
        }

        return response;
    }

}