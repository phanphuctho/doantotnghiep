package development.mobile.tuanhoang.code.entity;

public class QuanLy extends NhanVien {
    private String MatKhau;

    public QuanLy() {
    }

    public QuanLy(String matKhau) {
        MatKhau = matKhau;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }
}