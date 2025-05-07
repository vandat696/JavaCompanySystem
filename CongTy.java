public class CongTy {
    private String tenCongTy;
    private NhanVien[] danhSachNV;
    private int soNhanVien;
    public static final int SO_NV_MAX = 1000;  
    public static double loiNhuan;

    public CongTy(String tenCongTy, double loiNhuan) {
        this.tenCongTy = tenCongTy;
        this.danhSachNV = new NhanVien[SO_NV_MAX];
        this.soNhanVien = 0;
        CongTy.loiNhuan = loiNhuan;
    }

    public boolean themNV(NhanVien nv) {
        if (soNhanVien < SO_NV_MAX) {
            soNhanVien++;
            danhSachNV[soNhanVien] = nv;
            return true;
        }
        else {
            System.out.println("Khong the them do da dat so luong toi da!");
            return false;
        }

    }

    public NhanVien xoaNV() {
        if (soNhanVien > 0) {
            NhanVien nv = danhSachNV[soNhanVien];
            danhSachNV[soNhanVien] = null;
            soNhanVien--;
            return nv;
        }
        else {
            System.out.println("Khong co nhan vien de xoa!");
            return null;
        }
    }

    public double tinhTongLuong() {
        double tong = 0;
        for (int i = 1; i <= soNhanVien; i++)
        {
            tong += danhSachNV[i].tinhLuong();
        }
        return tong;
    }

    public void inThongTin() {
        System.out.println("=============Thong tin cong ty=============");
        System.out.println("Ten cong ty: " + tenCongTy);
        System.out.println("So nhan vien: " + soNhanVien);
        System.out.println("=============Thong tin nhan vien=============");
        for (int i = 1; i <= soNhanVien; i++) {
            System.out.println("Nhan vien thu " + i + ":");
            danhSachNV[i].inThongTin();
        }
        System.out.println("Tong luong: " + tinhTongLuong());
    }

    public static double getLoiNhuan() {
        return loiNhuan;
    }
    public static void setLoiNhuan(double loiNhuan) {
        CongTy.loiNhuan = loiNhuan;
    }
    public String getTenCongTy() {
        return tenCongTy;
    }
    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }
    public int getSoNhanVien() {
        return soNhanVien;
    }
}
