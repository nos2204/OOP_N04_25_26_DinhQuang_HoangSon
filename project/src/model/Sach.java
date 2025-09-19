public class Sach {
    private String maSach;
    private String tenSach;
    private String maNXB;        
    private String maNguoiThue; 

    public Sach(String maSach, String tenSach, String maNXB, String maNguoiThue) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.maNXB = maNXB;
        this.maNguoiThue = maNguoiThue;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getMaNXB() {
        return maNXB;
    }

    public String getMaNguoiThue() {
        return maNguoiThue;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }

    public void setMaNguoiThue(String maNguoiThue) {
        this.maNguoiThue = maNguoiThue;
    }

    @Override
    public String toString() {
        return "Mã sách: " + maSach +
               ", Tên sách: " + tenSach +
               ", Mã NXB: " + maNXB +
               ", Mã người thuê: " + maNguoiThue;
    }
}
