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
public class User {
    String username, password;
    int saldo;
    
    public User(String username, String password, int saldo){
        this.username = username;
        this.password = password;
        this.saldo = saldo;
    }
    
    void tambahSaldo(int topUp){
        saldo+=topUp;
    }
    
    public String toString(){
        return "\n Username : " + username 
              +"\n Saldo    : " + saldo;
    }
}
