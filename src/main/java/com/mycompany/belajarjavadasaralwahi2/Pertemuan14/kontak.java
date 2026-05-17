/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Pertemuan14;

/**
 *
 * @author TOSHIBA
 */
public class kontak {
    private String nama;
    private String nomor;
    
    public kontak (String nama,String nomor) {
        this.nama = nama;
        this.nomor = nomor;
        
    }
    public String getNama() {
        return nama;
    }
        public String getNomor() {
        return nomor;
        }
        @Override
        public String toString() {
            return "Nama: " + nama + "| Nomor:"+ nomor;
                
        
    }
      
    
    
}
