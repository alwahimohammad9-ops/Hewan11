/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Petemuan15;

/**
 *
 * @author TOSHIBA
 */
import java.util.List;
public class Main {
    public static void main (String []args){
        MahasiswaDAO dao= new MahasiswaDAO();
        
        Mahasiswa m1 = new Mahasiswa ("12345","Budi Santoso",3.75);
        dao.insert(m1);
        
        List<Mahasiswa> daftar = dao.getAll();
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa m: daftar) {
            System.out.println(m);
            
        }
        
        
    }
    
}
