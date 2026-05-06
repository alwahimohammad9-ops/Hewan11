/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Pertemuan11;

/**
 *
 * @author TOSHIBA
 */
public class Hewan {
    String nama;
    
    Hewan(String nama) {
        this.nama = nama;
        
    }
    void bersuara() {
        System.out.println ("Hewan bersuara");
        
    }
    
}
class Kucing extends Hewan {
   Kucing (String nama) {
       super (nama);
       
   }
   @Override
           void bersuara() {
               System.out.println("Meaong meong ");
           }
           
       }
 class Anjing extends Hewan {
     Anjing (String nama) {
         super (nama) ;
         
         
     }
     @Override
           void bersuara() {
               System.out.println("Guk guk ");
           }
 }
class main {
    public static void main (String [] argsd) { 
        Hewan Kucing =new Kucing ("kitty");
        Hewan anjing =new Anjing (" Doqqi");
        
        System.out.print(Kucing.nama + ":");
        Kucing.bersuara();
        
        System.out.println(anjing.nama + ": ");
        anjing.bersuara();
    }
      
        
    }
