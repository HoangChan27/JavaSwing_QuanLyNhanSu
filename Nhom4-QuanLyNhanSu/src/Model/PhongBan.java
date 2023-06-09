/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashSet;

/**
 *
 * @author Hoang
 */
public class PhongBan {

    private String maPhongBan;
    private String tenPhongBan;
    private HashSet<ChuyenVien> danhsachChuyenVien;

    public PhongBan() {
        danhsachChuyenVien = new HashSet<>();
    }
    
    public PhongBan(String maPhongBan, String tenPhongBan) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        danhsachChuyenVien = new HashSet<>();
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) throws Exception {
        if (maPhongBan.trim().isEmpty()) {
            throw new Exception("Mã phòng ban không được để trống!");
        }
        this.maPhongBan = maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) throws Exception {
        if (tenPhongBan.trim().isEmpty()) {
            throw new Exception("Tên phòng ban không được để trống!");
        }
        this.tenPhongBan = tenPhongBan;
    }

    public void themChuyenVien(ChuyenVien cv) {
        danhsachChuyenVien.add(cv);
    }
    
    public void xoaChuyenVien(ChuyenVien cv) {
        danhsachChuyenVien.remove(cv);
    }

    public HashSet<ChuyenVien> getDanhSachChuyenVien() {
        return danhsachChuyenVien;
    } 
}
