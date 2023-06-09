/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hoang
 */
public class ChuyenVien extends NhanSu {

    private PhongBan phongBan;
    private int soNgayLam;
    private long luongMotNgay;

    public ChuyenVien() {
        super();
    }

    public ChuyenVien(PhongBan phongBan) {
        this.phongBan = phongBan;
    }
    
    public ChuyenVien(PhongBan phongBan, int soNgayLam, long luongMotNgay) {
        this.phongBan = phongBan;
        this.soNgayLam = soNgayLam;
        this.luongMotNgay = luongMotNgay;
    }

    public ChuyenVien(String maNhanSu, String hoTen, String gioiTinh, int namSinh, String diaChi, HoSo hoSo, PhongBan phongBan, int soNgayLam, long luongMotNgay) {
        super(maNhanSu, hoTen, gioiTinh, namSinh, diaChi);
        this.phongBan = phongBan;
        this.soNgayLam = soNgayLam;
        this.luongMotNgay = luongMotNgay;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PhongBan phongBan) throws Exception {
        if (phongBan == null) {
            throw new Exception("Phòng ban không được để trống!");
        }
        this.phongBan = phongBan;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(Integer soNgayLam) throws Exception {
        if (soNgayLam.toString().trim().isEmpty()) {
            throw new Exception("Số ngày làm không được trống!");
        } else {
            if (soNgayLam.toString().matches("\\d+")) {
                throw new Exception("Số ngày làm chỉ được chứa số!");
            } else {
                if (soNgayLam < 0 || soNgayLam > 31) {
                    throw new Exception("Số ngày làm phải >= 0 và <= 31!");
                }
            }
        }
        this.soNgayLam = soNgayLam;
    }

    public long getLuongMotNgay() {
        return luongMotNgay;
    }

    public void setLuongMotNgay(Long luongMotNgay) throws Exception {
        if (luongMotNgay.toString().trim().isEmpty()) {
            throw new Exception("Lương một ngày không được trống!");
        } else {
            if (luongMotNgay.toString().matches("\\d+")) {
                throw new Exception("Lương một ngày chỉ được chứa số!");
            } else {
                if (luongMotNgay < 150000) {
                    throw new Exception("Lương một ngày phải >= 150000!");
                }
            }
        }
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
