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
    }

    public ChuyenVien(String phongBan) {
        this.phongBan = phongBan;
    }

    public ChuyenVien(NhanSu ns, String phong) {
        this.setMaNhanSu(ns.getMaNhanSu());
        this.setHoTen(ns.getHoTen());
        this.setDiaChi(ns.getDiaChi());
        this.setNamSinh(ns.getNamSinh());
        this.setSdt(ns.getSdt());
        this.setTrinhDo(ns.getTrinhDo());
        this.phongBan = phong;
    }
    
    public ChuyenVien(int soNgayLam, long luongMotNgay) {
        this.soNgayLam = soNgayLam;
        this.luongMotNgay = luongMotNgay;
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
        if (soNgayLam >= 26) {
            return 500000l;
        } else if (soNgayLam >= 22) {
            return 300000l;
        }
        return 0l;
    }

    @Override
    public long tinhLuong() {
        return soNgayLam * luongMotNgay + khenThuong();
    }
}
