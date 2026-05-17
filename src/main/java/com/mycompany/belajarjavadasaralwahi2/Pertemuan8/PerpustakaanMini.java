/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Pertemuan8;

/**
 *
 * @author TOSHIBA
 */
    import java.util.Scanner;

public class PerpustakaanMini{

    static String[] daftarBuku ={
        "Laskar pelangi",
        "Bumi Manusia",
        "Negri 5 Menara",
        "Dilan 1990",
        "Hujan", 
    };
    
    public static void tampilDaftarBuku() {
        System.out.println("=== DAFTAR BUKU PERPUSTAKAAN===");
        for (int i = 0; i < daftarBuku.length; i++){
            System.out.println(( i +1) + "." + daftarBuku[i]);
        }
        System.out.println("===============================");
    }
    public static boolean cariBuku(String judul) {
        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].equalsIgnoreCase(judul)) {
                return true;   
            }  
        }
        return false;
    }
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        tampilDaftarBuku();
        
        System.out.print("\nMasukan judul yang dicari:");
        String judulCari =input.nextLine();
        
        boolean ditemukan = cariBuku (judulCari);
        if(ditemukan) {
            System.out.println("Buku tidak ditemukan");
        }
        input.close();
        
    }
    
    
}
    

