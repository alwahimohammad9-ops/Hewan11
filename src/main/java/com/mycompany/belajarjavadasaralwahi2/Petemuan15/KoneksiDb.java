/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Petemuan15;

/**
 *
 * @author TOSHIBA
 */
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDb {
    private static final String URL = "jdbc:postgresql://localhost:5432/nama_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "password_kamu";
    
    private static Connection koneksi;

    private KoneksiDb() {}

    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                Class.forName("org.postgresql.Driver");
                koneksi = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Koneksi PostgreSQL berhasil");
            } catch (ClassNotFoundException e) {
                System.out.println("Driver tidak ditemukan: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }
        return koneksi;
    }

    public static void tutupKoneksi() {
        if (koneksi != null) {
            try {
                koneksi.close();
                koneksi = null;
                System.out.println("Koneksi ditutup");
            } catch (SQLException e) {
                System.out.println("Gagal tutup koneksi: " + e.getMessage());
            }
        }
    }
   
}
