/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author Hoang
 */
public class HoSo {

    private int maHoSo; // ma ho so tu dong tang
    private String hoTen;
    private String gioiTinh;
    private int namSinh;
    private String diaChi;
    private String trinhDo; // cao dang - dai hoc - thac si - tien si
    private String viTriUngTuyen; // giang vien - vien chuc
    private static int id = 1;

    public HoSo() {
        this.maHoSo = id++;
    }

    public HoSo(String hoTen, String gioiTinh, int namSinh, String diaChi, String trinhDo, String viTriUngTuyen) {
        this.maHoSo = id++;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.trinhDo = trinhDo;
        this.viTriUngTuyen = viTriUngTuyen;
    }

    public int getMaHoSo() {
        return maHoSo;
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

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) throws Exception {
        if (trinhDo.trim().isEmpty()) {
            throw new Exception("Trình độ không được để trống!");
        }
        this.trinhDo = trinhDo;
    }

    public String getViTriUngTuyen() {
        return viTriUngTuyen;
    }

    public void setViTriUngTuyen(String viTriUngTuyen) throws Exception {
        if (viTriUngTuyen.trim().isEmpty()) {
            throw new Exception("Vị trí ứng tuyển không được để trống!");
        }
        this.viTriUngTuyen = viTriUngTuyen;
    }
}
