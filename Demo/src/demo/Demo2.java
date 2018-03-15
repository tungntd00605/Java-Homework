/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author TVD1104
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số a: ");
        while (!scanner.hasNextFloat()){
            System.out.println("Xin vui lòng nhập lại số a");
            scanner.next();
        }
        float a = scanner.nextFloat();
        System.out.println("Hay nhap so b: ");
        while (!scanner.hasNextFloat()){
            System.out.println("Xin vui lòng nhập lại số b");
            scanner.next();
        }
        float b = scanner.nextFloat();
        Calculator basicOperation = new Calculator();
        basicOperation.sum(a, b);
        basicOperation.minus(a, b);
        basicOperation.multi(a, b);
        basicOperation.divide(a, b);
    }
}
