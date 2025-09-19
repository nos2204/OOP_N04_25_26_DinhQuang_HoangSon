

public class NguoiThue {
    private String maNguoiThue;
    private String tenNguoiThue;
    private String maSach;

    public NguoiThue(String maNguoiThue, String tenNguoiThue, String maSach) {
        this.maNguoiThue = maNguoiThue;
        this.tenNguoiThue = tenNguoiThue;
        this.maSach = maSach;
    }

    public String getMaNguoiThue() {
        return maNguoiThue;
    }

    public String getTenNguoiThue() {
        return tenNguoiThue;
    }

    public void setTenNguoiThue(String tenNguoiThue) {
        this.tenNguoiThue = tenNguoiThue;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    @Override
    public String toString() {
        return "Mã người thuê: " + maNguoiThue + ", Tên: " + tenNguoiThue + ", Mã sách: " + maSach;
    }
}
