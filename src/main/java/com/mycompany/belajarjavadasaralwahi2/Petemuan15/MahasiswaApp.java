/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasaralwahi2.Petemuan15;

/**
 *
 * @author TOSHIBA
 */
import java.sql.*;
import java.util.Scanner;
public class MahasiswaApp {
    static final String URL = "jdbc:mysql://localhost:3306/kampus";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== MENU MAHASISWA ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampil Semua Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            
            int pilih = sc.nextInt();
            sc.nextLine(); // buang enter
            
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Jurusan: ");
                    String jurusan = sc.nextLine();
                    insertMahasiswa(nama, nim, jurusan);
                    break;
                case 2:
                    tampilMahasiswa();
                    break;
                case 3:
                    System.out.println("Selesai");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan salah!");
            }
        }
    }

    // Fungsi koneksi + insert
    static void insertMahasiswa(String nama, String nim, String jurusan) {
        String sql = "INSERT INTO mahasiswa (nama, nim, jurusan) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, nama);
            ps.setString(2, nim);
            ps.setString(3, jurusan);
            ps.executeUpdate();
            System.out.println("✅ Data berhasil disimpan");
            
        } catch (SQLException e) {
            System.out.println("❌ Gagal: " + e.getMessage());
        }
    }

    // Fungsi tampil data
    static void tampilMahasiswa() {
        String sql = "SELECT * FROM mahasiswa ORDER BY id DESC";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            System.out.println("\n--- Data Mahasiswa ---");
            System.out.printf("%-5s %-20s %-12s %-20s\n", "ID", "Nama", "NIM", "Jurusan");
            System.out.println("------------------------------------------------------");
            while (rs.next()) {
                System.out.printf("%-5d %-20s %-12s %-20s\n",
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getString("nim"),
                        rs.getString("jurusan"));
            }
        } catch (SQLException e) {
            System.out.println("❌ Gagal: " + e.getMessage());
        }
    }

    
}
