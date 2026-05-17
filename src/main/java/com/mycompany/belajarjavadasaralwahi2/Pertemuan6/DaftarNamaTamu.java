/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Pertemuan6;

/**
 *
 * @author TOSHIBA
 */
    import java.util.Scanner;
public class DaftarNamaTamu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah tamu:");
        int jumlahTamu = input.nextInt();
        input.nextLine();
        
        String[]namaTamu = new String[jumlahTamu];
        
        for (int  i= 0; i < jumlahTamu; i++) {
            System.out.print("Nama tamu ke -" + (i+ 1) + ":");
            namaTamu[i] = input.nextLine();
            }
        System.out.println("\n=== Daftar Nama Tamu===");
        
        for(int i =0; i< jumlahTamu; i++) {
           System.out.println("Tamu" + (i+1)+ ":" +namaTamu[i]);
           
        }
        int jumlahA = 0;
        for(int i = 0; i < jumlahTamu; i++){
            if (namaTamu[i].startsWith("A")) {
                jumlahA++;
                
            }  
        }
        System.out.println("\nJumlah tamu yang namanya diawali'A': " + jumlahA);
       input.close();
       
}
}
    

