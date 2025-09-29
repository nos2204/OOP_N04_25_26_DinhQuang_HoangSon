package com.example.servingwebcontent.controllers;

import java.util.ArrayList;

public class NguoiThueManager {
    private ArrayList<NguoiThue> danhSach;

    public NguoiThueManager() {
        danhSach = new ArrayList<>();
    }

    public void themNguoiThue(NguoiThue nt) {
        danhSach.add(nt);
        System.out.println("Thêm người thuê thành công!");
    }

    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        for (NguoiThue nt : danhSach) {
            System.out.println(nt);
        }
    }

    public void capNhatNguoiThue(String maNguoiThue, String tenMoi, String maSachMoi) {
        for (NguoiThue nt : danhSach) {
            if (nt.getMaNguoiThue().equals(maNguoiThue)) {
                if (tenMoi != null && !tenMoi.isEmpty()) {
                    nt.setTenNguoiThue(tenMoi);
                }
                if (maSachMoi != null && !maSachMoi.isEmpty()) {
                    nt.setMaSach(maSachMoi);
                }
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy người thuê có mã " + maNguoiThue);
    }

    public void xoaNguoiThue(String maNguoiThue) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaNguoiThue().equals(maNguoiThue)) {
                danhSach.remove(i);
                System.out.println("Xóa người thuê thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy người thuê có mã " + maNguoiThue);
    }
}
