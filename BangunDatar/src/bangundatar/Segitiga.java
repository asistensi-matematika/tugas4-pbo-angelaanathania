/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

public class Segitiga extends BangunDatar{
    protected double Alas;
    protected double Tinggi;
    
    public Segitiga (){
        return ;
    }
    
    public Segitiga(double Alas, double Tinggi){
        this.Alas = Alas;
        this.Tinggi = Tinggi;
    }
    
    public double LuasSegitiga(double Alas, double Tinggi){
        return (0.5)*Alas*Tinggi;
    }
    
    public void viewSegitiga(){
        super.view();
        System.out.println("Masukkan pilihan anda : 3 ");
        System.out.println("Pilih Segitiga yang diinginkan");
        System.out.println("1. Segitiga siku-siku");
        System.out.println("2. Segitiga sama sisi");
}
}

