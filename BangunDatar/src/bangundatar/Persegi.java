/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author AJO
 */
public class Persegi extends BangunDatar{
    protected double Sisi;
    
    public Persegi(double Sisi){
        this.Sisi = Sisi;
    }
    
    public double LuasPersegi (double Sisi){
        return (Sisi*Sisi);
    }
    
    public void viewPersegi(){
        super.view();
        System.out.println("Masukkan pilihan anda : 1 ");
        System.out.println("Masukkan panjang sisi : " + Sisi + " cm");
        System.out.println("Nama bangun datar adalah persegi ");
        System.out.println("Luasnya adalah " + LuasPersegi(Sisi) + " cm^2");
        System.out.println("Kelilingnya adalah " + (4*Sisi) + " cm");
    }
    
}
