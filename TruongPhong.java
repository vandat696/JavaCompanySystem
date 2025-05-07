public class TruongPhong extends CanBoCoHuu {
    private double phuCap;

    public TruongPhong() {
        super();
        this.phuCap = 0;
    }

    public TruongPhong(String tenNhanVien, double heSoLuong, double phuCap) {
        super(tenNhanVien, heSoLuong);
        this.phuCap = phuCap;
    }

    public double getPhuCap() {
        return phuCap;
    }
    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + phuCap;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Phu cap: " + phuCap);
    }
    
}


