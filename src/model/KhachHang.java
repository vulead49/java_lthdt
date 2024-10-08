package model;

import java.sql.Date;
import java.util.Objects;

public class KhachHang {
    private String maKhachHang;
    private String tenKhachHang;
    private String diaChiKhachHang;
    private Date ngaySinhKhachHang;
    private String gioiTinhKhachHang;
    private String soDienThoaiKhachHang;
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getDiaChiKhachHang() {
		return diaChiKhachHang;
	}
	public void setDiaChiKhachHang(String diaChiKhachHang) {
		this.diaChiKhachHang = diaChiKhachHang;
	}
	public Date getNgaySinhKhachHang() {
		return ngaySinhKhachHang;
	}
	public void setNgaySinhKhachHang(Date ngaySinhKhachHang) {
		this.ngaySinhKhachHang = ngaySinhKhachHang;
	}
	public String getGioiTinhKhachHang() {
		return gioiTinhKhachHang;
	}
	public void setGioiTinhKhachHang(String gioiTinhKhachHang) {
		this.gioiTinhKhachHang = gioiTinhKhachHang;
	}
	public String getSoDienThoaiKhachHang() {
		return soDienThoaiKhachHang;
	}
	public void setSoDienThoaiKhachHang(String soDienThoaiKhachHang) {
		this.soDienThoaiKhachHang = soDienThoaiKhachHang;
	}
	public KhachHang(String maKhachHang, String tenKhachHang, String diaChiKhachHang, Date ngaySinhKhachHang,
			String gioiTinhKhachHang, String soDienThoaiKhachHang) {
		super();
		this.maKhachHang = maKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.diaChiKhachHang = diaChiKhachHang;
		this.ngaySinhKhachHang = ngaySinhKhachHang;
		this.gioiTinhKhachHang = gioiTinhKhachHang;
		this.soDienThoaiKhachHang = soDienThoaiKhachHang;
	}
	@Override
	public int hashCode() {
		return Objects.hash(diaChiKhachHang, gioiTinhKhachHang, maKhachHang, ngaySinhKhachHang, soDienThoaiKhachHang,
				tenKhachHang);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(diaChiKhachHang, other.diaChiKhachHang)
				&& Objects.equals(gioiTinhKhachHang, other.gioiTinhKhachHang)
				&& Objects.equals(maKhachHang, other.maKhachHang)
				&& Objects.equals(ngaySinhKhachHang, other.ngaySinhKhachHang)
				&& Objects.equals(soDienThoaiKhachHang, other.soDienThoaiKhachHang)
				&& Objects.equals(tenKhachHang, other.tenKhachHang);
	}
	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", tenKhachHang=" + tenKhachHang + ", diaChiKhachHang="
				+ diaChiKhachHang + ", ngaySinhKhachHang=" + ngaySinhKhachHang + ", gioiTinhKhachHang="
				+ gioiTinhKhachHang + ", soDienThoaiKhachHang=" + soDienThoaiKhachHang + "]";
	}
	
	

}
