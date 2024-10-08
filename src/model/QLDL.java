package model;

import java.util.ArrayList;

public class QLDL {
	private ArrayList<BanHang> dsBanHang;
    private ArrayList<SanPham> dsSanPham;
    private ArrayList<NhanVien> dsNhanVien;
    private ArrayList<KhachHang> dsKhachHang;
    private ArrayList<NhaCungCap> dsNhaCungCap;
    private ArrayList<PhieuNhap> dsPhieuNhap;
    private ArrayList<HoaDon> dsHoaDon;
    private ArrayList<ChiTietPhieuNhap> dsChiTietPhieuNhap;
    private ArrayList<TaiKhoan> dsTaiKhoan;
    
    public QLDL() {
    	this.dsBanHang = new ArrayList<BanHang>();
    	this.dsSanPham = new ArrayList<SanPham>();
    	this.dsNhanVien = new ArrayList<NhanVien>();
    	this.dsKhachHang = new ArrayList<KhachHang>();
    	this.dsNhaCungCap = new ArrayList<NhaCungCap>();
    	this.dsPhieuNhap = new ArrayList<PhieuNhap>();
    	this.dsHoaDon = new ArrayList<HoaDon>();
    	this.dsChiTietPhieuNhap = new ArrayList<ChiTietPhieuNhap>();
    	this.dsTaiKhoan = new ArrayList<TaiKhoan>();
    }

	public QLDL(ArrayList<BanHang> dsBanHang, ArrayList<SanPham> dsSanPham, ArrayList<NhanVien> dsNhanVien,
			ArrayList<KhachHang> dsKhachHang, ArrayList<NhaCungCap> dsNhaCungCap, ArrayList<PhieuNhap> dsPhieuNhap,
			ArrayList<HoaDon> dsHoaDon, ArrayList<ChiTietPhieuNhap> dsChiTietPhieuNhap,
			ArrayList<TaiKhoan> dsTaiKhoan) {
		super();
		this.dsBanHang = dsBanHang;
		this.dsSanPham = dsSanPham;
		this.dsNhanVien = dsNhanVien;
		this.dsKhachHang = dsKhachHang;
		this.dsNhaCungCap = dsNhaCungCap;
		this.dsPhieuNhap = dsPhieuNhap;
		this.dsHoaDon = dsHoaDon;
		this.dsChiTietPhieuNhap = dsChiTietPhieuNhap;
		this.dsTaiKhoan = dsTaiKhoan;
	}

	public ArrayList<BanHang> getDsBanHang() {
		return dsBanHang;
	}

	public void setDsBanHang(ArrayList<BanHang> dsBanHang) {
		this.dsBanHang = dsBanHang;
	}

	public ArrayList<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(ArrayList<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public ArrayList<NhanVien> getDsNhanVien() {
		return dsNhanVien;
	}

	public void setDsNhanVien(ArrayList<NhanVien> dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
	}

	public ArrayList<KhachHang> getDsKhachHang() {
		return dsKhachHang;
	}

	public void setDsKhachHang(ArrayList<KhachHang> dsKhachHang) {
		this.dsKhachHang = dsKhachHang;
	}

	public ArrayList<NhaCungCap> getDsNhaCungCap() {
		return dsNhaCungCap;
	}

	public void setDsNhaCungCap(ArrayList<NhaCungCap> dsNhaCungCap) {
		this.dsNhaCungCap = dsNhaCungCap;
	}

	public ArrayList<PhieuNhap> getDsPhieuNhap() {
		return dsPhieuNhap;
	}

	public void setDsPhieuNhap(ArrayList<PhieuNhap> dsPhieuNhap) {
		this.dsPhieuNhap = dsPhieuNhap;
	}

	public ArrayList<HoaDon> getDsHoaDon() {
		return dsHoaDon;
	}

	public void setDsHoaDon(ArrayList<HoaDon> dsHoaDon) {
		this.dsHoaDon = dsHoaDon;
	}

	public ArrayList<ChiTietPhieuNhap> getDsChiTietPhieuNhap() {
		return dsChiTietPhieuNhap;
	}

	public void setDsChiTietPhieuNhap(ArrayList<ChiTietPhieuNhap> dsChiTietPhieuNhap) {
		this.dsChiTietPhieuNhap = dsChiTietPhieuNhap;
	}

	public ArrayList<TaiKhoan> getDsTaiKhoan() {
		return dsTaiKhoan;
	}

	public void setDsTaiKhoan(ArrayList<TaiKhoan> dsTaiKhoan) {
		this.dsTaiKhoan = dsTaiKhoan;
	}
    
}