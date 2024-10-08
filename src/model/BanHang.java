package model;

import java.util.Objects;

public class BanHang {
	 private String maSanPham;
	    private String tenSanPham;
	    private String soLuongSanPham;
	    private String loaiSanPham;
	    private String maNhaCungCap;
	    private double giaTienSanPham;
	    
		public BanHang(String maSanPham, String tenSanPham, String soLuongSanPham, String loaiSanPham,
				String maNhaCungCap, double giaTienSanPham) {
			super();
			this.maSanPham = maSanPham;
			this.tenSanPham = tenSanPham;
			this.soLuongSanPham = soLuongSanPham;
			this.loaiSanPham = loaiSanPham;
			this.maNhaCungCap = maNhaCungCap;
			this.giaTienSanPham = giaTienSanPham;
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

		public String getSoLuongSanPham() {
			return soLuongSanPham;
		}

		public void setSoLuongSanPham(String soLuongSanPham) {
			this.soLuongSanPham = soLuongSanPham;
		}

		public String getLoaiSanPham() {
			return loaiSanPham;
		}

		public void setLoaiSanPham(String loaiSanPham) {
			this.loaiSanPham = loaiSanPham;
		}

		public String getMaNhaCungCap() {
			return maNhaCungCap;
		}

		public void setMaNhaCungCap(String maNhaCungCap) {
			this.maNhaCungCap = maNhaCungCap;
		}

		public double getGiaTienSanPham() {
			return giaTienSanPham;
		}

		public void setGiaTienSanPham(double giaTienSanPham) {
			this.giaTienSanPham = giaTienSanPham;
		}

		@Override
		public int hashCode() {
			return Objects.hash(giaTienSanPham, loaiSanPham, maNhaCungCap, maSanPham, soLuongSanPham, tenSanPham);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			BanHang other = (BanHang) obj;
			return Double.doubleToLongBits(giaTienSanPham) == Double.doubleToLongBits(other.giaTienSanPham)
					&& Objects.equals(loaiSanPham, other.loaiSanPham)
					&& Objects.equals(maNhaCungCap, other.maNhaCungCap) && Objects.equals(maSanPham, other.maSanPham)
					&& Objects.equals(soLuongSanPham, other.soLuongSanPham)
					&& Objects.equals(tenSanPham, other.tenSanPham);
		}

		@Override
		public String toString() {
			return "BanHang [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", soLuongSanPham="
					+ soLuongSanPham + ", loaiSanPham=" + loaiSanPham + ", maNhaCungCap=" + maNhaCungCap
					+ ", giaTienSanPham=" + giaTienSanPham + "]";
		}
	    
}
