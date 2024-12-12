/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doancanhan_phamvannhattruong;

import com.sun.jdi.connect.spi.Connection;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 *
 * @author ADMIN
 */
public class DANHSACHPHONG {
    ArrayList<PHONG> dsp = new ArrayList<PHONG>();
    public ArrayList<PHONG> getDsp() {
        return dsp;
    }

    public void setDsp(ArrayList<PHONG> dsp) {
        this.dsp = dsp;
    }
    public static Date chuyenChuoiThanhNgay(String date){
        try{
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            System.out.println("loi dinh dang: "+ e.getMessage());
        }
        return null;
    }
    public void docFile(String tenFile){
        try{
            FileReader fr = new FileReader(tenFile);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true){
                line = br.readLine();
                if (line == null){
                    break;
                }
                String[] a = line.split(",");
                String maPhong = a[0];
                String tenKhachHang = a[1];
                int soLuongKhachHang = Integer.parseInt(a[2]);
                String ngayNhanPhong = a[3];
                String loaiPhong = a[4];
                int thoiGianOLaiDuKien = Integer.parseInt(a[5]);
                PHONG phong = new PHONG(maPhong, tenKhachHang, soLuongKhachHang, chuyenChuoiThanhNgay(ngayNhanPhong), loaiPhong, thoiGianOLaiDuKien);
                themVaoDanhSach(phong);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Khong mo duoc file");
        }
    }
    public void themVaoDanhSach(PHONG p){
        dsp.add(p);
    }
    public PHONG timKiemPhong(String maPhong){
        for (PHONG phong : dsp){
            if (phong.getMaPhong().equalsIgnoreCase(maPhong)){
                return phong;
            }
        }
        return null;
    }
    public boolean xoaTheoMaPhong(String maPhong){
        for (PHONG phong : dsp){
            if (phong.getMaPhong().equalsIgnoreCase(maPhong)){
                dsp.remove(phong);
                return true;
            }
        }
        return false;
    }
}
