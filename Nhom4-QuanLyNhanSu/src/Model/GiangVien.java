/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hoang
 */
public class GiangVien extends NhanSu {

    private Khoa khoa;
    private int soTietDay;
    private final long donGia = 100000l;

    public GiangVien() {
        super();
    }

    public GiangVien(Khoa khoa, int soTietDay) {
        this.maNhanSu = id++;
        this.khoa = khoa;
        this.soTietDay = soTietDay;
    }

    public GiangVien(String hoTen, String gioiTinh, Integer namSinh, String diaChi, HoSo hoSo, Khoa khoa, int soTietDay) {
        super(hoTen, gioiTinh, namSinh, diaChi, hoSo);
        this.khoa = khoa;
        this.soTietDay = soTietDay;
    }

    public Khoa getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa khoa) throws Exception {
        if (khoa == null) {
            throw new Exception("Khoa không được để trống!");
        }
        this.khoa = khoa;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(Integer soTietDay) throws Exception {
        if (soTietDay.toString().trim().isEmpty()) {
            throw new Exception("Số tiết dạy không được trống!");
        } else {
            if (soTietDay.toString().matches("\\d+")) {
                throw new Exception("Số tiết dạy chỉ được chứa số!");
            } else {
                if (soTietDay < 0) {
                    throw new Exception("Số tiết dạy phải >= 0!");
                }
            }
        }
        this.soTietDay = soTietDay;
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
