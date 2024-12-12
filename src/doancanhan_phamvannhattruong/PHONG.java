/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doancanhan_phamvannhattruong;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class PHONG {
    String maPhong;
    String tenKhachHang;
    int soLuongKhach;
    Date ngayNhanPhong;
    String loaiPhong;
    int thoiGianOLaiDuKien;
    public PHONG(){
    }
    
    public PHONG(String maPhong, String tenKhachHang,int soLuongKhach,Date ngayNhanPhong, String loaiPhong, int thoiGianOLaiDuKien) {
        this.maPhong = maPhong;
        this.tenKhachHang = tenKhachHang;
        this.soLuongKhach = soLuongKhach;
        this.ngayNhanPhong = ngayNhanPhong;
        this.loaiPhong = loaiPhong;        
        this.thoiGianOLaiDuKien = thoiGianOLaiDuKien;
        
    }
    
    
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    
    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setSoLuongKhach(int soLuongKhach) {
        this.soLuongKhach = soLuongKhach;
    }

    public void setThoiGianOLaiDuKien(int thoiGianOLaiDuKien) {
        this.thoiGianOLaiDuKien = thoiGianOLaiDuKien;
    }

    public void setNgayNhanPhong(Date ngayNhanPhong) {
        this.ngayNhanPhong = ngayNhanPhong;
    }
    
    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public int getSoLuongKhach() {
        return soLuongKhach;
    }

    public int getThoiGianOLaiDuKien() {
        return thoiGianOLaiDuKien;
    }

    public Date getNgayNhanPhong() {
        return ngayNhanPhong;
    }
    public static Date chuyenChuoiThanhNgay(String date){
        try{
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            System.out.println("loi dinh dang: "+ e.getMessage());
        }
        return null;
    }
    public static String chuyenNgayThanhChuoi(Date d){
        return new SimpleDateFormat("dd/MM/yyyy").format(d);
    }
    public String dinhDangSo(float n){
        DecimalFormat df = new DecimalFormat("###,###.0");
        return df.format(n);
    }
    public String toString(){
        return maPhong + " " + tenKhachHang + " " + " " + soLuongKhach + " " + chuyenNgayThanhChuoi(ngayNhanPhong) + " " + loaiPhong + " " + thoiGianOLaiDuKien;
    }
    
}
