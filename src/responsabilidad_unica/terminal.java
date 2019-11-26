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
public class terminal implements interfaceTerminal {
    final card card;
    final int amount;

    public terminal(card card,int amount){
        this.card=card;
        this.amount=amount;
    }
    
    @Override
    public void tryCharge(){
    new bank(card.num_card,amount,this).hasMoney();
    }

    @Override
    public void printResponse(String message) {
    System.out.println(message);
    }
   
}
