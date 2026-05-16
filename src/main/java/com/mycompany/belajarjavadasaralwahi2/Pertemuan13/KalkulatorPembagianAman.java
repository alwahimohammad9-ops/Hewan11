/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Pertemuan13;

/**
 *
 * @author TOSHIBA
 */
 import java.util.Scanner;
import java.util.InputMismatchException;
public class KalkulatorPembagianAman {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean selesai = false;
        
        System.out.println("program di mulai.....");
        while(!selesai) {
            try {
                System.out.print("Masukkan angka pertama:");
                double angka1= input.nextDouble();
                
                 System.out.print("Masukkan angka kedua:");
                  double angka2= input.nextDouble();
                  
                  if (angka2 == 0){
                      System.out.println("Error: Tidak bisa membagi dengan 0!");
                      continue;
                      
                  }
                  double hasil = angka1/ angka2;
                  System.out.println("Hasil:" + hasil );
                  selesai =true;
                  
            } catch (InputMismatchException e) {
                System.out.println("Error: Input harus berupa angka !");
                input.nextLine();
            }
        }
                
            
                 
                
                
                
            
        
    }
    
}
