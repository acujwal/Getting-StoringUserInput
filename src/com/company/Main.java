package com.company;

import java.awt.*;
import java.util.Scanner;


public class Main {
    private static String name;

    public static void main(String[] args) {
	Scanner Keyboard = new Scanner(System.in);

	System.out.println("Enter your Name: ");
	name = Keyboard.nextLine();

	System.out.print("Hello, " + name);

    }
}
