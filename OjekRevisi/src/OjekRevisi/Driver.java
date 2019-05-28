/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OjekRevisi;

/**
 *
 * @author ASUS
 */
public class Driver extends User {
    public Driver(String username, String password, int saldo){
        super(username, password, saldo);
    }
    
    public String toString(){
        return "\n Driver \n" + 
               "-----------------" + super.toString();
    }
}
