/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Pertemuan10;

/**
 *
 * @author TOSHIBA
 */
public class Product {
   
     private String namaProduk;
    private double harga;
    private int stok;
    
    public Product(String namaProduk, double harga,int stok) {
        this.namaProduk = namaProduk;
        this.  harga=harga;
        
        if (stok >= 0) {
            this.stok = stok;    
        }else{
            this.stok = 0;
            
         }
    }
     public String getNamaProduk() {
         return namaProduk;
         
     }
     public int getStok() {
         return stok;
         
     }
     
     public void setStok(int stok) {
         if (stok >= 0)  {
             this.stok = stok;
         } else{
             System.out.println("Error: Jumlah penambahan harus positif");
         }
     }
     public void tambahStok( int jumlah){
         if (jumlah >0 ) {
             this.stok += jumlah;
         }else{
             System.out.println("Error: Jumlah penambahan harus positif");
             
         }
     }
     public void kurangiStok(int jumlah) {
          if (jumlah >0 ) {
              if (this.stok - jumlah >= 0) {
             this.stok -= jumlah;
         }else{
             System.out.println("Error: Stok tidak mencukupi! Stok sekarang:" + this.stok);
          }
              } else {
              System.out.println("Error: Jumlah pengurangan harus positif!");
         }
     }

         
         
     }
     
     
     
            
    

