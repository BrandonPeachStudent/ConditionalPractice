package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter either 1 or 2");
        int number = keyboard.nextInt();

        if(number == 1) {
            System.out.println("The number is equal to 1");
        }

        else if(number == 2 ) {
            System.out.println("The number is equal to 2");
        }

        else {
            System.out.println("You did not follow directions");
        }





    }
}
