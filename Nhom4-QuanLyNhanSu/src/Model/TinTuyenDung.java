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
public class TinTuyenDung implements Serializable {

    private int maTin; // ma tin tuyen dung tu dong tang
    private String viTri;
    private String yeuCau;
    private int soLuong;
    private String hanNopHoSo;
    private static int id = 1;

    public TinTuyenDung() {
        this.maTin = id++;
    }

    public TinTuyenDung(String viTri, String yeuCau, int soLuong, String hanNopHoSo) {
        this.maTin = id++;
        this.viTri = viTri;
        this.yeuCau = yeuCau;
        this.soLuong = soLuong;
        this.hanNopHoSo = hanNopHoSo;
    }
    
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        TinTuyenDung.id = id;
    }

    public int getMaTin() {
        return this.maTin;
    }

    public void setMaTin(int maTin) {
        this.maTin = maTin;
    }
    
    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getYeuCau() {
        return yeuCau;
    }

    public void setYeuCau(String yeuCau) {
        this.yeuCau = yeuCau;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getHanNopHoSo() {
        return hanNopHoSo;
    }

    public void setHanNopHoSo(String hanNopHoSo) {
        this.hanNopHoSo = hanNopHoSo;
    }
}
