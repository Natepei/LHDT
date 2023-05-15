package GiaoDich;
import java.util.Scanner;
public class GiaoDich {
	private String maGiaoDich;
	private String ngayGiaoDich;
	private long donGia;
	private float dienTich;
	public GiaoDich() {
		super();
	}
	public GiaoDich(String maGiaoDich, String ngayGiaoDich, long donGia, float dienTich) {
		super();
		this.maGiaoDich	= maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	public String getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	public void setNgayGiaoDich(String ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}
	public long getDonGia() {
		return donGia;
	}
	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}
	public float getDienTich() {
		return dienTich;
	}
	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}
	@Override
	public String toString() {
		return "GiaoDichDat [maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia
				+ ", dienTich=" + dienTich + "]";
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma giao dich: ");
		maGiaoDich = sc.nextLine();
		System.out.println("Nhap ngay giao dich(ngay/thang/nam): ");
		ngayGiaoDich = sc.nextLine();
		System.out.println("Nhap don gia: ");
		donGia = sc.nextLong();
		System.out.println("Nhap dien tich: ");
		dienTich = sc.nextFloat();
	}
}	
