/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Pertemuan5;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
    public class KasirSederhana05{
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        
        int total = 0; // Variable di luar loop buat nampung total harga
        char lagi; // Buat nampung jawaban y/n
        
        System.out.println("=== Program Kasir Sederhana ===");
        
        do {
            // 1. Program meminta user memasukkan harga barang
            System.out.print("Masukkan harga barang: Rp ");
            int harga = input.nextInt();
            
            total = total + harga; // Tambahin ke total
            
            // 2. Program bertanya: "Ada barang lagi? (y/n)"
            System.out.print("Ada barang lagi? (y/n): ");
            lagi = input.next().charAt(0);
            
        } while (lagi == 'y' || lagi == 'Y'); // 3. Jika 'y', ulangi input harga
        
        // 4. Jika 'n', program berhenti dan menampilkan Total Harga
        System.out.println("--------------------------------");
        System.out.println("Total Harga: Rp " + total);
        System.out.println("Terima kasih sudah berbelanja!");
        
        input.close();
    }

    }

    

