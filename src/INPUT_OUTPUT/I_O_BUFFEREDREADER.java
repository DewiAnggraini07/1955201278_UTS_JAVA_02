/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INPUT_OUTPUT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class I_O_BUFFEREDREADER {
    public static void main(String[] args) {
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        String a ="";
        int hitungLuas=0;
        System.out.println("<<<<LuasPersegi>>>>");

        
        
        try {
            System.out.println("Masukkan nilai sisi : ");
            a = data.readLine();
            int angka = Integer.parseInt(a);
            hitungLuas =angka*angka;
        } catch (IOException e) {
            System.out.println("Error");
        }
        System.out.println("Luas persegi dengan sisi " + a + " adalah " + hitungLuas);
        }
    }

