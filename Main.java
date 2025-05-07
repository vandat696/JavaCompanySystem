public class Main {
    public static void main(String[] args) {
                System.out.println("===== Tao Cong Ty =====");
                CongTy FPT = new CongTy("Cong Ty FPT", 1000000000); 
                System.out.println("Da tao cong ty: " + FPT.getTenCongTy());
                System.out.println("Loi nhuan ban dau: " + CongTy.getLoiNhuan());
                System.out.println("=======================\n");
        
                System.out.println("===== Tao Nhan Vien =====");
                CanBoCoHuu nvcch1 = new CanBoCoHuu("Nguyen Van A", 2.5);
                CanBoHopDong nvhd1 = new CanBoHopDong("Tran Thi B", 8500000);
                TruongPhong tp1 = new TruongPhong("Le Van C", 3.0, 3000000); 
                CanBoQuanLy cbql1 = new CanBoQuanLy(); 
                cbql1.setTenNhanVien("Pham Van D");
                cbql1.setHeSoLuong(3.5); 
                GiamDoc gd1 = new GiamDoc(); 
                gd1.setTenNhanVien("Hoang Thi E");
                gd1.setHeSoLuong(5.0); 
                gd1.setPhuCap(10000000); 
        
                CanBoCoHuu nvcch2 = new CanBoCoHuu();
                nvcch2.setTenNhanVien("Vu Thi G");
                nvcch2.setHeSoLuong(1.8);
                 System.out.println("Da tao cac doi tuong nhan vien.");
                System.out.println("=========================\n");
        
                System.out.println("===== Them Nhan Vien vao Cong Ty =====");
                FPT.themNV(nvcch1);
                FPT.themNV(nvhd1);
                FPT.themNV(tp1);
                FPT.themNV(cbql1);
                FPT.themNV(gd1);
                FPT.themNV(nvcch2);
                System.out.println("===============================\n");
        
                FPT.inThongTin();
        
                System.out.println("===== Tong Luong Ban Dau =====");
                System.out.println("Tong luong phai tra ban dau: " + FPT.tinhTongLuong());
                System.out.println("=============================\n");
                
                System.out.println("===== Tang He So Luong cho " + nvcch1.getTenNhanVien() + " =====");
                nvcch1.tangHeSoLuong(0.5); 
                System.out.println("Luong moi cua " + nvcch1.getTenNhanVien() + ": " + nvcch1.tinhLuong());
                System.out.println("=====================================\n");
        
                System.out.println("===== Cap Nhat Loi Nhuan Cong Ty =====");
                CongTy.setLoiNhuan(2500000000.0); 
                System.out.println("Loi nhuan moi cua cong ty: " + CongTy.getLoiNhuan());
                System.out.println("=====================================\n");
        
                System.out.println("===== Luong Quan Ly va Giam Doc sau khi cap nhat Loi Nhuan =====");
                System.out.println("Luong moi cua " + cbql1.getTenNhanVien() + ": " + cbql1.tinhLuong()); // Luong Can Bo Quan Ly tang do hoa hong tang
                System.out.println("Luong moi cua " + gd1.getTenNhanVien() + ": " + gd1.tinhLuong()); // Luong Giam Doc tang do hoa hong tang
                System.out.println("=============================================================\n");
        
                FPT.inThongTin();
        
                System.out.println("===== Xoa Nhan Vien Cuoi Cung =====");
                NhanVien nvBiXoa = FPT.xoaNV();
                if (nvBiXoa != null) {
                    System.out.println("Da xoa nhan vien: " + nvBiXoa.getTenNhanVien());
                }
                System.out.println("So nhan vien con lai: " + FPT.getSoNhanVien());
                 System.out.println("===============================\n");
        
                 FPT.inThongTin();
    }
}