/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author TVD1104
 */
public class Calculator {
    void sum (float a, float b){
        System.out.println("Tổng của (" + a + " + " + b + ") là : " + (a + b));
    }
    void minus (float a, float b){
        System.out.println("Hiệu của (" + a + " - " + b + ") là : " + (a - b));
    }
    void multi (float a, float b){
        System.out.println("Tích của (" + a + " * " + b + ") là : " + (a * b));
    }
    void divide (float a, float b){
        if(b == 0){
            System.out.println("Bạn không thể chia cho 0");
        }
        else {
            System.out.println("Thương của (" + a + " / " + b + ") là : " + (a / b));
        }
    }
}
