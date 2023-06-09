/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Hoang
 */
public abstract class NhanSu {

    protected String maNhanSu;
    protected String hoTen;
    protected String gioiTinh;
    protected int namSinh;
    protected String diaChi;
    protected HoSo hoSo;

    public NhanSu() {
    }

    public NhanSu(String maNhanSu, String hoTen, String gioiTinh, Integer namSinh, String diaChi) {
        this.maNhanSu = maNhanSu;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }
    
    public NhanSu(String maNhanSu, String hoTen, String gioiTinh, Integer namSinh, String diaChi, HoSo hoSo) {
        this.maNhanSu = maNhanSu;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.hoSo = hoSo;
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(String maNhanSu) throws Exception {
        if (hoTen.trim().isEmpty()) {
            throw new Exception("Mã nhân sự không được để trống!");
        }
        this.maNhanSu = maNhanSu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) throws Exception {
        if (hoTen.trim().isEmpty()) {
            throw new Exception("Họ tên không được để trống!");
        } else {
            if (hoTen.matches("[^a-zA-Z]+")) {
                throw new Exception("Họ tên chỉ được chứa chữ!");
            }
        }
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) throws Exception {
        if (gioiTinh.trim().isEmpty()) {
            throw new Exception("Giới tính không được để trống!");
        } else {
            if (gioiTinh.matches("[^a-zA-Z]+")) {
                throw new Exception("Giới tính chỉ được chứa chữ!");
            }
        }

        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) throws Exception {
        if (namSinh.toString().trim().isEmpty()) {
            throw new Exception("Năm sinh không được trống!");
        } else {
            if (namSinh.toString().matches("\\d+")) {
                throw new Exception("Năm sinh chỉ được chứa số!");
            } else {
                if ((LocalDate.now().getYear() - namSinh) < 24) {
                    throw new Exception("Năm sinh không phù hợp (Tuổi phải >= 24)");
                }
            }
        }
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) throws Exception {
        if (diaChi.trim().isEmpty()) {
            throw new Exception("Địa chỉ không được để trống!");
        }
        this.diaChi = diaChi;
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
    
    public abstract long khenThuong();

    public abstract long kyLuat();
    
    public abstract long tinhLuong();
}
