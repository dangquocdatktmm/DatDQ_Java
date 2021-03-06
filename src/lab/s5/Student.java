package lab.s5;

import java.util.Scanner;

public class Student extends Person {
    private int maSv;
    private double diemThi;
    private String email;

    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputPerson(){
        super.inputPerson();
        Scanner p = new Scanner(System.in);
        System.out.println("Nhap Ma SV: ");
        setMaSv(p.nextInt());
        System.out.println("Nhap Diem Thi: ");
        setDiemThi(p.nextDouble());
        System.out.println("Nhap Email: ");
        setEmail(p.next());
        System.out.println();
    }

    public void printPerson(){
        super.printPerson();
        System.out.println("Ma SV La: "+getMaSv());
        System.out.println("Diem Thi La: "+getDiemThi());
        System.out.println("Dia Chi Email La: "+getEmail());
        System.out.println();
    }

    public boolean checkDT(){
        if(getDiemThi()>8.0){
            System.out.println("Du dieu kien nhan hoc bong.");
            return true;
        }
        System.out.println("Khong du dieu kien nhan hoc bong.");
        return false;
    }
}
