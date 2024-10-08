package model;

import java.util.Objects;

public class ChiTietPhieuNhap {
   private String maPhieuNhap;
   private String maSanPham;
   private String tenSanPham;
   private String soLuong;
   private String donGia;
   private String tongTienTrenDonGia;
public String getMaPhieuNhap() {
	return maPhieuNhap;
}
public void setMaPhieuNhap(String maPhieuNhap) {
	this.maPhieuNhap = maPhieuNhap;
}
public String getMaSanPham() {
	return maSanPham;
}
public void setMaSanPham(String maSanPham) {
	this.maSanPham = maSanPham;
}
public String getTenSanPham() {
	return tenSanPham;
}
public void setTenSanPham(String tenSanPham) {
	this.tenSanPham = tenSanPham;
}
public String getSoLuong() {
	return soLuong;
}
public void setSoLuong(String soLuong) {
	this.soLuong = soLuong;
}
public String getDonGia() {
	return donGia;
}
public void setDonGia(String donGia) {
	this.donGia = donGia;
}
public String getTongTienTrenDonGia() {
	return tongTienTrenDonGia;
}
public void setTongTienTrenDonGia(String tongTienTrenDonGia) {
	this.tongTienTrenDonGia = tongTienTrenDonGia;
}
public ChiTietPhieuNhap(String maPhieuNhap, String maSanPham, String tenSanPham, String soLuong, String donGia,
		String tongTienTrenDonGia) {
	super();
	this.maPhieuNhap = maPhieuNhap;
	this.maSanPham = maSanPham;
	this.tenSanPham = tenSanPham;
	this.soLuong = soLuong;
	this.donGia = donGia;
	this.tongTienTrenDonGia = tongTienTrenDonGia;
}
@Override
public int hashCode() {
	return Objects.hash(donGia, maPhieuNhap, maSanPham, soLuong, tenSanPham, tongTienTrenDonGia);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ChiTietPhieuNhap other = (ChiTietPhieuNhap) obj;
	return Objects.equals(donGia, other.donGia) && Objects.equals(maPhieuNhap, other.maPhieuNhap)
			&& Objects.equals(maSanPham, other.maSanPham) && Objects.equals(soLuong, other.soLuong)
			&& Objects.equals(tenSanPham, other.tenSanPham)
			&& Objects.equals(tongTienTrenDonGia, other.tongTienTrenDonGia);
}
@Override
public String toString() {
	return "ChiTietPhieuNhap [maPhieuNhap=" + maPhieuNhap + ", maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham
			+ ", soLuong=" + soLuong + ", donGia=" + donGia + ", tongTienTrenDonGia=" + tongTienTrenDonGia + "]";
}
   
   
}
