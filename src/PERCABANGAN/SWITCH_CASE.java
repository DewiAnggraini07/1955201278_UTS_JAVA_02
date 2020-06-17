/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERCABANGAN;

/**
 *
 * @author HP
 */
public class SWITCH_CASE {
    public static void main (String[] args) {
        
        char grade = 'A';
        
        switch(grade){
            case 'A' :
                System.out.println("Perfect!");
                break;
            case 'B':
                System.out.println("Excellent!");
                break;
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default :
                System.out.println("invalid grade");     
        }
        System.out.println("Your grade is " + grade);
    }
}
