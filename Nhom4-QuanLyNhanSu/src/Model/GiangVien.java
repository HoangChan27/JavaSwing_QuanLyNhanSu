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
public class GiangVien extends NhanSu implements Serializable {

    private String khoa;
    private int soTietDay;
    private long donGia;

    public GiangVien() {
        super();
        soTietDay = 0;
        donGia = 0;
    }

    public GiangVien(String khoa) {
        this.khoa = khoa;
    }
    
    public GiangVien(String khoa, int soTietDay, long donGia) {
        this.khoa = khoa;
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) throws Exception {
        this.khoa = khoa;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(Integer soTietDay) {
        this.soTietDay = soTietDay;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(Long donGia) {
        this.donGia = donGia;
    }

    @Override
    public long khenThuong() {
        if (soTietDay >= 150) {
            return 800000l;
        } else if (soTietDay >= 100) {
            return 500000l;
        } else if (soTietDay >= 75) {
            return 200000l;
        }
        return 0l;
    }

    @Override
    public long kyLuat() {
        if (soTietDay < 30) {
            return 500000l;
        } else if (soTietDay < 50) {
            return 300000l;
        }
        return 0l;
    }

    @Override
    public long tinhLuong() {
        return soTietDay * donGia + khenThuong() - kyLuat();
    }
}
