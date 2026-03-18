/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author Emmanuel
 */
public class FruitsDemo {
    public static void run() {
        String[] fruits = new String[5];
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fruits:");
        for (int i=0; i<5; i++) {
            fruits[i] = scanner.nextLine();
        }
        System.out.println("------------------------");
        
        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
