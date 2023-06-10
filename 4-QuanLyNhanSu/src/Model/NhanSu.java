/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Hoang
 */
public class NhanSu implements Serializable {

    protected int maNhanSu;
    protected String hoTen;
    protected String diaChi;
    protected int namSinh;
    protected String sdt;
    protected String trinhDo;
    protected HoSo hoSo;
    protected static int id = 1;

    public NhanSu() {
        this.maNhanSu = id++;
    }

    public NhanSu(HoSo hoSo) {
        this.maNhanSu = id++;
        this.hoSo = hoSo;
    }
    
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        NhanSu.id = id;
    }

    public int getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(int maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

    public HoSo getHoSo() {
        return hoSo;
    }

    public void setHoSo(HoSo hoSo) {
        this.hoSo = hoSo;
    }
        
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.maNhanSu);
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
        final NhanSu other = (NhanSu) obj;
        return Objects.equals(this.maNhanSu, other.maNhanSu);
    }

    public long khenThuong() {
        return 0;
    }

    public long tinhLuong() {
        return 0;
    }
}
