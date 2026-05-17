/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Pertemuan14;

/**
 *
 * @author TOSHIBA
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenKontak {
    static ArrayList<kontak> daftarkontak = new ArrayList<>();
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            pilihan= input.nextInt();
            input.nextLine();
            
        } while (pilihan !=0);
    }
    public static void tampilkanMenu(){
        System.out.println("\n=== Menu kontak ===");
         System.out.println("\1. Tambah kontak ");
          System.out.println("\2. Lihat kontak ");
           System.out.println("\0. keluar");
          
            
    }
    public static void tambahkanKontak() {
        System.out.print("Masukkan nama:");
        String nama = input.nextLine();
        System.out.print("Masukkan nomor:");
        String nomor = input.nextLine();
        daftarkontak.add(new kontak(nama,nomor));
        System.out.println("kontak ditambahkan!");
    }
    public static void lihatkontak() {
        if(daftarkontak.isEmpty()) {
            System.out.println("Belum ada kontak.");
        }else{
            for(int i =0;i <daftarkontak.size();i++) {
                System.out.println((i+1) + "." + daftarkontak.get(i));
            }
        }
            }
        }
         
        
        
        
        
            
        
  