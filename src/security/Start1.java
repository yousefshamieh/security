/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Yousef Shamieh
 */
public class Start1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {
        hillcipher obj = new hillcipher();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        System.out.println("Menu:\n1: Encryption\n2: Decryption");
        System.out.println("Enter the line: ");
        choice = Integer.parseInt(in.readLine());
        System.out.println("Enter the line: ");
        String line = in.readLine();
        System.out.println("Enter the key: ");
        String key = in.readLine();
        double sq = java.lang.Math.sqrt(key.length());
        if (sq != (long) sq) {
            System.out.println("Invalid key length!!! Does not form a square matrix...");
        } else {
            int s = (int) sq;
            if (obj.check(key, s)) {
                System.out.println("Result:");
                obj.divide(line, s);
                obj.cofact(obj.keymatrix, s);
            }
        }
    }

}
