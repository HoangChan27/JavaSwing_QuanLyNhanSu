/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Hoang
 */
public class ChuyenVien extends NhanSu implements Serializable {

    private String phongBan;
    private int soNgayLam;
    private long luongMotNgay;

    public ChuyenVien() {
        super();
    }

    public ChuyenVien(String phongBan) {
        this.phongBan = phongBan;
    }
    
    public ChuyenVien(String phongBan, int soNgayLam, long luongMotNgay) {
        this.phongBan = phongBan;
        this.soNgayLam = soNgayLam;
        this.luongMotNgay = luongMotNgay;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan){
        this.phongBan = phongBan;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(Integer soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public long getLuongMotNgay() {
        return luongMotNgay;
    }

    public void setLuongMotNgay(Long luongMotNgay) {
        this.luongMotNgay = luongMotNgay;
    }

    @Override
    public long khenThuong() {
        if (soNgayLam >= 28) {
            return 500000l;
        } else if (soNgayLam >= 26) {
            return 300000l;
        }
        return 0l;
    }

    @Override
    public long kyLuat() {
        if (soNgayLam < 10) {
            return 800000l;
        } else if (soNgayLam < 15) {
            return 500000l;
        }
        return 0l;
    }

    @Override
    public long tinhLuong() {
        return soNgayLam * luongMotNgay + khenThuong() - kyLuat();
    }
}
