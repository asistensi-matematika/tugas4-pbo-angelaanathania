/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

public class JenisSegitiga extends Segitiga{

    public JenisSegitiga(double Alas, double Tinggi) {
        super(Alas, Tinggi);
    }
       
    public double SisiMiring(double Alas, double Tinggi){
        return Math.sqrt(Math.pow(Tinggi,2) + Math.pow(Alas,2));   
    }
    
    public double KelilingSegitigaSamaSisi(double Alas){ 
        return 3*Alas;
    }
    
    public double KelilingSegitigaSikuSiku(double Alas,double Tinggi){ 
        return Alas+Tinggi+SisiMiring(Alas,Tinggi);
    }
    
    public void viewSegitigaSamaSisi(double Alas){
        super.viewSegitiga();
        System.out.println("Masukkan pilihan Anda : 2 ");
        System.out.println("Masukkan panjang alas : " + Alas + " cm");
        System.out.println("Masukkan panjang tinggi : " + Tinggi + " cm");
        System.out.println("Nama bangun datar adalah segitiga");
        System.out.println("Luas segitiga adalah " + LuasSegitiga(Alas, Tinggi)+ " cm^2");
        System.out.println("Jenis segitiga adalah Segitiga Sama Sisi");
        System.out.println("Keliling segitiga adalah " + KelilingSegitigaSamaSisi(Alas) + " cm");
    }
    
    public void viewSegitigaSikuSiku(double Alas, double Tinggi){
        super.viewSegitiga();
        System.out.println("Masukkan pilihan Anda : 1 ");
        System.out.println("Masukkan panjang alas : " + Alas + " cm");
        System.out.println("Masukkan panjang tinggi : " + Tinggi + " cm");
        System.out.println("Nama bangun datar adalah segitiga");
        System.out.println("Luas segitiga adalah " + LuasSegitiga(Alas,Tinggi)+ " cm^2");
        System.out.println("Jenis segitiga adalah Segitiga Siku-Siku");
        System.out.println("Keliling segitiga adalah " + KelilingSegitigaSikuSiku(Alas, Tinggi) + " cm");
    }
}
