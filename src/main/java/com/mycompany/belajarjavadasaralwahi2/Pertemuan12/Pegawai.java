/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Pertemuan12;

/**
 *
 * @author TOSHIBA
 */
public class Pegawai {
    String nama;
    
    public Pegawai(String nama) {
        this.nama = nama;
        
    }
    public void tampilInfo() {
        System.out.println("Nama:" + nama);
        
    }
    public double gaji() {
        return 0;
        
    }
   }
class Manager extends Pegawai {
    public Manager (String nama ) {
        super(nama);
        
        
    }
}
class Programmer extends Pegawai {
    public Programmer(String nama){
        super(nama);
        
        
    }
    @Override
    public double gaji() {
        return 8000000;
        
        
    }
    
}

              
          
        
        
    