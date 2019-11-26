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
public class bank implements interfaceBank {

    final int id_card;
    final int amount;
    final interfaceTerminal intTerm;
    
    public bank(int id_card,int amount,interfaceTerminal intTerm) {
        this.id_card= id_card;
        this.amount=amount;
        this.intTerm= intTerm;
    }
    @Override
    public void hasMoney(){
        //Any operation to validate if the card with that id hass => money than the amount
        intTerm.printResponse("successfully operation / Wrong operation");
    }
}
