/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hoang
 */
public class TinTuyenDung {

    private int maTin; // ma tin tuyen dung tu dong tang
    private String viTri;
    private int soLuong;
    private String yeuCau;
    private String hanNopHoSo;
    private static int id = 1;

    public TinTuyenDung() {
        this.maTin = id++;
    }

    public TinTuyenDung(String viTri, int soLuong, String yeuCau, String hanNopHoSo) {
        this.maTin = id++;
        this.viTri = viTri;
        this.soLuong = soLuong;
        this.yeuCau = yeuCau;
        this.hanNopHoSo = hanNopHoSo;
    }

    public int getMaTin() {
        return this.maTin;
    }
    
    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) throws Exception {
        if (viTri.trim().isEmpty()) {
            throw new Exception("Vị trí tuyển dụng không được để trống!");
        }
        this.viTri = viTri;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) throws Exception {
        if (soLuong.toString().trim().isEmpty()) {
            throw new Exception("Số lượng tuyển không được trống!");
        } else {
            if (soLuong.toString().matches("\\d+")) {
                throw new Exception("Số lượng tuyển chỉ được chứa số!");
            } else {
                if (soLuong < 1) {
                    throw new Exception("Số lượng tuyển phải lớn hơn 0!");
                }
            }
        }
        this.soLuong = soLuong;
    }

    public String getYeuCau() {
        return yeuCau;
    }

    public void setYeuCau(String yeuCau) throws Exception {
        if (yeuCau.trim().isEmpty()) {
            throw new Exception("Yêu cầu không được để trống!");
        }
        this.yeuCau = yeuCau;
    }

    public String getHanNopHoSo() {
        return hanNopHoSo;
    }

    public void setHanNopHoSo(String hanNopHoSo) throws Exception {
        if (hanNopHoSo.trim().isEmpty()) {
            throw new Exception("Hạn nộp hồ sơ không được để trống!");
        }
        this.hanNopHoSo = hanNopHoSo;
    }
}
