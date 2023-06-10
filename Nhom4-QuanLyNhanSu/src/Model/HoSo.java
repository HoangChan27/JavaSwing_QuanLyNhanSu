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
public class HoSo implements Serializable {

    private int maHoSo; // ma ho so tu dong tang
    private String hoTen;
    private String gioiTinh;
    private String diaChi;
    private int namSinh;
    private String sdt;
    private String trinhDo; // cao dang - dai hoc - thac si - tien si
    private String viTriUngTuyen; // giang vien - vien chuc
    private String trangThai;
    private static int id = 1;

    public HoSo() {
        this.maHoSo = id++;
    }
    
    public HoSo(String hoTen, String gioiTinh, String diaChi, int namSinh, String sdt,
            String trinhDo, String viTriUngTuyen) {
        this.maHoSo = id++;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
        this.sdt = sdt;
        this.trinhDo = trinhDo;
        this.viTriUngTuyen = viTriUngTuyen;
        this.trangThai = "Chờ phê duyệt";
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        HoSo.id = id;
    }

    public int getMaHoSo() {
        return maHoSo;
    }

    public void setMaHoSo(int maHoSo) {
        this.maHoSo = maHoSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTriUngTuyen() {
        return viTriUngTuyen;
    }

    public void setViTriUngTuyen(String viTriUngTuyen) {
        this.viTriUngTuyen = viTriUngTuyen;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.maHoSo;
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
        final HoSo other = (HoSo) obj;
        return this.maHoSo == other.maHoSo;
    }
 
}
