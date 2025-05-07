public class CanBoHopDong extends NhanVien {
    private double luongHopDong;

    public CanBoHopDong(String tenNhanVien, double luongHopDong) {
        super(tenNhanVien);
        this.luongHopDong = luongHopDong;
    }

    @Override
    public double tinhLuong() {
        return luongHopDong;
    }

    @Override
    public void inThongTin() {
        System.out.println("Loai nhan vien: Can Bo Hop Dong");
        System.out.println("Ten nhan vien: " + getTenNhanVien());
        System.out.println("Luong hop dong: " + luongHopDong);
    }
    public void setLuongHopDong(double luongHopDong) {
        this.luongHopDong = luongHopDong;
    }
    public double getLuongHopDong() {
        return luongHopDong;
    }
}
