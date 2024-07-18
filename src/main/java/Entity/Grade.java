/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Admin
 */
public class Grade {

    private int id;
    private String maSV;
    private String hoTen;
    private float diemTA;
    private float diemTinHoc;
    private float diemGDTC;
    private float diemTB;

    public Grade() {
    }

    public Grade(int id, String maSV, String hoTen, float diemTA, float diemTinHoc, float diemGDTC, float diemTB) {
        this.id = id;
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTA = diemTA;
        this.diemTinHoc = diemTinHoc;
        this.diemGDTC = diemGDTC;
        this.diemTB = diemTB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemTA() {
        return diemTA;
    }

    public void setDiemTA(float diemTA) {
        this.diemTA = diemTA;
    }

    public float getDiemTinHoc() {
        return diemTinHoc;
    }

    public void setDiemTinHoc(float diemTinHoc) {
        this.diemTinHoc = diemTinHoc;
    }

    public float getDiemGDTC() {
        return diemGDTC;
    }

    public void setDiemGDTC(float diemGDTC) {
        this.diemGDTC = diemGDTC;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

}
