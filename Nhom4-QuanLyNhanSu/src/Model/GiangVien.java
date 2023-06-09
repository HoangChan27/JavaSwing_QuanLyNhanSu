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
    private long donGia;

    public GiangVien() {
        super();
        soTietDay = 0;
        donGia = 0;
    }

    public GiangVien(Khoa khoa) {
        this.khoa = khoa;
    }
    
    public GiangVien(Khoa khoa, int soTietDay, long donGia) {
        this.khoa = khoa;
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }

    public GiangVien(String maNhanSu, String hoTen, String gioiTinh, Integer namSinh, String diaChi, Khoa khoa, int soTietDay, long donGia) {
        super(maNhanSu, hoTen, gioiTinh, namSinh, diaChi);
        this.khoa = khoa;
        this.soTietDay = soTietDay;
        this.donGia = donGia;
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

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(Long donGia) throws Exception {
        if (donGia.toString().trim().isEmpty()) {
            throw new Exception("Đơn giá không được trống!");
        } else {
            if (donGia.toString().matches("\\d+")) {
                throw new Exception("Đơn giá chỉ được chứa số!");
            } else {
                if (donGia < 50000) {
                    throw new Exception("Đơn giá phải >= 50000!");
                }
            }
        }
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
