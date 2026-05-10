/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Pertemuan12;

/**
 *
 * @author TOSHIBA
 */
public class Perusahaan {
    public static void main(String [] args) {
        Pegawai[] karyawan = new Pegawai [3];
        karyawan[0] = new Manager ("Budi ");
         karyawan[1] = new Programmer ("Siti ");
          karyawan[2] = new Programmer ("Rudi "); 
          
          for(Pegawai p : karyawan){
              p.tampilInfo();
              System.out.println("Gaji :" + p.gaji ());
              System.out.println("-----------------");
          }
    }
    }
    
