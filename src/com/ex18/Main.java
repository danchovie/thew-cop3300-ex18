/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner newScanner = new Scanner(System.in);
        String degree, system_in = "", system_out = "";
        int temp;
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit. ");
        degree = newScanner.next();
        if(degree.equals("C")||degree.equals("c")){
            system_in = "Fahrenheit";
            system_out = "Celsius";
        }
        else if(degree.equals("F")||degree.equals("f")){
            system_in = "Celsius";
            system_out = "Fahrenheit";
        }
        System.out.printf("Please enter the temperature in %s: ", system_in);
        temp = newScanner.nextInt();
        if(system_in.equals("Fahrenheit")){
            temp = (temp-32)*5/9;
        }
        else{
            temp = (temp*9/5)+32;
        }
        System.out.printf("The temperature in %s is %d.", system_out,temp);
    }
}
