/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Hoang
 */
public class Khoa implements Serializable {

    private String tenKhoa;
    private List<GiangVien> danhSachGiangVien;

    public Khoa() {
        danhSachGiangVien = new ArrayList<>();
    }

    public Khoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
        danhSachGiangVien = new ArrayList<>();
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public void themGiangVien(GiangVien gv) {
        danhSachGiangVien.add(gv);
    }
    
    public void xoaGiangVien(GiangVien gv) {
        danhSachGiangVien.remove(gv);
    }

    public List<GiangVien> getDanhSachGiangVien() {
        return danhSachGiangVien;
    }   
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.tenKhoa);
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
        final Khoa other = (Khoa) obj;
        return Objects.equals(this.tenKhoa, other.tenKhoa);
    }
}
