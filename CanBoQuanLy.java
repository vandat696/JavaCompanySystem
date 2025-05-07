public class CanBoQuanLy extends CanBoCoHuu implements QuanLy{

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + tinhHoaHong();
    }

    @Override
    public double tinhHoaHong() {
        return CongTy.loiNhuan * 0.002;
    }
    
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Hoa hong: " + tinhHoaHong());
    }
}
