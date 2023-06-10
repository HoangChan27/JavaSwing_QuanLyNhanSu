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
    protected HoSo hoSo;
    protected static int id = 1;

    public NhanSu() {
        this.maNhanSu = id++;
    }

    public NhanSu(HoSo hoSo) {
        this.maNhanSu = id++;
        this.hoSo = hoSo;
    }

    public NhanSu(String hoTen, String diaChi, String sdt, String trinhDo) {
        this.hoSo.setHoTen(hoTen);
        this.hoSo.setDiaChi(diaChi);
        this.hoSo.setSdt(sdt);
        this.hoSo.setTrinhDo(trinhDo);
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

    public HoSo getHoSo() {
        return hoSo;
    }

    public void setHoSo(HoSo hoSo) {
        this.hoSo = hoSo;
    }
    
    public int getMaHoSo() {
        return this.hoSo.getMaHoSo();
    }

    public void setMaHoSo(int maHoSo) {
        this.hoSo.setMaHoSo(maHoSo);
    }
    
    public String getHoTen() {
        return this.hoSo.getHoTen();
    }

    public void setHoTen(String hoTen) {
        this.hoSo.setHoTen(hoTen);
    }

    public String getGioiTinh() {
        return this.hoSo.getGioiTinh();
    }

    public void setGioiTinh(String gioiTinh) {
        this.hoSo.setGioiTinh(gioiTinh);
    }

    public String getDiaChi() {
        return this.hoSo.getDiaChi();
    }

    public void setDiaChi(String diaChi) {
        this.hoSo.setDiaChi(diaChi);
    }

    public int getNamSinh() {
        return this.hoSo.getNamSinh();
    }

    public void setNamSinh(int namSinh) {
       this.hoSo.setNamSinh(namSinh);
    }

    public String getSdt() {
        return this.hoSo.getSdt();
    }

    public void setSdt(String sdt) {
        this.hoSo.setSdt(sdt);
    }
    
    public String getTrinhDo() {
        return this.hoSo.getTrinhDo();
    }

    public void setTrinhDo(String trinhDo) {
        this.hoSo.setTrinhDo(trinhDo);
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

    public long kyLuat() {
        return 0;
    }

    public long tinhLuong() {
        return 0;
    }
}
