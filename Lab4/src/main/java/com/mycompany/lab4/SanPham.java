/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author sang
 */
public class SanPham {


    private String tenSp;
    private double donGia;
    private double giamGia;

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }


    private double getThueNhapKhau() {
            return this.donGia * 0.1;
        }

        public void nhap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap ten sp ");
            this.tenSp = sc.nextLine();
            System.out.println("nhap don gia ");
            this.donGia = sc.nextDouble();
            System.out.println("nhap giam gia");
            this.giamGia = sc.nextDouble();
        }

        public void xuat() {
            System.out.println("ten san pham : " + this.tenSp);
            System.out.println("don gia : " + this.donGia);
            System.out.println("giam gia : " + this.giamGia);
            System.out.println("thue nhap khau : " + this.getThueNhapKhau());
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;

    }

    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    public SanPham() {

    }



}
