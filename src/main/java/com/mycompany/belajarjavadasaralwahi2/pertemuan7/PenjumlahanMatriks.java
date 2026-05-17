/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.pertemuan7;

/**
 *
 * @author TOSHIBA
 */
import java.util.Locale;
import java.util.Scanner;
public class PenjumlahanMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int[][] matriksA = new int[2][2];
        int[][] matriksB = new int[2][2];
        int[][] matriksHasil = new int[2][2];
        System.out.println("Masukkan elemen Matriks A 2*2:");
        for (int i = 0;i < 2; i++) {
             for (int j = 0;j < 2; j++) {
            System.out.println("A[" + i +"][" + "]: ");
            matriksA[i][j] = input.nextInt();
             }
            }
        System.out.println("\nMasukkan elemen Matriks B 2*2:");
         for (int i = 0;i < 2; i++) {
             for (int j = 0;j < 2; j++) {
            System.out.print("B[" + i +"][" + "]: ");
            matriksB[i][j]= input.nextInt();
            
             } 
        }
         for(int i =0;i < 2; i++) {
             for (int j = 0; j <2; j++){
                 matriksHasil[i][j] = matriksA [i][j] +matriksB[i][j];
             }
         }
         System.out.println("\nMatriks A:");
         for (int i = 0; i< 2; i++) {
              for (int j = 0; j< 2; j++) {
                  System.out.print(matriksA[i][j] +" ");
                  
              }
              System.out.println();
             
         }
         System.out.println("\nMatriks B:");
         for (int i = 0; i< 2; i++) {
              for (int j = 0; j< 2; j++) {
                  System.out.print(matriksB[i][j] +" ");
              }
              System.out.println();
         }
         System.out.println("\nHasil penjumlahan:");
         for (int i = 0; i< 2; i++) {
              for (int j = 0; j< 2; j++) {
                  System.out.print(matriksHasil[i][j] +" ");
              }
              System.out.println();
         }
         input.close();
         
         
         
         
                 
             }
                 
             }
         
        
    
         

