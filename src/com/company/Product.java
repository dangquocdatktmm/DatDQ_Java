package com.company;

public class Product {
    int masp;
    String tensp;
    float giatien;
    int soluong;
    String donvi;

    void hienthi(){
        System.out.println("ma san pham: " +this.masp);
        System.out.println("ten san pham: " +this.tensp);
        System.out.println("gia tien: " +this.giatien);
        System.out.println("So luong: " +this.soluong);
        System.out.println("Don vi: " +this.donvi);
    }
    void thaydoigiatien(float p){
        giatien = p;
    }
    void tanggiamsoluong(int sl){
        soluong += sl;
    }

    boolean kiemtrasp(){
        if (soluong>0) return true;
        return false;
    }

}

