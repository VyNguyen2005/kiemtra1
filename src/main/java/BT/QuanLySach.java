/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author nguye
 */
public class QuanLySach {
    ArrayList<Sach> dsSach = new ArrayList<>();
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    public QuanLySach() {
        dsSach.add(new Sach("K011", "Lap trinh java", 95000, 2017));
        dsSach.add(new Sach("K012", "Co so du lieu", 85000, 2001));
        dsSach.add(new Sach("K013", "Nhap mon lap trinh", 72000, 2013));
        dsSach.add(new Sach("K014", "Lap trinh Python", 39000, 2018));
        dsSach.add(new Sach("K015", "Lap trinh c#", 82000, 2015));
    }
    public void xuatVaTinhTriGia(){
        double sumTriGia = 0;
        for (Sach sach : dsSach) {
            System.out.println(sach);
            sumTriGia += sach.getGiabia();
        }
        System.out.println("Tong tri gia cac sach trong thu vien: " +sumTriGia);
    }
    public ArrayList<Sach> LaySach(){
        ArrayList<Sach> sachLay = new ArrayList<>();
        for (Sach sach : dsSach) {
            if(sach.getNamxuatban() < 2015){
                sachLay.add(sach);
            }
        }
        return sachLay;
    }
    public void TimSach(){
        for (Sach sach : dsSach) {
            if(sach.getTensach().startsWith("Lap trinh")){
                System.out.println(sach);
            }
        }
    }
    public void SapXepTang(){
        Comparator<Sach> tieuchi  = (s1, s2) -> Double.compare(s1.getGiabia(), s2.getGiabia());
        Collections.sort(dsSach, tieuchi);
        for (Sach sach : dsSach) {
            System.out.println(sach);
        }
    }
    public void XoaTheoMa(){
        ArrayList<Sach> dsXoaTheoMa = new ArrayList<>();
        System.out.print("Nhap ma sach muon xoa: ");
        String maXoa = sc1.nextLine();
        for (Sach sach : dsSach) {
            if(sach.getMasach().equals(maXoa)){
                dsXoaTheoMa.add(sach);
            }
        }
        if(!dsXoaTheoMa.isEmpty()){
            dsSach.removeAll(dsXoaTheoMa);
            System.out.println("Sach voi ma " + maXoa + " da duoc xoa.");
        }
        else{
            System.out.println("Khong tim thay sach voi ma " + maXoa + ".");
        }
    }
    public void SuaGiaTheoMa(){
        System.out.print("Nhap ma sach can sua: ");
        String maSua = sc1.nextLine();
        System.out.print("Nhap gia sach sua: ");
        double giaSua = sc2.nextDouble();
        boolean found = false;
        for (Sach sach : dsSach) {
            if(sach.getMasach().equals(maSua)){
                sach.setGiabia(giaSua);
                System.out.println("Da sua thanh cong");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Khong tim thay ma sach trong thu vien");
        }
    }
    public void TongTriGia(){
        double tongTriGia = 0;
        for (Sach sach : dsSach) {
            tongTriGia += sach.getGiabia();
        }
        System.out.println("Tong tri gia cac sach trong nha sach: " +tongTriGia);
    }
    public void ThemSach(){
        String tieptuc ="";
        do {            
            System.out.println("Thuc hien them sach moi vao thu vien");
            System.out.print("Nhap ma sach: ");
            String masach = sc1.nextLine();
            System.out.print("Nhap ten sach: ");
            String tensach = sc1.nextLine();
            System.out.print("Nhap gia bia: ");
            double giabia = sc2.nextDouble();
            System.out.print("Nhap nam san xuat: ");
            int namsx = sc2.nextInt();
            
            dsSach.add(new Sach(masach, tensach, giabia, namsx));
            
            System.out.print("Ban muon tiep tuc them(y/n): ");
            tieptuc = sc1.nextLine();
        } while (tieptuc.equalsIgnoreCase("y"));
    }
}
