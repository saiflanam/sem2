/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahasinterface;

/**
 *
 * @author ASUS
 */
public abstract class BujurSangkar implements Bangun2D, Image{
    int sisi;
    
    public BujurSangkar(int sisi){
        this.sisi=sisi;
    }
    
    public double getLuas(){
        return sisi*sisi;
    }
    
//    public double getKeliling(){
//        return sisi+sisi;
//    }
    
    public void draw(){
        //perintah menggambar
    }
 
}
