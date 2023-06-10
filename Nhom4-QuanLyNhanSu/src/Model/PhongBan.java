/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author Hoang
 */
public class PhongBan implements Serializable {

    private String tenPhongBan;
    private HashSet<ChuyenVien> danhsachChuyenVien;

    public PhongBan() {
        danhsachChuyenVien = new HashSet<>();
    }
    
    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
        danhsachChuyenVien = new HashSet<>();
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.tenPhongBan);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PhongBan other = (PhongBan) obj;
        return Objects.equals(this.tenPhongBan, other.tenPhongBan);
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
