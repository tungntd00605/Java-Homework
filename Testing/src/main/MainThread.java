/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author TVD1104
 */
public class MainThread {

    public static void main(String[] args) {
        try {
            //Testing write file
            FileInputStream input = null;
            FileOutputStream output = null;
            try {
                input = new FileInputStream("input.txt");
                output = new FileOutputStream("output.txt");
            } catch (Exception e) {
            }
            
            // read from URL
            URL vnexpressURL = new URL("https://vnexpress.net");
            URLConnection myConnection = vnexpressURL.openConnection();
            myConnection.connect();
            BufferedReader readInput = new BufferedReader(new InputStreamReader(myConnection.getInputStream()));
            String inputLine;
            while ((inputLine = readInput.readLine()) != null) {
                System.out.println(inputLine);
            }
            readInput.close();
        } catch (Exception e) {
            System.out.println("Something is wrong");
        }
    }
}
