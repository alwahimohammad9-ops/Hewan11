/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Petemuan15;

/**
 *
 * @author TOSHIBA
 */
public class Mahasiswa {
    private String nim;
     private String nama;
      private double ipk;
      
      public Mahasiswa (String nim, String nama,double ipk) {
          this.nim = nim;
          this.nama= nama;
          this.ipk = ipk;
      }
          
          public String getNim() { return nim; }
           public String getNama() { return nama;}
            public double getIpk() { return ipk;}
            @Override
            public String toString() {
                return nim+"|"+ nama+" |IPK:"+ ipk;
                
          
          }
}
      
    
    

