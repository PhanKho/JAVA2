package DanhSachSinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {
    private ArrayList<SinhVien> danhSach;   // khai bao danh sach

    public DanhSach()  // constructor
    {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public DanhSach(ArrayList<SinhVien> danhSach)  // constructor
    {
        this.danhSach = danhSach;
    }

    // them sinh vien vao danh sach.
    public void themSV(SinhVien sv){
        this.danhSach.add(sv);
    }

    public void inDSSV(){
       for(SinhVien sv : danhSach)
       {
           System.out.println(sv.toString());
       }
    }


    public boolean kiemTraDSRong(){
        return danhSach.isEmpty();
    }

    public int soLuongSVtrongDV(){
        return danhSach.size();
    }

    public void xoaSachDS(){
        danhSach.clear();
    }

    public boolean kiemtraSVCoTonTai(){
        System.out.println("Nhap ma SV");
        String msv = new Scanner(System.in).nextLine();
       return this.danhSach.contains(msv);
    }



}
