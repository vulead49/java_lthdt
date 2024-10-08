package model;

import java.util.Objects;

public class NhaCungCap {
    private String maNhaCungCap;
    private String tenNhaCungCap;
    private String diaChiNhaCungCap;
    private String nguoiLienHe;
    private String soDienThoaiNhaCungCap;
	public NhaCungCap(String maNhaCungCap, String tenNhaCungCap, String diaChiNhaCungCap, String nguoiLienHe,
			String soDienThoaiNhaCungCap) {
		super();
		this.maNhaCungCap = maNhaCungCap;
		this.tenNhaCungCap = tenNhaCungCap;
		this.diaChiNhaCungCap = diaChiNhaCungCap;
		this.nguoiLienHe = nguoiLienHe;
		this.soDienThoaiNhaCungCap = soDienThoaiNhaCungCap;
	}
	public String getMaNhaCungCap() {
		return maNhaCungCap;
	}
	public void setMaNhaCungCap(String maNhaCungCap) {
		this.maNhaCungCap = maNhaCungCap;
	}
	public String getTenNhaCungCap() {
		return tenNhaCungCap;
	}
	public void setTenNhaCungCap(String tenNhaCungCap) {
		this.tenNhaCungCap = tenNhaCungCap;
	}
	public String getDiaChiNhaCungCap() {
		return diaChiNhaCungCap;
	}
	public void setDiaChiNhaCungCap(String diaChiNhaCungCap) {
		this.diaChiNhaCungCap = diaChiNhaCungCap;
	}
	public String getNguoiLienHe() {
		return nguoiLienHe;
	}
	public void setNguoiLienHe(String nguoiLienHe) {
		this.nguoiLienHe = nguoiLienHe;
	}
	public String getSoDienThoaiNhaCungCap() {
		return soDienThoaiNhaCungCap;
	}
	public void setSoDienThoaiNhaCungCap(String soDienThoaiNhaCungCap) {
		this.soDienThoaiNhaCungCap = soDienThoaiNhaCungCap;
	}
	@Override
	public int hashCode() {
		return Objects.hash(diaChiNhaCungCap, maNhaCungCap, nguoiLienHe, soDienThoaiNhaCungCap, tenNhaCungCap);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhaCungCap other = (NhaCungCap) obj;
		return Objects.equals(diaChiNhaCungCap, other.diaChiNhaCungCap)
				&& Objects.equals(maNhaCungCap, other.maNhaCungCap) && Objects.equals(nguoiLienHe, other.nguoiLienHe)
				&& Objects.equals(soDienThoaiNhaCungCap, other.soDienThoaiNhaCungCap)
				&& Objects.equals(tenNhaCungCap, other.tenNhaCungCap);
	}
	@Override
	public String toString() {
		return "NhaCungCap [maNhaCungCap=" + maNhaCungCap + ", tenNhaCungCap=" + tenNhaCungCap + ", diaChiNhaCungCap="
				+ diaChiNhaCungCap + ", nguoiLienHe=" + nguoiLienHe + ", soDienThoaiNhaCungCap=" + soDienThoaiNhaCungCap
				+ "]";
	}

   
}
