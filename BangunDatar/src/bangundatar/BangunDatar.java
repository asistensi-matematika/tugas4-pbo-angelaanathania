/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

public class BangunDatar {
    
    protected String Jenis;
    
    public BangunDatar(){
       return;
    }
    
    public void view(){
            System.out.println("Pilih bangun datar yang diinginkan");
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Segitiga");
        }

   public static void main(String[] args) {
    
    Persegi a = new Persegi(10);
    a.LuasPersegi(10);
    a.viewPersegi();
    System.out.println("");
    
    Lingkaran b = new Lingkaran(20);
    b.LuasLingkaran(20);
    b.viewLingkaran();
    System.out.println("");
    
    Segitiga c = new Segitiga(5,12);
    JenisSegitiga d = new JenisSegitiga(5,12);
    c.LuasSegitiga(5,12);
    d.SisiMiring(5,12);
    d.KelilingSegitigaSikuSiku(5,12);
    d.viewSegitigaSikuSiku(5,12);
    System.out.println("");
    
    Segitiga e = new Segitiga(4,8);
    JenisSegitiga f = new JenisSegitiga(4,8);
    e.LuasSegitiga(4,8);
    f.SisiMiring(4,8);
    f.KelilingSegitigaSamaSisi(4);
    f.viewSegitigaSamaSisi(4);
    System.out.println("");
     
}
    
}
    
    
    
    

