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
public class Khoa {

    private String maKhoa;
    private String tenKhoa;
    private HashSet<GiangVien> danhSachGiangVien;

    public Khoa() {
        danhSachGiangVien = new HashSet<>();
    }

    public Khoa(String maKhoa, String tenKhoa) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
        danhSachGiangVien = new HashSet<>();
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) throws Exception {
        if (maKhoa.trim().isEmpty()) {
            throw new Exception("Mã khoa không được để trống!");
        }
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) throws Exception {
        if (tenKhoa.trim().isEmpty()) {
            throw new Exception("Tên khoa không được để trống!");
        }
        this.tenKhoa = tenKhoa;
    }

    public void themGiangVien(GiangVien gv) {
        danhSachGiangVien.add(gv);
    }
    
    public void xoaGiangVien(GiangVien gv) {
        danhSachGiangVien.remove(gv);
    }

    public HashSet<GiangVien> getDanhSachGiangVien() {
        return danhSachGiangVien;
    }    
}
