/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INPUT_OUTPUT;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class I_O_SCANNER {
    public static void main(String[] args) {
        
        Scanner inputNilai = new Scanner (System.in);
        System.out.println("Inputkan Nilai Angka 0-100");
        
        int tampungnilai = inputNilai.nextInt();
        System.out.println("Nilai : " + tampungnilai);
    }
}


