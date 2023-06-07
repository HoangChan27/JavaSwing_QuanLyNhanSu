/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hoang
 */
public class VienChuc extends NhanSu {

    private PhongBan phongBan;
    private int soNgayLam;
    private final long donGia = 250000l;

    public VienChuc() {
        super();
    }

    public VienChuc(PhongBan phongBan, int soNgayLam) {
        this.maNhanSu = id++;
        this.phongBan = phongBan;
        this.soNgayLam = soNgayLam;
    }

    public VienChuc(String hoTen, String gioiTinh, Integer namSinh, String diaChi, HoSo hoSo, PhongBan phongBan, int soNgayLam) {
        super(hoTen, gioiTinh, namSinh, diaChi, hoSo);
        this.phongBan = phongBan;
        this.soNgayLam = soNgayLam;
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
        return soNgayLam * donGia + khenThuong() - kyLuat();
    }
}
