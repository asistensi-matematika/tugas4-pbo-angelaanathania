/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

public class Lingkaran extends BangunDatar{
    protected double JariJari;
    
    public Lingkaran(double JariJari){
        this.JariJari = JariJari;
    }
    
    public double LuasLingkaran (double JariJari){
        return (3.14)*JariJari*JariJari;
    }
    
    public void viewLingkaran(){
        super.view();
        System.out.println("Masukkan pilihan anda : 2 ");
        System.out.println("Masukkan panjang jari-jari : " + JariJari + " cm");
        System.out.println("Nama bangun datar adalah lingkaran ");
        System.out.println("Luas lingkaran adalah " + LuasLingkaran(JariJari) + " cm^2");
        System.out.println("Keliling lingkaran adalah " + (2*JariJari*(3.14)) + " cm");
    }
}
