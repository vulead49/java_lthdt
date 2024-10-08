package model;

import java.util.Objects;

public class PhieuNhap {
     private String maPhieuNhap;
     private String maNhanVien;
     private String ngayNhap;
     private String maSanPham;
     private String maNhaCungCap;
     private String tongTienPhieuNhap;
	public PhieuNhap(String maPhieuNhap, String maNhanVien, String ngayNhap, String maSanPham, String maNhaCungCap,
			String tongTienPhieuNhap) {
		super();
		this.maPhieuNhap = maPhieuNhap;
		this.maNhanVien = maNhanVien;
		this.ngayNhap = ngayNhap;
		this.maSanPham = maSanPham;
		this.maNhaCungCap = maNhaCungCap;
		this.tongTienPhieuNhap = tongTienPhieuNhap;
	}
	public String getMaPhieuNhap() {
		return maPhieuNhap;
	}
	public void setMaPhieuNhap(String maPhieuNhap) {
		this.maPhieuNhap = maPhieuNhap;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getMaNhaCungCap() {
		return maNhaCungCap;
	}
	public void setMaNhaCungCap(String maNhaCungCap) {
		this.maNhaCungCap = maNhaCungCap;
	}
	public String getTongTienPhieuNhap() {
		return tongTienPhieuNhap;
	}
	public void setTongTienPhieuNhap(String tongTienPhieuNhap) {
		this.tongTienPhieuNhap = tongTienPhieuNhap;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maNhaCungCap, maNhanVien, maPhieuNhap, maSanPham, ngayNhap, tongTienPhieuNhap);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhieuNhap other = (PhieuNhap) obj;
		return Objects.equals(maNhaCungCap, other.maNhaCungCap) && Objects.equals(maNhanVien, other.maNhanVien)
				&& Objects.equals(maPhieuNhap, other.maPhieuNhap) && Objects.equals(maSanPham, other.maSanPham)
				&& Objects.equals(ngayNhap, other.ngayNhap)
				&& Objects.equals(tongTienPhieuNhap, other.tongTienPhieuNhap);
	}
	@Override
	public String toString() {
		return "PhieuNhap [maPhieuNhap=" + maPhieuNhap + ", maNhanVien=" + maNhanVien + ", ngayNhap=" + ngayNhap
				+ ", maSanPham=" + maSanPham + ", maNhaCungCap=" + maNhaCungCap + ", tongTienPhieuNhap="
				+ tongTienPhieuNhap + "]";
	}
     
}
