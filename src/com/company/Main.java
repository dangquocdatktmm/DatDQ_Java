package com.company;

public class Main {

    public static void main(String[] args) {
//        Student st; //Khai bao 1 bien co kieu du lieu Student
//        st = new Student(); // Tao doi tuong -> st se co 1 o nho
//        Student st2 = new Student();
//        st.name = "Nguyen Van Nam";
//        st2.name = "Le Manh Dung";
//        st.run();
//        st2.run();

        // Lab 1
        Product sp1 = new Product();
        sp1.masp = 1;
        sp1.tensp = "Iphone 6";
        sp1.giatien = 6000000;
        sp1.soluong = 10;
        sp1.donvi = "chiec";
        sp1.hienthi();
        sp1.thaydoigiatien(450000);
            System.out.println("Gia tien moi "+sp1.giatien);
        sp1.tanggiamsoluong(30);
            System.out.println("So luong moi " +sp1.soluong);
        if(sp1.kiemtrasp()){
            System.out.println("San pham " +sp1.tensp+" Con " +sp1.soluong+ " San pham");
        }else {
            System.out.println("San pham " +sp1.tensp + "het hang");
        }

        Product sp2 = new Product();
        sp2.masp = 2;
        sp2.tensp = "Realme 5 Pro";
        sp2.giatien = 7500000;
        sp2.soluong = 15;
        sp2.donvi = "chiec";
        //sp2.hienthi();

        Product sp3 = new Product();
        sp3.masp = 3;
        sp3.tensp = "Oppo F1";
        sp3.giatien = 8000000;
        sp3.soluong = 5;
        sp3.donvi = "chiec";
        //sp3.hienthi();


    }
}
