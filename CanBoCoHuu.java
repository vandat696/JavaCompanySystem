public class CanBoCoHuu extends NhanVien {
    private static double luongCoBan = 1200000;
    private double heSoLuong;

    public CanBoCoHuu() {
        super("NO NAME");
        this.heSoLuong = 1.0;
    }

    // Phương thức khởi tạo với 2 tham số
    public CanBoCoHuu(String tenNhanVien, double heSoLuong) {
        super(tenNhanVien);
        if (heSoLuong > 0) {
            this.heSoLuong = heSoLuong;
        }
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    @Override
    public void inThongTin() {
        System.out.println("Loai nhan vien: Can Bo Co Huu");
        System.out.println("Ten nhan vien: " + getTenNhanVien());
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Luong nhan duoc: " + tinhLuong());
    }

    public double tangHeSoLuong(double tang) {

        if (heSoLuong <= 0)
        {
            return heSoLuong;
        }
        else
        {
            return heSoLuong + tang;
        }
    }

    public static double getLuongCoBan() {
        return luongCoBan;
    }
    public static void setLuongCoBan(double luongCoBan) {
        if (luongCoBan > 0) {
            CanBoCoHuu.luongCoBan = luongCoBan;
        }
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(double heSoLuong) {
        if (heSoLuong > 0) {
            this.heSoLuong = heSoLuong;
        }
    }
}
