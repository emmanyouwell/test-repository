/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author Emmanuel
 */
public class MoreExamples {
    public static void run() {
        // 1. Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};
        
        
        
        // 2. Accessing elements in the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // 3. Changing a value in the array
        numbers[1] = 25;
        System.out.println("Updated second element: " + numbers[1]);

        // 4. Getting the length of the array
        System.out.println("Array length: " + numbers.length);

        // 5. Looping through the array using a for loop
        System.out.println("\nArray elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 6. Looping using enhanced for loop (for-each)
        System.out.println("\nArray elements using for-each loop:");
        
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
