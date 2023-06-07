/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hoang
 */
public class Khoa {

    private String maKhoa;
    private String tenKhoa;

    public Khoa() {
    }

    public Khoa(String maKhoa, String tenKhoa) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) throws Exception {
        if (maKhoa.trim().isEmpty()) {
            throw new Exception("Mã khoa không được để trống!");
        }
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) throws Exception {
        if (tenKhoa.trim().isEmpty()) {
            throw new Exception("Tên khoa không được để trống!");
        }
        this.tenKhoa = tenKhoa;
    }

}
