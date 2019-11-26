/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsabilidad_unica;

/**
 *
 * @author JonathanC
 */
public class Responsabilidad_unica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        card american_express=new card();
        int totalAmount=100;
        terminal b= new terminal(american_express,totalAmount);
        b.tryCharge();
    }
    
}
