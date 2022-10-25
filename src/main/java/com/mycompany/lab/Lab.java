/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab;

import java.util.Random;

/**
 *
 * @author student
 */
public class Lab {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Random rand = new Random();
        for(int i=0;i<10;i++){
            System.out.println(rand.nextInt(10));
        }
    }
}
