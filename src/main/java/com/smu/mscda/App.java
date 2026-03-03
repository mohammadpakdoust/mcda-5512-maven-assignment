package com.smu.mscda;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("This program will capitalize the input string and generate MD5 hex!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String capitalized = StringUtils.capitalize(input);
        String md5Hex = DigestUtils.md5Hex(input);

        System.out.println("Capitalized string is: " + capitalized);
        System.out.println("MD5 Hex is: " + md5Hex);
    }
}