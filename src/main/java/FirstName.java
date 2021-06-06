/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Quentin_Burney
 */
import java.util.Scanner;

public class FirstName {
    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Hello, " + input + " ,nice to meet you!");
    }
}
