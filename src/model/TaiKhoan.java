package model;

import java.util.Objects;

public class TaiKhoan {
  private String maTaiKhoan;
  private String tenDangNhap;
  private String matKhau;
  private String maNhanVien;
  private String nhomQuyen;
  private String idTaiKhoan;
public TaiKhoan(String maTaiKhoan, String tenDangNhap, String matKhau, String maNhanVien, String nhomQuyen,
		String idTaiKhoan) {
	super();
	this.maTaiKhoan = maTaiKhoan;
	this.tenDangNhap = tenDangNhap;
	this.matKhau = matKhau;
	this.maNhanVien = maNhanVien;
	this.nhomQuyen = nhomQuyen;
	this.idTaiKhoan = idTaiKhoan;
}
public String getMaTaiKhoan() {
	return maTaiKhoan;
}
public void setMaTaiKhoan(String maTaiKhoan) {
	this.maTaiKhoan = maTaiKhoan;
}
public String getTenDangNhap() {
	return tenDangNhap;
}
public void setTenDangNhap(String tenDangNhap) {
	this.tenDangNhap = tenDangNhap;
}
public String getMatKhau() {
	return matKhau;
}
public void setMatKhau(String matKhau) {
	this.matKhau = matKhau;
}
public String getMaNhanVien() {
	return maNhanVien;
}
public void setMaNhanVien(String maNhanVien) {
	this.maNhanVien = maNhanVien;
}
public String getNhomQuyen() {
	return nhomQuyen;
}
public void setNhomQuyen(String nhomQuyen) {
	this.nhomQuyen = nhomQuyen;
}
public String getIdTaiKhoan() {
	return idTaiKhoan;
}
public void setIdTaiKhoan(String idTaiKhoan) {
	this.idTaiKhoan = idTaiKhoan;
}
@Override
public int hashCode() {
	return Objects.hash(idTaiKhoan, maNhanVien, maTaiKhoan, matKhau, nhomQuyen, tenDangNhap);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	TaiKhoan other = (TaiKhoan) obj;
	return Objects.equals(idTaiKhoan, other.idTaiKhoan) && Objects.equals(maNhanVien, other.maNhanVien)
			&& Objects.equals(maTaiKhoan, other.maTaiKhoan) && Objects.equals(matKhau, other.matKhau)
			&& Objects.equals(nhomQuyen, other.nhomQuyen) && Objects.equals(tenDangNhap, other.tenDangNhap);
}
@Override
public String toString() {
	return "TaiKhoan [maTaiKhoan=" + maTaiKhoan + ", tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau
			+ ", maNhanVien=" + maNhanVien + ", nhomQuyen=" + nhomQuyen + ", idTaiKhoan=" + idTaiKhoan + "]";
}
  
}
