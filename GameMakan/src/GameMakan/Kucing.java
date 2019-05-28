/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMakan;

/**
 *
 * @author ASUS
 */
public class Kucing extends Karnivora {
    String bulu;
    
    public Kucing(String nama, String spesies, String warna, String alatPembunuh, String bulu){
    super (nama, spesies, warna, alatPembunuh);
    this.bulu=bulu;
    }
    
    String bersuara (){
        return "meowww";
    }
}
