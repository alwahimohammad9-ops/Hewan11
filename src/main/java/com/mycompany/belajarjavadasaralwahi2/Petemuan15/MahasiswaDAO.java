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
import java.util.ArrayList;
import java.util.List;

public class MahasiswaDAO {
    private String url ="jdbc :mysql://localhost:3306/db_mahasiswa";
    private String user = "root";
    private String pass ="";
    
    public void insert(Mahasiswa m) {
        String sql = "INSERT INTO mahasiswa (nim,nama,ipk) VALUES (?,?,?)";
        try(Connection conn =DriverManager.getConnection(url,user,pass);
                PreparedStatement pstmt =conn.prepareStatement(sql)){
            pstmt.setString(1,m.getNim());
            pstmt.setString(2,m.getNama());
            pstmt.setDouble(3,m.getIpk());
            
            pstmt.executeUpdate();
            System.out.println("Data berhasil ditambahkan!");
            
        }catch (SQLException e) {
            System.out.println("Error:"+ e. getMessage());
        }
    }
    public List <Mahasiswa> getAll(){
        List<Mahasiswa>list =new ArrayList<>();
        String sql = "SELECT*FROM mahasiswa ";
        try (Connection conn =
                 DriverManager.getConnection(url,user,pass)){
                Statement stmt = 
                        conn.createStatement();
                ResultSet rs = 
                        stmt. executeQuery(sql);
            
            while(rs.next()){
                    Mahasiswa m = new Mahasiswa (
                            rs.getString("nim"),
                            rs.getString("nama"),
                            rs.getDouble("ipk")
                    );
                            list.add(m);
        }
    }catch (SQLException e) {
    System.out.println("Error:" + e. getMessage());
                }
    return list;
}
        
        
            
            
}
        
    
    

