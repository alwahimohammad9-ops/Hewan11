/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.pertemuan9;

/**
 *
 * @author TOSHIBA
 */
public class Laptop {
 
    String merk;
    int harga;
    String warna;
    
    public Laptop (String merk, int harga, String warna){
        this.merk = merk;
        this.harga = harga;
        this. warna = warna;
     }
    public void tampilSpek() {
        System.out.println("Merk :" + merk);
        System.out.println("Warna:" + warna);
        System.out.println("Harga : Rp" + harga);
        System.out.println("-----------------------");  
      }
    public int diskon(int persen) {
        return harga -(harga * persen / 100);  
   
        
    }
}
    
