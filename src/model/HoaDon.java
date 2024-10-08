package model;

import java.util.Objects;

public class HoaDon {
    private String maHoaDon;
    private String maNhanVien;
    private String ngayNhap;
    private String maSanPham;
    private String maKhachHang;
    private String tongTienHoaDon;
	public HoaDon(String maHoaDon, String maNhanVien, String ngayNhap, String maSanPham, String maKhachHang,
			String tongTienHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
		this.maNhanVien = maNhanVien;
		this.ngayNhap = ngayNhap;
		this.maSanPham = maSanPham;
		this.maKhachHang = maKhachHang;
		this.tongTienHoaDon = tongTienHoaDon;
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
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
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getTongTienHoaDon() {
		return tongTienHoaDon;
	}
	public void setTongTienHoaDon(String tongTienHoaDon) {
		this.tongTienHoaDon = tongTienHoaDon;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maHoaDon, maKhachHang, maNhanVien, maSanPham, ngayNhap, tongTienHoaDon);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(maHoaDon, other.maHoaDon) && Objects.equals(maKhachHang, other.maKhachHang)
				&& Objects.equals(maNhanVien, other.maNhanVien) && Objects.equals(maSanPham, other.maSanPham)
				&& Objects.equals(ngayNhap, other.ngayNhap) && Objects.equals(tongTienHoaDon, other.tongTienHoaDon);
	}
	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", maNhanVien=" + maNhanVien + ", ngayNhap=" + ngayNhap + ", maSanPham="
				+ maSanPham + ", maKhachHang=" + maKhachHang + ", tongTienHoaDon=" + tongTienHoaDon + "]";
	}
    
}
