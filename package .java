package com.colors.javascanner;

import java.util.Scanner;

public class colorscanner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = myScanner.nextInt();

        if (num >= 30) {
            System.out.println("Red");
        } else if (num >= 20) {
            System.out.println("Green");
        } else if (num >= 10) {
            System.out.println("Blue");
        } else {
            System.out.println("There is no correlating color");
        }

        myScanner.close();
    }
}

