package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("How old are you?: ");
        int age = scanner.nextInt();




        // Calculate the total cost
        int yearsTo100 = 100 - age;
        System.out.println("You are " + yearsTo100 + " years away from 100 years old." );


            }
}