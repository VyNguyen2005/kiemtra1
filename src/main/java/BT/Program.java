/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Program {

    static QuanLySach quanly = new QuanLySach();

    public static void main(String[] args) {
        int luachon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("CHUONG TRINH QUAN LY SACH CUA THU VIEN");
            System.out.println("--------------------------------");
            System.out.println("1. Them sach moi");
            System.out.println("2. Xuat toan bo sach va tinh tong tri gia cac sach trong thu vien");
            System.out.println("3. Lay ra cac sach xuat ban truoc nam 2015");
            System.out.println("4. Tim sach co ky tu dau cua ten sach la Lap trinh");
            System.out.println("5. Sap xep sach theo gia tang dan");
            System.out.println("6. Xoa sach theo ma sach");
            System.out.println("7. Sua gia bia cua sach theo ma sach");
            System.out.println("8. Tinh tong tri gia cua cac sach nha sach");
            System.out.println("9. Ket thuc");
            System.out.println("--------------------------------");
            System.out.print("Nhap lua chon cua ban(1-7): ");
            luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    quanly.ThemSach();
                    break;
                case 2:
                    System.out.println("Danh sach thu vien sach");
                    quanly.xuatVaTinhTriGia();
                    break;
                case 3:
                    quanly.LaySach();
                    break;
                case 4:
                    System.out.println("Sach co ky tu dau cua ten sach la Lap trinh");
                    quanly.TimSach();
                    break;
                case 5:
                    System.out.println("Danh sach sau khi sap xep tang dan");
                    quanly.SapXepTang();
                    break;
                case 6:
                    quanly.XoaTheoMa();
                    break;
                case 7:
                    quanly.SuaGiaTheoMa();
                    break;
                case 8:
                    quanly.TongTriGia();
                    break;
                case 9:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Khong tim thay lua chon phu hop. Vui long chon lai");
                    continue;
            }
        } while (luachon != 9);
    }
}
