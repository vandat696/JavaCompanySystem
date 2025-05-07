public class GiamDoc extends CanBoCoHuu implements QuanLy {
    private double phuCap;

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + phuCap + tinhHoaHong();
    }

    @Override
    public double tinhHoaHong() {
        return CongTy.loiNhuan * 0.05;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Hoa hong: " + tinhHoaHong());
        System.out.println("Phu cap: " + phuCap);
    }

    public double getPhuCap() {
        return phuCap;
    }
    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }
}
