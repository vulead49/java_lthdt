package model;

import java.util.Objects;

public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String chucVu;
    private String ngaySinhNhanVien;
    private String gioiTinhNhanVien;
    private String soDienThoaiNhanVien;
    
	public NhanVien(String maNhanVien, String tenNhanVien, String chucVu, String ngaySinhNhanVien,
			String gioiTinhNhanVien, String soDienThoaiNhanVien) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.chucVu = chucVu;
		this.ngaySinhNhanVien = ngaySinhNhanVien;
		this.gioiTinhNhanVien = gioiTinhNhanVien;
		this.soDienThoaiNhanVien = soDienThoaiNhanVien;
	}
	
	public String getNgaySinhNhanVien() {
		return ngaySinhNhanVien;
	}
	public void setNgaySinhNhanVien(String ngaySinhNhanVien) {
		this.ngaySinhNhanVien = ngaySinhNhanVien;
	}
	public String getGioiTinhNhanVien() {
		return gioiTinhNhanVien;
	}
	public void setGioiTinhNhanVien(String gioiTinhNhanVien) {
		this.gioiTinhNhanVien = gioiTinhNhanVien;
	}
	public String getSoDienThoaiNhanVien() {
		return soDienThoaiNhanVien;
	}
	public void setSoDienThoaiNhanVien(String soDienThoaiNhanVien) {
		this.soDienThoaiNhanVien = soDienThoaiNhanVien;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(chucVu, maNhanVien, tenNhanVien);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(chucVu, other.chucVu) && Objects.equals(maNhanVien, other.maNhanVien)
				&& Objects.equals(tenNhanVien, other.tenNhanVien);
	}
	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", chucVu=" + chucVu + "]";
	}
    

}