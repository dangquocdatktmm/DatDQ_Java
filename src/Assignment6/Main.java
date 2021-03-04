package Assignment6;

public class Main {
    public static void main(String[] args){
        MonHocDaiCuong pb = new MonHocDaiCuong();
        pb.themLopHoc("T2008M", 25);
        pb.themLopHoc("T2008M", 30);
        pb.themLopHoc("T20010M", 12);
        pb.inDanhSach();
        System.out.println("<==== Sắp xếp lại ====>");
        pb.sort();
        pb.inDanhSach();
    }
}
