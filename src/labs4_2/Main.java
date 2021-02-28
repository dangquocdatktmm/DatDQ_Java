package labs4_2;

public class Main {
    public static void main(String[] args) {
        SinhVien r = new SinhVien();
        r.setMaso(1);
        r.setHoten("Công Phượng");
        r.setDiachi("Nghệ An");
        r.setSodienthoai(12344456);


        SinhVien r1 = new SinhVien();
        r1.setMaso(2);
        r1.setHoten("Công Phượng");
        r1.setDiachi("Nghệ An");
        r1.setSodienthoai(2341678);

        LopHoc c = new LopHoc();
        c.setMalop(1);
        c.setTenlop("T2008M");
        c.setPhonghoc("phong so 2");


        c.addSv(r);
        c.addSv(r);
        c.addSv(r);
        c.addSv(r1);
        c.addSv(r1);
        c.addSv(r1);

        System.out.println("danh sach sinh vien trong lop:");
        for (SinhVien p : c.Danhsachsinhvien()){
            System.out.println(p.getMaso()+"-"+ p.getHoten()+"-"+p.getDiachi()+"-"+p.getSodienthoai());
        }
    }
}
