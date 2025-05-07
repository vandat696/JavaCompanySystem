abstract public class NhanVien {

    private String tenNhanVien;

    public NhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public abstract double tinhLuong();
    public abstract void inThongTin();
}